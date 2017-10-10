// Generated from notaql\parser\antlr\NotaQL2CSVIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2CSVInParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2CSVInVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2CSVInParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2CSVInParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2CSVInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2CSVInParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2CSVInParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColIdInputPathStep(@NotNull NotaQL2CSVInParser.ColIdInputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2CSVInParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2CSVInParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellInputPathStep(@NotNull NotaQL2CSVInParser.CellInputPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2CSVInParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull NotaQL2CSVInParser.ColIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2CSVInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2CSVInParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2CSVInParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2CSVInParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2CSVInParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2CSVInParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2CSVInParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2CSVInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2CSVInParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2CSVInParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2CSVInParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2CSVInParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2CSVInParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2CSVInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplittedInputPath(@NotNull NotaQL2CSVInParser.SplittedInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2CSVInParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleInputPath(@NotNull NotaQL2CSVInParser.SimpleInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2CSVInParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2CSVInParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2CSVInParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2CSVInParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeCurrentCellPathStep(@NotNull NotaQL2CSVInParser.RelativeCurrentCellPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2CSVInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2CSVInParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2CSVInParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2CSVInParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2CSVInParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2CSVInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2CSVInParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2CSVInParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2CSVInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2CSVInParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2CSVInParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2CSVInParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2CSVInParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2CSVInParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2CSVInParser.AndPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedInputPathStep(@NotNull NotaQL2CSVInParser.ResolvedInputPathStepContext ctx);
}