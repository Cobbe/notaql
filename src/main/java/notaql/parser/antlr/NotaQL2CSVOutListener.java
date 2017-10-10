// Generated from notaql\parser\antlr\NotaQL2CSVOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2CSVOutParser}.
 */
public interface NotaQL2CSVOutListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2CSVOutParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2CSVOutParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2CSVOutParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2CSVOutParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2CSVOutParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2CSVOutParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2CSVOutParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2CSVOutParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2CSVOutParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2CSVOutParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#colIdOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterColIdOutputPath(@NotNull NotaQL2CSVOutParser.ColIdOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#colIdOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitColIdOutputPath(@NotNull NotaQL2CSVOutParser.ColIdOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2CSVOutParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2CSVOutParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2CSVOutParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2CSVOutParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2CSVOutParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2CSVOutParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2CSVOutParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2CSVOutParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2CSVOutParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2CSVOutParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2CSVOutParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2CSVOutParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2CSVOutParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2CSVOutParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2CSVOutParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2CSVOutParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2CSVOutParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2CSVOutParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#colId}.
	 * @param ctx the parse tree
	 */
	void enterColId(@NotNull NotaQL2CSVOutParser.ColIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#colId}.
	 * @param ctx the parse tree
	 */
	void exitColId(@NotNull NotaQL2CSVOutParser.ColIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2CSVOutParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2CSVOutParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2CSVOutParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2CSVOutParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2CSVOutParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2CSVOutParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2CSVOutParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2CSVOutParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2CSVOutParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2CSVOutParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2CSVOutParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2CSVOutParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2CSVOutParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2CSVOutParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2CSVOutParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2CSVOutParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2CSVOutParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2CSVOutParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2CSVOutParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2CSVOutParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2CSVOutParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2CSVOutParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2CSVOutParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2CSVOutParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2CSVOutParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2CSVOutParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2CSVOutParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2CSVOutParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2CSVOutParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2CSVOutParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2CSVOutParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2CSVOutParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2CSVOutParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2CSVOutParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2CSVOutParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2CSVOutParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2CSVOutParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2CSVOutParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2CSVOutParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2CSVOutParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2CSVOutParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2CSVOutParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2CSVOutParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterResolvedOutputPath(@NotNull NotaQL2CSVOutParser.ResolvedOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#resolvedOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitResolvedOutputPath(@NotNull NotaQL2CSVOutParser.ResolvedOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2CSVOutParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2CSVOutParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2CSVOutParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2CSVOutParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2CSVOutParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2CSVOutParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2CSVOutParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2CSVOutParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2CSVOutParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2CSVOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2CSVOutParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2CSVOutParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2CSVOutParser.AndPredicateContext ctx);
}