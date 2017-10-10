// Generated from notaql\parser\antlr\NotaQL2KeyValueIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotaQL2KeyValueInParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotaQL2KeyValueInVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#inEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInEngine(@NotNull NotaQL2KeyValueInParser.InEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionVData(@NotNull NotaQL2KeyValueInParser.GenericFunctionVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunction(@NotNull NotaQL2KeyValueInParser.GenericFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#notaql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotaql(@NotNull NotaQL2KeyValueInParser.NotaqlContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull NotaQL2KeyValueInParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegatedPredicate(@NotNull NotaQL2KeyValueInParser.NegatedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#trueAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(@NotNull NotaQL2KeyValueInParser.TrueAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#splitStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitStep(@NotNull NotaQL2KeyValueInParser.SplitStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#predicateGenericComplexStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateGenericComplexStep(@NotNull NotaQL2KeyValueInParser.PredicateGenericComplexStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectConstructorFunction(@NotNull NotaQL2KeyValueInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexListStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericComplexListStep(@NotNull NotaQL2KeyValueInParser.GenericComplexListStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull NotaQL2KeyValueInParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicatedVData(@NotNull NotaQL2KeyValueInParser.MultiplicatedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull NotaQL2KeyValueInParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#aggregateVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVData(@NotNull NotaQL2KeyValueInParser.AggregateVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#keyInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyInputPath(@NotNull NotaQL2KeyValueInParser.KeyInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#hashPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashPathStep(@NotNull NotaQL2KeyValueInParser.HashPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexHashStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericComplexHashStep(@NotNull NotaQL2KeyValueInParser.GenericComplexHashStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#pathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathToken(@NotNull NotaQL2KeyValueInParser.PathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#constructorVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorVData(@NotNull NotaQL2KeyValueInParser.ConstructorVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#bracedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedVData(@NotNull NotaQL2KeyValueInParser.BracedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull NotaQL2KeyValueInParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#falseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(@NotNull NotaQL2KeyValueInParser.FalseAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedPredicate(@NotNull NotaQL2KeyValueInParser.BracedPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#keyIdHashStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyIdHashStep(@NotNull NotaQL2KeyValueInParser.KeyIdHashStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPath(@NotNull NotaQL2KeyValueInParser.RelativeInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#resolvedGenericComplexStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResolvedGenericComplexStep(@NotNull NotaQL2KeyValueInParser.ResolvedGenericComplexStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#currentGenericComplexStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentGenericComplexStep(@NotNull NotaQL2KeyValueInParser.CurrentGenericComplexStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorFunction(@NotNull NotaQL2KeyValueInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#nameHashMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameHashMethod(@NotNull NotaQL2KeyValueInParser.NameHashMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#keyId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyId(@NotNull NotaQL2KeyValueInParser.KeyIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#atomVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVData(@NotNull NotaQL2KeyValueInParser.AtomVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#attributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeId(@NotNull NotaQL2KeyValueInParser.AttributeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#outEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutEngine(@NotNull NotaQL2KeyValueInParser.OutEngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(@NotNull NotaQL2KeyValueInParser.EngineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#indexListMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexListMethod(@NotNull NotaQL2KeyValueInParser.IndexListMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPathVData(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#anyGenericComplexStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyGenericComplexStep(@NotNull NotaQL2KeyValueInParser.AnyGenericComplexStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#genericPathToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPathToken(@NotNull NotaQL2KeyValueInParser.GenericPathTokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonePredicate(@NotNull NotaQL2KeyValueInParser.StandalonePredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#valueInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInputPath(@NotNull NotaQL2KeyValueInParser.ValueInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#orPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPredicate(@NotNull NotaQL2KeyValueInParser.OrPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#listPathStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPathStep(@NotNull NotaQL2KeyValueInParser.ListPathStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#outPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutPredicate(@NotNull NotaQL2KeyValueInParser.OutPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeInputPathVData(@NotNull NotaQL2KeyValueInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull NotaQL2KeyValueInParser.InPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecification(@NotNull NotaQL2KeyValueInParser.AttributeSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeGenericOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#transformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformation(@NotNull NotaQL2KeyValueInParser.TransformationContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(@NotNull NotaQL2KeyValueInParser.AggregationFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalPredicate(@NotNull NotaQL2KeyValueInParser.RelationalPredicateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteInputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#indexListStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexListStep(@NotNull NotaQL2KeyValueInParser.IndexListStepContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#addedVData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddedVData(@NotNull NotaQL2KeyValueInParser.AddedVDataContext ctx);

	/**
	 * Visit a parse tree produced by {@link NotaQL2KeyValueInParser#andPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPredicate(@NotNull NotaQL2KeyValueInParser.AndPredicateContext ctx);
}