// Generated from notaql\parser\antlr\NotaQL2KeyValueOut.g4 by ANTLR 4.2.1
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
public class NotaQL2KeyValueOutParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Key=8, Val=9, 
		SL_COMMENT=10, OPTWS=11, OPTNL=12, IN=13, OUT=14, ARROW=15, EQ=16, NEQ=17, 
		LT=18, LTEQ=19, GT=20, GTEQ=21, AND=22, OR=23, PLUS=24, MINUS=25, DIV=26, 
		TRUE=27, FALSE=28, Int=29, Float=30, String=31, AVG=32, COUNT=33, MAX=34, 
		MIN=35, SUM=36, IMPLODE=37, LIST=38, OBJECT=39, Name=40, OPEN=41, CLOSE=42, 
		ARRAYOPEN=43, ARRAYCLOSE=44, RESOLVE=45, PREDICATE=46, STAR=47, AT=48, 
		DOT=49, COLON=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "'_k'", "'_v'", "SL_COMMENT", "OPTWS", "OPTNL", 
		"'IN'", "'OUT'", "'<-'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", 
		"'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", "'false'", "Int", "Float", 
		"String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", "'SUM'", "'IMPLODE'", 
		"'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", "']'", "'$'", "'?'", 
		"'*'", "'@'", "'.'", "':'"
	};
	public static final int
		RULE_outputPath = 0, RULE_keyId = 1, RULE_pathToken = 2, RULE_notaql = 3, 
		RULE_transformation = 4, RULE_inEngine = 5, RULE_outEngine = 6, RULE_engine = 7, 
		RULE_attributeSpecification = 8, RULE_genericOutputPath = 9, RULE_absoluteOutputPath = 10, 
		RULE_relativeOutputPath = 11, RULE_absoluteInputPath = 12, RULE_relativeInputPath = 13, 
		RULE_path = 14, RULE_genericPathToken = 15, RULE_vData = 16, RULE_aggregationFunction = 17, 
		RULE_constructorFunction = 18, RULE_genericFunction = 19, RULE_standalonePredicate = 20, 
		RULE_predicate = 21, RULE_inPredicate = 22, RULE_outPredicate = 23, RULE_atom = 24, 
		RULE_attributeId = 25, RULE_index = 26;
	public static final String[] ruleNames = {
		"outputPath", "keyId", "pathToken", "notaql", "transformation", "inEngine", 
		"outEngine", "engine", "attributeSpecification", "genericOutputPath", 
		"absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", "relativeInputPath", 
		"path", "genericPathToken", "vData", "aggregationFunction", "constructorFunction", 
		"genericFunction", "standalonePredicate", "predicate", "inPredicate", 
		"outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2KeyValueOut.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2KeyValueOutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OutputPathContext extends ParserRuleContext {
		public OutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputPath; }
	 
		public OutputPathContext() { }
		public void copyFrom(OutputPathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeyOutputPathContext extends OutputPathContext {
		public TerminalNode Key() { return getToken(NotaQL2KeyValueOutParser.Key, 0); }
		public KeyOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterKeyOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitKeyOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitKeyOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeyIdOutputPathContext extends OutputPathContext {
		public KeyIdContext keyId() {
			return getRuleContext(KeyIdContext.class,0);
		}
		public KeyIdOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterKeyIdOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitKeyIdOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitKeyIdOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueOutputPathContext extends OutputPathContext {
		public TerminalNode Val() { return getToken(NotaQL2KeyValueOutParser.Val, 0); }
		public ValueOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterValueOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitValueOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitValueOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResolvedOutputPathContext extends OutputPathContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterResolvedOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitResolvedOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitResolvedOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputPathContext outputPath() throws RecognitionException {
		OutputPathContext _localctx = new OutputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_outputPath);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case Key:
				_localctx = new KeyOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); match(Key);
				}
				break;
			case Val:
				_localctx = new ValueOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(Val);
				}
				break;
			case Name:
				_localctx = new KeyIdOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56); keyId();
				}
				break;
			case RESOLVE:
				_localctx = new ResolvedOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57); match(RESOLVE);
				setState(58); match(OPEN);
				setState(59); absoluteInputPath();
				setState(60); match(CLOSE);
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

	public static class KeyIdContext extends ParserRuleContext {
		public TerminalNode Name(int i) {
			return getToken(NotaQL2KeyValueOutParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2KeyValueOutParser.Name); }
		public KeyIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterKeyId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitKeyId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitKeyId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyIdContext keyId() throws RecognitionException {
		KeyIdContext _localctx = new KeyIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_keyId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(Name);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(65); match(COLON);
				setState(66); match(Name);
				}
				}
				setState(71);
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
		public TerminalNode Key() { return getToken(NotaQL2KeyValueOutParser.Key, 0); }
		public TerminalNode Val() { return getToken(NotaQL2KeyValueOutParser.Val, 0); }
		public PathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pathToken);
		try {
			setState(75);
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
				setState(72); genericPathToken();
				}
				break;
			case Key:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); match(Key);
				}
				break;
			case Val:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(Val);
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
		public TerminalNode EOF() { return getToken(NotaQL2KeyValueOutParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitNotaql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaqlContext notaql() throws RecognitionException {
		NotaqlContext _localctx = new NotaqlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notaql);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(77); transformation();
					setState(78); match(3);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(85); transformation();
			setState(87);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(86); match(3);
				}
			}

			setState(89); match(EOF);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitTransformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformationContext transformation() throws RecognitionException {
		TransformationContext _localctx = new TransformationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transformation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); inEngine();
			setState(92); match(7);
			setState(93); outEngine();
			setState(94); match(7);
			setState(98);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(95); inPredicate();
				setState(96); match(7);
				}
			}

			setState(103);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(100); outPredicate();
				setState(101); match(7);
				}
			}

			setState(105); attributeSpecification();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(106); match(7);
				setState(107); attributeSpecification();
				}
				}
				setState(112);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(5);
			setState(114); engine();
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(2);
			setState(117); engine();
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
			return getToken(NotaQL2KeyValueOutParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2KeyValueOutParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); ((EngineContext)_localctx).engineName = match(Name);
			setState(120); match(OPEN);
			setState(133);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(121); match(Name);
				setState(122); match(ARROW);
				setState(123); atom();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(124); match(7);
					setState(125); match(Name);
					setState(126); match(ARROW);
					setState(127); atom();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(135); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2KeyValueOutParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); genericOutputPath();
			setState(138); match(ARROW);
			setState(139); vData(0);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericOutputPath);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case Key:
			case Val:
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
				setState(141); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2KeyValueOutParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(OUT);
			setState(146); match(DOT);
			setState(147); path();
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); path();
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
		public TerminalNode IN() { return getToken(NotaQL2KeyValueOutParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(IN);
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

	public static class RelativeInputPathContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(NotaQL2KeyValueOutParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(AT);
			setState(155); path();
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(157); pathToken();
					}
					} 
				}
				setState(162);
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
		public TerminalNode AT() { return getToken(NotaQL2KeyValueOutParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2KeyValueOutParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2KeyValueOutParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2KeyValueOutParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2KeyValueOutParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2KeyValueOutParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2KeyValueOutParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2KeyValueOutParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2KeyValueOutParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2KeyValueOutParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2KeyValueOutParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2KeyValueOutParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2KeyValueOutParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2KeyValueOutParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2KeyValueOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2KeyValueOutParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2KeyValueOutParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2KeyValueOutParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2KeyValueOutParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2KeyValueOutParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2KeyValueOutParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2KeyValueOutParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2KeyValueOutParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2KeyValueOutParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2KeyValueOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2KeyValueOutParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericPathToken);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(OPEN);
				setState(164); path();
				setState(165); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); match(ARRAYOPEN);
				setState(168); path();
				setState(169); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(172); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(173); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(174); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(175); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(176); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(177); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(178); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(179); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(180); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(181); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(182); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(183); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(184); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(185); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(186); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(187); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(188); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(189); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(190); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(191); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(192); match(OR);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2KeyValueOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2KeyValueOutParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2KeyValueOutParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2KeyValueOutParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAggregateVData(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_vData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(OPEN);
				setState(198); vData(0);
				setState(199); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(210); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(213); vData(7);
						}
						break;
					}
					} 
				}
				setState(218);
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
		public TerminalNode MIN() { return getToken(NotaQL2KeyValueOutParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2KeyValueOutParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2KeyValueOutParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2KeyValueOutParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2KeyValueOutParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2KeyValueOutParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2KeyValueOutParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(220); match(OPEN);
			setState(222);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(221); vData(0);
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(224); match(7);
				setState(225); atom();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueOutParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2KeyValueOutParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorFunction);
		int _la;
		try {
			setState(257);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(OBJECT);
				setState(234); match(OPEN);
				setState(235); attributeSpecification();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(236); match(7);
					setState(237); attributeSpecification();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(Name);
				setState(246); match(OPEN);
				setState(247); attributeSpecification();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(248); match(7);
					setState(249); attributeSpecification();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueOutParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitGenericFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionContext genericFunction() throws RecognitionException {
		GenericFunctionContext _localctx = new GenericFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(Name);
			setState(260); match(OPEN);
			setState(269);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(261); vData(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(262); match(7);
					setState(263); vData(0);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2KeyValueOutParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); predicate(0);
			setState(274); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2KeyValueOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2KeyValueOutParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2KeyValueOutParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2KeyValueOutParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2KeyValueOutParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2KeyValueOutParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2KeyValueOutParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2KeyValueOutParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAndPredicate(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(277); match(4);
				setState(278); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); match(OPEN);
				setState(280); predicate(0);
				setState(281); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283); vData(0);
				setState(284);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(285); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(291);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(292); match(AND);
						setState(293); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295); match(OR);
						setState(296); predicate(5);
						}
						break;
					}
					} 
				}
				setState(301);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(1);
			setState(303); match(COLON);
			setState(304); predicate(0);
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
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(6);
			setState(307); match(COLON);
			setState(308); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2KeyValueOutParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2KeyValueOutParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2KeyValueOutParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2KeyValueOutParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2KeyValueOutParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		int _la;
		try {
			setState(314);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
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
				setState(311); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(312); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2KeyValueOutParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2KeyValueOutParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2KeyValueOutListener ) ((NotaQL2KeyValueOutListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2KeyValueOutVisitor ) return ((NotaQL2KeyValueOutVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); ((IndexContext)_localctx).indexNumber = match(Int);
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
		case 16: return vData_sempred((VDataContext)_localctx, predIndex);

		case 21: return predicate_sempred((PredicateContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u0143\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n"+
		"\2\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6e\n\6\3\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6"+
		"r\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0083\n\t\f\t\16\t\u0086\13\t\5\t\u0088\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d1"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d9\n\22\f\22\16\22\u00dc\13"+
		"\22\3\23\3\23\3\23\5\23\u00e1\n\23\3\23\3\23\7\23\u00e5\n\23\f\23\16\23"+
		"\u00e8\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00f1\n\24\f\24\16"+
		"\24\u00f4\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00fd\n\24\f\24"+
		"\16\24\u0100\13\24\3\24\3\24\5\24\u0104\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u010b\n\25\f\25\16\25\u010e\13\25\5\25\u0110\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0124\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012c\n\27\f"+
		"\27\16\27\u012f\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\5\32\u013d\n\32\3\33\3\33\3\34\3\34\3\34\3\u00a2\4\",\35\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\4\2\34"+
		"\34\61\61\3\2\32\33\3\2\"(\3\2\22\27\3\2\37 \u0165\2@\3\2\2\2\4B\3\2\2"+
		"\2\6M\3\2\2\2\bT\3\2\2\2\n]\3\2\2\2\fs\3\2\2\2\16v\3\2\2\2\20y\3\2\2\2"+
		"\22\u008b\3\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u0097\3\2\2\2\32"+
		"\u0099\3\2\2\2\34\u009c\3\2\2\2\36\u00a2\3\2\2\2 \u00c3\3\2\2\2\"\u00d0"+
		"\3\2\2\2$\u00dd\3\2\2\2&\u0103\3\2\2\2(\u0105\3\2\2\2*\u0113\3\2\2\2,"+
		"\u0123\3\2\2\2.\u0130\3\2\2\2\60\u0134\3\2\2\2\62\u013c\3\2\2\2\64\u013e"+
		"\3\2\2\2\66\u0140\3\2\2\28A\7\n\2\29A\7\13\2\2:A\5\4\3\2;<\7/\2\2<=\7"+
		"+\2\2=>\5\32\16\2>?\7,\2\2?A\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3"+
		"\2\2\2A\3\3\2\2\2BG\7*\2\2CD\7\64\2\2DF\7*\2\2EC\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3\2\2\2JN\5 \21\2KN\7\n\2\2LN\7\13\2\2M"+
		"J\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\7\3\2\2\2OP\5\n\6\2PQ\7\5\2\2QS\3\2\2\2"+
		"RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WY\5\n\6\2"+
		"XZ\7\5\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\2\2\3\\\t\3\2\2\2]^\5\f"+
		"\7\2^_\7\t\2\2_`\5\16\b\2`d\7\t\2\2ab\5.\30\2bc\7\t\2\2ce\3\2\2\2da\3"+
		"\2\2\2de\3\2\2\2ei\3\2\2\2fg\5\60\31\2gh\7\t\2\2hj\3\2\2\2if\3\2\2\2i"+
		"j\3\2\2\2jk\3\2\2\2kp\5\22\n\2lm\7\t\2\2mo\5\22\n\2nl\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\7\7\2\2tu\5\20\t\2u\r\3"+
		"\2\2\2vw\7\4\2\2wx\5\20\t\2x\17\3\2\2\2yz\7*\2\2z\u0087\7+\2\2{|\7*\2"+
		"\2|}\7\21\2\2}\u0084\5\62\32\2~\177\7\t\2\2\177\u0080\7*\2\2\u0080\u0081"+
		"\7\21\2\2\u0081\u0083\5\62\32\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087{\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a\21\3\2\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\21\2\2\u008d"+
		"\u008e\5\"\22\2\u008e\23\3\2\2\2\u008f\u0092\5\30\r\2\u0090\u0092\5\26"+
		"\f\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094"+
		"\7\20\2\2\u0094\u0095\7\63\2\2\u0095\u0096\5\36\20\2\u0096\27\3\2\2\2"+
		"\u0097\u0098\5\36\20\2\u0098\31\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b"+
		"\5\36\20\2\u009b\33\3\2\2\2\u009c\u009d\7\62\2\2\u009d\u009e\5\36\20\2"+
		"\u009e\35\3\2\2\2\u009f\u00a1\5\6\4\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\37\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7"+
		",\2\2\u00a8\u00c4\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab\5\36\20\2\u00ab"+
		"\u00ac\7.\2\2\u00ac\u00c4\3\2\2\2\u00ad\u00c4\7/\2\2\u00ae\u00c4\7\60"+
		"\2\2\u00af\u00c4\7\61\2\2\u00b0\u00c4\7\62\2\2\u00b1\u00c4\7!\2\2\u00b2"+
		"\u00c4\7\37\2\2\u00b3\u00c4\7 \2\2\u00b4\u00c4\7*\2\2\u00b5\u00c4\7\63"+
		"\2\2\u00b6\u00c4\7\64\2\2\u00b7\u00c4\7\17\2\2\u00b8\u00c4\7\22\2\2\u00b9"+
		"\u00c4\7\23\2\2\u00ba\u00c4\7\24\2\2\u00bb\u00c4\7\25\2\2\u00bc\u00c4"+
		"\7\26\2\2\u00bd\u00c4\7\27\2\2\u00be\u00c4\7\32\2\2\u00bf\u00c4\7\33\2"+
		"\2\u00c0\u00c4\7\34\2\2\u00c1\u00c4\7\30\2\2\u00c2\u00c4\7\31\2\2\u00c3"+
		"\u00a5\3\2\2\2\u00c3\u00a9\3\2\2\2\u00c3\u00ad\3\2\2\2\u00c3\u00ae\3\2"+
		"\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c3\u00b1\3\2\2\2\u00c3"+
		"\u00b2\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b5\3\2"+
		"\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3"+
		"\u00b9\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2"+
		"\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4!\3\2\2\2"+
		"\u00c5\u00c6\b\22\1\2\u00c6\u00d1\5\62\32\2\u00c7\u00c8\7+\2\2\u00c8\u00c9"+
		"\5\"\22\2\u00c9\u00ca\7,\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00d1\5$\23\2\u00cc"+
		"\u00d1\5&\24\2\u00cd\u00d1\5(\25\2\u00ce\u00d1\5\32\16\2\u00cf\u00d1\5"+
		"\34\17\2\u00d0\u00c5\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00da\3\2\2\2\u00d2\u00d3\f\t\2\2\u00d3\u00d4\t\2\2\2\u00d4"+
		"\u00d9\5\"\22\n\u00d5\u00d6\f\b\2\2\u00d6\u00d7\t\3\2\2\u00d7\u00d9\5"+
		"\"\22\t\u00d8\u00d2\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db#\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00de\t\4\2\2\u00de\u00e0\7+\2\2\u00df\u00e1\5\"\22\2\u00e0\u00df"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3"+
		"\u00e5\5\62\32\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7,\2\2\u00ea%\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\7+\2\2\u00ed"+
		"\u00f2\5\22\n\2\u00ee\u00ef\7\t\2\2\u00ef\u00f1\5\22\n\2\u00f0\u00ee\3"+
		"\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u0104\3\2"+
		"\2\2\u00f7\u00f8\7*\2\2\u00f8\u00f9\7+\2\2\u00f9\u00fe\5\22\n\2\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u00fd\5\22\n\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7,\2\2\u0102\u0104\3\2\2\2\u0103\u00eb\3\2"+
		"\2\2\u0103\u00f7\3\2\2\2\u0104\'\3\2\2\2\u0105\u0106\7*\2\2\u0106\u010f"+
		"\7+\2\2\u0107\u010c\5\"\22\2\u0108\u0109\7\t\2\2\u0109\u010b\5\"\22\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0107\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7,\2\2\u0112)\3\2\2\2\u0113"+
		"\u0114\5,\27\2\u0114\u0115\7\2\2\3\u0115+\3\2\2\2\u0116\u0117\b\27\1\2"+
		"\u0117\u0118\7\6\2\2\u0118\u0124\5,\27\b\u0119\u011a\7+\2\2\u011a\u011b"+
		"\5,\27\2\u011b\u011c\7,\2\2\u011c\u0124\3\2\2\2\u011d\u011e\5\"\22\2\u011e"+
		"\u011f\t\5\2\2\u011f\u0120\5\"\22\2\u0120\u0124\3\2\2\2\u0121\u0124\5"+
		"\32\16\2\u0122\u0124\5\34\17\2\u0123\u0116\3\2\2\2\u0123\u0119\3\2\2\2"+
		"\u0123\u011d\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u012d"+
		"\3\2\2\2\u0125\u0126\f\7\2\2\u0126\u0127\7\30\2\2\u0127\u012c\5,\27\b"+
		"\u0128\u0129\f\6\2\2\u0129\u012a\7\31\2\2\u012a\u012c\5,\27\7\u012b\u0125"+
		"\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e-\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\3\2\2"+
		"\u0131\u0132\7\64\2\2\u0132\u0133\5,\27\2\u0133/\3\2\2\2\u0134\u0135\7"+
		"\b\2\2\u0135\u0136\7\64\2\2\u0136\u0137\5,\27\2\u0137\61\3\2\2\2\u0138"+
		"\u013d\t\6\2\2\u0139\u013d\7!\2\2\u013a\u013d\7\35\2\2\u013b\u013d\7\36"+
		"\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\63\3\2\2\2\u013e\u013f\7*\2\2\u013f\65\3\2\2\2\u0140"+
		"\u0141\7\37\2\2\u0141\67\3\2\2\2\35@GMTYdip\u0084\u0087\u0091\u00a2\u00c3"+
		"\u00d0\u00d8\u00da\u00e0\u00e6\u00f2\u00fe\u0103\u010c\u010f\u0123\u012b"+
		"\u012d\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}