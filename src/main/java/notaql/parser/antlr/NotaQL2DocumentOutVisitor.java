// Generated from notaql\parser\antlr\NotaQL2DocumentOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2DocumentOutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2DocumentOutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2DocumentOutParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2DocumentOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedOutputAttributeStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.ResolvedOutputAttributeStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2DocumentOutParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2DocumentOutParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2DocumentOutParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2DocumentOutParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2DocumentOutParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2DocumentOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#outputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputPathStep(@NotNull NotaQL2DocumentOutParser.OutputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2DocumentOutParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2DocumentOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2DocumentOutParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2DocumentOutParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2DocumentOutParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2DocumentOutParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2DocumentOutParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2DocumentOutParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2DocumentOutParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2DocumentOutParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2DocumentOutParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2DocumentOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2DocumentOutParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2DocumentOutParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2DocumentOutParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2DocumentOutParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#outputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputPath(@NotNull NotaQL2DocumentOutParser.OutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeIdOutputAttributeStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.AttributeIdOutputAttributeStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2DocumentOutParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2DocumentOutParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2DocumentOutParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2DocumentOutParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2DocumentOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2DocumentOutParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#idOutputAttributeStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.IdOutputAttributeStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2DocumentOutParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2DocumentOutParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2DocumentOutParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedAttributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedAttributeId(@NotNull NotaQL2DocumentOutParser.ResolvedAttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2DocumentOutParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2DocumentOutParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentOutParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2DocumentOutParser.AndPredicateContext ctx);
}