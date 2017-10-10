// Generated from notaql\parser\antlr\NotaQL2ColumnOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2ColumnOutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2ColumnOutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2ColumnOutParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2ColumnOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2ColumnOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2ColumnOutParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2ColumnOutParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2ColumnOutParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2ColumnOutParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2ColumnOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2ColumnOutParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull NotaQL2ColumnOutParser.ColIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2ColumnOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2ColumnOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2ColumnOutParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2ColumnOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2ColumnOutParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2ColumnOutParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2ColumnOutParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2ColumnOutParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2ColumnOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2ColumnOutParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2ColumnOutParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedOutputPath(@NotNull NotaQL2ColumnOutParser.ResolvedOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2ColumnOutParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2ColumnOutParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2ColumnOutParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2ColumnOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2ColumnOutParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#colIdOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColIdOutputPath(@NotNull NotaQL2ColumnOutParser.ColIdOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2ColumnOutParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#rowOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowOutputPath(@NotNull NotaQL2ColumnOutParser.RowOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2ColumnOutParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2ColumnOutParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2ColumnOutParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2ColumnOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#resolvedOutputPathFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedOutputPathFamily(@NotNull NotaQL2ColumnOutParser.ResolvedOutputPathFamilyContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2ColumnOutParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2ColumnOutParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2ColumnOutParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2ColumnOutParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2ColumnOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2ColumnOutParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2ColumnOutParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2ColumnOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2ColumnOutParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2ColumnOutParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2ColumnOutParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2ColumnOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2ColumnOutParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2ColumnOutParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2ColumnOutParser.AndPredicateContext ctx);
}