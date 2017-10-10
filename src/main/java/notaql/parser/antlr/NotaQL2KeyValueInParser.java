// Generated from notaql\parser\antlr\NotaQL2KeyValueIn.g4 by ANTLR 4.2.1
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
public class NotaQL2KeyValueInParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, NameToken=8, IndexToken=9, 
		Key=10, Val=11, Split=12, SL_COMMENT=13, OPTWS=14, OPTNL=15, IN=16, OUT=17, 
		ARROW=18, EQ=19, NEQ=20, LT=21, LTEQ=22, GT=23, GTEQ=24, AND=25, OR=26, 
		PLUS=27, MINUS=28, DIV=29, TRUE=30, FALSE=31, Int=32, Float=33, String=34, 
		AVG=35, COUNT=36, MAX=37, MIN=38, SUM=39, IMPLODE=40, LIST=41, OBJECT=42, 
		Name=43, OPEN=44, CLOSE=45, ARRAYOPEN=46, ARRAYCLOSE=47, RESOLVE=48, PREDICATE=49, 
		STAR=50, AT=51, DOT=52, COLON=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'name()'", "'index()'", "'_k'", "'_v'", "'split'", 
		"SL_COMMENT", "OPTWS", "OPTNL", "'IN'", "'OUT'", "'<-'", "'='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", 
		"'false'", "Int", "Float", "String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", 
		"'SUM'", "'IMPLODE'", "'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", 
		"']'", "'$'", "'?'", "'*'", "'@'", "'.'", "':'"
	};
	public static final int
		RULE_inputPath = 0, RULE_splitStep = 1, RULE_complexTypeStep = 2, RULE_hashStep = 3, 
		RULE_listStep = 4, RULE_genericComplexStep = 5, RULE_hashMethod = 6, RULE_listMethod = 7, 
		RULE_keyId = 8, RULE_pathToken = 9, RULE_notaql = 10, RULE_transformation = 11, 
		RULE_inEngine = 12, RULE_outEngine = 13, RULE_engine = 14, RULE_attributeSpecification = 15, 
		RULE_genericOutputPath = 16, RULE_absoluteOutputPath = 17, RULE_relativeOutputPath = 18, 
		RULE_absoluteInputPath = 19, RULE_relativeInputPath = 20, RULE_path = 21, 
		RULE_genericPathToken = 22, RULE_vData = 23, RULE_aggregationFunction = 24, 
		RULE_constructorFunction = 25, RULE_genericFunction = 26, RULE_standalonePredicate = 27, 
		RULE_predicate = 28, RULE_inPredicate = 29, RULE_outPredicate = 30, RULE_atom = 31, 
		RULE_attributeId = 32, RULE_index = 33;
	public static final String[] ruleNames = {
		"inputPath", "splitStep", "complexTypeStep", "hashStep", "listStep", "genericComplexStep", 
		"hashMethod", "listMethod", "keyId", "pathToken", "notaql", "transformation", 
		"inEngine", "outEngine", "engine", "attributeSpecification", "genericOutputPath", 
		"absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", "relativeInputPath", 
		"path", "genericPathToken", "vData", "aggregationFunction", "constructorFunction", 
		"genericFunction", "standalonePredicate", "predicate", "inPredicate", 
		"outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2KeyValueIn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2KeyValueInParser(TokenStream input) {
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
	public static class ValueInputPathContext extends InputPathContext {
		public ComplexTypeStepContext complexTypeStep() {
			return getRuleContext(ComplexTypeStepContext.class,0);
		}
		public SplitStepContext splitStep() {
			return getRuleContext(SplitStepContext.class,0);
		}
		public TerminalNode Val() { return getToken(NotaQL2KeyValueInParser.Val, 0); }
		public ValueInputPathContext(InputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterValueInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitValueInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitValueInputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyInputPathContext extends InputPathContext {
		public TerminalNode Key() { return getToken(NotaQL2KeyValueInParser.Key, 0); }
		public KeyInputPathContext(InputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterKeyInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitKeyInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitKeyInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputPathContext inputPath() throws RecognitionException {
		InputPathContext _localctx = new InputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inputPath);
		int _la;
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new KeyInputPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(DOT);
				setState(69); match(Key);
				}
				break;

			case 2:
				_localctx = new ValueInputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(DOT);
				setState(71); match(Val);
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(72); complexTypeStep();
					}
					break;
				}
				setState(76);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(75); splitStep();
					}
				}

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

	public static class SplitStepContext extends ParserRuleContext {
		public TerminalNode Split() { return getToken(NotaQL2KeyValueInParser.Split, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SplitStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterSplitStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitSplitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitSplitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitStepContext splitStep() throws RecognitionException {
		SplitStepContext _localctx = new SplitStepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_splitStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(DOT);
			setState(81); match(Split);
			setState(82); match(OPEN);
			setState(84);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(83); atom();
				}
			}

			setState(86); match(CLOSE);
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

	public static class ComplexTypeStepContext extends ParserRuleContext {
		public ComplexTypeStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexTypeStep; }
	 
		public ComplexTypeStepContext() { }
		public void copyFrom(ComplexTypeStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListPathStepContext extends ComplexTypeStepContext {
		public ListMethodContext listMethod() {
			return getRuleContext(ListMethodContext.class,0);
		}
		public ListStepContext listStep() {
			return getRuleContext(ListStepContext.class,0);
		}
		public ListPathStepContext(ComplexTypeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterListPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitListPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitListPathStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HashPathStepContext extends ComplexTypeStepContext {
		public HashStepContext hashStep() {
			return getRuleContext(HashStepContext.class,0);
		}
		public HashMethodContext hashMethod() {
			return getRuleContext(HashMethodContext.class,0);
		}
		public HashPathStepContext(ComplexTypeStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterHashPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitHashPathStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitHashPathStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeStepContext complexTypeStep() throws RecognitionException {
		ComplexTypeStepContext _localctx = new ComplexTypeStepContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_complexTypeStep);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case ARRAYOPEN:
				_localctx = new ListPathStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(ARRAYOPEN);
				setState(89); listStep();
				setState(90); match(ARRAYCLOSE);
				setState(93);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(91); match(DOT);
					setState(92); listMethod();
					}
					break;
				}
				}
				break;
			case DOT:
				_localctx = new HashPathStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(DOT);
				setState(96); hashStep();
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(97); match(DOT);
					setState(98); hashMethod();
					}
					break;
				}
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

	public static class HashStepContext extends ParserRuleContext {
		public HashStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashStep; }
	 
		public HashStepContext() { }
		public void copyFrom(HashStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericComplexHashStepContext extends HashStepContext {
		public GenericComplexStepContext genericComplexStep() {
			return getRuleContext(GenericComplexStepContext.class,0);
		}
		public GenericComplexHashStepContext(HashStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericComplexHashStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericComplexHashStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericComplexHashStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyIdHashStepContext extends HashStepContext {
		public KeyIdContext keyId() {
			return getRuleContext(KeyIdContext.class,0);
		}
		public KeyIdHashStepContext(HashStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterKeyIdHashStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitKeyIdHashStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitKeyIdHashStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashStepContext hashStep() throws RecognitionException {
		HashStepContext _localctx = new HashStepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hashStep);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case Name:
				_localctx = new KeyIdHashStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103); keyId();
				}
				break;
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
				_localctx = new GenericComplexHashStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104); genericComplexStep();
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
	public static class GenericComplexListStepContext extends ListStepContext {
		public GenericComplexStepContext genericComplexStep() {
			return getRuleContext(GenericComplexStepContext.class,0);
		}
		public GenericComplexListStepContext(ListStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericComplexListStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericComplexListStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericComplexListStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexListStepContext extends ListStepContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexListStepContext(ListStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterIndexListStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitIndexListStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitIndexListStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStepContext listStep() throws RecognitionException {
		ListStepContext _localctx = new ListStepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listStep);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case Int:
				_localctx = new IndexListStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); index();
				}
				break;
			case RESOLVE:
			case PREDICATE:
			case STAR:
			case AT:
				_localctx = new GenericComplexListStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108); genericComplexStep();
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

	public static class GenericComplexStepContext extends ParserRuleContext {
		public GenericComplexStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericComplexStep; }
	 
		public GenericComplexStepContext() { }
		public void copyFrom(GenericComplexStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicateGenericComplexStepContext extends GenericComplexStepContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateGenericComplexStepContext(GenericComplexStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterPredicateGenericComplexStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitPredicateGenericComplexStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitPredicateGenericComplexStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnyGenericComplexStepContext extends GenericComplexStepContext {
		public AnyGenericComplexStepContext(GenericComplexStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAnyGenericComplexStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAnyGenericComplexStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAnyGenericComplexStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResolvedGenericComplexStepContext extends GenericComplexStepContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedGenericComplexStepContext(GenericComplexStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterResolvedGenericComplexStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitResolvedGenericComplexStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitResolvedGenericComplexStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentGenericComplexStepContext extends GenericComplexStepContext {
		public CurrentGenericComplexStepContext(GenericComplexStepContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterCurrentGenericComplexStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitCurrentGenericComplexStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitCurrentGenericComplexStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericComplexStepContext genericComplexStep() throws RecognitionException {
		GenericComplexStepContext _localctx = new GenericComplexStepContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericComplexStep);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case RESOLVE:
				_localctx = new ResolvedGenericComplexStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(RESOLVE);
				setState(112); match(OPEN);
				setState(113); absoluteInputPath();
				setState(114); match(CLOSE);
				}
				break;
			case STAR:
				_localctx = new AnyGenericComplexStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(STAR);
				}
				break;
			case AT:
				_localctx = new CurrentGenericComplexStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117); match(AT);
				}
				break;
			case PREDICATE:
				_localctx = new PredicateGenericComplexStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118); match(PREDICATE);
				setState(119); match(OPEN);
				setState(120); predicate(0);
				setState(121); match(CLOSE);
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

	public static class HashMethodContext extends ParserRuleContext {
		public HashMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashMethod; }
	 
		public HashMethodContext() { }
		public void copyFrom(HashMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameHashMethodContext extends HashMethodContext {
		public TerminalNode NameToken() { return getToken(NotaQL2KeyValueInParser.NameToken, 0); }
		public NameHashMethodContext(HashMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterNameHashMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitNameHashMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitNameHashMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashMethodContext hashMethod() throws RecognitionException {
		HashMethodContext _localctx = new HashMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hashMethod);
		try {
			_localctx = new NameHashMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(NameToken);
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

	public static class ListMethodContext extends ParserRuleContext {
		public ListMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listMethod; }
	 
		public ListMethodContext() { }
		public void copyFrom(ListMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexListMethodContext extends ListMethodContext {
		public TerminalNode IndexToken() { return getToken(NotaQL2KeyValueInParser.IndexToken, 0); }
		public IndexListMethodContext(ListMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterIndexListMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitIndexListMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitIndexListMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListMethodContext listMethod() throws RecognitionException {
		ListMethodContext _localctx = new ListMethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listMethod);
		try {
			_localctx = new IndexListMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(IndexToken);
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

	public static class KeyIdContext extends ParserRuleContext {
		public TerminalNode Name(int i) {
			return getToken(NotaQL2KeyValueInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2KeyValueInParser.Name); }
		public KeyIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterKeyId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitKeyId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitKeyId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyIdContext keyId() throws RecognitionException {
		KeyIdContext _localctx = new KeyIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(Name);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(130); match(COLON);
				setState(131); match(Name);
				}
				}
				setState(136);
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

	public static class PathTokenContext extends ParserRuleContext {
		public GenericPathTokenContext genericPathToken() {
			return getRuleContext(GenericPathTokenContext.class,0);
		}
		public TerminalNode Key() { return getToken(NotaQL2KeyValueInParser.Key, 0); }
		public TerminalNode IndexToken() { return getToken(NotaQL2KeyValueInParser.IndexToken, 0); }
		public TerminalNode NameToken() { return getToken(NotaQL2KeyValueInParser.NameToken, 0); }
		public TerminalNode Split() { return getToken(NotaQL2KeyValueInParser.Split, 0); }
		public TerminalNode Val() { return getToken(NotaQL2KeyValueInParser.Val, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pathToken);
		try {
			setState(143);
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
				setState(137); genericPathToken();
				}
				break;
			case NameToken:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(NameToken);
				}
				break;
			case IndexToken:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); match(IndexToken);
				}
				break;
			case Key:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(Key);
				}
				break;
			case Val:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); match(Val);
				}
				break;
			case Split:
				enterOuterAlt(_localctx, 6);
				{
				setState(142); match(Split);
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
		public TerminalNode EOF() { return getToken(NotaQL2KeyValueInParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); transformation();
					setState(146); match(3);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(153); transformation();
			setState(155);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(154); match(3);
				}
			}

			setState(157); match(EOF);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); inEngine();
			setState(160); match(7);
			setState(161); outEngine();
			setState(162); match(7);
			setState(166);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(163); inPredicate();
				setState(164); match(7);
				}
			}

			setState(171);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(168); outPredicate();
				setState(169); match(7);
				}
			}

			setState(173); attributeSpecification();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(174); match(7);
				setState(175); attributeSpecification();
				}
				}
				setState(180);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(5);
			setState(182); engine();
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(2);
			setState(185); engine();
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
			return getToken(NotaQL2KeyValueInParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2KeyValueInParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); ((EngineContext)_localctx).engineName = match(Name);
			setState(188); match(OPEN);
			setState(201);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(189); match(Name);
				setState(190); match(ARROW);
				setState(191); atom();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(192); match(7);
					setState(193); match(Name);
					setState(194); match(ARROW);
					setState(195); atom();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2KeyValueInParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); genericOutputPath();
			setState(206); match(ARROW);
			setState(207); vData(0);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_genericOutputPath);
		try {
			setState(211);
			switch (_input.LA(1)) {
			case NameToken:
			case IndexToken:
			case Key:
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
				setState(209); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2KeyValueInParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(OUT);
			setState(214); match(DOT);
			setState(215); path();
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); path();
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
		public TerminalNode IN() { return getToken(NotaQL2KeyValueInParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(IN);
			setState(220); path();
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
		public TerminalNode AT() { return getToken(NotaQL2KeyValueInParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(AT);
			setState(223); path();
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(225); pathToken();
					}
					} 
				}
				setState(230);
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
			exitRule();
		}
		return _localctx;
	}

	public static class GenericPathTokenContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NotaQL2KeyValueInParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2KeyValueInParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2KeyValueInParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2KeyValueInParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2KeyValueInParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2KeyValueInParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2KeyValueInParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2KeyValueInParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2KeyValueInParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2KeyValueInParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2KeyValueInParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2KeyValueInParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2KeyValueInParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2KeyValueInParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2KeyValueInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2KeyValueInParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2KeyValueInParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2KeyValueInParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2KeyValueInParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2KeyValueInParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2KeyValueInParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2KeyValueInParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2KeyValueInParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2KeyValueInParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2KeyValueInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2KeyValueInParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericPathToken);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(OPEN);
				setState(232); path();
				setState(233); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); match(ARRAYOPEN);
				setState(236); path();
				setState(237); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(240); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(241); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(242); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(243); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(244); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(245); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(246); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(247); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(248); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(249); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(250); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(251); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(252); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(253); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(254); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(255); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(256); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(257); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(258); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(259); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(260); match(OR);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2KeyValueInParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2KeyValueInParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2KeyValueInParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2KeyValueInParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAggregateVData(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); match(OPEN);
				setState(266); vData(0);
				setState(267); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(276);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(277);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(278); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(280);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(281); vData(7);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public TerminalNode MIN() { return getToken(NotaQL2KeyValueInParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2KeyValueInParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2KeyValueInParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2KeyValueInParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2KeyValueInParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2KeyValueInParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2KeyValueInParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(288); match(OPEN);
			setState(290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(289); vData(0);
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(292); match(7);
				setState(293); atom();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueInParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2KeyValueInParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorFunction);
		int _la;
		try {
			setState(325);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301); match(OBJECT);
				setState(302); match(OPEN);
				setState(303); attributeSpecification();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(304); match(7);
					setState(305); attributeSpecification();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313); match(Name);
				setState(314); match(OPEN);
				setState(315); attributeSpecification();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(316); match(7);
					setState(317); attributeSpecification();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueInParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(Name);
			setState(328); match(OPEN);
			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(329); vData(0);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(330); match(7);
					setState(331); vData(0);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2KeyValueInParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); predicate(0);
			setState(342); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2KeyValueInParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2KeyValueInParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2KeyValueInParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2KeyValueInParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2KeyValueInParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2KeyValueInParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2KeyValueInParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2KeyValueInParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAndPredicate(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(345); match(4);
				setState(346); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347); match(OPEN);
				setState(348); predicate(0);
				setState(349); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351); vData(0);
				setState(352);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(353); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(359);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(360); match(AND);
						setState(361); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(362);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(363); match(OR);
						setState(364); predicate(5);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(1);
			setState(371); match(COLON);
			setState(372); predicate(0);
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
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(6);
			setState(375); match(COLON);
			setState(376); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2KeyValueInParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2KeyValueInParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2KeyValueInParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2KeyValueInParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2KeyValueInParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		int _la;
		try {
			setState(382);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
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
				setState(379); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(381); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueInParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2KeyValueInParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueInListener ) ((NotaQL2KeyValueInListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueInVisitor ) return ((NotaQL2KeyValueInVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); ((IndexContext)_localctx).indexNumber = match(Int);
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
		case 23: return vData_sempred((VDataContext)_localctx, predIndex);

		case 28: return predicate_sempred((PredicateContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0187\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\2\5\2O\n\2\5\2Q\n\2\3"+
		"\3\3\3\3\3\3\3\5\3W\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3"+
		"\4\3\4\5\4f\n\4\5\4h\n\4\3\5\3\5\5\5l\n\5\3\6\3\6\5\6p\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0092\n\13\3\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3\f\3\f\5"+
		"\f\u009e\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\r\3\r"+
		"\3\r\5\r\u00ae\n\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00c7\n\20\f\20\16\20\u00ca\13\20\5\20\u00cc\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\7\27\u00e5\n\27\f\27\16\27\u00e8\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0115\n\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011d"+
		"\n\31\f\31\16\31\u0120\13\31\3\32\3\32\3\32\5\32\u0125\n\32\3\32\3\32"+
		"\7\32\u0129\n\32\f\32\16\32\u012c\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0135\n\33\f\33\16\33\u0138\13\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u0141\n\33\f\33\16\33\u0144\13\33\3\33\3\33\5\33\u0148"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u014f\n\34\f\34\16\34\u0152\13\34"+
		"\5\34\u0154\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0168\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u0170\n\36\f\36\16\36\u0173\13\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\5!\u0181\n!\3\"\3\"\3#\3#\3#\3\u00e6\4\60:$\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7"+
		"\4\2\37\37\64\64\3\2\35\36\3\2%+\3\2\25\32\3\2\"#\u01ae\2P\3\2\2\2\4R"+
		"\3\2\2\2\6g\3\2\2\2\bk\3\2\2\2\no\3\2\2\2\f}\3\2\2\2\16\177\3\2\2\2\20"+
		"\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0091\3\2\2\2\26\u0098\3\2\2\2\30\u00a1"+
		"\3\2\2\2\32\u00b7\3\2\2\2\34\u00ba\3\2\2\2\36\u00bd\3\2\2\2 \u00cf\3\2"+
		"\2\2\"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00db\3\2\2\2(\u00dd\3\2\2\2*\u00e0"+
		"\3\2\2\2,\u00e6\3\2\2\2.\u0107\3\2\2\2\60\u0114\3\2\2\2\62\u0121\3\2\2"+
		"\2\64\u0147\3\2\2\2\66\u0149\3\2\2\28\u0157\3\2\2\2:\u0167\3\2\2\2<\u0174"+
		"\3\2\2\2>\u0178\3\2\2\2@\u0180\3\2\2\2B\u0182\3\2\2\2D\u0184\3\2\2\2F"+
		"G\7\66\2\2GQ\7\f\2\2HI\7\66\2\2IK\7\r\2\2JL\5\6\4\2KJ\3\2\2\2KL\3\2\2"+
		"\2LN\3\2\2\2MO\5\4\3\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PF\3\2\2\2PH\3\2\2"+
		"\2Q\3\3\2\2\2RS\7\66\2\2ST\7\16\2\2TV\7.\2\2UW\5@!\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7/\2\2Y\5\3\2\2\2Z[\7\60\2\2[\\\5\n\6\2\\_\7\61\2\2]^\7"+
		"\66\2\2^`\5\20\t\2_]\3\2\2\2_`\3\2\2\2`h\3\2\2\2ab\7\66\2\2be\5\b\5\2"+
		"cd\7\66\2\2df\5\16\b\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2gZ\3\2\2\2ga\3\2\2"+
		"\2h\7\3\2\2\2il\5\22\n\2jl\5\f\7\2ki\3\2\2\2kj\3\2\2\2l\t\3\2\2\2mp\5"+
		"D#\2np\5\f\7\2om\3\2\2\2on\3\2\2\2p\13\3\2\2\2qr\7\62\2\2rs\7.\2\2st\5"+
		"(\25\2tu\7/\2\2u~\3\2\2\2v~\7\64\2\2w~\7\65\2\2xy\7\63\2\2yz\7.\2\2z{"+
		"\5:\36\2{|\7/\2\2|~\3\2\2\2}q\3\2\2\2}v\3\2\2\2}w\3\2\2\2}x\3\2\2\2~\r"+
		"\3\2\2\2\177\u0080\7\n\2\2\u0080\17\3\2\2\2\u0081\u0082\7\13\2\2\u0082"+
		"\21\3\2\2\2\u0083\u0088\7-\2\2\u0084\u0085\7\67\2\2\u0085\u0087\7-\2\2"+
		"\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\23\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0092\5.\30\2\u008c"+
		"\u0092\7\n\2\2\u008d\u0092\7\13\2\2\u008e\u0092\7\f\2\2\u008f\u0092\7"+
		"\r\2\2\u0090\u0092\7\16\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\25\3\2\2\2\u0093\u0094\5\30\r\2\u0094\u0095\7\5\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5\30"+
		"\r\2\u009c\u009e\7\5\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\7\2\2\3\u00a0\27\3\2\2\2\u00a1\u00a2\5\32\16"+
		"\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5\34\17\2\u00a4\u00a8\7\t\2\2\u00a5"+
		"\u00a6\5<\37\2\u00a6\u00a7\7\t\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ab\5> \2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b4\5 \21\2\u00b0\u00b1\7\t\2\2\u00b1\u00b3\5 "+
		"\21\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\7\2"+
		"\2\u00b8\u00b9\5\36\20\2\u00b9\33\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc"+
		"\5\36\20\2\u00bc\35\3\2\2\2\u00bd\u00be\7-\2\2\u00be\u00cb\7.\2\2\u00bf"+
		"\u00c0\7-\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c8\5@!\2\u00c2\u00c3\7\t\2"+
		"\2\u00c3\u00c4\7-\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c7\5@!\2\u00c6\u00c2"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce\37\3\2\2\2\u00cf\u00d0"+
		"\5\"\22\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5\60\31\2\u00d2!\3\2\2\2\u00d3"+
		"\u00d6\5&\24\2\u00d4\u00d6\5$\23\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6#\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7\66\2\2\u00d9\u00da"+
		"\5,\27\2\u00da%\3\2\2\2\u00db\u00dc\5,\27\2\u00dc\'\3\2\2\2\u00dd\u00de"+
		"\7\22\2\2\u00de\u00df\5,\27\2\u00df)\3\2\2\2\u00e0\u00e1\7\65\2\2\u00e1"+
		"\u00e2\5,\27\2\u00e2+\3\2\2\2\u00e3\u00e5\5\24\13\2\u00e4\u00e3\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7-"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7.\2\2\u00ea\u00eb\5,\27\2\u00eb"+
		"\u00ec\7/\2\2\u00ec\u0108\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\5,"+
		"\27\2\u00ef\u00f0\7\61\2\2\u00f0\u0108\3\2\2\2\u00f1\u0108\7\62\2\2\u00f2"+
		"\u0108\7\63\2\2\u00f3\u0108\7\64\2\2\u00f4\u0108\7\65\2\2\u00f5\u0108"+
		"\7$\2\2\u00f6\u0108\7\"\2\2\u00f7\u0108\7#\2\2\u00f8\u0108\7-\2\2\u00f9"+
		"\u0108\7\66\2\2\u00fa\u0108\7\67\2\2\u00fb\u0108\7\22\2\2\u00fc\u0108"+
		"\7\25\2\2\u00fd\u0108\7\26\2\2\u00fe\u0108\7\27\2\2\u00ff\u0108\7\30\2"+
		"\2\u0100\u0108\7\31\2\2\u0101\u0108\7\32\2\2\u0102\u0108\7\35\2\2\u0103"+
		"\u0108\7\36\2\2\u0104\u0108\7\37\2\2\u0105\u0108\7\33\2\2\u0106\u0108"+
		"\7\34\2\2\u0107\u00e9\3\2\2\2\u0107\u00ed\3\2\2\2\u0107\u00f1\3\2\2\2"+
		"\u0107\u00f2\3\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00f4\3\2\2\2\u0107\u00f5"+
		"\3\2\2\2\u0107\u00f6\3\2\2\2\u0107\u00f7\3\2\2\2\u0107\u00f8\3\2\2\2\u0107"+
		"\u00f9\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00fc\3\2"+
		"\2\2\u0107\u00fd\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2"+
		"\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"/\3\2\2\2\u0109\u010a\b\31\1\2\u010a\u0115\5@!\2\u010b\u010c\7.\2\2\u010c"+
		"\u010d\5\60\31\2\u010d\u010e\7/\2\2\u010e\u0115\3\2\2\2\u010f\u0115\5"+
		"\62\32\2\u0110\u0115\5\64\33\2\u0111\u0115\5\66\34\2\u0112\u0115\5(\25"+
		"\2\u0113\u0115\5*\26\2\u0114\u0109\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010f"+
		"\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u011e\3\2\2\2\u0116\u0117\f\t\2\2\u0117\u0118\t\2"+
		"\2\2\u0118\u011d\5\60\31\n\u0119\u011a\f\b\2\2\u011a\u011b\t\3\2\2\u011b"+
		"\u011d\5\60\31\t\u011c\u0116\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\61\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\t\4\2\2\u0122\u0124\7.\2\2\u0123\u0125\5\60"+
		"\31\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012a\3\2\2\2\u0126"+
		"\u0127\7\t\2\2\u0127\u0129\5@!\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\7/\2\2\u012e\63\3\2\2\2\u012f\u0130\7,\2\2\u0130"+
		"\u0131\7.\2\2\u0131\u0136\5 \21\2\u0132\u0133\7\t\2\2\u0133\u0135\5 \21"+
		"\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7/\2\2\u013a"+
		"\u0148\3\2\2\2\u013b\u013c\7-\2\2\u013c\u013d\7.\2\2\u013d\u0142\5 \21"+
		"\2\u013e\u013f\7\t\2\2\u013f\u0141\5 \21\2\u0140\u013e\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7/\2\2\u0146\u0148\3\2\2\2\u0147\u012f\3\2"+
		"\2\2\u0147\u013b\3\2\2\2\u0148\65\3\2\2\2\u0149\u014a\7-\2\2\u014a\u0153"+
		"\7.\2\2\u014b\u0150\5\60\31\2\u014c\u014d\7\t\2\2\u014d\u014f\5\60\31"+
		"\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u014b\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7/\2\2\u0156\67\3\2\2\2"+
		"\u0157\u0158\5:\36\2\u0158\u0159\7\2\2\3\u01599\3\2\2\2\u015a\u015b\b"+
		"\36\1\2\u015b\u015c\7\6\2\2\u015c\u0168\5:\36\b\u015d\u015e\7.\2\2\u015e"+
		"\u015f\5:\36\2\u015f\u0160\7/\2\2\u0160\u0168\3\2\2\2\u0161\u0162\5\60"+
		"\31\2\u0162\u0163\t\5\2\2\u0163\u0164\5\60\31\2\u0164\u0168\3\2\2\2\u0165"+
		"\u0168\5(\25\2\u0166\u0168\5*\26\2\u0167\u015a\3\2\2\2\u0167\u015d\3\2"+
		"\2\2\u0167\u0161\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0171\3\2\2\2\u0169\u016a\f\7\2\2\u016a\u016b\7\33\2\2\u016b\u0170\5"+
		":\36\b\u016c\u016d\f\6\2\2\u016d\u016e\7\34\2\2\u016e\u0170\5:\36\7\u016f"+
		"\u0169\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172;\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175"+
		"\7\3\2\2\u0175\u0176\7\67\2\2\u0176\u0177\5:\36\2\u0177=\3\2\2\2\u0178"+
		"\u0179\7\b\2\2\u0179\u017a\7\67\2\2\u017a\u017b\5:\36\2\u017b?\3\2\2\2"+
		"\u017c\u0181\t\6\2\2\u017d\u0181\7$\2\2\u017e\u0181\7 \2\2\u017f\u0181"+
		"\7!\2\2\u0180\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u017f\3\2\2\2\u0181A\3\2\2\2\u0182\u0183\7-\2\2\u0183C\3\2\2\2\u0184"+
		"\u0185\7\"\2\2\u0185E\3\2\2\2&KNPV_egko}\u0088\u0091\u0098\u009d\u00a8"+
		"\u00ad\u00b4\u00c8\u00cb\u00d5\u00e6\u0107\u0114\u011c\u011e\u0124\u012a"+
		"\u0136\u0142\u0147\u0150\u0153\u0167\u016f\u0171\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}