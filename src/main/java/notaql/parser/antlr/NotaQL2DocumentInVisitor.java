// Generated from notaql\parser\antlr\NotaQL2DocumentIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2DocumentInParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2DocumentInVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2DocumentInParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2DocumentInParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2DocumentInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2DocumentInParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2DocumentInParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2DocumentInParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#stringSplitMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSplitMethod(@NotNull NotaQL2DocumentInParser.StringSplitMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2DocumentInParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#methodPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPathStep(@NotNull NotaQL2DocumentInParser.MethodPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2DocumentInParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2DocumentInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#attributeIdStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeIdStep(@NotNull NotaQL2DocumentInParser.AttributeIdStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericListStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericListStep(@NotNull NotaQL2DocumentInParser.GenericListStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2DocumentInParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2DocumentInParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2DocumentInParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2DocumentInParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#inputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputPath(@NotNull NotaQL2DocumentInParser.InputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2DocumentInParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2DocumentInParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2DocumentInParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2DocumentInParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2DocumentInParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#indexPathMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexPathMethod(@NotNull NotaQL2DocumentInParser.IndexPathMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2DocumentInParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#predicateGenericStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateGenericStep(@NotNull NotaQL2DocumentInParser.PredicateGenericStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2DocumentInParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#namePathMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamePathMethod(@NotNull NotaQL2DocumentInParser.NamePathMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2DocumentInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2DocumentInParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2DocumentInParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#idStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdStep(@NotNull NotaQL2DocumentInParser.IdStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#attributePathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributePathStep(@NotNull NotaQL2DocumentInParser.AttributePathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2DocumentInParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2DocumentInParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2DocumentInParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#splitPathMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitPathMethod(@NotNull NotaQL2DocumentInParser.SplitPathMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2DocumentInParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2DocumentInParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2DocumentInParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#listPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPathStep(@NotNull NotaQL2DocumentInParser.ListPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2DocumentInParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2DocumentInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2DocumentInParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2DocumentInParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2DocumentInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2DocumentInParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2DocumentInParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#genericAttributeStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAttributeStep(@NotNull NotaQL2DocumentInParser.GenericAttributeStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#splitNameStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitNameStep(@NotNull NotaQL2DocumentInParser.SplitNameStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2DocumentInParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#anyGenericStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyGenericStep(@NotNull NotaQL2DocumentInParser.AnyGenericStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#indexListStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexListStep(@NotNull NotaQL2DocumentInParser.IndexListStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#resolvedGenericStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedGenericStep(@NotNull NotaQL2DocumentInParser.ResolvedGenericStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2DocumentInParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#currentGenericStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentGenericStep(@NotNull NotaQL2DocumentInParser.CurrentGenericStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2DocumentInParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2DocumentInParser.AndPredicateContext ctx);
}