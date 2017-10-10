// Generated from notaql\parser\antlr\NotaQL2ColumnIn.g4 by ANTLR 4.2.1
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
public class NotaQL2ColumnInParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Row=8, Col=9, 
		Val=10, Split=11, SL_COMMENT=12, OPTWS=13, OPTNL=14, IN=15, OUT=16, ARROW=17, 
		EQ=18, NEQ=19, LT=20, LTEQ=21, GT=22, GTEQ=23, AND=24, OR=25, PLUS=26, 
		MINUS=27, DIV=28, TRUE=29, FALSE=30, Int=31, Float=32, String=33, AVG=34, 
		COUNT=35, MAX=36, MIN=37, SUM=38, IMPLODE=39, LIST=40, OBJECT=41, Name=42, 
		OPEN=43, CLOSE=44, ARRAYOPEN=45, ARRAYCLOSE=46, RESOLVE=47, PREDICATE=48, 
		STAR=49, AT=50, DOT=51, COLON=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'_r'", "'_c'", "'_v'", "'split'", "SL_COMMENT", 
		"OPTWS", "OPTNL", "'IN'", "'OUT'", "'<-'", "'='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", "'false'", 
		"Int", "Float", "String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", "'SUM'", 
		"'IMPLODE'", "'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", "']'", 
		"'$'", "'?'", "'*'", "'@'", "'.'", "':'"
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
	public String getGrammarFileName() { return "NotaQL2ColumnIn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2ColumnInParser(TokenStream input) {
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterSimpleInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitSimpleInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitSimpleInputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SplittedInputPathContext extends InputPathContext {
		public FirstInputPathStepContext firstInputPathStep() {
			return getRuleContext(FirstInputPathStepContext.class,0);
		}
		public TerminalNode Split() { return getToken(NotaQL2ColumnInParser.Split, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SplittedInputPathContext(InputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterSplittedInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitSplittedInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitSplittedInputPath(this);
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
	public static class RowInputPathStepContext extends FirstInputPathStepContext {
		public TerminalNode Row() { return getToken(NotaQL2ColumnInParser.Row, 0); }
		public RowInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRowInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRowInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRowInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColIdInputPathStepContext extends FirstInputPathStepContext {
		public ColIdContext colId() {
			return getRuleContext(ColIdContext.class,0);
		}
		public ColIdInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterColIdInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitColIdInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitColIdInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeCurrentCellPathStepContext extends FirstInputPathStepContext {
		public RelativeCurrentCellPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativeCurrentCellPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativeCurrentCellPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativeCurrentCellPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CellInputPathStepContext extends FirstInputPathStepContext {
		public Token colFamilyFilter;
		public Token source;
		public TerminalNode Col() { return getToken(NotaQL2ColumnInParser.Col, 0); }
		public TerminalNode Val() { return getToken(NotaQL2ColumnInParser.Val, 0); }
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public CellInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterCellInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitCellInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitCellInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResolvedInputPathStepContext extends FirstInputPathStepContext {
		public Token colFamily;
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public ResolvedInputPathStepContext(FirstInputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterResolvedInputPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitResolvedInputPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitResolvedInputPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstInputPathStepContext firstInputPathStep() throws RecognitionException {
		FirstInputPathStepContext _localctx = new FirstInputPathStepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstInputPathStep);
		int _la;
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new RowInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(DOT);
				setState(69); match(Row);
				}
				break;

			case 2:
				_localctx = new CellInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(DOT);
				setState(73);
				_la = _input.LA(1);
				if (_la==Name) {
					{
					setState(71); ((CellInputPathStepContext)_localctx).colFamilyFilter = match(Name);
					setState(72); match(COLON);
					}
				}

				setState(75);
				((CellInputPathStepContext)_localctx).source = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Col || _la==Val) ) {
					((CellInputPathStepContext)_localctx).source = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(81);
				_la = _input.LA(1);
				if (_la==PREDICATE) {
					{
					setState(76); match(PREDICATE);
					setState(77); match(OPEN);
					setState(78); predicate(0);
					setState(79); match(CLOSE);
					}
				}

				}
				break;

			case 3:
				_localctx = new ColIdInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(DOT);
				setState(84); colId();
				}
				break;

			case 4:
				_localctx = new ResolvedInputPathStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85); match(DOT);
				setState(88);
				_la = _input.LA(1);
				if (_la==Name) {
					{
					setState(86); ((ResolvedInputPathStepContext)_localctx).colFamily = match(Name);
					setState(87); match(COLON);
					}
				}

				setState(90); match(RESOLVE);
				setState(91); match(OPEN);
				setState(92); absoluteInputPath();
				setState(93); match(CLOSE);
				}
				break;

			case 5:
				_localctx = new RelativeCurrentCellPathStepContext(_localctx);
				enterOuterAlt(_localctx, 5);
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
		public Token colFamily;
		public Token colName;
		public TerminalNode Name(int i) {
			return getToken(NotaQL2ColumnInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2ColumnInParser.Name); }
		public ColIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterColId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitColId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitColId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColIdContext colId() throws RecognitionException {
		ColIdContext _localctx = new ColIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_colId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(98); ((ColIdContext)_localctx).colFamily = match(Name);
				setState(99); match(COLON);
				}
				break;
			}
			setState(102); ((ColIdContext)_localctx).colName = match(Name);
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
		public TerminalNode Col() { return getToken(NotaQL2ColumnInParser.Col, 0); }
		public GenericPathTokenContext genericPathToken() {
			return getRuleContext(GenericPathTokenContext.class,0);
		}
		public TerminalNode Row() { return getToken(NotaQL2ColumnInParser.Row, 0); }
		public TerminalNode Split() { return getToken(NotaQL2ColumnInParser.Split, 0); }
		public TerminalNode Val() { return getToken(NotaQL2ColumnInParser.Val, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pathToken);
		try {
			setState(109);
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
				setState(104); genericPathToken();
				}
				break;
			case Row:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(Row);
				}
				break;
			case Col:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(Col);
				}
				break;
			case Val:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(Val);
				}
				break;
			case Split:
				enterOuterAlt(_localctx, 5);
				{
				setState(108); match(Split);
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
		public TerminalNode EOF() { return getToken(NotaQL2ColumnInParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitNotaql(this);
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
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(111); transformation();
					setState(112); match(3);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(119); transformation();
			setState(121);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(120); match(3);
				}
			}

			setState(123); match(EOF);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitTransformation(this);
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
			setState(125); inEngine();
			setState(126); match(7);
			setState(127); outEngine();
			setState(128); match(7);
			setState(132);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(129); inPredicate();
				setState(130); match(7);
				}
			}

			setState(137);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(134); outPredicate();
				setState(135); match(7);
				}
			}

			setState(139); attributeSpecification();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(140); match(7);
				setState(141); attributeSpecification();
				}
				}
				setState(146);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(5);
			setState(148); engine();
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(2);
			setState(151); engine();
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
			return getToken(NotaQL2ColumnInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2ColumnInParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitEngine(this);
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
			setState(153); ((EngineContext)_localctx).engineName = match(Name);
			setState(154); match(OPEN);
			setState(167);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(155); match(Name);
				setState(156); match(ARROW);
				setState(157); atom();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(158); match(7);
					setState(159); match(Name);
					setState(160); match(ARROW);
					setState(161); atom();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2ColumnInParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); genericOutputPath();
			setState(172); match(ARROW);
			setState(173); vData(0);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_genericOutputPath);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case Row:
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
				setState(175); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2ColumnInParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(OUT);
			setState(180); match(DOT);
			setState(181); path();
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); path();
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
		public TerminalNode IN() { return getToken(NotaQL2ColumnInParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(IN);
			setState(186); path();
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
		public TerminalNode AT() { return getToken(NotaQL2ColumnInParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(AT);
			setState(189); path();
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitPath(this);
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
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(191); pathToken();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TerminalNode AT() { return getToken(NotaQL2ColumnInParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2ColumnInParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2ColumnInParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2ColumnInParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2ColumnInParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2ColumnInParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2ColumnInParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2ColumnInParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2ColumnInParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2ColumnInParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2ColumnInParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2ColumnInParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2ColumnInParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2ColumnInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2ColumnInParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2ColumnInParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2ColumnInParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2ColumnInParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2ColumnInParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2ColumnInParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2ColumnInParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2ColumnInParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2ColumnInParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2ColumnInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2ColumnInParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_genericPathToken);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); match(OPEN);
				setState(198); path();
				setState(199); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); match(ARRAYOPEN);
				setState(202); path();
				setState(203); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(207); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(209); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(210); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(211); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(212); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(213); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(214); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(215); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(216); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(217); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(218); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(219); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(220); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(221); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(222); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(223); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(224); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(225); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(226); match(OR);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2ColumnInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2ColumnInParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2ColumnInParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2ColumnInParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAggregateVData(this);
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
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); match(OPEN);
				setState(232); vData(0);
				setState(233); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(244); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(245);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(246);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(247); vData(7);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode MIN() { return getToken(NotaQL2ColumnInParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2ColumnInParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2ColumnInParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2ColumnInParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2ColumnInParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2ColumnInParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2ColumnInParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAggregationFunction(this);
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
			setState(253);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(254); match(OPEN);
			setState(256);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(255); vData(0);
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(258); match(7);
				setState(259); atom();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2ColumnInParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorFunction);
		int _la;
		try {
			setState(291);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267); match(OBJECT);
				setState(268); match(OPEN);
				setState(269); attributeSpecification();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(270); match(7);
					setState(271); attributeSpecification();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279); match(Name);
				setState(280); match(OPEN);
				setState(281); attributeSpecification();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(282); match(7);
					setState(283); attributeSpecification();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitGenericFunction(this);
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
			setState(293); match(Name);
			setState(294); match(OPEN);
			setState(303);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(295); vData(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(296); match(7);
					setState(297); vData(0);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2ColumnInParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); predicate(0);
			setState(308); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2ColumnInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2ColumnInParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2ColumnInParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2ColumnInParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2ColumnInParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2ColumnInParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2ColumnInParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2ColumnInParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAndPredicate(this);
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
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311); match(4);
				setState(312); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313); match(OPEN);
				setState(314); predicate(0);
				setState(315); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); vData(0);
				setState(318);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(319); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(325);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(326); match(AND);
						setState(327); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329); match(OR);
						setState(330); predicate(5);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(1);
			setState(337); match(COLON);
			setState(338); predicate(0);
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
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(6);
			setState(341); match(COLON);
			setState(342); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2ColumnInParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2ColumnInParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2ColumnInParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2ColumnInParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2ColumnInParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom);
		int _la;
		try {
			setState(348);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
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
				setState(345); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(347); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2ColumnInParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2ColumnInParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2ColumnInListener ) ((NotaQL2ColumnInListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2ColumnInVisitor ) return ((NotaQL2ColumnInVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); ((IndexContext)_localctx).indexNumber = match(Int);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0165\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\5\2A"+
		"\n\2\3\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3T\n\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"c\n\3\3\4\3\4\5\4g\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3"+
		"\6\7\6u\n\6\f\6\16\6x\13\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0087\n\7\3\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7\3\7\7\7\u0091"+
		"\n\7\f\7\16\7\u0094\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\5\n\u00aa\n\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00b4\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00e6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00f3\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fb"+
		"\n\23\f\23\16\23\u00fe\13\23\3\24\3\24\3\24\5\24\u0103\n\24\3\24\3\24"+
		"\7\24\u0107\n\24\f\24\16\24\u010a\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0113\n\25\f\25\16\25\u0116\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u011f\n\25\f\25\16\25\u0122\13\25\3\25\3\25\5\25\u0126"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u012d\n\26\f\26\16\26\u0130\13\26"+
		"\5\26\u0132\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0146\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u014e\n\30\f\30\16\30\u0151\13\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u015f\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\u00c4\4$.\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668\2\b\3\2\13\f\4\2\36\36\63\63\3\2\34\35\3\2$*\3\2\24"+
		"\31\3\2!\"\u018e\2D\3\2\2\2\4b\3\2\2\2\6f\3\2\2\2\bo\3\2\2\2\nv\3\2\2"+
		"\2\f\177\3\2\2\2\16\u0095\3\2\2\2\20\u0098\3\2\2\2\22\u009b\3\2\2\2\24"+
		"\u00ad\3\2\2\2\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00b9\3\2\2\2\34\u00bb"+
		"\3\2\2\2\36\u00be\3\2\2\2 \u00c4\3\2\2\2\"\u00e5\3\2\2\2$\u00f2\3\2\2"+
		"\2&\u00ff\3\2\2\2(\u0125\3\2\2\2*\u0127\3\2\2\2,\u0135\3\2\2\2.\u0145"+
		"\3\2\2\2\60\u0152\3\2\2\2\62\u0156\3\2\2\2\64\u015e\3\2\2\2\66\u0160\3"+
		"\2\2\28\u0162\3\2\2\2:E\5\4\3\2;<\5\4\3\2<=\7\65\2\2=>\7\r\2\2>@\7-\2"+
		"\2?A\5\64\33\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7.\2\2CE\3\2\2\2D:\3\2"+
		"\2\2D;\3\2\2\2E\3\3\2\2\2FG\7\65\2\2Gc\7\n\2\2HK\7\65\2\2IJ\7,\2\2JL\7"+
		"\66\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MS\t\2\2\2NO\7\62\2\2OP\7-\2\2PQ"+
		"\5.\30\2QR\7.\2\2RT\3\2\2\2SN\3\2\2\2ST\3\2\2\2Tc\3\2\2\2UV\7\65\2\2V"+
		"c\5\6\4\2WZ\7\65\2\2XY\7,\2\2Y[\7\66\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2"+
		"\2\\]\7\61\2\2]^\7-\2\2^_\5\34\17\2_`\7.\2\2`c\3\2\2\2ac\3\2\2\2bF\3\2"+
		"\2\2bH\3\2\2\2bU\3\2\2\2bW\3\2\2\2ba\3\2\2\2c\5\3\2\2\2de\7,\2\2eg\7\66"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7,\2\2i\7\3\2\2\2jp\5\"\22\2kp\7"+
		"\n\2\2lp\7\13\2\2mp\7\f\2\2np\7\r\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om"+
		"\3\2\2\2on\3\2\2\2p\t\3\2\2\2qr\5\f\7\2rs\7\5\2\2su\3\2\2\2tq\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y{\5\f\7\2z|\7\5\2\2"+
		"{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\2\2\3~\13\3\2\2\2\177\u0080\5\16\b"+
		"\2\u0080\u0081\7\t\2\2\u0081\u0082\5\20\t\2\u0082\u0086\7\t\2\2\u0083"+
		"\u0084\5\60\31\2\u0084\u0085\7\t\2\2\u0085\u0087\3\2\2\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u0089\5\62\32\2\u0089"+
		"\u008a\7\t\2\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0092\5\24\13\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0091\5\24\13\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\7\7\2\2\u0096\u0097\5\22\n\2\u0097\17\3\2\2\2\u0098\u0099\7\4\2\2\u0099"+
		"\u009a\5\22\n\2\u009a\21\3\2\2\2\u009b\u009c\7,\2\2\u009c\u00a9\7-\2\2"+
		"\u009d\u009e\7,\2\2\u009e\u009f\7\23\2\2\u009f\u00a6\5\64\33\2\u00a0\u00a1"+
		"\7\t\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a5\5\64\33\2"+
		"\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7.\2\2\u00ac\23\3\2\2\2"+
		"\u00ad\u00ae\5\26\f\2\u00ae\u00af\7\23\2\2\u00af\u00b0\5$\23\2\u00b0\25"+
		"\3\2\2\2\u00b1\u00b4\5\32\16\2\u00b2\u00b4\5\30\r\2\u00b3\u00b1\3\2\2"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7"+
		"\7\65\2\2\u00b7\u00b8\5 \21\2\u00b8\31\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\5 \21\2\u00bd\35\3\2\2\2"+
		"\u00be\u00bf\7\64\2\2\u00bf\u00c0\5 \21\2\u00c0\37\3\2\2\2\u00c1\u00c3"+
		"\5\b\5\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"\u00c9\5 \21\2\u00c9\u00ca\7.\2\2\u00ca\u00e6\3\2\2\2\u00cb\u00cc\7/\2"+
		"\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7\60\2\2\u00ce\u00e6\3\2\2\2\u00cf"+
		"\u00e6\7\61\2\2\u00d0\u00e6\7\62\2\2\u00d1\u00e6\7\63\2\2\u00d2\u00e6"+
		"\7\64\2\2\u00d3\u00e6\7#\2\2\u00d4\u00e6\7!\2\2\u00d5\u00e6\7\"\2\2\u00d6"+
		"\u00e6\7,\2\2\u00d7\u00e6\7\65\2\2\u00d8\u00e6\7\66\2\2\u00d9\u00e6\7"+
		"\21\2\2\u00da\u00e6\7\24\2\2\u00db\u00e6\7\25\2\2\u00dc\u00e6\7\26\2\2"+
		"\u00dd\u00e6\7\27\2\2\u00de\u00e6\7\30\2\2\u00df\u00e6\7\31\2\2\u00e0"+
		"\u00e6\7\34\2\2\u00e1\u00e6\7\35\2\2\u00e2\u00e6\7\36\2\2\u00e3\u00e6"+
		"\7\32\2\2\u00e4\u00e6\7\33\2\2\u00e5\u00c7\3\2\2\2\u00e5\u00cb\3\2\2\2"+
		"\u00e5\u00cf\3\2\2\2\u00e5\u00d0\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d2"+
		"\3\2\2\2\u00e5\u00d3\3\2\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5"+
		"\u00d6\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00d9\3\2"+
		"\2\2\u00e5\u00da\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6#\3\2\2\2\u00e7\u00e8\b\23\1\2\u00e8\u00f3\5\64\33"+
		"\2\u00e9\u00ea\7-\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7.\2\2\u00ec\u00f3"+
		"\3\2\2\2\u00ed\u00f3\5&\24\2\u00ee\u00f3\5(\25\2\u00ef\u00f3\5*\26\2\u00f0"+
		"\u00f3\5\34\17\2\u00f1\u00f3\5\36\20\2\u00f2\u00e7\3\2\2\2\u00f2\u00e9"+
		"\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5\f\t"+
		"\2\2\u00f5\u00f6\t\3\2\2\u00f6\u00fb\5$\23\n\u00f7\u00f8\f\b\2\2\u00f8"+
		"\u00f9\t\4\2\2\u00f9\u00fb\5$\23\t\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"%\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\t\5\2\2\u0100\u0102\7-\2\2\u0101"+
		"\u0103\5$\23\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2"+
		"\2\2\u0104\u0105\7\t\2\2\u0105\u0107\5\64\33\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7.\2\2\u010c\'\3\2\2\2\u010d\u010e"+
		"\7+\2\2\u010e\u010f\7-\2\2\u010f\u0114\5\24\13\2\u0110\u0111\7\t\2\2\u0111"+
		"\u0113\5\24\13\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7.\2\2\u0118\u0126\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7-\2"+
		"\2\u011b\u0120\5\24\13\2\u011c\u011d\7\t\2\2\u011d\u011f\5\24\13\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7.\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u010d\3\2\2\2\u0125\u0119\3\2\2\2\u0126)\3\2\2\2"+
		"\u0127\u0128\7,\2\2\u0128\u0131\7-\2\2\u0129\u012e\5$\23\2\u012a\u012b"+
		"\7\t\2\2\u012b\u012d\5$\23\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7.\2\2\u0134+\3\2\2\2\u0135\u0136\5.\30\2\u0136\u0137\7\2\2\3\u0137"+
		"-\3\2\2\2\u0138\u0139\b\30\1\2\u0139\u013a\7\6\2\2\u013a\u0146\5.\30\b"+
		"\u013b\u013c\7-\2\2\u013c\u013d\5.\30\2\u013d\u013e\7.\2\2\u013e\u0146"+
		"\3\2\2\2\u013f\u0140\5$\23\2\u0140\u0141\t\6\2\2\u0141\u0142\5$\23\2\u0142"+
		"\u0146\3\2\2\2\u0143\u0146\5\34\17\2\u0144\u0146\5\36\20\2\u0145\u0138"+
		"\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u014f\3\2\2\2\u0147\u0148\f\7\2\2\u0148\u0149\7\32"+
		"\2\2\u0149\u014e\5.\30\b\u014a\u014b\f\6\2\2\u014b\u014c\7\33\2\2\u014c"+
		"\u014e\5.\30\7\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150/\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\7\3\2\2\u0153\u0154\7\66\2\2\u0154\u0155\5.\30\2"+
		"\u0155\61\3\2\2\2\u0156\u0157\7\b\2\2\u0157\u0158\7\66\2\2\u0158\u0159"+
		"\5.\30\2\u0159\63\3\2\2\2\u015a\u015f\t\7\2\2\u015b\u015f\7#\2\2\u015c"+
		"\u015f\7\37\2\2\u015d\u015f\7 \2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\65\3\2\2\2\u0160\u0161"+
		"\7,\2\2\u0161\67\3\2\2\2\u0162\u0163\7!\2\2\u01639\3\2\2\2\"@DKSZbfov"+
		"{\u0086\u008b\u0092\u00a6\u00a9\u00b3\u00c4\u00e5\u00f2\u00fa\u00fc\u0102"+
		"\u0108\u0114\u0120\u0125\u012e\u0131\u0145\u014d\u014f\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}