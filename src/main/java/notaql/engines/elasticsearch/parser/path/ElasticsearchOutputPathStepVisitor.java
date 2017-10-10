package notaql.engines.elasticsearch.parser.path;

import org.antlr.v4.runtime.misc.NotNull;

import notaql.datamodel.Step;
import notaql.model.path.IdStep;
import notaql.model.path.IgnoredIdStep;
import notaql.model.path.OutputPathStep;
import notaql.model.path.ResolvedIdStep;
import notaql.parser.TransformationParser;
import notaql.parser.antlr.NotaQL2DocumentOutBaseVisitor;
import notaql.parser.antlr.NotaQL2DocumentOutParser;

/**
 * Created by John Bengtson on 2017-04-20
 */
public class ElasticsearchOutputPathStepVisitor extends NotaQL2DocumentOutBaseVisitor<OutputPathStep> {
	private final TransformationParser parser;
	
	public ElasticsearchOutputPathStepVisitor(TransformationParser parser) {
		this.parser = parser;
	}
	
    @Override
    public OutputPathStep visitAttributeIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.AttributeIdOutputAttributeStepContext ctx) {
        if(ctx.attributeId().attributeName.getText().equals("_"))
            return new IgnoredIdStep();
        return new IdStep<>(new Step<>(ctx.attributeId().attributeName.getText()));
    }

    @Override
    public OutputPathStep visitIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.IdOutputAttributeStepContext ctx) {
        return new IdStep<>(new Step<>("_id"));
    }

    @Override
    public OutputPathStep visitResolvedOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.ResolvedOutputAttributeStepContext ctx) {
        return new ResolvedIdStep(parser.getInputPathVisitor().evaluateAbsolute(ctx.resolvedAttributeId().absoluteInputPath().path().getText()));
    }

}
