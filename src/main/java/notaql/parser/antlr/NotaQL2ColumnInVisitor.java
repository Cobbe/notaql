// Generated from notaql\parser\antlr\NotaQL2ColumnIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2ColumnInParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2ColumnInVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2ColumnInParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2ColumnInParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2ColumnInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2ColumnInParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2ColumnInParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColIdInputPathStep(@NotNull NotaQL2ColumnInParser.ColIdInputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2ColumnInParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2ColumnInParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellInputPathStep(@NotNull NotaQL2ColumnInParser.CellInputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2ColumnInParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull NotaQL2ColumnInParser.ColIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2ColumnInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2ColumnInParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2ColumnInParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2ColumnInParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2ColumnInParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#rowInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowInputPathStep(@NotNull NotaQL2ColumnInParser.RowInputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2ColumnInParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2ColumnInParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2ColumnInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2ColumnInParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2ColumnInParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2ColumnInParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2ColumnInParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2ColumnInParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2ColumnInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplittedInputPath(@NotNull NotaQL2ColumnInParser.SplittedInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2ColumnInParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleInputPath(@NotNull NotaQL2ColumnInParser.SimpleInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2ColumnInParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2ColumnInParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2ColumnInParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2ColumnInParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeCurrentCellPathStep(@NotNull NotaQL2ColumnInParser.RelativeCurrentCellPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2ColumnInParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2ColumnInParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2ColumnInParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2ColumnInParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2ColumnInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2ColumnInParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2ColumnInParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2ColumnInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2ColumnInParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2ColumnInParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2ColumnInParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2ColumnInParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2ColumnInParser.AndPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedInputPathStep(@NotNull NotaQL2ColumnInParser.ResolvedInputPathStepContext ctx);
}