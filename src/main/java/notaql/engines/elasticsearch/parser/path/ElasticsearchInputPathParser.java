package notaql.engines.elasticsearch.parser.path;

import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import notaql.model.path.InputPath;
import notaql.model.path.InputPathStep;
import notaql.parser.NotaQLErrorListener;
import notaql.parser.TransformationParser;
import notaql.parser.antlr.NotaQL2DocumentInLexer;
import notaql.parser.antlr.NotaQL2DocumentInParser;
import notaql.parser.path.InputPathParser;

/**
 * Created by John Bengtson on 2017-04-20
 */
public class ElasticsearchInputPathParser implements InputPathParser {
	private final TransformationParser transformationParser;
	
	public ElasticsearchInputPathParser(TransformationParser parser) {
		this.transformationParser = parser;
	}

	@Override
	public InputPath parse(String enginePath, boolean relative) {
		final NotaQL2DocumentInLexer lexer = new NotaQL2DocumentInLexer(new ANTLRInputStream(enginePath));
        final NotaQL2DocumentInParser parser = new NotaQL2DocumentInParser(new CommonTokenStream(lexer));

        parser.addErrorListener(new NotaQLErrorListener(parser));

        final NotaQL2DocumentInParser.InputPathContext inputPathContext = parser.inputPath();

        final List<InputPathStep> steps = inputPathContext.inputPathStep()
                .stream()
                .map(s -> new ElasticsearchInputPathStepVisitor(this.transformationParser).visit(s))
                .collect(Collectors.toList());
        return new InputPath(relative, steps);
	}

}
