// Generated from notaql\parser\antlr\NotaQL2CSVIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2CSVInParser}.
 */
public interface NotaQL2CSVInListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2CSVInParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2CSVInParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2CSVInParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2CSVInParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2CSVInParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2CSVInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2CSVInParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2CSVInParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2CSVInParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2CSVInParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterColIdInputPathStep(@NotNull NotaQL2CSVInParser.ColIdInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitColIdInputPathStep(@NotNull NotaQL2CSVInParser.ColIdInputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2CSVInParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2CSVInParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2CSVInParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2CSVInParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterCellInputPathStep(@NotNull NotaQL2CSVInParser.CellInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitCellInputPathStep(@NotNull NotaQL2CSVInParser.CellInputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2CSVInParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2CSVInParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(@NotNull NotaQL2CSVInParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(@NotNull NotaQL2CSVInParser.ColIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2CSVInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2CSVInParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2CSVInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2CSVInParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2CSVInParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2CSVInParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2CSVInParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2CSVInParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2CSVInParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2CSVInParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2CSVInParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2CSVInParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2CSVInParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2CSVInParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2CSVInParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2CSVInParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2CSVInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2CSVInParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2CSVInParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2CSVInParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2CSVInParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2CSVInParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2CSVInParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2CSVInParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2CSVInParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2CSVInParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2CSVInParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2CSVInParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2CSVInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 */
	void enterSplittedInputPath(@NotNull NotaQL2CSVInParser.SplittedInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 */
	void exitSplittedInputPath(@NotNull NotaQL2CSVInParser.SplittedInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2CSVInParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2CSVInParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 */
	void enterSimpleInputPath(@NotNull NotaQL2CSVInParser.SimpleInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 */
	void exitSimpleInputPath(@NotNull NotaQL2CSVInParser.SimpleInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2CSVInParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2CSVInParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2CSVInParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2CSVInParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2CSVInParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2CSVInParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2CSVInParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2CSVInParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 */
	void enterRelativeCurrentCellPathStep(@NotNull NotaQL2CSVInParser.RelativeCurrentCellPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 */
	void exitRelativeCurrentCellPathStep(@NotNull NotaQL2CSVInParser.RelativeCurrentCellPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2CSVInParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2CSVInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2CSVInParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2CSVInParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2CSVInParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2CSVInParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2CSVInParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2CSVInParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2CSVInParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2CSVInParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2CSVInParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2CSVInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2CSVInParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2CSVInParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2CSVInParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2CSVInParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2CSVInParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2CSVInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2CSVInParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2CSVInParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2CSVInParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2CSVInParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2CSVInParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2CSVInParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2CSVInParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2CSVInParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2CSVInParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2CSVInParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2CSVInParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2CSVInParser.AndPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterResolvedInputPathStep(@NotNull NotaQL2CSVInParser.ResolvedInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitResolvedInputPathStep(@NotNull NotaQL2CSVInParser.ResolvedInputPathStepContext ctx);
}