// Generated from notaql\parser\antlr\NotaQL2CSVIn.g4 by ANTLR 4.2.1
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
public class NotaQL2CSVInParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Col=8, Val=9, 
		Split=10, SL_COMMENT=11, OPTWS=12, OPTNL=13, IN=14, OUT=15, ARROW=16, 
		EQ=17, NEQ=18, LT=19, LTEQ=20, GT=21, GTEQ=22, AND=23, OR=24, PLUS=25, 
		MINUS=26, DIV=27, TRUE=28, FALSE=29, Int=30, Float=31, String=32, AVG=33, 
		COUNT=34, MAX=35, MIN=36, SUM=37, IMPLODE=38, LIST=39, OBJECT=40, Name=41, 
		OPEN=42, CLOSE=43, ARRAYOPEN=44, ARRAYCLOSE=45, RESOLVE=46, PREDICATE=47, 
		STAR=48, AT=49, DOT=50, COLON=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'_c'", "'_v'", "'split'", "SL_COMMENT", "OPTWS", 
		"OPTNL", "'IN'", "'OUT'", "'<-'", "'='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", "'false'", "Int", 
		"Float", "String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", "'SUM'", "'IMPLODE'", 
		"'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", "']'", "'$'", "'?'", 
		"'*'", "'@'", "'.'", "':'"
	};
	public static final int
		RULE_inputPath = 0, RULE_firstInputPathStep = 1, RULE_colId = 2, RULE_pathToken = 3, 
		RULE_notaql = 4, RULE_transformation = 5, RULE_inEngine = 6, RULE_outEngine = 7, 
		RULE_engine = 8, RULE_attributeSpecification = 9, RULE_genericOutputPath = 10, 
		RULE_absoluteOutputPath = 11, RULE_relativeOutputPath = 12, RULE_absoluteInputPath = 13, 
		RULE_relativeInputPath = 14, RULE_path = 15, RULE_genericPathToken = 16, 
		RULE_vData = 17, RULE_aggregationFunction = 18, RULE_constructorFunction = 19, 
		RULE_genericFunction = 20, RULE_standalonePredicate = 21, RULE_predicate = 22, 
		RULE_inPredicate = 23, RULE_outPredicate = 24, RULE_atom = 25, RULE_attributeId = 26, 
		RULE_index = 27;
	public static final String[] ruleNames = {
		"inputPath", "firstInputPathStep", "colId", "pathToken", "notaql", "transformation", 
		"inEngine", "outEngine", "engine", "attributeSpecification", "genericOutputPath", 
		"absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", "relativeInputPath", 
		"path", "genericPathToken", "vData", "aggregationFunction", "constructorFunction", 
		"genericFunction", "standalonePredicate", "predicate", "inPredicate", 
		"outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2CSVIn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2CSVInParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputPathContext extends ParserRuleContext {
		public InputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputPath; }
	 
		public InputPathContext() { }
		public void copyFrom(InputPathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleInputPathContext extends InputPathContext {
		public FirstInputPathStepContext firstInputPathStep() {
			return getRuleContext(FirstInputPathStepContext.class,0);
		}
		public SimpleInputPathContext(InputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterSimpleInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitSimpleInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitSimpleInputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SplittedInputPathContext extends InputPathContext {
		public FirstInputPathStepContext firstInputPathStep() {
			return getRuleContext(FirstInputPathStepContext.class,0);
		}
		public TerminalNode Split() { return getToken(NotaQL2CSVInParser.Split, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SplittedInputPathContext(InputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterSplittedInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitSplittedInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitSplittedInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputPathContext inputPath() throws RecognitionException {
		InputPathContext _localctx = new InputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inputPath);
		int _la;
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SimpleInputPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); firstInputPathStep();
				}
				break;

			case 2:
				_localctx = new SplittedInputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57); firstInputPathStep();
				setState(58); match(DOT);
				setState(59); match(Split);
				setState(60); match(OPEN);
				setState(62);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(61); atom();
					}
				}

				setState(64); match(CLOSE);
				}
				break;
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

	public static class FirstInputPathStepContext extends ParserRuleContext {
		public FirstInputPathStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstInputPathStep; }
	 
		public FirstInputPathStepContext() { }
		public void copyFrom(FirstInputPathStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColIdInputPathStepContext extends FirstInputPathStepContext {
		public ColIdContext colId() {
			return getRuleContext(ColIdContext.class,0);
		}
		public ColIdInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterColIdInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitColIdInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitColIdInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeCurrentCellPathStepContext extends FirstInputPathStepContext {
		public RelativeCurrentCellPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativeCurrentCellPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativeCurrentCellPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativeCurrentCellPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CellInputPathStepContext extends FirstInputPathStepContext {
		public Token source;
		public TerminalNode Col() { return getToken(NotaQL2CSVInParser.Col, 0); }
		public TerminalNode Val() { return getToken(NotaQL2CSVInParser.Val, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public CellInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterCellInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitCellInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitCellInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResolvedInputPathStepContext extends FirstInputPathStepContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterResolvedInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitResolvedInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitResolvedInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstInputPathStepContext firstInputPathStep() throws RecognitionException {
		FirstInputPathStepContext _localctx = new FirstInputPathStepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstInputPathStep);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CellInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(DOT);
				setState(69);
				((CellInputPathStepContext)_localctx).source = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Col || _la==Val) ) {
					((CellInputPathStepContext)_localctx).source = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(75);
				_la = _input.LA(1);
				if (_la==PREDICATE) {
					{
					setState(70); match(PREDICATE);
					setState(71); match(OPEN);
					setState(72); predicate(0);
					setState(73); match(CLOSE);
					}
				}

				}
				break;

			case 2:
				_localctx = new ColIdInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(DOT);
				setState(78); colId();
				}
				break;

			case 3:
				_localctx = new ResolvedInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79); match(DOT);
				setState(80); match(RESOLVE);
				setState(81); match(OPEN);
				setState(82); absoluteInputPath();
				setState(83); match(CLOSE);
				}
				break;

			case 4:
				_localctx = new RelativeCurrentCellPathStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class ColIdContext extends ParserRuleContext {
		public Token colName;
		public TerminalNode Name() { return getToken(NotaQL2CSVInParser.Name, 0); }
		public ColIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterColId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitColId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitColId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColIdContext colId() throws RecognitionException {
		ColIdContext _localctx = new ColIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_colId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); ((ColIdContext)_localctx).colName = match(Name);
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
		public TerminalNode Col() { return getToken(NotaQL2CSVInParser.Col, 0); }
		public GenericPathTokenContext genericPathToken() {
			return getRuleContext(GenericPathTokenContext.class,0);
		}
		public TerminalNode Split() { return getToken(NotaQL2CSVInParser.Split, 0); }
		public TerminalNode Val() { return getToken(NotaQL2CSVInParser.Val, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pathToken);
		try {
			setState(94);
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
				setState(90); genericPathToken();
				}
				break;
			case Col:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(Col);
				}
				break;
			case Val:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(Val);
				}
				break;
			case Split:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); match(Split);
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
		public TerminalNode EOF() { return getToken(NotaQL2CSVInParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(96); transformation();
					setState(97); match(3);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(104); transformation();
			setState(106);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(105); match(3);
				}
			}

			setState(108); match(EOF);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); inEngine();
			setState(111); match(7);
			setState(112); outEngine();
			setState(113); match(7);
			setState(117);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(114); inPredicate();
				setState(115); match(7);
				}
			}

			setState(122);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(119); outPredicate();
				setState(120); match(7);
				}
			}

			setState(124); attributeSpecification();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(125); match(7);
				setState(126); attributeSpecification();
				}
				}
				setState(131);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(5);
			setState(133); engine();
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(2);
			setState(136); engine();
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
			return getToken(NotaQL2CSVInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2CSVInParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); ((EngineContext)_localctx).engineName = match(Name);
			setState(139); match(OPEN);
			setState(152);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(140); match(Name);
				setState(141); match(ARROW);
				setState(142); atom();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(143); match(7);
					setState(144); match(Name);
					setState(145); match(ARROW);
					setState(146); atom();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2CSVInParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); genericOutputPath();
			setState(157); match(ARROW);
			setState(158); vData(0);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericOutputPath);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case Col:
			case Val:
			case Split:
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
				setState(160); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2CSVInParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(OUT);
			setState(165); match(DOT);
			setState(166); path();
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); path();
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
		public TerminalNode IN() { return getToken(NotaQL2CSVInParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(IN);
			setState(171); path();
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
		public TerminalNode AT() { return getToken(NotaQL2CSVInParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(AT);
			setState(174); path();
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(176); pathToken();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode AT() { return getToken(NotaQL2CSVInParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2CSVInParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2CSVInParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2CSVInParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2CSVInParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2CSVInParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2CSVInParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2CSVInParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2CSVInParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2CSVInParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2CSVInParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2CSVInParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2CSVInParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2CSVInParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2CSVInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2CSVInParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2CSVInParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2CSVInParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2CSVInParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2CSVInParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2CSVInParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2CSVInParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2CSVInParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2CSVInParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2CSVInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2CSVInParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_genericPathToken);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(OPEN);
				setState(183); path();
				setState(184); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); match(ARRAYOPEN);
				setState(187); path();
				setState(188); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(190); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(191); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(192); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(193); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(194); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(195); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(196); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(197); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(198); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(199); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(200); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(201); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(202); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(203); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(204); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(205); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(206); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(207); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(208); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(209); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(210); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(211); match(OR);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2CSVInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2CSVInParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2CSVInParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2CSVInParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAggregateVData(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(215); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216); match(OPEN);
				setState(217); vData(0);
				setState(218); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(229); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(232); vData(7);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public TerminalNode MIN() { return getToken(NotaQL2CSVInParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2CSVInParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2CSVInParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2CSVInParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2CSVInParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2CSVInParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2CSVInParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(239); match(OPEN);
			setState(241);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(240); vData(0);
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(243); match(7);
				setState(244); atom();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVInParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2CSVInParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorFunction);
		int _la;
		try {
			setState(276);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); match(OBJECT);
				setState(253); match(OPEN);
				setState(254); attributeSpecification();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(255); match(7);
					setState(256); attributeSpecification();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264); match(Name);
				setState(265); match(OPEN);
				setState(266); attributeSpecification();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(267); match(7);
					setState(268); attributeSpecification();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVInParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(Name);
			setState(279); match(OPEN);
			setState(288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(280); vData(0);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(281); match(7);
					setState(282); vData(0);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(290); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2CSVInParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); predicate(0);
			setState(293); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2CSVInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2CSVInParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2CSVInParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2CSVInParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2CSVInParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2CSVInParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2CSVInParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2CSVInParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAndPredicate(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(296); match(4);
				setState(297); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298); match(OPEN);
				setState(299); predicate(0);
				setState(300); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302); vData(0);
				setState(303);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(304); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(310);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(311); match(AND);
						setState(312); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(313);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(314); match(OR);
						setState(315); predicate(5);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(1);
			setState(322); match(COLON);
			setState(323); predicate(0);
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
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(6);
			setState(326); match(COLON);
			setState(327); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2CSVInParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2CSVInParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2CSVInParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2CSVInParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2CSVInParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom);
		int _la;
		try {
			setState(333);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
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
				setState(330); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(332); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVInParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2CSVInParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVInListener ) ((NotaQL2CSVInListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVInVisitor ) return ((NotaQL2CSVInVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); ((IndexContext)_localctx).indexNumber = match(Int);
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
		case 17: return vData_sempred((VDataContext)_localctx, predIndex);

		case 22: return predicate_sempred((PredicateContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\5\2A"+
		"\n\2\3\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5a\n\5\3\6"+
		"\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\7\7\u0082\n"+
		"\7\f\7\16\7\u0085\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\5\n\u009b\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\7\21\u00b4\n\21\f\21\16\21\u00b7\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00d7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00e4\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ec\n"+
		"\23\f\23\16\23\u00ef\13\23\3\24\3\24\3\24\5\24\u00f4\n\24\3\24\3\24\7"+
		"\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0104\n\25\f\25\16\25\u0107\13\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u0110\n\25\f\25\16\25\u0113\13\25\3\25\3\25\5\25\u0117\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\7\26\u011e\n\26\f\26\16\26\u0121\13\26\5"+
		"\26\u0123\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0137\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u013f\n\30\f\30\16\30\u0142\13\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0150\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\u00b5\4$.\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668\2\b\3\2\n\13\4\2\35\35\62\62\3\2\33\34\3\2#)\3\2\23"+
		"\30\3\2 !\u017a\2D\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b`\3\2\2\2\ng\3\2\2\2"+
		"\fp\3\2\2\2\16\u0086\3\2\2\2\20\u0089\3\2\2\2\22\u008c\3\2\2\2\24\u009e"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3"+
		"\2\2\2\36\u00af\3\2\2\2 \u00b5\3\2\2\2\"\u00d6\3\2\2\2$\u00e3\3\2\2\2"+
		"&\u00f0\3\2\2\2(\u0116\3\2\2\2*\u0118\3\2\2\2,\u0126\3\2\2\2.\u0136\3"+
		"\2\2\2\60\u0143\3\2\2\2\62\u0147\3\2\2\2\64\u014f\3\2\2\2\66\u0151\3\2"+
		"\2\28\u0153\3\2\2\2:E\5\4\3\2;<\5\4\3\2<=\7\64\2\2=>\7\f\2\2>@\7,\2\2"+
		"?A\5\64\33\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7-\2\2CE\3\2\2\2D:\3\2\2"+
		"\2D;\3\2\2\2E\3\3\2\2\2FG\7\64\2\2GM\t\2\2\2HI\7\61\2\2IJ\7,\2\2JK\5."+
		"\30\2KL\7-\2\2LN\3\2\2\2MH\3\2\2\2MN\3\2\2\2NY\3\2\2\2OP\7\64\2\2PY\5"+
		"\6\4\2QR\7\64\2\2RS\7\60\2\2ST\7,\2\2TU\5\34\17\2UV\7-\2\2VY\3\2\2\2W"+
		"Y\3\2\2\2XF\3\2\2\2XO\3\2\2\2XQ\3\2\2\2XW\3\2\2\2Y\5\3\2\2\2Z[\7+\2\2"+
		"[\7\3\2\2\2\\a\5\"\22\2]a\7\n\2\2^a\7\13\2\2_a\7\f\2\2`\\\3\2\2\2`]\3"+
		"\2\2\2`^\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bc\5\f\7\2cd\7\5\2\2df\3\2\2\2eb"+
		"\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\5\f\7\2k"+
		"m\7\5\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\2\2\3o\13\3\2\2\2pq\5\16\b"+
		"\2qr\7\t\2\2rs\5\20\t\2sw\7\t\2\2tu\5\60\31\2uv\7\t\2\2vx\3\2\2\2wt\3"+
		"\2\2\2wx\3\2\2\2x|\3\2\2\2yz\5\62\32\2z{\7\t\2\2{}\3\2\2\2|y\3\2\2\2|"+
		"}\3\2\2\2}~\3\2\2\2~\u0083\5\24\13\2\177\u0080\7\t\2\2\u0080\u0082\5\24"+
		"\13\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\7\2\2"+
		"\u0087\u0088\5\22\n\2\u0088\17\3\2\2\2\u0089\u008a\7\4\2\2\u008a\u008b"+
		"\5\22\n\2\u008b\21\3\2\2\2\u008c\u008d\7+\2\2\u008d\u009a\7,\2\2\u008e"+
		"\u008f\7+\2\2\u008f\u0090\7\22\2\2\u0090\u0097\5\64\33\2\u0091\u0092\7"+
		"\t\2\2\u0092\u0093\7+\2\2\u0093\u0094\7\22\2\2\u0094\u0096\5\64\33\2\u0095"+
		"\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7-\2\2\u009d\23\3\2\2\2"+
		"\u009e\u009f\5\26\f\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\5$\23\2\u00a1\25"+
		"\3\2\2\2\u00a2\u00a5\5\32\16\2\u00a3\u00a5\5\30\r\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8"+
		"\7\64\2\2\u00a8\u00a9\5 \21\2\u00a9\31\3\2\2\2\u00aa\u00ab\5 \21\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\7\20\2\2\u00ad\u00ae\5 \21\2\u00ae\35\3\2\2\2"+
		"\u00af\u00b0\7\63\2\2\u00b0\u00b1\5 \21\2\u00b1\37\3\2\2\2\u00b2\u00b4"+
		"\5\b\5\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00ba\5 \21\2\u00ba\u00bb\7-\2\2\u00bb\u00d7\3\2\2\2\u00bc\u00bd\7.\2"+
		"\2\u00bd\u00be\5 \21\2\u00be\u00bf\7/\2\2\u00bf\u00d7\3\2\2\2\u00c0\u00d7"+
		"\7\60\2\2\u00c1\u00d7\7\61\2\2\u00c2\u00d7\7\62\2\2\u00c3\u00d7\7\63\2"+
		"\2\u00c4\u00d7\7\"\2\2\u00c5\u00d7\7 \2\2\u00c6\u00d7\7!\2\2\u00c7\u00d7"+
		"\7+\2\2\u00c8\u00d7\7\64\2\2\u00c9\u00d7\7\65\2\2\u00ca\u00d7\7\20\2\2"+
		"\u00cb\u00d7\7\23\2\2\u00cc\u00d7\7\24\2\2\u00cd\u00d7\7\25\2\2\u00ce"+
		"\u00d7\7\26\2\2\u00cf\u00d7\7\27\2\2\u00d0\u00d7\7\30\2\2\u00d1\u00d7"+
		"\7\33\2\2\u00d2\u00d7\7\34\2\2\u00d3\u00d7\7\35\2\2\u00d4\u00d7\7\31\2"+
		"\2\u00d5\u00d7\7\32\2\2\u00d6\u00b8\3\2\2\2\u00d6\u00bc\3\2\2\2\u00d6"+
		"\u00c0\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c2\3\2\2\2\u00d6\u00c3\3\2"+
		"\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00c5\3\2\2\2\u00d6\u00c6\3\2\2\2\u00d6"+
		"\u00c7\3\2\2\2\u00d6\u00c8\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d6\u00ca\3\2"+
		"\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2"+
		"\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9\b\23\1\2\u00d9\u00e4\5\64\33"+
		"\2\u00da\u00db\7,\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7-\2\2\u00dd\u00e4"+
		"\3\2\2\2\u00de\u00e4\5&\24\2\u00df\u00e4\5(\25\2\u00e0\u00e4\5*\26\2\u00e1"+
		"\u00e4\5\34\17\2\u00e2\u00e4\5\36\20\2\u00e3\u00d8\3\2\2\2\u00e3\u00da"+
		"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00ed\3\2\2\2\u00e5\u00e6\f\t"+
		"\2\2\u00e6\u00e7\t\3\2\2\u00e7\u00ec\5$\23\n\u00e8\u00e9\f\b\2\2\u00e9"+
		"\u00ea\t\4\2\2\u00ea\u00ec\5$\23\t\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"%\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\t\5\2\2\u00f1\u00f3\7,\2\2\u00f2"+
		"\u00f4\5$\23\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2"+
		"\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f8\5\64\33\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd\'\3\2\2\2\u00fe\u00ff"+
		"\7*\2\2\u00ff\u0100\7,\2\2\u0100\u0105\5\24\13\2\u0101\u0102\7\t\2\2\u0102"+
		"\u0104\5\24\13\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7-\2\2\u0109\u0117\3\2\2\2\u010a\u010b\7+\2\2\u010b\u010c\7,\2"+
		"\2\u010c\u0111\5\24\13\2\u010d\u010e\7\t\2\2\u010e\u0110\5\24\13\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7-\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u00fe\3\2\2\2\u0116\u010a\3\2\2\2\u0117)\3\2\2\2"+
		"\u0118\u0119\7+\2\2\u0119\u0122\7,\2\2\u011a\u011f\5$\23\2\u011b\u011c"+
		"\7\t\2\2\u011c\u011e\5$\23\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u011a\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\7-\2\2\u0125+\3\2\2\2\u0126\u0127\5.\30\2\u0127\u0128\7\2\2\3\u0128"+
		"-\3\2\2\2\u0129\u012a\b\30\1\2\u012a\u012b\7\6\2\2\u012b\u0137\5.\30\b"+
		"\u012c\u012d\7,\2\2\u012d\u012e\5.\30\2\u012e\u012f\7-\2\2\u012f\u0137"+
		"\3\2\2\2\u0130\u0131\5$\23\2\u0131\u0132\t\6\2\2\u0132\u0133\5$\23\2\u0133"+
		"\u0137\3\2\2\2\u0134\u0137\5\34\17\2\u0135\u0137\5\36\20\2\u0136\u0129"+
		"\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u0139\f\7\2\2\u0139\u013a\7\31"+
		"\2\2\u013a\u013f\5.\30\b\u013b\u013c\f\6\2\2\u013c\u013d\7\32\2\2\u013d"+
		"\u013f\5.\30\7\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141/\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\7\3\2\2\u0144\u0145\7\65\2\2\u0145\u0146\5.\30\2"+
		"\u0146\61\3\2\2\2\u0147\u0148\7\b\2\2\u0148\u0149\7\65\2\2\u0149\u014a"+
		"\5.\30\2\u014a\63\3\2\2\2\u014b\u0150\t\7\2\2\u014c\u0150\7\"\2\2\u014d"+
		"\u0150\7\36\2\2\u014e\u0150\7\37\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\65\3\2\2\2\u0151"+
		"\u0152\7+\2\2\u0152\67\3\2\2\2\u0153\u0154\7 \2\2\u01549\3\2\2\2\37@D"+
		"MX`glw|\u0083\u0097\u009a\u00a4\u00b5\u00d6\u00e3\u00eb\u00ed\u00f3\u00f9"+
		"\u0105\u0111\u0116\u011f\u0122\u0136\u013e\u0140\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}