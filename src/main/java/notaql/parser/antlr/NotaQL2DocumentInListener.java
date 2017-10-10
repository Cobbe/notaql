// Generated from notaql\parser\antlr\NotaQL2DocumentIn.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotaQL2DocumentInParser}.
 */
public interface NotaQL2DocumentInListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void enterInEngine(@NotNull NotaQL2DocumentInParser.InEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#inEngine}.
	 * @param ctx the parse tree
	 */
	void exitInEngine(@NotNull NotaQL2DocumentInParser.InEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionVData(@NotNull NotaQL2DocumentInParser.GenericFunctionVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericFunctionVData}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionVData(@NotNull NotaQL2DocumentInParser.GenericFunctionVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelativePathExistencePredicate(@NotNull NotaQL2DocumentInParser.RelativePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relativePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelativePathExistencePredicate(@NotNull NotaQL2DocumentInParser.RelativePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunction(@NotNull NotaQL2DocumentInParser.GenericFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunction(@NotNull NotaQL2DocumentInParser.GenericFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void enterNotaql(@NotNull NotaQL2DocumentInParser.NotaqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#notaql}.
	 * @param ctx the parse tree
	 */
	void exitNotaql(@NotNull NotaQL2DocumentInParser.NotaqlContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull NotaQL2DocumentInParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull NotaQL2DocumentInParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#stringSplitMethod}.
	 * @param ctx the parse tree
	 */
	void enterStringSplitMethod(@NotNull NotaQL2DocumentInParser.StringSplitMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#stringSplitMethod}.
	 * @param ctx the parse tree
	 */
	void exitStringSplitMethod(@NotNull NotaQL2DocumentInParser.StringSplitMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNegatedPredicate(@NotNull NotaQL2DocumentInParser.NegatedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#negatedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNegatedPredicate(@NotNull NotaQL2DocumentInParser.NegatedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#methodPathStep}.
	 * @param ctx the parse tree
	 */
	void enterMethodPathStep(@NotNull NotaQL2DocumentInParser.MethodPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#methodPathStep}.
	 * @param ctx the parse tree
	 */
	void exitMethodPathStep(@NotNull NotaQL2DocumentInParser.MethodPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(@NotNull NotaQL2DocumentInParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#trueAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(@NotNull NotaQL2DocumentInParser.TrueAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteGenericOutputPath(@NotNull NotaQL2DocumentInParser.AbsoluteGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterObjectConstructorFunction(@NotNull NotaQL2DocumentInParser.ObjectConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#objectConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitObjectConstructorFunction(@NotNull NotaQL2DocumentInParser.ObjectConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#attributeIdStep}.
	 * @param ctx the parse tree
	 */
	void enterAttributeIdStep(@NotNull NotaQL2DocumentInParser.AttributeIdStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#attributeIdStep}.
	 * @param ctx the parse tree
	 */
	void exitAttributeIdStep(@NotNull NotaQL2DocumentInParser.AttributeIdStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericListStep}.
	 * @param ctx the parse tree
	 */
	void enterGenericListStep(@NotNull NotaQL2DocumentInParser.GenericListStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericListStep}.
	 * @param ctx the parse tree
	 */
	void exitGenericListStep(@NotNull NotaQL2DocumentInParser.GenericListStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull NotaQL2DocumentInParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull NotaQL2DocumentInParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicatedVData(@NotNull NotaQL2DocumentInParser.MultiplicatedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#multiplicatedVData}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicatedVData(@NotNull NotaQL2DocumentInParser.MultiplicatedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull NotaQL2DocumentInParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#numberAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull NotaQL2DocumentInParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVData(@NotNull NotaQL2DocumentInParser.AggregateVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#aggregateVData}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVData(@NotNull NotaQL2DocumentInParser.AggregateVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#inputPath}.
	 * @param ctx the parse tree
	 */
	void enterInputPath(@NotNull NotaQL2DocumentInParser.InputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#inputPath}.
	 * @param ctx the parse tree
	 */
	void exitInputPath(@NotNull NotaQL2DocumentInParser.InputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void enterPathToken(@NotNull NotaQL2DocumentInParser.PathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#pathToken}.
	 * @param ctx the parse tree
	 */
	void exitPathToken(@NotNull NotaQL2DocumentInParser.PathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void enterConstructorVData(@NotNull NotaQL2DocumentInParser.ConstructorVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#constructorVData}.
	 * @param ctx the parse tree
	 */
	void exitConstructorVData(@NotNull NotaQL2DocumentInParser.ConstructorVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentInParser.AbsolutePathExistencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#absolutePathExistencePredicate}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathExistencePredicate(@NotNull NotaQL2DocumentInParser.AbsolutePathExistencePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void enterBracedVData(@NotNull NotaQL2DocumentInParser.BracedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#bracedVData}.
	 * @param ctx the parse tree
	 */
	void exitBracedVData(@NotNull NotaQL2DocumentInParser.BracedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull NotaQL2DocumentInParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#stringAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull NotaQL2DocumentInParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(@NotNull NotaQL2DocumentInParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#falseAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(@NotNull NotaQL2DocumentInParser.FalseAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#indexPathMethod}.
	 * @param ctx the parse tree
	 */
	void enterIndexPathMethod(@NotNull NotaQL2DocumentInParser.IndexPathMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#indexPathMethod}.
	 * @param ctx the parse tree
	 */
	void exitIndexPathMethod(@NotNull NotaQL2DocumentInParser.IndexPathMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBracedPredicate(@NotNull NotaQL2DocumentInParser.BracedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#bracedPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBracedPredicate(@NotNull NotaQL2DocumentInParser.BracedPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#predicateGenericStep}.
	 * @param ctx the parse tree
	 */
	void enterPredicateGenericStep(@NotNull NotaQL2DocumentInParser.PredicateGenericStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#predicateGenericStep}.
	 * @param ctx the parse tree
	 */
	void exitPredicateGenericStep(@NotNull NotaQL2DocumentInParser.PredicateGenericStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPath(@NotNull NotaQL2DocumentInParser.RelativeInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPath(@NotNull NotaQL2DocumentInParser.RelativeInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#namePathMethod}.
	 * @param ctx the parse tree
	 */
	void enterNamePathMethod(@NotNull NotaQL2DocumentInParser.NamePathMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#namePathMethod}.
	 * @param ctx the parse tree
	 */
	void exitNamePathMethod(@NotNull NotaQL2DocumentInParser.NamePathMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorFunction(@NotNull NotaQL2DocumentInParser.GenericConstructorFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericConstructorFunction}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorFunction(@NotNull NotaQL2DocumentInParser.GenericConstructorFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void enterAtomVData(@NotNull NotaQL2DocumentInParser.AtomVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#atomVData}.
	 * @param ctx the parse tree
	 */
	void exitAtomVData(@NotNull NotaQL2DocumentInParser.AtomVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void enterAttributeId(@NotNull NotaQL2DocumentInParser.AttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#attributeId}.
	 * @param ctx the parse tree
	 */
	void exitAttributeId(@NotNull NotaQL2DocumentInParser.AttributeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#idStep}.
	 * @param ctx the parse tree
	 */
	void enterIdStep(@NotNull NotaQL2DocumentInParser.IdStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#idStep}.
	 * @param ctx the parse tree
	 */
	void exitIdStep(@NotNull NotaQL2DocumentInParser.IdStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#attributePathStep}.
	 * @param ctx the parse tree
	 */
	void enterAttributePathStep(@NotNull NotaQL2DocumentInParser.AttributePathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#attributePathStep}.
	 * @param ctx the parse tree
	 */
	void exitAttributePathStep(@NotNull NotaQL2DocumentInParser.AttributePathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void enterOutEngine(@NotNull NotaQL2DocumentInParser.OutEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#outEngine}.
	 * @param ctx the parse tree
	 */
	void exitOutEngine(@NotNull NotaQL2DocumentInParser.OutEngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(@NotNull NotaQL2DocumentInParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(@NotNull NotaQL2DocumentInParser.EngineContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeOutputPath(@NotNull NotaQL2DocumentInParser.RelativeOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relativeOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeOutputPath(@NotNull NotaQL2DocumentInParser.RelativeOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPathVData(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPathVData(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#splitPathMethod}.
	 * @param ctx the parse tree
	 */
	void enterSplitPathMethod(@NotNull NotaQL2DocumentInParser.SplitPathMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#splitPathMethod}.
	 * @param ctx the parse tree
	 */
	void exitSplitPathMethod(@NotNull NotaQL2DocumentInParser.SplitPathMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void enterGenericPathToken(@NotNull NotaQL2DocumentInParser.GenericPathTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericPathToken}.
	 * @param ctx the parse tree
	 */
	void exitGenericPathToken(@NotNull NotaQL2DocumentInParser.GenericPathTokenContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void enterStandalonePredicate(@NotNull NotaQL2DocumentInParser.StandalonePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#standalonePredicate}.
	 * @param ctx the parse tree
	 */
	void exitStandalonePredicate(@NotNull NotaQL2DocumentInParser.StandalonePredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOrPredicate(@NotNull NotaQL2DocumentInParser.OrPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#orPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOrPredicate(@NotNull NotaQL2DocumentInParser.OrPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#listPathStep}.
	 * @param ctx the parse tree
	 */
	void enterListPathStep(@NotNull NotaQL2DocumentInParser.ListPathStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#listPathStep}.
	 * @param ctx the parse tree
	 */
	void exitListPathStep(@NotNull NotaQL2DocumentInParser.ListPathStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void enterOutPredicate(@NotNull NotaQL2DocumentInParser.OutPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#outPredicate}.
	 * @param ctx the parse tree
	 */
	void exitOutPredicate(@NotNull NotaQL2DocumentInParser.OutPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void enterRelativeInputPathVData(@NotNull NotaQL2DocumentInParser.RelativeInputPathVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relativeInputPathVData}.
	 * @param ctx the parse tree
	 */
	void exitRelativeInputPathVData(@NotNull NotaQL2DocumentInParser.RelativeInputPathVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(@NotNull NotaQL2DocumentInParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(@NotNull NotaQL2DocumentInParser.InPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecification(@NotNull NotaQL2DocumentInParser.AttributeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#attributeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecification(@NotNull NotaQL2DocumentInParser.AttributeSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void enterRelativeGenericOutputPath(@NotNull NotaQL2DocumentInParser.RelativeGenericOutputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relativeGenericOutputPath}.
	 * @param ctx the parse tree
	 */
	void exitRelativeGenericOutputPath(@NotNull NotaQL2DocumentInParser.RelativeGenericOutputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void enterTransformation(@NotNull NotaQL2DocumentInParser.TransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#transformation}.
	 * @param ctx the parse tree
	 */
	void exitTransformation(@NotNull NotaQL2DocumentInParser.TransformationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(@NotNull NotaQL2DocumentInParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(@NotNull NotaQL2DocumentInParser.AggregationFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#genericAttributeStep}.
	 * @param ctx the parse tree
	 */
	void enterGenericAttributeStep(@NotNull NotaQL2DocumentInParser.GenericAttributeStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#genericAttributeStep}.
	 * @param ctx the parse tree
	 */
	void exitGenericAttributeStep(@NotNull NotaQL2DocumentInParser.GenericAttributeStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#splitNameStep}.
	 * @param ctx the parse tree
	 */
	void enterSplitNameStep(@NotNull NotaQL2DocumentInParser.SplitNameStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#splitNameStep}.
	 * @param ctx the parse tree
	 */
	void exitSplitNameStep(@NotNull NotaQL2DocumentInParser.SplitNameStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationalPredicate(@NotNull NotaQL2DocumentInParser.RelationalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#relationalPredicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationalPredicate(@NotNull NotaQL2DocumentInParser.RelationalPredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#anyGenericStep}.
	 * @param ctx the parse tree
	 */
	void enterAnyGenericStep(@NotNull NotaQL2DocumentInParser.AnyGenericStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#anyGenericStep}.
	 * @param ctx the parse tree
	 */
	void exitAnyGenericStep(@NotNull NotaQL2DocumentInParser.AnyGenericStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteInputPath(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#absoluteInputPath}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteInputPath(@NotNull NotaQL2DocumentInParser.AbsoluteInputPathContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#indexListStep}.
	 * @param ctx the parse tree
	 */
	void enterIndexListStep(@NotNull NotaQL2DocumentInParser.IndexListStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#indexListStep}.
	 * @param ctx the parse tree
	 */
	void exitIndexListStep(@NotNull NotaQL2DocumentInParser.IndexListStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#resolvedGenericStep}.
	 * @param ctx the parse tree
	 */
	void enterResolvedGenericStep(@NotNull NotaQL2DocumentInParser.ResolvedGenericStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#resolvedGenericStep}.
	 * @param ctx the parse tree
	 */
	void exitResolvedGenericStep(@NotNull NotaQL2DocumentInParser.ResolvedGenericStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void enterAddedVData(@NotNull NotaQL2DocumentInParser.AddedVDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#addedVData}.
	 * @param ctx the parse tree
	 */
	void exitAddedVData(@NotNull NotaQL2DocumentInParser.AddedVDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#currentGenericStep}.
	 * @param ctx the parse tree
	 */
	void enterCurrentGenericStep(@NotNull NotaQL2DocumentInParser.CurrentGenericStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#currentGenericStep}.
	 * @param ctx the parse tree
	 */
	void exitCurrentGenericStep(@NotNull NotaQL2DocumentInParser.CurrentGenericStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link NotaQL2DocumentInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void enterAndPredicate(@NotNull NotaQL2DocumentInParser.AndPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotaQL2DocumentInParser#andPredicate}.
	 * @param ctx the parse tree
	 */
	void exitAndPredicate(@NotNull NotaQL2DocumentInParser.AndPredicateContext ctx);
}