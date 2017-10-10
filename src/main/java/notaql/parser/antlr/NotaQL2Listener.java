// Generated from notaql\parser\antlr\NotaQL2.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2Parser}.
 */
public interface NotaQL2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2Parser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2Parser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2Parser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2Parser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2Parser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2Parser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2Parser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2Parser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2Parser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2Parser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2Parser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2Parser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2Parser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2Parser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2Parser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2Parser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2Parser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2Parser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2Parser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2Parser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2Parser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2Parser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2Parser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2Parser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2Parser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2Parser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2Parser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2Parser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2Parser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2Parser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2Parser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2Parser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2Parser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2Parser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2Parser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2Parser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2Parser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2Parser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2Parser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2Parser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2Parser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2Parser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2Parser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2Parser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2Parser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2Parser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2Parser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2Parser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2Parser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2Parser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2Parser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2Parser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2Parser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2Parser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2Parser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2Parser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2Parser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2Parser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2Parser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2Parser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2Parser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2Parser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2Parser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2Parser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2Parser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2Parser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2Parser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2Parser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2Parser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2Parser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2Parser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2Parser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2Parser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2Parser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2Parser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2Parser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2Parser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2Parser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2Parser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2Parser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2Parser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2Parser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2Parser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2Parser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2Parser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2Parser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2Parser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2Parser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2Parser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2Parser.AndPredicateContext ctx);
}