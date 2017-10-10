// Generated from notaql\parser\antlr\NotaQL2DocumentIn.g4 by ANTLR 4.2.1
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
public class NotaQL2DocumentInParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, NameToken=8, IndexToken=9, 
		SplitToken=10, IdToken=11, SL_COMMENT=12, OPTWS=13, OPTNL=14, IN=15, OUT=16, 
		ARROW=17, EQ=18, NEQ=19, LT=20, LTEQ=21, GT=22, GTEQ=23, AND=24, OR=25, 
		PLUS=26, MINUS=27, DIV=28, TRUE=29, FALSE=30, Int=31, Float=32, String=33, 
		AVG=34, COUNT=35, MAX=36, MIN=37, SUM=38, IMPLODE=39, LIST=40, OBJECT=41, 
		Name=42, OPEN=43, CLOSE=44, ARRAYOPEN=45, ARRAYCLOSE=46, RESOLVE=47, PREDICATE=48, 
		STAR=49, AT=50, DOT=51, COLON=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'name()'", "'index()'", "'split'", "'_id'", "SL_COMMENT", 
		"OPTWS", "OPTNL", "'IN'", "'OUT'", "'<-'", "'='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", "'false'", 
		"Int", "Float", "String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", "'SUM'", 
		"'IMPLODE'", "'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", "']'", 
		"'$'", "'?'", "'*'", "'@'", "'.'", "':'"
	};
	public static final int
		RULE_inputPath = 0, RULE_inputPathStep = 1, RULE_attributeStep = 2, RULE_listStep = 3, 
		RULE_genericStep = 4, RULE_pathMethod = 5, RULE_splitMethod = 6, RULE_pathToken = 7, 
		RULE_notaql = 8, RULE_transformation = 9, RULE_inEngine = 10, RULE_outEngine = 11, 
		RULE_engine = 12, RULE_attributeSpecification = 13, RULE_genericOutputPath = 14, 
		RULE_absoluteOutputPath = 15, RULE_relativeOutputPath = 16, RULE_absoluteInputPath = 17, 
		RULE_relativeInputPath = 18, RULE_path = 19, RULE_genericPathToken = 20, 
		RULE_vData = 21, RULE_aggregationFunction = 22, RULE_constructorFunction = 23, 
		RULE_genericFunction = 24, RULE_standalonePredicate = 25, RULE_predicate = 26, 
		RULE_inPredicate = 27, RULE_outPredicate = 28, RULE_atom = 29, RULE_attributeId = 30, 
		RULE_index = 31;
	public static final String[] ruleNames = {
		"inputPath", "inputPathStep", "attributeStep", "listStep", "genericStep", 
		"pathMethod", "splitMethod", "pathToken", "notaql", "transformation", 
		"inEngine", "outEngine", "engine", "attributeSpecification", "genericOutputPath", 
		"absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", "relativeInputPath", 
		"path", "genericPathToken", "vData", "aggregationFunction", "constructorFunction", 
		"genericFunction", "standalonePredicate", "predicate", "inPredicate", 
		"outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2DocumentIn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2DocumentInParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputPathContext extends ParserRuleContext {
		public InputPathStepContext inputPathStep(int i) {
			return getRuleContext(InputPathStepContext.class,i);
		}
		public List<InputPathStepContext> inputPathStep() {
			return getRuleContexts(InputPathStepContext.class);
		}
		public InputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputPathContext inputPath() throws RecognitionException {
		InputPathContext _localctx = new InputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inputPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); inputPathStep();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARRAYOPEN || _la==DOT );
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

	public static class InputPathStepContext extends ParserRuleContext {
		public InputPathStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputPathStep; }
	 
		public InputPathStepContext() { }
		public void copyFrom(InputPathStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListPathStepContext extends InputPathStepContext {
		public ListStepContext listStep() {
			return getRuleContext(ListStepContext.class,0);
		}
		public ListPathStepContext(InputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterListPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitListPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitListPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributePathStepContext extends InputPathStepContext {
		public AttributeStepContext attributeStep() {
			return getRuleContext(AttributeStepContext.class,0);
		}
		public AttributePathStepContext(InputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAttributePathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAttributePathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAttributePathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SplitPathMethodContext extends InputPathStepContext {
		public SplitMethodContext splitMethod() {
			return getRuleContext(SplitMethodContext.class,0);
		}
		public SplitPathMethodContext(InputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterSplitPathMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitSplitPathMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitSplitPathMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodPathStepContext extends InputPathStepContext {
		public PathMethodContext pathMethod() {
			return getRuleContext(PathMethodContext.class,0);
		}
		public MethodPathStepContext(InputPathStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterMethodPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitMethodPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitMethodPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputPathStepContext inputPathStep() throws RecognitionException {
		InputPathStepContext _localctx = new InputPathStepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inputPathStep);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ListPathStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(ARRAYOPEN);
				setState(70); listStep();
				setState(71); match(ARRAYCLOSE);
				}
				break;

			case 2:
				_localctx = new AttributePathStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(DOT);
				setState(74); attributeStep();
				}
				break;

			case 3:
				_localctx = new MethodPathStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75); match(DOT);
				setState(76); pathMethod();
				}
				break;

			case 4:
				_localctx = new SplitPathMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77); match(DOT);
				setState(78); splitMethod();
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

	public static class AttributeStepContext extends ParserRuleContext {
		public AttributeStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeStep; }
	 
		public AttributeStepContext() { }
		public void copyFrom(AttributeStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericAttributeStepContext extends AttributeStepContext {
		public GenericStepContext genericStep() {
			return getRuleContext(GenericStepContext.class,0);
		}
		public GenericAttributeStepContext(AttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericAttributeStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericAttributeStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericAttributeStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SplitNameStepContext extends AttributeStepContext {
		public TerminalNode SplitToken() { return getToken(NotaQL2DocumentInParser.SplitToken, 0); }
		public SplitNameStepContext(AttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterSplitNameStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitSplitNameStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitSplitNameStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdStepContext extends AttributeStepContext {
		public TerminalNode IdToken() { return getToken(NotaQL2DocumentInParser.IdToken, 0); }
		public IdStepContext(AttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitIdStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeIdStepContext extends AttributeStepContext {
		public AttributeIdContext attributeId() {
			return getRuleContext(AttributeIdContext.class,0);
		}
		public AttributeIdStepContext(AttributeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAttributeIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAttributeIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAttributeIdStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeStepContext attributeStep() throws RecognitionException {
		AttributeStepContext _localctx = new AttributeStepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeStep);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case IdToken:
				_localctx = new IdStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(IdToken);
				}
				break;
			case SplitToken:
				_localctx = new SplitNameStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(SplitToken);
				}
				break;
			case Name:
				_localctx = new AttributeIdStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83); attributeId();
				}
				break;
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
				_localctx = new GenericAttributeStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84); genericStep();
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

	public static class ListStepContext extends ParserRuleContext {
		public ListStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStep; }
	 
		public ListStepContext() { }
		public void copyFrom(ListStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexListStepContext extends ListStepContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexListStepContext(ListStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterIndexListStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitIndexListStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitIndexListStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericListStepContext extends ListStepContext {
		public GenericStepContext genericStep() {
			return getRuleContext(GenericStepContext.class,0);
		}
		public GenericListStepContext(ListStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericListStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericListStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericListStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStepContext listStep() throws RecognitionException {
		ListStepContext _localctx = new ListStepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listStep);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new IndexListStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87); index();
				}
				break;
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
				_localctx = new GenericListStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88); genericStep();
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

	public static class GenericStepContext extends ParserRuleContext {
		public GenericStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericStep; }
	 
		public GenericStepContext() { }
		public void copyFrom(GenericStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnyGenericStepContext extends GenericStepContext {
		public AnyGenericStepContext(GenericStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAnyGenericStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAnyGenericStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAnyGenericStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResolvedGenericStepContext extends GenericStepContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedGenericStepContext(GenericStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterResolvedGenericStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitResolvedGenericStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitResolvedGenericStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateGenericStepContext extends GenericStepContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateGenericStepContext(GenericStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterPredicateGenericStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitPredicateGenericStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitPredicateGenericStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentGenericStepContext extends GenericStepContext {
		public CurrentGenericStepContext(GenericStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterCurrentGenericStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitCurrentGenericStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitCurrentGenericStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericStepContext genericStep() throws RecognitionException {
		GenericStepContext _localctx = new GenericStepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericStep);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case RESOLVE:
				_localctx = new ResolvedGenericStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(RESOLVE);
				setState(92); match(OPEN);
				setState(93); absoluteInputPath();
				setState(94); match(CLOSE);
				}
				break;
			case PREDICATE:
				_localctx = new PredicateGenericStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(PREDICATE);
				setState(97); match(OPEN);
				setState(98); predicate(0);
				setState(99); match(CLOSE);
				}
				break;
			case STAR:
				_localctx = new AnyGenericStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(STAR);
				}
				break;
			case AT:
				_localctx = new CurrentGenericStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102); match(AT);
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

	public static class PathMethodContext extends ParserRuleContext {
		public PathMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathMethod; }
	 
		public PathMethodContext() { }
		public void copyFrom(PathMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexPathMethodContext extends PathMethodContext {
		public TerminalNode IndexToken() { return getToken(NotaQL2DocumentInParser.IndexToken, 0); }
		public IndexPathMethodContext(PathMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterIndexPathMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitIndexPathMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitIndexPathMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamePathMethodContext extends PathMethodContext {
		public TerminalNode NameToken() { return getToken(NotaQL2DocumentInParser.NameToken, 0); }
		public NamePathMethodContext(PathMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterNamePathMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitNamePathMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitNamePathMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathMethodContext pathMethod() throws RecognitionException {
		PathMethodContext _localctx = new PathMethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pathMethod);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case NameToken:
				_localctx = new NamePathMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(NameToken);
				}
				break;
			case IndexToken:
				_localctx = new IndexPathMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(IndexToken);
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

	public static class SplitMethodContext extends ParserRuleContext {
		public SplitMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitMethod; }
	 
		public SplitMethodContext() { }
		public void copyFrom(SplitMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringSplitMethodContext extends SplitMethodContext {
		public TerminalNode SplitToken() { return getToken(NotaQL2DocumentInParser.SplitToken, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public StringSplitMethodContext(SplitMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterStringSplitMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitStringSplitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitStringSplitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitMethodContext splitMethod() throws RecognitionException {
		SplitMethodContext _localctx = new SplitMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_splitMethod);
		int _la;
		try {
			_localctx = new StringSplitMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(SplitToken);
			setState(110); match(OPEN);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(111); atom();
				}
			}

			setState(114); match(CLOSE);
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
		public TerminalNode IndexToken() { return getToken(NotaQL2DocumentInParser.IndexToken, 0); }
		public TerminalNode IdToken() { return getToken(NotaQL2DocumentInParser.IdToken, 0); }
		public TerminalNode NameToken() { return getToken(NotaQL2DocumentInParser.NameToken, 0); }
		public TerminalNode SplitToken() { return getToken(NotaQL2DocumentInParser.SplitToken, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pathToken);
		try {
			setState(121);
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
				setState(116); genericPathToken();
				}
				break;
			case NameToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(NameToken);
				}
				break;
			case IndexToken:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(IndexToken);
				}
				break;
			case SplitToken:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(SplitToken);
				}
				break;
			case IdToken:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); match(IdToken);
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
		public TerminalNode EOF() { return getToken(NotaQL2DocumentInParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); transformation();
					setState(124); match(3);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(131); transformation();
			setState(133);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(132); match(3);
				}
			}

			setState(135); match(EOF);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); inEngine();
			setState(138); match(7);
			setState(139); outEngine();
			setState(140); match(7);
			setState(144);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(141); inPredicate();
				setState(142); match(7);
				}
			}

			setState(149);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(146); outPredicate();
				setState(147); match(7);
				}
			}

			setState(151); attributeSpecification();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(152); match(7);
				setState(153); attributeSpecification();
				}
				}
				setState(158);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(5);
			setState(160); engine();
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(2);
			setState(163); engine();
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
			return getToken(NotaQL2DocumentInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2DocumentInParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); ((EngineContext)_localctx).engineName = match(Name);
			setState(166); match(OPEN);
			setState(179);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(167); match(Name);
				setState(168); match(ARROW);
				setState(169); atom();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(170); match(7);
					setState(171); match(Name);
					setState(172); match(ARROW);
					setState(173); atom();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2DocumentInParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); genericOutputPath();
			setState(184); match(ARROW);
			setState(185); vData(0);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_genericOutputPath);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case NameToken:
			case IndexToken:
			case SplitToken:
			case IdToken:
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
				setState(187); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2DocumentInParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(OUT);
			setState(192); match(DOT);
			setState(193); path();
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); path();
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
		public TerminalNode IN() { return getToken(NotaQL2DocumentInParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(IN);
			setState(198); path();
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
		public TerminalNode AT() { return getToken(NotaQL2DocumentInParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(AT);
			setState(201); path();
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(203); pathToken();
					}
					} 
				}
				setState(208);
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
		public TerminalNode AT() { return getToken(NotaQL2DocumentInParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2DocumentInParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2DocumentInParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2DocumentInParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2DocumentInParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2DocumentInParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2DocumentInParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2DocumentInParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2DocumentInParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2DocumentInParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2DocumentInParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2DocumentInParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2DocumentInParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2DocumentInParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2DocumentInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2DocumentInParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2DocumentInParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2DocumentInParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2DocumentInParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2DocumentInParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2DocumentInParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2DocumentInParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2DocumentInParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2DocumentInParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2DocumentInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2DocumentInParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_genericPathToken);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(OPEN);
				setState(210); path();
				setState(211); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); match(ARRAYOPEN);
				setState(214); path();
				setState(215); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(219); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(220); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(221); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(222); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(223); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(224); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(225); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(226); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(227); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(228); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(229); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(230); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(231); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(232); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(233); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(234); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(235); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(236); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(237); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(238); match(OR);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2DocumentInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2DocumentInParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2DocumentInParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2DocumentInParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAggregateVData(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); match(OPEN);
				setState(244); vData(0);
				setState(245); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(254);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(255);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(256); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(257);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(258);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(259); vData(7);
						}
						break;
					}
					} 
				}
				setState(264);
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
		public TerminalNode MIN() { return getToken(NotaQL2DocumentInParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2DocumentInParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2DocumentInParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2DocumentInParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2DocumentInParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2DocumentInParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2DocumentInParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(266); match(OPEN);
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(267); vData(0);
				}
			}

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(270); match(7);
				setState(271); atom();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2DocumentInParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2DocumentInParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorFunction);
		int _la;
		try {
			setState(303);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(OBJECT);
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
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(Name);
				setState(292); match(OPEN);
				setState(293); attributeSpecification();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(294); match(7);
					setState(295); attributeSpecification();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2DocumentInParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(Name);
			setState(306); match(OPEN);
			setState(315);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(307); vData(0);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(308); match(7);
					setState(309); vData(0);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2DocumentInParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); predicate(0);
			setState(320); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2DocumentInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2DocumentInParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2DocumentInParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2DocumentInParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2DocumentInParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2DocumentInParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2DocumentInParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2DocumentInParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAndPredicate(this);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(323); match(4);
				setState(324); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325); match(OPEN);
				setState(326); predicate(0);
				setState(327); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); vData(0);
				setState(330);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(331); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(338); match(AND);
						setState(339); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(341); match(OR);
						setState(342); predicate(5);
						}
						break;
					}
					} 
				}
				setState(347);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(1);
			setState(349); match(COLON);
			setState(350); predicate(0);
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
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(6);
			setState(353); match(COLON);
			setState(354); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2DocumentInParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2DocumentInParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2DocumentInParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2DocumentInParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2DocumentInParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		int _la;
		try {
			setState(360);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
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
				setState(357); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2DocumentInParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2DocumentInParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2DocumentInListener ) ((NotaQL2DocumentInListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2DocumentInVisitor ) return ((NotaQL2DocumentInVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); ((IndexContext)_localctx).indexNumber = match(Int);
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
		case 21: return vData_sempred((VDataContext)_localctx, predIndex);

		case 26: return predicate_sempred((PredicateContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0171\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\5\bs"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\7\n\u0081\n\n\f"+
		"\n\16\n\u0084\13\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0093\n\13\3\13\3\13\3\13\5\13\u0098\n\13\3\13\3\13"+
		"\3\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16"+
		"\u00b4\13\16\5\16\u00b6\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5"+
		"\20\u00c0\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f2"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ff"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0107\n\27\f\27\16\27\u010a\13"+
		"\27\3\30\3\30\3\30\5\30\u010f\n\30\3\30\3\30\7\30\u0113\n\30\f\30\16\30"+
		"\u0116\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u011f\n\31\f\31\16"+
		"\31\u0122\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u012b\n\31\f\31"+
		"\16\31\u012e\13\31\3\31\3\31\5\31\u0132\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0139\n\32\f\32\16\32\u013c\13\32\5\32\u013e\n\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0152\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u015a\n\34\f"+
		"\34\16\34\u015d\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u016b\n\37\3 \3 \3!\3!\3!\3\u00d0\4,\66\"\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\4\2\36\36\63"+
		"\63\3\2\34\35\3\2$*\3\2\24\31\3\2!\"\u0199\2C\3\2\2\2\4Q\3\2\2\2\6W\3"+
		"\2\2\2\b[\3\2\2\2\ni\3\2\2\2\fm\3\2\2\2\16o\3\2\2\2\20{\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u008b\3\2\2\2\26\u00a1\3\2\2\2\30\u00a4\3\2\2\2\32\u00a7\3"+
		"\2\2\2\34\u00b9\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2\2\2\"\u00c5\3\2\2"+
		"\2$\u00c7\3\2\2\2&\u00ca\3\2\2\2(\u00d0\3\2\2\2*\u00f1\3\2\2\2,\u00fe"+
		"\3\2\2\2.\u010b\3\2\2\2\60\u0131\3\2\2\2\62\u0133\3\2\2\2\64\u0141\3\2"+
		"\2\2\66\u0151\3\2\2\28\u015e\3\2\2\2:\u0162\3\2\2\2<\u016a\3\2\2\2>\u016c"+
		"\3\2\2\2@\u016e\3\2\2\2BD\5\4\3\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\3\3\2\2\2GH\7/\2\2HI\5\b\5\2IJ\7\60\2\2JR\3\2\2\2KL\7\65\2\2LR\5"+
		"\6\4\2MN\7\65\2\2NR\5\f\7\2OP\7\65\2\2PR\5\16\b\2QG\3\2\2\2QK\3\2\2\2"+
		"QM\3\2\2\2QO\3\2\2\2R\5\3\2\2\2SX\7\r\2\2TX\7\f\2\2UX\5> \2VX\5\n\6\2"+
		"WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2Y\\\5@!\2Z\\\5\n\6"+
		"\2[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]^\7\61\2\2^_\7-\2\2_`\5$\23\2`a\7."+
		"\2\2aj\3\2\2\2bc\7\62\2\2cd\7-\2\2de\5\66\34\2ef\7.\2\2fj\3\2\2\2gj\7"+
		"\63\2\2hj\7\64\2\2i]\3\2\2\2ib\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\13\3\2\2\2"+
		"kn\7\n\2\2ln\7\13\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7\f\2\2pr\7-\2"+
		"\2qs\5<\37\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7.\2\2u\17\3\2\2\2v|\5*\26"+
		"\2w|\7\n\2\2x|\7\13\2\2y|\7\f\2\2z|\7\r\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2"+
		"\2\2{y\3\2\2\2{z\3\2\2\2|\21\3\2\2\2}~\5\24\13\2~\177\7\5\2\2\177\u0081"+
		"\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\24"+
		"\13\2\u0086\u0088\7\5\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\2\2\3\u008a\23\3\2\2\2\u008b\u008c\5\26\f"+
		"\2\u008c\u008d\7\t\2\2\u008d\u008e\5\30\r\2\u008e\u0092\7\t\2\2\u008f"+
		"\u0090\58\35\2\u0090\u0091\7\t\2\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0095\5:\36\2\u0095"+
		"\u0096\7\t\2\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009e\5\34\17\2\u009a\u009b\7\t\2\2\u009b"+
		"\u009d\5\34\17\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\25\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\7\2\2\u00a2\u00a3\5\32\16\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\4"+
		"\2\2\u00a5\u00a6\5\32\16\2\u00a6\31\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\u00b5"+
		"\7-\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00b2\5<\37\2\u00ac"+
		"\u00ad\7\t\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\23\2\2\u00af\u00b1\5<"+
		"\37\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00a9\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\5,"+
		"\27\2\u00bc\35\3\2\2\2\u00bd\u00c0\5\"\22\2\u00be\u00c0\5 \21\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\22\2"+
		"\2\u00c2\u00c3\7\65\2\2\u00c3\u00c4\5(\25\2\u00c4!\3\2\2\2\u00c5\u00c6"+
		"\5(\25\2\u00c6#\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\5(\25\2\u00c9"+
		"%\3\2\2\2\u00ca\u00cb\7\64\2\2\u00cb\u00cc\5(\25\2\u00cc\'\3\2\2\2\u00cd"+
		"\u00cf\5\20\t\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4"+
		"\7-\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\7.\2\2\u00d6\u00f2\3\2\2\2\u00d7"+
		"\u00d8\7/\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\7\60\2\2\u00da\u00f2\3\2"+
		"\2\2\u00db\u00f2\7\61\2\2\u00dc\u00f2\7\62\2\2\u00dd\u00f2\7\63\2\2\u00de"+
		"\u00f2\7\64\2\2\u00df\u00f2\7#\2\2\u00e0\u00f2\7!\2\2\u00e1\u00f2\7\""+
		"\2\2\u00e2\u00f2\7,\2\2\u00e3\u00f2\7\65\2\2\u00e4\u00f2\7\66\2\2\u00e5"+
		"\u00f2\7\21\2\2\u00e6\u00f2\7\24\2\2\u00e7\u00f2\7\25\2\2\u00e8\u00f2"+
		"\7\26\2\2\u00e9\u00f2\7\27\2\2\u00ea\u00f2\7\30\2\2\u00eb\u00f2\7\31\2"+
		"\2\u00ec\u00f2\7\34\2\2\u00ed\u00f2\7\35\2\2\u00ee\u00f2\7\36\2\2\u00ef"+
		"\u00f2\7\32\2\2\u00f0\u00f2\7\33\2\2\u00f1\u00d3\3\2\2\2\u00f1\u00d7\3"+
		"\2\2\2\u00f1\u00db\3\2\2\2\u00f1\u00dc\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1"+
		"\u00de\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00e1\3\2"+
		"\2\2\u00f1\u00e2\3\2\2\2\u00f1\u00e3\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f1"+
		"\u00e5\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00e8\3\2"+
		"\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f4\b\27\1\2\u00f4\u00ff"+
		"\5<\37\2\u00f5\u00f6\7-\2\2\u00f6\u00f7\5,\27\2\u00f7\u00f8\7.\2\2\u00f8"+
		"\u00ff\3\2\2\2\u00f9\u00ff\5.\30\2\u00fa\u00ff\5\60\31\2\u00fb\u00ff\5"+
		"\62\32\2\u00fc\u00ff\5$\23\2\u00fd\u00ff\5&\24\2\u00fe\u00f3\3\2\2\2\u00fe"+
		"\u00f5\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0108\3\2\2\2\u0100"+
		"\u0101\f\t\2\2\u0101\u0102\t\2\2\2\u0102\u0107\5,\27\n\u0103\u0104\f\b"+
		"\2\2\u0104\u0105\t\3\2\2\u0105\u0107\5,\27\t\u0106\u0100\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109-\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\t\4\2\2\u010c\u010e"+
		"\7-\2\2\u010d\u010f\5,\27\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0114\3\2\2\2\u0110\u0111\7\t\2\2\u0111\u0113\5<\37\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7.\2\2\u0118/\3\2\2\2\u0119"+
		"\u011a\7+\2\2\u011a\u011b\7-\2\2\u011b\u0120\5\34\17\2\u011c\u011d\7\t"+
		"\2\2\u011d\u011f\5\34\17\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0124\7.\2\2\u0124\u0132\3\2\2\2\u0125\u0126\7,\2\2\u0126\u0127"+
		"\7-\2\2\u0127\u012c\5\34\17\2\u0128\u0129\7\t\2\2\u0129\u012b\5\34\17"+
		"\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7.\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u0119\3\2\2\2\u0131\u0125\3\2\2\2\u0132\61\3\2\2"+
		"\2\u0133\u0134\7,\2\2\u0134\u013d\7-\2\2\u0135\u013a\5,\27\2\u0136\u0137"+
		"\7\t\2\2\u0137\u0139\5,\27\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013d\u0135\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7.\2\2\u0140\63\3\2\2\2\u0141\u0142\5\66\34\2\u0142\u0143\7\2\2"+
		"\3\u0143\65\3\2\2\2\u0144\u0145\b\34\1\2\u0145\u0146\7\6\2\2\u0146\u0152"+
		"\5\66\34\b\u0147\u0148\7-\2\2\u0148\u0149\5\66\34\2\u0149\u014a\7.\2\2"+
		"\u014a\u0152\3\2\2\2\u014b\u014c\5,\27\2\u014c\u014d\t\5\2\2\u014d\u014e"+
		"\5,\27\2\u014e\u0152\3\2\2\2\u014f\u0152\5$\23\2\u0150\u0152\5&\24\2\u0151"+
		"\u0144\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152\u015b\3\2\2\2\u0153\u0154\f\7\2\2\u0154"+
		"\u0155\7\32\2\2\u0155\u015a\5\66\34\b\u0156\u0157\f\6\2\2\u0157\u0158"+
		"\7\33\2\2\u0158\u015a\5\66\34\7\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2"+
		"\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\67"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\3\2\2\u015f\u0160\7\66\2\2"+
		"\u0160\u0161\5\66\34\2\u01619\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164"+
		"\7\66\2\2\u0164\u0165\5\66\34\2\u0165;\3\2\2\2\u0166\u016b\t\6\2\2\u0167"+
		"\u016b\7#\2\2\u0168\u016b\7\37\2\2\u0169\u016b\7 \2\2\u016a\u0166\3\2"+
		"\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"=\3\2\2\2\u016c\u016d\7,\2\2\u016d?\3\2\2\2\u016e\u016f\7!\2\2\u016fA"+
		"\3\2\2\2\"EQW[imr{\u0082\u0087\u0092\u0097\u009e\u00b2\u00b5\u00bf\u00d0"+
		"\u00f1\u00fe\u0106\u0108\u010e\u0114\u0120\u012c\u0131\u013a\u013d\u0151"+
		"\u0159\u015b\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}