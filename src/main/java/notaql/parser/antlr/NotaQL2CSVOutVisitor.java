// Generated from notaql\parser\antlr\NotaQL2CSVOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2CSVOutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2CSVOutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2CSVOutParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2CSVOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2CSVOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2CSVOutParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2CSVOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#colIdOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColIdOutputPath(@NotNull NotaQL2CSVOutParser.ColIdOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2CSVOutParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2CSVOutParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2CSVOutParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2CSVOutParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2CSVOutParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2CSVOutParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2CSVOutParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2CSVOutParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2CSVOutParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(@NotNull NotaQL2CSVOutParser.ColIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2CSVOutParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2CSVOutParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2CSVOutParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2CSVOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2CSVOutParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2CSVOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2CSVOutParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2CSVOutParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2CSVOutParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2CSVOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2CSVOutParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2CSVOutParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2CSVOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2CSVOutParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2CSVOutParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2CSVOutParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2CSVOutParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2CSVOutParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2CSVOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2CSVOutParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2CSVOutParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedOutputPath(@NotNull NotaQL2CSVOutParser.ResolvedOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2CSVOutParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2CSVOutParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2CSVOutParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2CSVOutParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2CSVOutParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2CSVOutParser.AndPredicateContext ctx);
}