package notaql.engines.elasticsearch.parser.path;

import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import notaql.model.path.OutputPath;
import notaql.model.path.OutputPathStep;
import notaql.parser.NotaQLErrorListener;
import notaql.parser.TransformationParser;
import notaql.parser.antlr.NotaQL2DocumentOutLexer;
import notaql.parser.antlr.NotaQL2DocumentOutParser;
import notaql.parser.path.OutputPathParser;

/**
 * Created by John Bengtson on 2017-04-20
 * based on existing engines.
 */
public class ElasticsearchOutputPathParser implements OutputPathParser {
	private final TransformationParser transformationParser;
	
	public ElasticsearchOutputPathParser(TransformationParser parser) {
		this.transformationParser = parser;
	}
	@Override
	public OutputPath parse(String enginePath, boolean relative) {
        final NotaQL2DocumentOutLexer lexer = new NotaQL2DocumentOutLexer(new ANTLRInputStream(enginePath));
        final NotaQL2DocumentOutParser parser = new NotaQL2DocumentOutParser(new CommonTokenStream(lexer));

        parser.addErrorListener(new NotaQLErrorListener(parser));

        final NotaQL2DocumentOutParser.OutputPathContext outputPathContext = parser.outputPath();

        final List<OutputPathStep> steps = outputPathContext.outputPathStep().stream()
                .map(s -> new ElasticsearchOutputPathStepVisitor(this.transformationParser).visit(s))
                .collect(Collectors.toList());
        return new OutputPath(steps);
	}

}
