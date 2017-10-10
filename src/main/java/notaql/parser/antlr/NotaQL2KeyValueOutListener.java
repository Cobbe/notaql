// Generated from notaql\parser\antlr\NotaQL2KeyValueOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2KeyValueOutParser}.
 */
public interface NotaQL2KeyValueOutListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2KeyValueOutParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2KeyValueOutParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2KeyValueOutParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2KeyValueOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2KeyValueOutParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2KeyValueOutParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2KeyValueOutParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2KeyValueOutParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2KeyValueOutParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2KeyValueOutParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2KeyValueOutParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2KeyValueOutParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2KeyValueOutParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2KeyValueOutParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2KeyValueOutParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2KeyValueOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2KeyValueOutParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2KeyValueOutParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2KeyValueOutParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2KeyValueOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2KeyValueOutParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2KeyValueOutParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2KeyValueOutParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2KeyValueOutParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2KeyValueOutParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2KeyValueOutParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2KeyValueOutParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2KeyValueOutParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2KeyValueOutParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2KeyValueOutParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2KeyValueOutParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2KeyValueOutParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterResolvedOutputPath(@NotNull NotaQL2KeyValueOutParser.ResolvedOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitResolvedOutputPath(@NotNull NotaQL2KeyValueOutParser.ResolvedOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2KeyValueOutParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2KeyValueOutParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2KeyValueOutParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2KeyValueOutParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2KeyValueOutParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2KeyValueOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#keyIdOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterKeyIdOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyIdOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyIdOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitKeyIdOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyIdOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#keyId}.
	 * @param ctx the parse tree
	 */
	void enterKeyId(@NotNull NotaQL2KeyValueOutParser.KeyIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyId}.
	 * @param ctx the parse tree
	 */
	void exitKeyId(@NotNull NotaQL2KeyValueOutParser.KeyIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2KeyValueOutParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2KeyValueOutParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2KeyValueOutParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2KeyValueOutParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#keyOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterKeyOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#keyOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitKeyOutputPath(@NotNull NotaQL2KeyValueOutParser.KeyOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2KeyValueOutParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2KeyValueOutParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2KeyValueOutParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2KeyValueOutParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#valueOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterValueOutputPath(@NotNull NotaQL2KeyValueOutParser.ValueOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#valueOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitValueOutputPath(@NotNull NotaQL2KeyValueOutParser.ValueOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2KeyValueOutParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2KeyValueOutParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2KeyValueOutParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2KeyValueOutParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2KeyValueOutParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2KeyValueOutParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2KeyValueOutParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2KeyValueOutParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2KeyValueOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2KeyValueOutParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2KeyValueOutParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2KeyValueOutParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2KeyValueOutParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2KeyValueOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2KeyValueOutParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2KeyValueOutParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2KeyValueOutParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2KeyValueOutParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2KeyValueOutParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2KeyValueOutParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2KeyValueOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2KeyValueOutParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2KeyValueOutParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2KeyValueOutParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2KeyValueOutParser.AndPredicateContext ctx);
}