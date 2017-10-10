// Generated from notaql\parser\antlr\NotaQL2DocumentOut.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NotaQL2DocumentOutParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Id=8, SL_COMMENT=9, 
		OPTWS=10, OPTNL=11, IN=12, OUT=13, ARROW=14, EQ=15, NEQ=16, LT=17, LTEQ=18, 
		GT=19, GTEQ=20, AND=21, OR=22, PLUS=23, MINUS=24, DIV=25, TRUE=26, FALSE=27, 
		Int=28, Float=29, String=30, AVG=31, COUNT=32, MAX=33, MIN=34, SUM=35, 
		IMPLODE=36, LIST=37, OBJECT=38, Name=39, OPEN=40, CLOSE=41, ARRAYOPEN=42, 
		ARRAYCLOSE=43, RESOLVE=44, PREDICATE=45, STAR=46, AT=47, DOT=48, COLON=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'_id'", "SL_COMMENT", "OPTWS", "OPTNL", "'IN'", 
		"'OUT'", "'<-'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", 
		"'||'", "'+'", "'-'", "'/'", "'true'", "'false'", "Int", "Float", "String", 
		"'AVG'", "'COUNT'", "'MAX'", "'MIN'", "'SUM'", "'IMPLODE'", "'LIST'", 
		"'OBJECT'", "Name", "'('", "')'", "'['", "']'", "'$'", "'?'", "'*'", "'@'", 
		"'.'", "':'"
	};
	public static final int
		RULE_outputPath = 0, RULE_outputPathStep = 1, RULE_outputAttributeStep = 2, 
		RULE_resolvedAttributeId = 3, RULE_pathToken = 4, RULE_notaql = 5, RULE_transformation = 6, 
		RULE_inEngine = 7, RULE_outEngine = 8, RULE_engine = 9, RULE_attributeSpecification = 10, 
		RULE_genericOutputPath = 11, RULE_absoluteOutputPath = 12, RULE_relativeOutputPath = 13, 
		RULE_absoluteInputPath = 14, RULE_relativeInputPath = 15, RULE_path = 16, 
		RULE_genericPathToken = 17, RULE_vData = 18, RULE_aggregationFunction = 19, 
		RULE_constructorFunction = 20, RULE_genericFunction = 21, RULE_standalonePredicate = 22, 
		RULE_predicate = 23, RULE_inPredicate = 24, RULE_outPredicate = 25, RULE_atom = 26, 
		RULE_attributeId = 27, RULE_index = 28;
	public static final String[] ruleNames = {
		"outputPath", "outputPathStep", "outputAttributeStep", "resolvedAttributeId", 
		"pathToken", "notaql", "transformation", "inEngine", "outEngine", "engine", 
		"attributeSpecification", "genericOutputPath", "absoluteOutputPath", "relativeOutputPath", 
		"absoluteInputPath", "relativeInputPath", "path", "genericPathToken", 
		"vData", "aggregationFunction", "constructorFunction", "genericFunction", 
		"standalonePredicate", "predicate", "inPredicate", "outPredicate", "atom", 
		"attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2DocumentOut.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2DocumentOutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OutputPathContext extends ParserRuleContext {
		public OutputPathStepContext outputPathStep(int i) {
			return getRuleContext(OutputPathStepContext.class,i);
		}
		public List<OutputPathStepContext> outputPathStep() {
			return getRuleContexts(OutputPathStepContext.class);
		}
		public OutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputPathContext outputPath() throws RecognitionException {
		OutputPathContext _localctx = new OutputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_outputPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); outputPathStep();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(59); match(DOT);
				setState(60); outputPathStep();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputPathStepContext extends ParserRuleContext {
		public OutputAttributeStepContext outputAttributeStep() {
			return getRuleContext(OutputAttributeStepContext.class,0);
		}
		public OutputPathStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputPathStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterOutputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitOutputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitOutputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputPathStepContext outputPathStep() throws RecognitionException {
		OutputPathStepContext _localctx = new OutputPathStepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_outputPathStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); outputAttributeStep();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputAttributeStepContext extends ParserRuleContext {
		public OutputAttributeStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputAttributeStep; }
	 
		public OutputAttributeStepContext() { }
		public void copyFrom(OutputAttributeStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResolvedOutputAttributeStepContext extends OutputAttributeStepContext {
		public ResolvedAttributeIdContext resolvedAttributeId() {
			return getRuleContext(ResolvedAttributeIdContext.class,0);
		}
		public ResolvedOutputAttributeStepContext(OutputAttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterResolvedOutputAttributeStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitResolvedOutputAttributeStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitResolvedOutputAttributeStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdOutputAttributeStepContext extends OutputAttributeStepContext {
		public TerminalNode Id() { return getToken(NotaQL2DocumentOutParser.Id, 0); }
		public IdOutputAttributeStepContext(OutputAttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterIdOutputAttributeStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitIdOutputAttributeStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitIdOutputAttributeStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeIdOutputAttributeStepContext extends OutputAttributeStepContext {
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public AttributeIdOutputAttributeStepContext(OutputAttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAttributeIdOutputAttributeStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAttributeIdOutputAttributeStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAttributeIdOutputAttributeStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputAttributeStepContext outputAttributeStep() throws RecognitionException {
		OutputAttributeStepContext _localctx = new OutputAttributeStepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_outputAttributeStep);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case Name:
				_localctx = new AttributeIdOutputAttributeStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); attributeId();
				}
				break;
			case Id:
				_localctx = new IdOutputAttributeStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(Id);
				}
				break;
			case RESOLVE:
				_localctx = new ResolvedOutputAttributeStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70); resolvedAttributeId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResolvedAttributeIdContext extends ParserRuleContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedAttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolvedAttributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterResolvedAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitResolvedAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitResolvedAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResolvedAttributeIdContext resolvedAttributeId() throws RecognitionException {
		ResolvedAttributeIdContext _localctx = new ResolvedAttributeIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_resolvedAttributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(RESOLVE);
			setState(74); match(OPEN);
			setState(75); absoluteInputPath();
			setState(76); match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathTokenContext extends ParserRuleContext {
		public GenericPathTokenContext genericPathToken() {
			return getRuleContext(GenericPathTokenContext.class,0);
		}
		public TerminalNode Id() { return getToken(NotaQL2DocumentOutParser.Id, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pathToken);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case IN:
			case EQ:
			case NEQ:
			case LT:
			case LTEQ:
			case GT:
			case GTEQ:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case DIV:
			case Int:
			case Float:
			case String:
			case Name:
			case OPEN:
			case ARRAYOPEN:
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
			case DOT:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); genericPathToken();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(Id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotaqlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NotaQL2DocumentOutParser.EOF, 0); }
		public List<TransformationContext> transformation() {
			return getRuleContexts(TransformationContext.class);
		}
		public TransformationContext transformation(int i) {
			return getRuleContext(TransformationContext.class,i);
		}
		public NotaqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notaql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(82); transformation();
					setState(83); match(3);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(90); transformation();
			setState(92);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(91); match(3);
				}
			}

			setState(94); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformationContext extends ParserRuleContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public InPredicateContext inPredicate() {
			return getRuleContext(InPredicateContext.class,0);
		}
		public OutEngineContext outEngine() {
			return getRuleContext(OutEngineContext.class,0);
		}
		public InEngineContext inEngine() {
			return getRuleContext(InEngineContext.class,0);
		}
		public OutPredicateContext outPredicate() {
			return getRuleContext(OutPredicateContext.class,0);
		}
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public TransformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); inEngine();
			setState(97); match(7);
			setState(98); outEngine();
			setState(99); match(7);
			setState(103);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(100); inPredicate();
				setState(101); match(7);
				}
			}

			setState(108);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(105); outPredicate();
				setState(106); match(7);
				}
			}

			setState(110); attributeSpecification();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(111); match(7);
				setState(112); attributeSpecification();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InEngineContext extends ParserRuleContext {
		public EngineContext engine() {
			return getRuleContext(EngineContext.class,0);
		}
		public InEngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inEngine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(5);
			setState(119); engine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutEngineContext extends ParserRuleContext {
		public EngineContext engine() {
			return getRuleContext(EngineContext.class,0);
		}
		public OutEngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outEngine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(2);
			setState(122); engine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngineContext extends ParserRuleContext {
		public Token engineName;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode Name(int i) {
			return getToken(NotaQL2DocumentOutParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2DocumentOutParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); ((EngineContext)_localctx).engineName = match(Name);
			setState(125); match(OPEN);
			setState(138);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(126); match(Name);
				setState(127); match(ARROW);
				setState(128); atom();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(129); match(7);
					setState(130); match(Name);
					setState(131); match(ARROW);
					setState(132); atom();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140); match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecificationContext extends ParserRuleContext {
		public GenericOutputPathContext genericOutputPath() {
			return getRuleContext(GenericOutputPathContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(NotaQL2DocumentOutParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); genericOutputPath();
			setState(143); match(ARROW);
			setState(144); vData(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericOutputPathContext extends ParserRuleContext {
		public GenericOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericOutputPath; }
	 
		public GenericOutputPathContext() { }
		public void copyFrom(GenericOutputPathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsoluteGenericOutputPathContext extends GenericOutputPathContext {
		public AbsoluteOutputPathContext absoluteOutputPath() {
			return getRuleContext(AbsoluteOutputPathContext.class,0);
		}
		public AbsoluteGenericOutputPathContext(GenericOutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeGenericOutputPathContext extends GenericOutputPathContext {
		public RelativeOutputPathContext relativeOutputPath() {
			return getRuleContext(RelativeOutputPathContext.class,0);
		}
		public RelativeGenericOutputPathContext(GenericOutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_genericOutputPath);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case Id:
			case IN:
			case ARROW:
			case EQ:
			case NEQ:
			case LT:
			case LTEQ:
			case GT:
			case GTEQ:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case DIV:
			case Int:
			case Float:
			case String:
			case Name:
			case OPEN:
			case ARRAYOPEN:
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
			case DOT:
			case COLON:
				_localctx = new RelativeGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147); absoluteOutputPath();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsoluteOutputPathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode OUT() { return getToken(NotaQL2DocumentOutParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(OUT);
			setState(151); match(DOT);
			setState(152); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativeOutputPathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsoluteInputPathContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode IN() { return getToken(NotaQL2DocumentOutParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(IN);
			setState(157); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativeInputPathContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NotaQL2DocumentOutParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(AT);
			setState(160); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathTokenContext pathToken(int i) {
			return getRuleContext(PathTokenContext.class,i);
		}
		public List<PathTokenContext> pathToken() {
			return getRuleContexts(PathTokenContext.class);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(162); pathToken();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericPathTokenContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NotaQL2DocumentOutParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2DocumentOutParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2DocumentOutParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2DocumentOutParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2DocumentOutParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2DocumentOutParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2DocumentOutParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2DocumentOutParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2DocumentOutParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2DocumentOutParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2DocumentOutParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2DocumentOutParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2DocumentOutParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2DocumentOutParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2DocumentOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2DocumentOutParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2DocumentOutParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2DocumentOutParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2DocumentOutParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2DocumentOutParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2DocumentOutParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2DocumentOutParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2DocumentOutParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2DocumentOutParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2DocumentOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2DocumentOutParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_genericPathToken);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); match(OPEN);
				setState(169); path();
				setState(170); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); match(ARRAYOPEN);
				setState(173); path();
				setState(174); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(177); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(178); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(179); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(180); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(181); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(182); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(183); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(184); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(185); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(186); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(187); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(188); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(189); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(190); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(191); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(192); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(193); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(194); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(195); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(196); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(197); match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VDataContext extends ParserRuleContext {
		public VDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vData; }
	 
		public VDataContext() { }
		public void copyFrom(VDataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorVDataContext extends VDataContext {
		public ConstructorFunctionContext constructorFunction() {
			return getRuleContext(ConstructorFunctionContext.class,0);
		}
		public ConstructorVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitConstructorVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFunctionVDataContext extends VDataContext {
		public GenericFunctionContext genericFunction() {
			return getRuleContext(GenericFunctionContext.class,0);
		}
		public GenericFunctionVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracedVDataContext extends VDataContext {
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public BracedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitBracedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeInputPathVDataContext extends VDataContext {
		public RelativeInputPathContext relativeInputPath() {
			return getRuleContext(RelativeInputPathContext.class,0);
		}
		public RelativeInputPathVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomVDataContext extends VDataContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAtomVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsoluteInputPathVDataContext extends VDataContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public AbsoluteInputPathVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2DocumentOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2DocumentOutParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2DocumentOutParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2DocumentOutParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregateVDataContext extends VDataContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public AggregateVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAggregateVData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VDataContext vData() throws RecognitionException {
		return vData(0);
	}

	private VDataContext vData(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VDataContext _localctx = new VDataContext(_ctx, _parentState);
		VDataContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); match(OPEN);
				setState(203); vData(0);
				setState(204); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(213);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(214);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(215); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(216);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(217);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(218); vData(7);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public Token function;
		public TerminalNode MIN() { return getToken(NotaQL2DocumentOutParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2DocumentOutParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2DocumentOutParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2DocumentOutParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2DocumentOutParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2DocumentOutParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2DocumentOutParser.SUM, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(225); match(OPEN);
			setState(227);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(226); vData(0);
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(229); match(7);
				setState(230); atom();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236); match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorFunctionContext extends ParserRuleContext {
		public ConstructorFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorFunction; }
	 
		public ConstructorFunctionContext() { }
		public void copyFrom(ConstructorFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode Name() { return getToken(NotaQL2DocumentOutParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2DocumentOutParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorFunction);
		int _la;
		try {
			setState(262);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238); match(OBJECT);
				setState(239); match(OPEN);
				setState(240); attributeSpecification();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(241); match(7);
					setState(242); attributeSpecification();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(Name);
				setState(251); match(OPEN);
				setState(252); attributeSpecification();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(253); match(7);
					setState(254); attributeSpecification();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260); match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericFunctionContext extends ParserRuleContext {
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode Name() { return getToken(NotaQL2DocumentOutParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(Name);
			setState(265); match(OPEN);
			setState(274);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(266); vData(0);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(267); match(7);
					setState(268); vData(0);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(276); match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandalonePredicateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NotaQL2DocumentOutParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); predicate(0);
			setState(279); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalPredicateContext extends PredicateContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(NotaQL2DocumentOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2DocumentOutParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2DocumentOutParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2DocumentOutParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2DocumentOutParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2DocumentOutParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2DocumentOutParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitOrPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsolutePathExistencePredicateContext extends PredicateContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public AbsolutePathExistencePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegatedPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public NegatedPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitNegatedPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracedPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BracedPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitBracedPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativePathExistencePredicateContext extends PredicateContext {
		public RelativeInputPathContext relativeInputPath() {
			return getRuleContext(RelativeInputPathContext.class,0);
		}
		public RelativePathExistencePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2DocumentOutParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAndPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(282); match(4);
				setState(283); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); match(OPEN);
				setState(285); predicate(0);
				setState(286); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); vData(0);
				setState(289);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(290); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(296);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(297); match(AND);
						setState(298); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(299);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(300); match(OR);
						setState(301); predicate(5);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InPredicateContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public InPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(1);
			setState(308); match(COLON);
			setState(309); predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutPredicateContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public OutPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(6);
			setState(312); match(COLON);
			setState(313); predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode String() { return getToken(NotaQL2DocumentOutParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2DocumentOutParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2DocumentOutParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2DocumentOutParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2DocumentOutParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atom);
		int _la;
		try {
			setState(319);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				_la = _input.LA(1);
				if ( !(_la==Int || _la==Float) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case String:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318); match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeIdContext extends ParserRuleContext {
		public Token attributeName;
		public TerminalNode Name() { return getToken(NotaQL2DocumentOutParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); ((AttributeIdContext)_localctx).attributeName = match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public Token indexNumber;
		public TerminalNode Int() { return getToken(NotaQL2DocumentOutParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentOutListener ) ((NotaQL2DocumentOutListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentOutVisitor ) return ((NotaQL2DocumentOutVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); ((IndexContext)_localctx).indexNumber = match(Int);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18: return vData_sempred((VDataContext)_localctx, predIndex);

		case 23: return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);

		case 3: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean vData_sempred(VDataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);

		case 1: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0148\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6S\n\6\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\5\7_\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b"+
		"\3\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\5"+
		"\13\u008d\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u0097\n\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\7\22\u00a6"+
		"\n\22\f\22\16\22\u00a9\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24\3\25\3\25\3\25"+
		"\5\25\u00e6\n\25\3\25\3\25\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u00f6\n\26\f\26\16\26\u00f9\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0102\n\26\f\26\16\26\u0105\13"+
		"\26\3\26\3\26\5\26\u0109\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u0110\n\27"+
		"\f\27\16\27\u0113\13\27\5\27\u0115\n\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0129"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0131\n\31\f\31\16\31\u0134\13"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0142"+
		"\n\34\3\35\3\35\3\36\3\36\3\36\3\u00a7\4&\60\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\4\2\33\33\60\60\3\2\31\32\3"+
		"\2!\'\3\2\21\26\3\2\36\37\u0166\2<\3\2\2\2\4D\3\2\2\2\6I\3\2\2\2\bK\3"+
		"\2\2\2\nR\3\2\2\2\fY\3\2\2\2\16b\3\2\2\2\20x\3\2\2\2\22{\3\2\2\2\24~\3"+
		"\2\2\2\26\u0090\3\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u009c\3\2"+
		"\2\2\36\u009e\3\2\2\2 \u00a1\3\2\2\2\"\u00a7\3\2\2\2$\u00c8\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00e2\3\2\2\2*\u0108\3\2\2\2,\u010a\3\2\2\2.\u0118\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u0135\3\2\2\2\64\u0139\3\2\2\2\66\u0141\3\2\2\28\u0143"+
		"\3\2\2\2:\u0145\3\2\2\2<A\5\4\3\2=>\7\62\2\2>@\5\4\3\2?=\3\2\2\2@C\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\5\6\4\2E\5\3\2\2\2FJ\5"+
		"8\35\2GJ\7\n\2\2HJ\5\b\5\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL"+
		"\7.\2\2LM\7*\2\2MN\5\36\20\2NO\7+\2\2O\t\3\2\2\2PS\5$\23\2QS\7\n\2\2R"+
		"P\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2TU\5\16\b\2UV\7\5\2\2VX\3\2\2\2WT\3\2\2"+
		"\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\5\16\b\2]_\7"+
		"\5\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\2\2\3a\r\3\2\2\2bc\5\20\t\2c"+
		"d\7\t\2\2de\5\22\n\2ei\7\t\2\2fg\5\62\32\2gh\7\t\2\2hj\3\2\2\2if\3\2\2"+
		"\2ij\3\2\2\2jn\3\2\2\2kl\5\64\33\2lm\7\t\2\2mo\3\2\2\2nk\3\2\2\2no\3\2"+
		"\2\2op\3\2\2\2pu\5\26\f\2qr\7\t\2\2rt\5\26\f\2sq\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2v\17\3\2\2\2wu\3\2\2\2xy\7\7\2\2yz\5\24\13\2z\21\3\2\2"+
		"\2{|\7\4\2\2|}\5\24\13\2}\23\3\2\2\2~\177\7)\2\2\177\u008c\7*\2\2\u0080"+
		"\u0081\7)\2\2\u0081\u0082\7\20\2\2\u0082\u0089\5\66\34\2\u0083\u0084\7"+
		"\t\2\2\u0084\u0085\7)\2\2\u0085\u0086\7\20\2\2\u0086\u0088\5\66\34\2\u0087"+
		"\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0080\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7+\2\2\u008f\25\3\2\2\2"+
		"\u0090\u0091\5\30\r\2\u0091\u0092\7\20\2\2\u0092\u0093\5&\24\2\u0093\27"+
		"\3\2\2\2\u0094\u0097\5\34\17\2\u0095\u0097\5\32\16\2\u0096\u0094\3\2\2"+
		"\2\u0096\u0095\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\7\17\2\2\u0099\u009a"+
		"\7\62\2\2\u009a\u009b\5\"\22\2\u009b\33\3\2\2\2\u009c\u009d\5\"\22\2\u009d"+
		"\35\3\2\2\2\u009e\u009f\7\16\2\2\u009f\u00a0\5\"\22\2\u00a0\37\3\2\2\2"+
		"\u00a1\u00a2\7\61\2\2\u00a2\u00a3\5\"\22\2\u00a3!\3\2\2\2\u00a4\u00a6"+
		"\5\n\6\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8#\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\u00ac\5\"\22\2\u00ac\u00ad\7+\2\2\u00ad\u00c9\3\2\2\2\u00ae\u00af\7,"+
		"\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7-\2\2\u00b1\u00c9\3\2\2\2\u00b2"+
		"\u00c9\7.\2\2\u00b3\u00c9\7/\2\2\u00b4\u00c9\7\60\2\2\u00b5\u00c9\7\61"+
		"\2\2\u00b6\u00c9\7 \2\2\u00b7\u00c9\7\36\2\2\u00b8\u00c9\7\37\2\2\u00b9"+
		"\u00c9\7)\2\2\u00ba\u00c9\7\62\2\2\u00bb\u00c9\7\63\2\2\u00bc\u00c9\7"+
		"\16\2\2\u00bd\u00c9\7\21\2\2\u00be\u00c9\7\22\2\2\u00bf\u00c9\7\23\2\2"+
		"\u00c0\u00c9\7\24\2\2\u00c1\u00c9\7\25\2\2\u00c2\u00c9\7\26\2\2\u00c3"+
		"\u00c9\7\31\2\2\u00c4\u00c9\7\32\2\2\u00c5\u00c9\7\33\2\2\u00c6\u00c9"+
		"\7\27\2\2\u00c7\u00c9\7\30\2\2\u00c8\u00aa\3\2\2\2\u00c8\u00ae\3\2\2\2"+
		"\u00c8\u00b2\3\2\2\2\u00c8\u00b3\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b5"+
		"\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8"+
		"\u00b9\3\2\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00bc\3\2"+
		"\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\b\24\1\2\u00cb\u00d6\5\66\34"+
		"\2\u00cc\u00cd\7*\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7+\2\2\u00cf\u00d6"+
		"\3\2\2\2\u00d0\u00d6\5(\25\2\u00d1\u00d6\5*\26\2\u00d2\u00d6\5,\27\2\u00d3"+
		"\u00d6\5\36\20\2\u00d4\u00d6\5 \21\2\u00d5\u00ca\3\2\2\2\u00d5\u00cc\3"+
		"\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00df\3\2\2\2\u00d7\u00d8\f\t"+
		"\2\2\u00d8\u00d9\t\2\2\2\u00d9\u00de\5&\24\n\u00da\u00db\f\b\2\2\u00db"+
		"\u00dc\t\3\2\2\u00dc\u00de\5&\24\t\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\'\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\t\4\2\2\u00e3\u00e5\7*\2\2"+
		"\u00e4\u00e6\5&\24\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb"+
		"\3\2\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00ea\5\66\34\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef)\3\2\2\2\u00f0\u00f1"+
		"\7(\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f7\5\26\f\2\u00f3\u00f4\7\t\2\2\u00f4"+
		"\u00f6\5\26\f\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fb\u0109\3\2\2\2\u00fc\u00fd\7)\2\2\u00fd\u00fe\7*\2"+
		"\2\u00fe\u0103\5\26\f\2\u00ff\u0100\7\t\2\2\u0100\u0102\5\26\f\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7+\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u00f0\3\2\2\2\u0108\u00fc\3\2\2\2\u0109+\3\2\2\2"+
		"\u010a\u010b\7)\2\2\u010b\u0114\7*\2\2\u010c\u0111\5&\24\2\u010d\u010e"+
		"\7\t\2\2\u010e\u0110\5&\24\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\7+\2\2\u0117-\3\2\2\2\u0118\u0119\5\60\31\2\u0119\u011a\7\2\2\3"+
		"\u011a/\3\2\2\2\u011b\u011c\b\31\1\2\u011c\u011d\7\6\2\2\u011d\u0129\5"+
		"\60\31\b\u011e\u011f\7*\2\2\u011f\u0120\5\60\31\2\u0120\u0121\7+\2\2\u0121"+
		"\u0129\3\2\2\2\u0122\u0123\5&\24\2\u0123\u0124\t\5\2\2\u0124\u0125\5&"+
		"\24\2\u0125\u0129\3\2\2\2\u0126\u0129\5\36\20\2\u0127\u0129\5 \21\2\u0128"+
		"\u011b\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0127\3\2\2\2\u0129\u0132\3\2\2\2\u012a\u012b\f\7\2\2\u012b"+
		"\u012c\7\27\2\2\u012c\u0131\5\60\31\b\u012d\u012e\f\6\2\2\u012e\u012f"+
		"\7\30\2\2\u012f\u0131\5\60\31\7\u0130\u012a\3\2\2\2\u0130\u012d\3\2\2"+
		"\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\61"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\3\2\2\u0136\u0137\7\63\2\2"+
		"\u0137\u0138\5\60\31\2\u0138\63\3\2\2\2\u0139\u013a\7\b\2\2\u013a\u013b"+
		"\7\63\2\2\u013b\u013c\5\60\31\2\u013c\65\3\2\2\2\u013d\u0142\t\6\2\2\u013e"+
		"\u0142\7 \2\2\u013f\u0142\7\34\2\2\u0140\u0142\7\35\2\2\u0141\u013d\3"+
		"\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\67\3\2\2\2\u0143\u0144\7)\2\2\u01449\3\2\2\2\u0145\u0146\7\36\2\2\u0146"+
		";\3\2\2\2\35AIRY^inu\u0089\u008c\u0096\u00a7\u00c8\u00d5\u00dd\u00df\u00e5"+
		"\u00eb\u00f7\u0103\u0108\u0111\u0114\u0128\u0130\u0132\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}