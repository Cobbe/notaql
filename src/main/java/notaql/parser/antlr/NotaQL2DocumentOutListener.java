// Generated from notaql\parser\antlr\NotaQL2DocumentOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2DocumentOutParser}.
 */
public interface NotaQL2DocumentOutListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2DocumentOutParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2DocumentOutParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2DocumentOutParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2DocumentOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void enterResolvedOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.ResolvedOutputAttributeStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void exitResolvedOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.ResolvedOutputAttributeStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2DocumentOutParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2DocumentOutParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2DocumentOutParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2DocumentOutParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2DocumentOutParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2DocumentOutParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2DocumentOutParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2DocumentOutParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2DocumentOutParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2DocumentOutParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2DocumentOutParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2DocumentOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#outputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterOutputPathStep(@NotNull NotaQL2DocumentOutParser.OutputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#outputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitOutputPathStep(@NotNull NotaQL2DocumentOutParser.OutputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2DocumentOutParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2DocumentOutParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2DocumentOutParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2DocumentOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2DocumentOutParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2DocumentOutParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2DocumentOutParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2DocumentOutParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2DocumentOutParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2DocumentOutParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2DocumentOutParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2DocumentOutParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2DocumentOutParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2DocumentOutParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2DocumentOutParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2DocumentOutParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2DocumentOutParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2DocumentOutParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2DocumentOutParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2DocumentOutParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2DocumentOutParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2DocumentOutParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2DocumentOutParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2DocumentOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2DocumentOutParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2DocumentOutParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2DocumentOutParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2DocumentOutParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2DocumentOutParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2DocumentOutParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2DocumentOutParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2DocumentOutParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#outputPath}.
	 * @param ctx the parse tree
	 */
	void enterOutputPath(@NotNull NotaQL2DocumentOutParser.OutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#outputPath}.
	 * @param ctx the parse tree
	 */
	void exitOutputPath(@NotNull NotaQL2DocumentOutParser.OutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#attributeIdOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void enterAttributeIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.AttributeIdOutputAttributeStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeIdOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void exitAttributeIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.AttributeIdOutputAttributeStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2DocumentOutParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2DocumentOutParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2DocumentOutParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2DocumentOutParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2DocumentOutParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2DocumentOutParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2DocumentOutParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2DocumentOutParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2DocumentOutParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2DocumentOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2DocumentOutParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2DocumentOutParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#idOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void enterIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.IdOutputAttributeStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#idOutputAttributeStep}.
	 * @param ctx the parse tree
	 */
	void exitIdOutputAttributeStep(@NotNull NotaQL2DocumentOutParser.IdOutputAttributeStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2DocumentOutParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2DocumentOutParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2DocumentOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2DocumentOutParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2DocumentOutParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2DocumentOutParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2DocumentOutParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedAttributeId}.
	 * @param ctx the parse tree
	 */
	void enterResolvedAttributeId(@NotNull NotaQL2DocumentOutParser.ResolvedAttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#resolvedAttributeId}.
	 * @param ctx the parse tree
	 */
	void exitResolvedAttributeId(@NotNull NotaQL2DocumentOutParser.ResolvedAttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2DocumentOutParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2DocumentOutParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2DocumentOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2DocumentOutParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2DocumentOutParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2DocumentOutParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2DocumentOutParser.AndPredicateContext ctx);
}