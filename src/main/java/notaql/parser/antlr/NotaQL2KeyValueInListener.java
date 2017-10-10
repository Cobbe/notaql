// Generated from notaql\parser\antlr\NotaQL2KeyValueIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2KeyValueInParser}.
 */
public interface NotaQL2KeyValueInListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2KeyValueInParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2KeyValueInParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2KeyValueInParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2KeyValueInParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2KeyValueInParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2KeyValueInParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2KeyValueInParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2KeyValueInParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2KeyValueInParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2KeyValueInParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2KeyValueInParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2KeyValueInParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2KeyValueInParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2KeyValueInParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#splitStep}.
	 * @param ctx the parse tree
	 */
	void enterSplitStep(@NotNull NotaQL2KeyValueInParser.SplitStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#splitStep}.
	 * @param ctx the parse tree
	 */
	void exitSplitStep(@NotNull NotaQL2KeyValueInParser.SplitStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#predicateGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void enterPredicateGenericComplexStep(@NotNull NotaQL2KeyValueInParser.PredicateGenericComplexStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#predicateGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void exitPredicateGenericComplexStep(@NotNull NotaQL2KeyValueInParser.PredicateGenericComplexStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2KeyValueInParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2KeyValueInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexListStep}.
	 * @param ctx the parse tree
	 */
	void enterGenericComplexListStep(@NotNull NotaQL2KeyValueInParser.GenericComplexListStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexListStep}.
	 * @param ctx the parse tree
	 */
	void exitGenericComplexListStep(@NotNull NotaQL2KeyValueInParser.GenericComplexListStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2KeyValueInParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2KeyValueInParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2KeyValueInParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2KeyValueInParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2KeyValueInParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2KeyValueInParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2KeyValueInParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2KeyValueInParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#keyInputPath}.
	 * @param ctx the parse tree
	 */
	void enterKeyInputPath(@NotNull NotaQL2KeyValueInParser.KeyInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#keyInputPath}.
	 * @param ctx the parse tree
	 */
	void exitKeyInputPath(@NotNull NotaQL2KeyValueInParser.KeyInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#hashPathStep}.
	 * @param ctx the parse tree
	 */
	void enterHashPathStep(@NotNull NotaQL2KeyValueInParser.HashPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#hashPathStep}.
	 * @param ctx the parse tree
	 */
	void exitHashPathStep(@NotNull NotaQL2KeyValueInParser.HashPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexHashStep}.
	 * @param ctx the parse tree
	 */
	void enterGenericComplexHashStep(@NotNull NotaQL2KeyValueInParser.GenericComplexHashStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericComplexHashStep}.
	 * @param ctx the parse tree
	 */
	void exitGenericComplexHashStep(@NotNull NotaQL2KeyValueInParser.GenericComplexHashStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2KeyValueInParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2KeyValueInParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2KeyValueInParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2KeyValueInParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2KeyValueInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2KeyValueInParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2KeyValueInParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2KeyValueInParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2KeyValueInParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2KeyValueInParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2KeyValueInParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2KeyValueInParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2KeyValueInParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#keyIdHashStep}.
	 * @param ctx the parse tree
	 */
	void enterKeyIdHashStep(@NotNull NotaQL2KeyValueInParser.KeyIdHashStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#keyIdHashStep}.
	 * @param ctx the parse tree
	 */
	void exitKeyIdHashStep(@NotNull NotaQL2KeyValueInParser.KeyIdHashStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2KeyValueInParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2KeyValueInParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#resolvedGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void enterResolvedGenericComplexStep(@NotNull NotaQL2KeyValueInParser.ResolvedGenericComplexStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#resolvedGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void exitResolvedGenericComplexStep(@NotNull NotaQL2KeyValueInParser.ResolvedGenericComplexStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#currentGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void enterCurrentGenericComplexStep(@NotNull NotaQL2KeyValueInParser.CurrentGenericComplexStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#currentGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void exitCurrentGenericComplexStep(@NotNull NotaQL2KeyValueInParser.CurrentGenericComplexStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2KeyValueInParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2KeyValueInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#nameHashMethod}.
	 * @param ctx the parse tree
	 */
	void enterNameHashMethod(@NotNull NotaQL2KeyValueInParser.NameHashMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#nameHashMethod}.
	 * @param ctx the parse tree
	 */
	void exitNameHashMethod(@NotNull NotaQL2KeyValueInParser.NameHashMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#keyId}.
	 * @param ctx the parse tree
	 */
	void enterKeyId(@NotNull NotaQL2KeyValueInParser.KeyIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#keyId}.
	 * @param ctx the parse tree
	 */
	void exitKeyId(@NotNull NotaQL2KeyValueInParser.KeyIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2KeyValueInParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2KeyValueInParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2KeyValueInParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2KeyValueInParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2KeyValueInParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2KeyValueInParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2KeyValueInParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2KeyValueInParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#indexListMethod}.
	 * @param ctx the parse tree
	 */
	void enterIndexListMethod(@NotNull NotaQL2KeyValueInParser.IndexListMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#indexListMethod}.
	 * @param ctx the parse tree
	 */
	void exitIndexListMethod(@NotNull NotaQL2KeyValueInParser.IndexListMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#anyGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void enterAnyGenericComplexStep(@NotNull NotaQL2KeyValueInParser.AnyGenericComplexStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#anyGenericComplexStep}.
	 * @param ctx the parse tree
	 */
	void exitAnyGenericComplexStep(@NotNull NotaQL2KeyValueInParser.AnyGenericComplexStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2KeyValueInParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2KeyValueInParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2KeyValueInParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2KeyValueInParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#valueInputPath}.
	 * @param ctx the parse tree
	 */
	void enterValueInputPath(@NotNull NotaQL2KeyValueInParser.ValueInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#valueInputPath}.
	 * @param ctx the parse tree
	 */
	void exitValueInputPath(@NotNull NotaQL2KeyValueInParser.ValueInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2KeyValueInParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2KeyValueInParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#listPathStep}.
	 * @param ctx the parse tree
	 */
	void enterListPathStep(@NotNull NotaQL2KeyValueInParser.ListPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#listPathStep}.
	 * @param ctx the parse tree
	 */
	void exitListPathStep(@NotNull NotaQL2KeyValueInParser.ListPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2KeyValueInParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2KeyValueInParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2KeyValueInParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2KeyValueInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2KeyValueInParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2KeyValueInParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2KeyValueInParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2KeyValueInParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2KeyValueInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2KeyValueInParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2KeyValueInParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2KeyValueInParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2KeyValueInParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2KeyValueInParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2KeyValueInParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2KeyValueInParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#indexListStep}.
	 * @param ctx the parse tree
	 */
	void enterIndexListStep(@NotNull NotaQL2KeyValueInParser.IndexListStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#indexListStep}.
	 * @param ctx the parse tree
	 */
	void exitIndexListStep(@NotNull NotaQL2KeyValueInParser.IndexListStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2KeyValueInParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2KeyValueInParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2KeyValueInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2KeyValueInParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2KeyValueInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2KeyValueInParser.AndPredicateContext ctx);
}