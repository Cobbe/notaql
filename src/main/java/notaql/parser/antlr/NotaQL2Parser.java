// Generated from notaql\parser\antlr\NotaQL2.g4 by ANTLR 4.2.1
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
public class NotaQL2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, SL_COMMENT=8, 
		OPTWS=9, OPTNL=10, IN=11, OUT=12, ARROW=13, EQ=14, NEQ=15, LT=16, LTEQ=17, 
		GT=18, GTEQ=19, AND=20, OR=21, PLUS=22, MINUS=23, DIV=24, TRUE=25, FALSE=26, 
		Int=27, Float=28, String=29, AVG=30, COUNT=31, MAX=32, MIN=33, SUM=34, 
		IMPLODE=35, LIST=36, OBJECT=37, Name=38, OPEN=39, CLOSE=40, ARRAYOPEN=41, 
		ARRAYCLOSE=42, RESOLVE=43, PREDICATE=44, STAR=45, AT=46, DOT=47, COLON=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'!'", "'IN-ENGINE:'", "'OUT-ENGINE:'", "';'", 
		"'OUT-FILTER'", "','", "SL_COMMENT", "OPTWS", "OPTNL", "'IN'", "'OUT'", 
		"'<-'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'+'", 
		"'-'", "'/'", "'true'", "'false'", "Int", "Float", "String", "'AVG'", 
		"'COUNT'", "'MAX'", "'MIN'", "'SUM'", "'IMPLODE'", "'LIST'", "'OBJECT'", 
		"Name", "'('", "')'", "'['", "']'", "'$'", "'?'", "'*'", "'@'", "'.'", 
		"':'"
	};
	public static final int
		RULE_notaql = 0, RULE_transformation = 1, RULE_inEngine = 2, RULE_outEngine = 3, 
		RULE_engine = 4, RULE_attributeSpecification = 5, RULE_genericOutputPath = 6, 
		RULE_absoluteOutputPath = 7, RULE_relativeOutputPath = 8, RULE_absoluteInputPath = 9, 
		RULE_relativeInputPath = 10, RULE_path = 11, RULE_pathToken = 12, RULE_genericPathToken = 13, 
		RULE_vData = 14, RULE_aggregationFunction = 15, RULE_constructorFunction = 16, 
		RULE_genericFunction = 17, RULE_standalonePredicate = 18, RULE_predicate = 19, 
		RULE_inPredicate = 20, RULE_outPredicate = 21, RULE_atom = 22, RULE_attributeId = 23, 
		RULE_index = 24;
	public static final String[] ruleNames = {
		"notaql", "transformation", "inEngine", "outEngine", "engine", "attributeSpecification", 
		"genericOutputPath", "absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", 
		"relativeInputPath", "path", "pathToken", "genericPathToken", "vData", 
		"aggregationFunction", "constructorFunction", "genericFunction", "standalonePredicate", 
		"predicate", "inPredicate", "outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NotaqlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NotaQL2Parser.EOF, 0); }
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(50); transformation();
					setState(51); match(5);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58); transformation();
			setState(60);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(59); match(5);
				}
			}

			setState(62); match(EOF);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); inEngine();
			setState(65); match(7);
			setState(66); outEngine();
			setState(67); match(7);
			setState(71);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(68); inPredicate();
				setState(69); match(7);
				}
			}

			setState(76);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(73); outPredicate();
				setState(74); match(7);
				}
			}

			setState(78); attributeSpecification();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(79); match(7);
				setState(80); attributeSpecification();
				}
				}
				setState(85);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(3);
			setState(87); engine();
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(4);
			setState(90); engine();
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
			return getToken(NotaQL2Parser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2Parser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); ((EngineContext)_localctx).engineName = match(Name);
			setState(93); match(OPEN);
			setState(106);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(94); match(Name);
				setState(95); match(ARROW);
				setState(96); atom();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(97); match(7);
					setState(98); match(Name);
					setState(99); match(ARROW);
					setState(100); atom();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2Parser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); genericOutputPath();
			setState(111); match(ARROW);
			setState(112); vData(0);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genericOutputPath);
		try {
			setState(116);
			switch (_input.LA(1)) {
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
				setState(114); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2Parser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(OUT);
			setState(119); match(DOT);
			setState(120); path();
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); path();
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
		public TerminalNode IN() { return getToken(NotaQL2Parser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(IN);
			setState(125); path();
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
		public TerminalNode AT() { return getToken(NotaQL2Parser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(AT);
			setState(128); path();
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(130); pathToken();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pathToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); genericPathToken();
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
		public TerminalNode AT() { return getToken(NotaQL2Parser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2Parser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2Parser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2Parser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2Parser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2Parser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2Parser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2Parser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2Parser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2Parser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2Parser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2Parser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2Parser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2Parser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2Parser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2Parser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2Parser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2Parser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2Parser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2Parser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2Parser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2Parser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2Parser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2Parser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2Parser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_genericPathToken);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); match(OPEN);
				setState(139); path();
				setState(140); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(ARRAYOPEN);
				setState(143); path();
				setState(144); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(148); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(150); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(151); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(152); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(153); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(154); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(155); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(156); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(157); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(158); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(159); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(160); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(161); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(162); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(163); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(164); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(165); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(166); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(167); match(OR);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2Parser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2Parser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2Parser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAggregateVData(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(OPEN);
				setState(173); vData(0);
				setState(174); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(185); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(188); vData(7);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode MIN() { return getToken(NotaQL2Parser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2Parser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2Parser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2Parser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2Parser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2Parser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2Parser.SUM, 0); }
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(195); match(OPEN);
			setState(197);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(196); vData(0);
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(199); match(7);
				setState(200); atom();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2Parser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2Parser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorFunction);
		int _la;
		try {
			setState(232);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(OBJECT);
				setState(209); match(OPEN);
				setState(210); attributeSpecification();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(211); match(7);
					setState(212); attributeSpecification();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220); match(Name);
				setState(221); match(OPEN);
				setState(222); attributeSpecification();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(223); match(7);
					setState(224); attributeSpecification();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2Parser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(Name);
			setState(235); match(OPEN);
			setState(244);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(236); vData(0);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(237); match(7);
					setState(238); vData(0);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(246); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2Parser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); predicate(0);
			setState(249); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2Parser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2Parser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2Parser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2Parser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2Parser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2Parser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2Parser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAndPredicate(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(252); match(2);
				setState(253); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(OPEN);
				setState(255); predicate(0);
				setState(256); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); vData(0);
				setState(259);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(260); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(266);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(267); match(AND);
						setState(268); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270); match(OR);
						setState(271); predicate(5);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(1);
			setState(278); match(COLON);
			setState(279); predicate(0);
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
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(6);
			setState(282); match(COLON);
			setState(283); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2Parser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2Parser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2Parser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2Parser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2Parser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		int _la;
		try {
			setState(289);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
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
				setState(286); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(288); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2Parser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2Parser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2Listener ) ((NotaQL2Listener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2Visitor ) return ((NotaQL2Visitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); ((IndexContext)_localctx).indexNumber = match(Int);
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
		case 14: return vData_sempred((VDataContext)_localctx, predIndex);

		case 19: return predicate_sempred((PredicateContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\5\2?\n\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3"+
		"\3\7\3T\n\3\f\3\16\3W\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ab"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b8"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c0\n\20\f\20\16\20\u00c3\13"+
		"\20\3\21\3\21\3\21\5\21\u00c8\n\21\3\21\3\21\7\21\u00cc\n\21\f\21\16\21"+
		"\u00cf\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d8\n\22\f\22\16"+
		"\22\u00db\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e4\n\22\f\22"+
		"\16\22\u00e7\13\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\5\23\u00f7\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u010b\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0113\n\25\f"+
		"\25\16\25\u0116\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\5\30\u0124\n\30\3\31\3\31\3\32\3\32\3\32\3\u0087\4\36(\33\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\4\2\32\32//\3"+
		"\2\30\31\3\2 &\3\2\20\25\3\2\35\36\u0148\29\3\2\2\2\4B\3\2\2\2\6X\3\2"+
		"\2\2\b[\3\2\2\2\n^\3\2\2\2\fp\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22|\3\2"+
		"\2\2\24~\3\2\2\2\26\u0081\3\2\2\2\30\u0087\3\2\2\2\32\u008a\3\2\2\2\34"+
		"\u00aa\3\2\2\2\36\u00b7\3\2\2\2 \u00c4\3\2\2\2\"\u00ea\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00fa\3\2\2\2(\u010a\3\2\2\2*\u0117\3\2\2\2,\u011b\3\2\2\2."+
		"\u0123\3\2\2\2\60\u0125\3\2\2\2\62\u0127\3\2\2\2\64\65\5\4\3\2\65\66\7"+
		"\7\2\2\668\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2"+
		"\2\2;9\3\2\2\2<>\5\4\3\2=?\7\7\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\2"+
		"\2\3A\3\3\2\2\2BC\5\6\4\2CD\7\t\2\2DE\5\b\5\2EI\7\t\2\2FG\5*\26\2GH\7"+
		"\t\2\2HJ\3\2\2\2IF\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KL\5,\27\2LM\7\t\2\2MO\3"+
		"\2\2\2NK\3\2\2\2NO\3\2\2\2OP\3\2\2\2PU\5\f\7\2QR\7\t\2\2RT\5\f\7\2SQ\3"+
		"\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WU\3\2\2\2XY\7\5\2\2YZ"+
		"\5\n\6\2Z\7\3\2\2\2[\\\7\6\2\2\\]\5\n\6\2]\t\3\2\2\2^_\7(\2\2_l\7)\2\2"+
		"`a\7(\2\2ab\7\17\2\2bi\5.\30\2cd\7\t\2\2de\7(\2\2ef\7\17\2\2fh\5.\30\2"+
		"gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l`\3\2\2\2"+
		"lm\3\2\2\2mn\3\2\2\2no\7*\2\2o\13\3\2\2\2pq\5\16\b\2qr\7\17\2\2rs\5\36"+
		"\20\2s\r\3\2\2\2tw\5\22\n\2uw\5\20\t\2vt\3\2\2\2vu\3\2\2\2w\17\3\2\2\2"+
		"xy\7\16\2\2yz\7\61\2\2z{\5\30\r\2{\21\3\2\2\2|}\5\30\r\2}\23\3\2\2\2~"+
		"\177\7\r\2\2\177\u0080\5\30\r\2\u0080\25\3\2\2\2\u0081\u0082\7\60\2\2"+
		"\u0082\u0083\5\30\r\2\u0083\27\3\2\2\2\u0084\u0086\5\32\16\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\31\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\34\17\2\u008b\33\3\2\2\2"+
		"\u008c\u008d\7)\2\2\u008d\u008e\5\30\r\2\u008e\u008f\7*\2\2\u008f\u00ab"+
		"\3\2\2\2\u0090\u0091\7+\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7,\2\2\u0093"+
		"\u00ab\3\2\2\2\u0094\u00ab\7-\2\2\u0095\u00ab\7.\2\2\u0096\u00ab\7/\2"+
		"\2\u0097\u00ab\7\60\2\2\u0098\u00ab\7\37\2\2\u0099\u00ab\7\35\2\2\u009a"+
		"\u00ab\7\36\2\2\u009b\u00ab\7(\2\2\u009c\u00ab\7\61\2\2\u009d\u00ab\7"+
		"\62\2\2\u009e\u00ab\7\r\2\2\u009f\u00ab\7\20\2\2\u00a0\u00ab\7\21\2\2"+
		"\u00a1\u00ab\7\22\2\2\u00a2\u00ab\7\23\2\2\u00a3\u00ab\7\24\2\2\u00a4"+
		"\u00ab\7\25\2\2\u00a5\u00ab\7\30\2\2\u00a6\u00ab\7\31\2\2\u00a7\u00ab"+
		"\7\32\2\2\u00a8\u00ab\7\26\2\2\u00a9\u00ab\7\27\2\2\u00aa\u008c\3\2\2"+
		"\2\u00aa\u0090\3\2\2\2\u00aa\u0094\3\2\2\2\u00aa\u0095\3\2\2\2\u00aa\u0096"+
		"\3\2\2\2\u00aa\u0097\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa\u0099\3\2\2\2\u00aa"+
		"\u009a\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa\u009d\3\2"+
		"\2\2\u00aa\u009e\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa"+
		"\u00a1\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\b\20\1"+
		"\2\u00ad\u00b8\5.\30\2\u00ae\u00af\7)\2\2\u00af\u00b0\5\36\20\2\u00b0"+
		"\u00b1\7*\2\2\u00b1\u00b8\3\2\2\2\u00b2\u00b8\5 \21\2\u00b3\u00b8\5\""+
		"\22\2\u00b4\u00b8\5$\23\2\u00b5\u00b8\5\24\13\2\u00b6\u00b8\5\26\f\2\u00b7"+
		"\u00ac\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00c1\3\2\2\2\u00b9\u00ba\f\t\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00c0\5\36"+
		"\20\n\u00bc\u00bd\f\b\2\2\u00bd\u00be\t\3\2\2\u00be\u00c0\5\36\20\t\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\37\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\t\4\2\2\u00c5\u00c7\7)\2\2\u00c6\u00c8\5\36\20\2\u00c7\u00c6\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00cc"+
		"\5.\30\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7*"+
		"\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d9"+
		"\5\f\7\2\u00d5\u00d6\7\t\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\u00eb\3\2\2\2\u00de"+
		"\u00df\7(\2\2\u00df\u00e0\7)\2\2\u00e0\u00e5\5\f\7\2\u00e1\u00e2\7\t\2"+
		"\2\u00e2\u00e4\5\f\7\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7*\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00d2\3\2\2\2\u00ea\u00de\3\2"+
		"\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\u00f6\7)\2\2\u00ee\u00f3"+
		"\5\36\20\2\u00ef\u00f0\7\t\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00ef\3\2\2"+
		"\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9%\3\2\2\2\u00fa\u00fb\5(\25\2\u00fb"+
		"\u00fc\7\2\2\3\u00fc\'\3\2\2\2\u00fd\u00fe\b\25\1\2\u00fe\u00ff\7\4\2"+
		"\2\u00ff\u010b\5(\25\b\u0100\u0101\7)\2\2\u0101\u0102\5(\25\2\u0102\u0103"+
		"\7*\2\2\u0103\u010b\3\2\2\2\u0104\u0105\5\36\20\2\u0105\u0106\t\5\2\2"+
		"\u0106\u0107\5\36\20\2\u0107\u010b\3\2\2\2\u0108\u010b\5\24\13\2\u0109"+
		"\u010b\5\26\f\2\u010a\u00fd\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0104\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u0114\3\2\2\2\u010c"+
		"\u010d\f\7\2\2\u010d\u010e\7\26\2\2\u010e\u0113\5(\25\b\u010f\u0110\f"+
		"\6\2\2\u0110\u0111\7\27\2\2\u0111\u0113\5(\25\7\u0112\u010c\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115)\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\3\2\2\u0118\u0119"+
		"\7\62\2\2\u0119\u011a\5(\25\2\u011a+\3\2\2\2\u011b\u011c\7\b\2\2\u011c"+
		"\u011d\7\62\2\2\u011d\u011e\5(\25\2\u011e-\3\2\2\2\u011f\u0124\t\6\2\2"+
		"\u0120\u0124\7\37\2\2\u0121\u0124\7\33\2\2\u0122\u0124\7\34\2\2\u0123"+
		"\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u0124/\3\2\2\2\u0125\u0126\7(\2\2\u0126\61\3\2\2\2\u0127\u0128\7"+
		"\35\2\2\u0128\63\3\2\2\2\329>INUilv\u0087\u00aa\u00b7\u00bf\u00c1\u00c7"+
		"\u00cd\u00d9\u00e5\u00ea\u00f3\u00f6\u010a\u0112\u0114\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}