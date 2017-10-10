// Generated from notaql\parser\antlr\NotaQL2KeyValueOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2KeyValueOutParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2KeyValueOutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2KeyValueOutParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2KeyValueOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2KeyValueOutParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2KeyValueOutParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2KeyValueOutParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2KeyValueOutParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2KeyValueOutParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2KeyValueOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2KeyValueOutParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2KeyValueOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2KeyValueOutParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2KeyValueOutParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2KeyValueOutParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2KeyValueOutParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2KeyValueOutParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2KeyValueOutParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedOutputPath(@NotNull NotaQL2KeyValueOutParser.ResolvedOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2KeyValueOutParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2KeyValueOutParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2KeyValueOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyIdOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyIdOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyIdOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyId(@NotNull NotaQL2KeyValueOutParser.KeyIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2KeyValueOutParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2KeyValueOutParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2KeyValueOutParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2KeyValueOutParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#valueOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOutputPath(@NotNull NotaQL2KeyValueOutParser.ValueOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2KeyValueOutParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2KeyValueOutParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2KeyValueOutParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2KeyValueOutParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2KeyValueOutParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2KeyValueOutParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2KeyValueOutParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2KeyValueOutParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2KeyValueOutParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2KeyValueOutParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueOutParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2KeyValueOutParser.AndPredicateContext ctx);
}