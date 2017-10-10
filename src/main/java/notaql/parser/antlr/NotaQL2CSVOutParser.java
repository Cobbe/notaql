// Generated from notaql\parser\antlr\NotaQL2CSVOut.g4 by ANTLR 4.2.1
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
public class NotaQL2CSVOutParser extends Parser {
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
		"<INVALID>", "'IN-FILTER'", "'OUT-ENGINE:'", "';'", "'!'", "'IN-ENGINE:'", 
		"'OUT-FILTER'", "','", "SL_COMMENT", "OPTWS", "OPTNL", "'IN'", "'OUT'", 
		"'<-'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'+'", 
		"'-'", "'/'", "'true'", "'false'", "Int", "Float", "String", "'AVG'", 
		"'COUNT'", "'MAX'", "'MIN'", "'SUM'", "'IMPLODE'", "'LIST'", "'OBJECT'", 
		"Name", "'('", "')'", "'['", "']'", "'$'", "'?'", "'*'", "'@'", "'.'", 
		"':'"
	};
	public static final int
		RULE_outputPath = 0, RULE_colId = 1, RULE_pathToken = 2, RULE_notaql = 3, 
		RULE_transformation = 4, RULE_inEngine = 5, RULE_outEngine = 6, RULE_engine = 7, 
		RULE_attributeSpecification = 8, RULE_genericOutputPath = 9, RULE_absoluteOutputPath = 10, 
		RULE_relativeOutputPath = 11, RULE_absoluteInputPath = 12, RULE_relativeInputPath = 13, 
		RULE_path = 14, RULE_genericPathToken = 15, RULE_vData = 16, RULE_aggregationFunction = 17, 
		RULE_constructorFunction = 18, RULE_genericFunction = 19, RULE_standalonePredicate = 20, 
		RULE_predicate = 21, RULE_inPredicate = 22, RULE_outPredicate = 23, RULE_atom = 24, 
		RULE_attributeId = 25, RULE_index = 26;
	public static final String[] ruleNames = {
		"outputPath", "colId", "pathToken", "notaql", "transformation", "inEngine", 
		"outEngine", "engine", "attributeSpecification", "genericOutputPath", 
		"absoluteOutputPath", "relativeOutputPath", "absoluteInputPath", "relativeInputPath", 
		"path", "genericPathToken", "vData", "aggregationFunction", "constructorFunction", 
		"genericFunction", "standalonePredicate", "predicate", "inPredicate", 
		"outPredicate", "atom", "attributeId", "index"
	};

	@Override
	public String getGrammarFileName() { return "NotaQL2CSVOut.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotaQL2CSVOutParser(TokenStream input) {
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
	public static class ResolvedOutputPathContext extends OutputPathContext {
		public AbsoluteInputPathContext absoluteInputPath() {
			return getRuleContext(AbsoluteInputPathContext.class,0);
		}
		public ResolvedOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterResolvedOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitResolvedOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitResolvedOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColIdOutputPathContext extends OutputPathContext {
		public ColIdContext colId() {
			return getRuleContext(ColIdContext.class,0);
		}
		public ColIdOutputPathContext(OutputPathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterColIdOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitColIdOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitColIdOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputPathContext outputPath() throws RecognitionException {
		OutputPathContext _localctx = new OutputPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_outputPath);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case Name:
				_localctx = new ColIdOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); colId();
				}
				break;
			case RESOLVE:
				_localctx = new ResolvedOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(RESOLVE);
				setState(56); match(OPEN);
				setState(57); absoluteInputPath();
				setState(58); match(CLOSE);
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

	public static class ColIdContext extends ParserRuleContext {
		public Token colName;
		public TerminalNode Name() { return getToken(NotaQL2CSVOutParser.Name, 0); }
		public ColIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterColId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitColId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitColId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColIdContext colId() throws RecognitionException {
		ColIdContext _localctx = new ColIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_colId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); ((ColIdContext)_localctx).colName = match(Name);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathTokenContext pathToken() throws RecognitionException {
		PathTokenContext _localctx = new PathTokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pathToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); genericPathToken();
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
		public TerminalNode EOF() { return getToken(NotaQL2CSVOutParser.EOF, 0); }
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterNotaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitNotaql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitNotaql(this);
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
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(66); transformation();
					setState(67); match(3);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74); transformation();
			setState(76);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(75); match(3);
				}
			}

			setState(78); match(EOF);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitTransformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitTransformation(this);
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
			setState(80); inEngine();
			setState(81); match(7);
			setState(82); outEngine();
			setState(83); match(7);
			setState(87);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(84); inPredicate();
				setState(85); match(7);
				}
			}

			setState(92);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(89); outPredicate();
				setState(90); match(7);
				}
			}

			setState(94); attributeSpecification();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(95); match(7);
				setState(96); attributeSpecification();
				}
				}
				setState(101);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterInEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitInEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitInEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InEngineContext inEngine() throws RecognitionException {
		InEngineContext _localctx = new InEngineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(5);
			setState(103); engine();
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterOutEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitOutEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitOutEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutEngineContext outEngine() throws RecognitionException {
		OutEngineContext _localctx = new OutEngineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(2);
			setState(106); engine();
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
			return getToken(NotaQL2CSVOutParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(NotaQL2CSVOutParser.Name); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitEngine(this);
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
			setState(108); ((EngineContext)_localctx).engineName = match(Name);
			setState(109); match(OPEN);
			setState(122);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(110); match(Name);
				setState(111); match(ARROW);
				setState(112); atom();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(113); match(7);
					setState(114); match(Name);
					setState(115); match(ARROW);
					setState(116); atom();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(124); match(CLOSE);
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
		public TerminalNode ARROW() { return getToken(NotaQL2CSVOutParser.ARROW, 0); }
		public VDataContext vData() {
			return getRuleContext(VDataContext.class,0);
		}
		public AttributeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAttributeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAttributeSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAttributeSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecificationContext attributeSpecification() throws RecognitionException {
		AttributeSpecificationContext _localctx = new AttributeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); genericOutputPath();
			setState(127); match(ARROW);
			setState(128); vData(0);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAbsoluteGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAbsoluteGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAbsoluteGenericOutputPath(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelativeGenericOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelativeGenericOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelativeGenericOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericOutputPathContext genericOutputPath() throws RecognitionException {
		GenericOutputPathContext _localctx = new GenericOutputPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericOutputPath);
		try {
			setState(132);
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
				setState(130); relativeOutputPath();
				}
				break;
			case OUT:
				_localctx = new AbsoluteGenericOutputPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131); absoluteOutputPath();
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
		public TerminalNode OUT() { return getToken(NotaQL2CSVOutParser.OUT, 0); }
		public AbsoluteOutputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteOutputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAbsoluteOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAbsoluteOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAbsoluteOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteOutputPathContext absoluteOutputPath() throws RecognitionException {
		AbsoluteOutputPathContext _localctx = new AbsoluteOutputPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_absoluteOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(OUT);
			setState(135); match(DOT);
			setState(136); path();
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelativeOutputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelativeOutputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelativeOutputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeOutputPathContext relativeOutputPath() throws RecognitionException {
		RelativeOutputPathContext _localctx = new RelativeOutputPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relativeOutputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); path();
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
		public TerminalNode IN() { return getToken(NotaQL2CSVOutParser.IN, 0); }
		public AbsoluteInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAbsoluteInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAbsoluteInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAbsoluteInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteInputPathContext absoluteInputPath() throws RecognitionException {
		AbsoluteInputPathContext _localctx = new AbsoluteInputPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_absoluteInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(IN);
			setState(141); path();
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
		public TerminalNode AT() { return getToken(NotaQL2CSVOutParser.AT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RelativeInputPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeInputPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelativeInputPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelativeInputPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelativeInputPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeInputPathContext relativeInputPath() throws RecognitionException {
		RelativeInputPathContext _localctx = new RelativeInputPathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relativeInputPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(AT);
			setState(144); path();
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitPath(this);
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
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(146); pathToken();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode AT() { return getToken(NotaQL2CSVOutParser.AT, 0); }
		public TerminalNode STAR() { return getToken(NotaQL2CSVOutParser.STAR, 0); }
		public TerminalNode Name() { return getToken(NotaQL2CSVOutParser.Name, 0); }
		public TerminalNode Int() { return getToken(NotaQL2CSVOutParser.Int, 0); }
		public TerminalNode DOT() { return getToken(NotaQL2CSVOutParser.DOT, 0); }
		public TerminalNode OPEN() { return getToken(NotaQL2CSVOutParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(NotaQL2CSVOutParser.CLOSE, 0); }
		public TerminalNode ARRAYCLOSE() { return getToken(NotaQL2CSVOutParser.ARRAYCLOSE, 0); }
		public TerminalNode AND() { return getToken(NotaQL2CSVOutParser.AND, 0); }
		public TerminalNode PREDICATE() { return getToken(NotaQL2CSVOutParser.PREDICATE, 0); }
		public TerminalNode RESOLVE() { return getToken(NotaQL2CSVOutParser.RESOLVE, 0); }
		public TerminalNode GTEQ() { return getToken(NotaQL2CSVOutParser.GTEQ, 0); }
		public TerminalNode DIV() { return getToken(NotaQL2CSVOutParser.DIV, 0); }
		public TerminalNode ARRAYOPEN() { return getToken(NotaQL2CSVOutParser.ARRAYOPEN, 0); }
		public TerminalNode NEQ() { return getToken(NotaQL2CSVOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2CSVOutParser.LTEQ, 0); }
		public TerminalNode COLON() { return getToken(NotaQL2CSVOutParser.COLON, 0); }
		public TerminalNode LT() { return getToken(NotaQL2CSVOutParser.LT, 0); }
		public TerminalNode String() { return getToken(NotaQL2CSVOutParser.String, 0); }
		public TerminalNode GT() { return getToken(NotaQL2CSVOutParser.GT, 0); }
		public TerminalNode Float() { return getToken(NotaQL2CSVOutParser.Float, 0); }
		public TerminalNode OR() { return getToken(NotaQL2CSVOutParser.OR, 0); }
		public TerminalNode IN() { return getToken(NotaQL2CSVOutParser.IN, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2CSVOutParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(NotaQL2CSVOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2CSVOutParser.MINUS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public GenericPathTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPathToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterGenericPathToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitGenericPathToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitGenericPathToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPathTokenContext genericPathToken() throws RecognitionException {
		GenericPathTokenContext _localctx = new GenericPathTokenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericPathToken);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(OPEN);
				setState(153); path();
				setState(154); match(CLOSE);
				}
				break;
			case ARRAYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(ARRAYOPEN);
				setState(157); path();
				setState(158); match(ARRAYCLOSE);
				}
				break;
			case RESOLVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(RESOLVE);
				}
				break;
			case PREDICATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(161); match(PREDICATE);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(162); match(STAR);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(163); match(AT);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(164); match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 8);
				{
				setState(165); match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 9);
				{
				setState(166); match(Float);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 10);
				{
				setState(167); match(Name);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 11);
				{
				setState(168); match(DOT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 12);
				{
				setState(169); match(COLON);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 13);
				{
				setState(170); match(IN);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(171); match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 15);
				{
				setState(172); match(NEQ);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 16);
				{
				setState(173); match(LT);
				}
				break;
			case LTEQ:
				enterOuterAlt(_localctx, 17);
				{
				setState(174); match(LTEQ);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 18);
				{
				setState(175); match(GT);
				}
				break;
			case GTEQ:
				enterOuterAlt(_localctx, 19);
				{
				setState(176); match(GTEQ);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 20);
				{
				setState(177); match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 21);
				{
				setState(178); match(MINUS);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 22);
				{
				setState(179); match(DIV);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 23);
				{
				setState(180); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 24);
				{
				setState(181); match(OR);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterConstructorVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitConstructorVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitConstructorVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterGenericFunctionVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitGenericFunctionVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitGenericFunctionVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterBracedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitBracedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitBracedVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelativeInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelativeInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelativeInputPathVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAtomVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAtomVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAtomVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAbsoluteInputPathVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAbsoluteInputPathVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAbsoluteInputPathVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddedVDataContext extends VDataContext {
		public Token op;
		public TerminalNode PLUS() { return getToken(NotaQL2CSVOutParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NotaQL2CSVOutParser.MINUS, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public AddedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAddedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAddedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAddedVData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicatedVDataContext extends VDataContext {
		public Token op;
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public TerminalNode STAR() { return getToken(NotaQL2CSVOutParser.STAR, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode DIV() { return getToken(NotaQL2CSVOutParser.DIV, 0); }
		public MultiplicatedVDataContext(VDataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterMultiplicatedVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitMultiplicatedVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitMultiplicatedVData(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAggregateVData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAggregateVData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAggregateVData(this);
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new AtomVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185); atom();
				}
				break;

			case 2:
				{
				_localctx = new BracedVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); match(OPEN);
				setState(187); vData(0);
				setState(188); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new AggregateVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190); aggregationFunction();
				}
				break;

			case 4:
				{
				_localctx = new ConstructorVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); constructorFunction();
				}
				break;

			case 5:
				{
				_localctx = new GenericFunctionVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192); genericFunction();
				}
				break;

			case 6:
				{
				_localctx = new AbsoluteInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193); absoluteInputPath();
				}
				break;

			case 7:
				{
				_localctx = new RelativeInputPathVDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicatedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						((MultiplicatedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==STAR) ) {
							((MultiplicatedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(199); vData(8);
						}
						break;

					case 2:
						{
						_localctx = new AddedVDataContext(new VDataContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_vData);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						((AddedVDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddedVDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(202); vData(7);
						}
						break;
					}
					} 
				}
				setState(207);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public Token function;
		public TerminalNode MIN() { return getToken(NotaQL2CSVOutParser.MIN, 0); }
		public TerminalNode COUNT() { return getToken(NotaQL2CSVOutParser.COUNT, 0); }
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLODE() { return getToken(NotaQL2CSVOutParser.IMPLODE, 0); }
		public TerminalNode MAX() { return getToken(NotaQL2CSVOutParser.MAX, 0); }
		public TerminalNode LIST() { return getToken(NotaQL2CSVOutParser.LIST, 0); }
		public TerminalNode AVG() { return getToken(NotaQL2CSVOutParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(NotaQL2CSVOutParser.SUM, 0); }
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAggregationFunction(this);
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
			setState(208);
			((AggregationFunctionContext)_localctx).function = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST))) != 0)) ) {
				((AggregationFunctionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(209); match(OPEN);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(210); vData(0);
				}
			}

			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==7) {
				{
				{
				setState(213); match(7);
				setState(214); atom();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVOutParser.Name, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public GenericConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterGenericConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitGenericConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitGenericConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectConstructorFunctionContext extends ConstructorFunctionContext {
		public List<AttributeSpecificationContext> attributeSpecification() {
			return getRuleContexts(AttributeSpecificationContext.class);
		}
		public TerminalNode OBJECT() { return getToken(NotaQL2CSVOutParser.OBJECT, 0); }
		public AttributeSpecificationContext attributeSpecification(int i) {
			return getRuleContext(AttributeSpecificationContext.class,i);
		}
		public ObjectConstructorFunctionContext(ConstructorFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterObjectConstructorFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitObjectConstructorFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitObjectConstructorFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorFunctionContext constructorFunction() throws RecognitionException {
		ConstructorFunctionContext _localctx = new ConstructorFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorFunction);
		int _la;
		try {
			setState(246);
			switch (_input.LA(1)) {
			case OBJECT:
				_localctx = new ObjectConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222); match(OBJECT);
				setState(223); match(OPEN);
				setState(224); attributeSpecification();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(225); match(7);
					setState(226); attributeSpecification();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232); match(CLOSE);
				}
				break;
			case Name:
				_localctx = new GenericConstructorFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(Name);
				setState(235); match(OPEN);
				setState(236); attributeSpecification();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(237); match(7);
					setState(238); attributeSpecification();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244); match(CLOSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVOutParser.Name, 0); }
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public GenericFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterGenericFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitGenericFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitGenericFunction(this);
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
			setState(248); match(Name);
			setState(249); match(OPEN);
			setState(258);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << TRUE) | (1L << FALSE) | (1L << Int) | (1L << Float) | (1L << String) | (1L << AVG) | (1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << IMPLODE) | (1L << LIST) | (1L << OBJECT) | (1L << Name) | (1L << OPEN) | (1L << AT))) != 0)) {
				{
				setState(250); vData(0);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==7) {
					{
					{
					setState(251); match(7);
					setState(252); vData(0);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(260); match(CLOSE);
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
		public TerminalNode EOF() { return getToken(NotaQL2CSVOutParser.EOF, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StandalonePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterStandalonePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitStandalonePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitStandalonePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePredicateContext standalonePredicate() throws RecognitionException {
		StandalonePredicateContext _localctx = new StandalonePredicateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_standalonePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); predicate(0);
			setState(263); match(EOF);
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
		public TerminalNode NEQ() { return getToken(NotaQL2CSVOutParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(NotaQL2CSVOutParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(NotaQL2CSVOutParser.LT, 0); }
		public TerminalNode GT() { return getToken(NotaQL2CSVOutParser.GT, 0); }
		public TerminalNode EQ() { return getToken(NotaQL2CSVOutParser.EQ, 0); }
		public VDataContext vData(int i) {
			return getRuleContext(VDataContext.class,i);
		}
		public List<VDataContext> vData() {
			return getRuleContexts(VDataContext.class);
		}
		public TerminalNode GTEQ() { return getToken(NotaQL2CSVOutParser.GTEQ, 0); }
		public RelationalPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelationalPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelationalPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelationalPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPredicateContext extends PredicateContext {
		public TerminalNode OR() { return getToken(NotaQL2CSVOutParser.OR, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public OrPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterOrPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitOrPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitOrPredicate(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAbsolutePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAbsolutePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAbsolutePathExistencePredicate(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterNegatedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitNegatedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitNegatedPredicate(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterBracedPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitBracedPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitBracedPredicate(this);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterRelativePathExistencePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitRelativePathExistencePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitRelativePathExistencePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPredicateContext extends PredicateContext {
		public TerminalNode AND() { return getToken(NotaQL2CSVOutParser.AND, 0); }
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public AndPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAndPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAndPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAndPredicate(this);
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
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NegatedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(266); match(4);
				setState(267); predicate(6);
				}
				break;

			case 2:
				{
				_localctx = new BracedPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); match(OPEN);
				setState(269); predicate(0);
				setState(270); match(CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new RelationalPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); vData(0);
				setState(273);
				((RelationalPredicateContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((RelationalPredicateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(274); vData(0);
				}
				break;

			case 4:
				{
				_localctx = new AbsolutePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276); absoluteInputPath();
				}
				break;

			case 5:
				{
				_localctx = new RelativePathExistencePredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277); relativeInputPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AndPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281); match(AND);
						setState(282); predicate(6);
						}
						break;

					case 2:
						{
						_localctx = new OrPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284); match(OR);
						setState(285); predicate(5);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPredicateContext inPredicate() throws RecognitionException {
		InPredicateContext _localctx = new InPredicateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(1);
			setState(292); match(COLON);
			setState(293); predicate(0);
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
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterOutPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitOutPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitOutPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutPredicateContext outPredicate() throws RecognitionException {
		OutPredicateContext _localctx = new OutPredicateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_outPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(6);
			setState(296); match(COLON);
			setState(297); predicate(0);
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
		public TerminalNode String() { return getToken(NotaQL2CSVOutParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(NotaQL2CSVOutParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(NotaQL2CSVOutParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Float() { return getToken(NotaQL2CSVOutParser.Float, 0); }
		public TerminalNode Int() { return getToken(NotaQL2CSVOutParser.Int, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		int _la;
		try {
			setState(303);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
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
				setState(300); match(String);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(302); match(FALSE);
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
		public TerminalNode Name() { return getToken(NotaQL2CSVOutParser.Name, 0); }
		public AttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeIdContext attributeId() throws RecognitionException {
		AttributeIdContext _localctx = new AttributeIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); ((AttributeIdContext)_localctx).attributeName = match(Name);
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
		public TerminalNode Int() { return getToken(NotaQL2CSVOutParser.Int, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotaQL2CSVOutListener ) ((NotaQL2CSVOutListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotaQL2CSVOutVisitor ) return ((NotaQL2CSVOutVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); ((IndexContext)_localctx).indexNumber = match(Int);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3"+
		"\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\5\t}\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00c6\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ce\n\22\f\22\16"+
		"\22\u00d1\13\22\3\23\3\23\3\23\5\23\u00d6\n\23\3\23\3\23\7\23\u00da\n"+
		"\23\f\23\16\23\u00dd\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00e6"+
		"\n\24\f\24\16\24\u00e9\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f2"+
		"\n\24\f\24\16\24\u00f5\13\24\3\24\3\24\5\24\u00f9\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\5\25\u0105\n\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0119\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0121"+
		"\n\27\f\27\16\27\u0124\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\5\32\u0132\n\32\3\33\3\33\3\34\3\34\3\34\3\u0097\4"+
		"\",\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7"+
		"\4\2\32\32//\3\2\30\31\3\2 &\3\2\20\25\3\2\35\36\u0155\2>\3\2\2\2\4@\3"+
		"\2\2\2\6B\3\2\2\2\bI\3\2\2\2\nR\3\2\2\2\fh\3\2\2\2\16k\3\2\2\2\20n\3\2"+
		"\2\2\22\u0080\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008c\3\2\2"+
		"\2\32\u008e\3\2\2\2\34\u0091\3\2\2\2\36\u0097\3\2\2\2 \u00b8\3\2\2\2\""+
		"\u00c5\3\2\2\2$\u00d2\3\2\2\2&\u00f8\3\2\2\2(\u00fa\3\2\2\2*\u0108\3\2"+
		"\2\2,\u0118\3\2\2\2.\u0125\3\2\2\2\60\u0129\3\2\2\2\62\u0131\3\2\2\2\64"+
		"\u0133\3\2\2\2\66\u0135\3\2\2\28?\5\4\3\29:\7-\2\2:;\7)\2\2;<\5\32\16"+
		"\2<=\7*\2\2=?\3\2\2\2>8\3\2\2\2>9\3\2\2\2?\3\3\2\2\2@A\7(\2\2A\5\3\2\2"+
		"\2BC\5 \21\2C\7\3\2\2\2DE\5\n\6\2EF\7\5\2\2FH\3\2\2\2GD\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LN\5\n\6\2MO\7\5\2\2NM\3\2"+
		"\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\t\3\2\2\2RS\5\f\7\2ST\7\t\2\2TU\5"+
		"\16\b\2UY\7\t\2\2VW\5.\30\2WX\7\t\2\2XZ\3\2\2\2YV\3\2\2\2YZ\3\2\2\2Z^"+
		"\3\2\2\2[\\\5\60\31\2\\]\7\t\2\2]_\3\2\2\2^[\3\2\2\2^_\3\2\2\2_`\3\2\2"+
		"\2`e\5\22\n\2ab\7\t\2\2bd\5\22\n\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2f\13\3\2\2\2ge\3\2\2\2hi\7\7\2\2ij\5\20\t\2j\r\3\2\2\2kl\7\4\2\2l"+
		"m\5\20\t\2m\17\3\2\2\2no\7(\2\2o|\7)\2\2pq\7(\2\2qr\7\17\2\2ry\5\62\32"+
		"\2st\7\t\2\2tu\7(\2\2uv\7\17\2\2vx\5\62\32\2ws\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|p\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177"+
		"\7*\2\2\177\21\3\2\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0083\5\"\22\2\u0083\23\3\2\2\2\u0084\u0087\5\30\r\2\u0085\u0087\5\26"+
		"\f\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089"+
		"\7\16\2\2\u0089\u008a\7\61\2\2\u008a\u008b\5\36\20\2\u008b\27\3\2\2\2"+
		"\u008c\u008d\5\36\20\2\u008d\31\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090"+
		"\5\36\20\2\u0090\33\3\2\2\2\u0091\u0092\7\60\2\2\u0092\u0093\5\36\20\2"+
		"\u0093\35\3\2\2\2\u0094\u0096\5\6\4\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\37\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7)\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7"+
		"*\2\2\u009d\u00b9\3\2\2\2\u009e\u009f\7+\2\2\u009f\u00a0\5\36\20\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00b9\3\2\2\2\u00a2\u00b9\7-\2\2\u00a3\u00b9\7.\2"+
		"\2\u00a4\u00b9\7/\2\2\u00a5\u00b9\7\60\2\2\u00a6\u00b9\7\37\2\2\u00a7"+
		"\u00b9\7\35\2\2\u00a8\u00b9\7\36\2\2\u00a9\u00b9\7(\2\2\u00aa\u00b9\7"+
		"\61\2\2\u00ab\u00b9\7\62\2\2\u00ac\u00b9\7\r\2\2\u00ad\u00b9\7\20\2\2"+
		"\u00ae\u00b9\7\21\2\2\u00af\u00b9\7\22\2\2\u00b0\u00b9\7\23\2\2\u00b1"+
		"\u00b9\7\24\2\2\u00b2\u00b9\7\25\2\2\u00b3\u00b9\7\30\2\2\u00b4\u00b9"+
		"\7\31\2\2\u00b5\u00b9\7\32\2\2\u00b6\u00b9\7\26\2\2\u00b7\u00b9\7\27\2"+
		"\2\u00b8\u009a\3\2\2\2\u00b8\u009e\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00a3"+
		"\3\2\2\2\u00b8\u00a4\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8"+
		"\u00a7\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00aa\3\2"+
		"\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8"+
		"\u00ae\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2"+
		"\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9!\3\2\2\2"+
		"\u00ba\u00bb\b\22\1\2\u00bb\u00c6\5\62\32\2\u00bc\u00bd\7)\2\2\u00bd\u00be"+
		"\5\"\22\2\u00be\u00bf\7*\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c6\5$\23\2\u00c1"+
		"\u00c6\5&\24\2\u00c2\u00c6\5(\25\2\u00c3\u00c6\5\32\16\2\u00c4\u00c6\5"+
		"\34\17\2\u00c5\u00ba\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5"+
		"\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\f\t\2\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\u00ce\5\"\22\n\u00ca\u00cb\f\b\2\2\u00cb\u00cc\t\3\2\2\u00cc\u00ce\5"+
		"\"\22\t\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\u00d3\t\4\2\2\u00d3\u00d5\7)\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8"+
		"\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7*\2\2\u00df%\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7)\2\2\u00e2"+
		"\u00e7\5\22\n\2\u00e3\u00e4\7\t\2\2\u00e4\u00e6\5\22\n\2\u00e5\u00e3\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00f9\3\2"+
		"\2\2\u00ec\u00ed\7(\2\2\u00ed\u00ee\7)\2\2\u00ee\u00f3\5\22\n\2\u00ef"+
		"\u00f0\7\t\2\2\u00f0\u00f2\5\22\n\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00e0\3\2"+
		"\2\2\u00f8\u00ec\3\2\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\7(\2\2\u00fb\u0104"+
		"\7)\2\2\u00fc\u0101\5\"\22\2\u00fd\u00fe\7\t\2\2\u00fe\u0100\5\"\22\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7*\2\2\u0107)\3\2\2\2\u0108"+
		"\u0109\5,\27\2\u0109\u010a\7\2\2\3\u010a+\3\2\2\2\u010b\u010c\b\27\1\2"+
		"\u010c\u010d\7\6\2\2\u010d\u0119\5,\27\b\u010e\u010f\7)\2\2\u010f\u0110"+
		"\5,\27\2\u0110\u0111\7*\2\2\u0111\u0119\3\2\2\2\u0112\u0113\5\"\22\2\u0113"+
		"\u0114\t\5\2\2\u0114\u0115\5\"\22\2\u0115\u0119\3\2\2\2\u0116\u0119\5"+
		"\32\16\2\u0117\u0119\5\34\17\2\u0118\u010b\3\2\2\2\u0118\u010e\3\2\2\2"+
		"\u0118\u0112\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u0122"+
		"\3\2\2\2\u011a\u011b\f\7\2\2\u011b\u011c\7\26\2\2\u011c\u0121\5,\27\b"+
		"\u011d\u011e\f\6\2\2\u011e\u011f\7\27\2\2\u011f\u0121\5,\27\7\u0120\u011a"+
		"\3\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123-\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\3\2\2"+
		"\u0126\u0127\7\62\2\2\u0127\u0128\5,\27\2\u0128/\3\2\2\2\u0129\u012a\7"+
		"\b\2\2\u012a\u012b\7\62\2\2\u012b\u012c\5,\27\2\u012c\61\3\2\2\2\u012d"+
		"\u0132\t\6\2\2\u012e\u0132\7\37\2\2\u012f\u0132\7\33\2\2\u0130\u0132\7"+
		"\34\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\63\3\2\2\2\u0133\u0134\7(\2\2\u0134\65\3\2\2\2\u0135"+
		"\u0136\7\35\2\2\u0136\67\3\2\2\2\33>INY^ey|\u0086\u0097\u00b8\u00c5\u00cd"+
		"\u00cf\u00d5\u00db\u00e7\u00f3\u00f8\u0101\u0104\u0118\u0120\u0122\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}