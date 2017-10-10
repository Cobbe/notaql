// Generated from notaql\parser\antlr\NotaQL2ColumnIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2ColumnInParser}.
 */
public interface NotaQL2ColumnInListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2ColumnInParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2ColumnInParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2ColumnInParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2ColumnInParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2ColumnInParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2ColumnInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2ColumnInParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2ColumnInParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2ColumnInParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2ColumnInParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterColIdInputPathStep(@NotNull NotaQL2ColumnInParser.ColIdInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#colIdInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitColIdInputPathStep(@NotNull NotaQL2ColumnInParser.ColIdInputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2ColumnInParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2ColumnInParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2ColumnInParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2ColumnInParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterCellInputPathStep(@NotNull NotaQL2ColumnInParser.CellInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#cellInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitCellInputPathStep(@NotNull NotaQL2ColumnInParser.CellInputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2ColumnInParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2ColumnInParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(@NotNull NotaQL2ColumnInParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(@NotNull NotaQL2ColumnInParser.ColIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2ColumnInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2ColumnInParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2ColumnInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2ColumnInParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2ColumnInParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2ColumnInParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2ColumnInParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2ColumnInParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2ColumnInParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2ColumnInParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2ColumnInParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#rowInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterRowInputPathStep(@NotNull NotaQL2ColumnInParser.RowInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#rowInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitRowInputPathStep(@NotNull NotaQL2ColumnInParser.RowInputPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2ColumnInParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2ColumnInParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2ColumnInParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2ColumnInParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2ColumnInParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2ColumnInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2ColumnInParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2ColumnInParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2ColumnInParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2ColumnInParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2ColumnInParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2ColumnInParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2ColumnInParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2ColumnInParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2ColumnInParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2ColumnInParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2ColumnInParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2ColumnInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 */
	void enterSplittedInputPath(@NotNull NotaQL2ColumnInParser.SplittedInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#splittedInputPath}.
	 * @param ctx the parse tree
	 */
	void exitSplittedInputPath(@NotNull NotaQL2ColumnInParser.SplittedInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2ColumnInParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2ColumnInParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 */
	void enterSimpleInputPath(@NotNull NotaQL2ColumnInParser.SimpleInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#simpleInputPath}.
	 * @param ctx the parse tree
	 */
	void exitSimpleInputPath(@NotNull NotaQL2ColumnInParser.SimpleInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2ColumnInParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2ColumnInParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2ColumnInParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2ColumnInParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2ColumnInParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2ColumnInParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2ColumnInParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2ColumnInParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 */
	void enterRelativeCurrentCellPathStep(@NotNull NotaQL2ColumnInParser.RelativeCurrentCellPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativeCurrentCellPathStep}.
	 * @param ctx the parse tree
	 */
	void exitRelativeCurrentCellPathStep(@NotNull NotaQL2ColumnInParser.RelativeCurrentCellPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2ColumnInParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2ColumnInParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2ColumnInParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2ColumnInParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2ColumnInParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2ColumnInParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2ColumnInParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2ColumnInParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2ColumnInParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2ColumnInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2ColumnInParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2ColumnInParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2ColumnInParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2ColumnInParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2ColumnInParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2ColumnInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2ColumnInParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2ColumnInParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2ColumnInParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2ColumnInParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2ColumnInParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2ColumnInParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2ColumnInParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2ColumnInParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2ColumnInParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2ColumnInParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2ColumnInParser.AndPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2ColumnInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 */
	void enterResolvedInputPathStep(@NotNull NotaQL2ColumnInParser.ResolvedInputPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2ColumnInParser#resolvedInputPathStep}.
	 * @param ctx the parse tree
	 */
	void exitResolvedInputPathStep(@NotNull NotaQL2ColumnInParser.ResolvedInputPathStepContext ctx);
}