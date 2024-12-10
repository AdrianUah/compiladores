// Generated from miniBParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class miniBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, STRING=2, CONDICION=3, ESPACIOS=4, SWITCH=5, CASE=6, DEFAULT=7, 
		BREAK=8, LET=9, IF=10, THEN=11, ELSE=12, END=13, WHILE=14, DO=15, FOR=16, 
		TO=17, NEXT=18, REPEAT=19, UNTIL=20, VAL=21, LEN=22, ISNAN=23, PRINT=24, 
		INPUT=25, ASIGNACION=26, MAS=27, MENOS=28, POR=29, DIVIDIR=30, LPAREN=31, 
		RPAREN=32, MAYOR=33, MENOR=34, MOD=35, EXIT=36, CONTINUE=37, COMA=38, 
		PUNTOPUNTO=39, COMENTARIOLINEA=40, IDENTIFICADOR=41, FINAL_COMENTARIO_UL=42, 
		TEXTOCOMENTARIOUL=43;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_comentario = 2, RULE_textos = 3, 
		RULE_asignacion = 4, RULE_expresion = 5, RULE_condicion = 6, RULE_ciclo = 7, 
		RULE_funcion = 8, RULE_funcion_usuario = 9, RULE_bloque = 10, RULE_identificador = 11, 
		RULE_numero = 12, RULE_string = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "comentario", "textos", "asignacion", "expresion", 
			"condicion", "ciclo", "funcion", "funcion_usuario", "bloque", "identificador", 
			"numero", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'>'", "'<'", 
			null, null, null, "','", "':'", "'REM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "STRING", "CONDICION", "ESPACIOS", "SWITCH", "CASE", 
			"DEFAULT", "BREAK", "LET", "IF", "THEN", "ELSE", "END", "WHILE", "DO", 
			"FOR", "TO", "NEXT", "REPEAT", "UNTIL", "VAL", "LEN", "ISNAN", "PRINT", 
			"INPUT", "ASIGNACION", "MAS", "MENOS", "POR", "DIVIDIR", "LPAREN", "RPAREN", 
			"MAYOR", "MENOR", "MOD", "EXIT", "CONTINUE", "COMA", "PUNTOPUNTO", "COMENTARIOLINEA", 
			"IDENTIFICADOR", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "miniBParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(miniBParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3506906416678L) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
				case STRING:
				case SWITCH:
				case LET:
				case IF:
				case WHILE:
				case FOR:
				case REPEAT:
				case VAL:
				case LEN:
				case ISNAN:
				case PRINT:
				case INPUT:
				case LPAREN:
				case EXIT:
				case CONTINUE:
				case IDENTIFICADOR:
					{
					setState(28);
					sentencia();
					}
					break;
				case COMENTARIOLINEA:
					{
					setState(29);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				expresion(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				condicion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				ciclo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOLINEA() { return getToken(miniBParser.COMENTARIOLINEA, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(COMENTARIOLINEA);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTOCOMENTARIOUL) {
				{
				{
				setState(45);
				textos();
				}
				}
				setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(miniBParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(miniBParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitTextos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitTextos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_textos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					match(TEXTOCOMENTARIOUL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(miniBParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(56);
				match(LET);
				}
			}

			setState(59);
			identificador();
			setState(60);
			match(ASIGNACION);
			setState(61);
			expresion(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(miniBParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(miniBParser.RPAREN, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public TerminalNode DIVIDIR() { return getToken(miniBParser.DIVIDIR, 0); }
		public TerminalNode MAYOR() { return getToken(miniBParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(miniBParser.MENOR, 0); }
		public TerminalNode MOD() { return getToken(miniBParser.MOD, 0); }
		public TerminalNode ASIGNACION() { return getToken(miniBParser.ASIGNACION, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(64);
				match(LPAREN);
				setState(65);
				expresion(0);
				setState(66);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(68);
				identificador();
				}
				break;
			case 3:
				{
				setState(69);
				numero();
				}
				break;
			case 4:
				{
				setState(70);
				funcion();
				}
				break;
			case 5:
				{
				setState(71);
				string();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(74);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(75);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62209916928L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(76);
					expresion(7);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniBParser.IF, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(miniBParser.THEN, 0); }
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miniBParser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(miniBParser.SWITCH, 0); }
		public List<TerminalNode> CASE() { return getTokens(miniBParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(miniBParser.CASE, i);
		}
		public List<TerminalNode> PUNTOPUNTO() { return getTokens(miniBParser.PUNTOPUNTO); }
		public TerminalNode PUNTOPUNTO(int i) {
			return getToken(miniBParser.PUNTOPUNTO, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(miniBParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(miniBParser.BREAK, i);
		}
		public TerminalNode DEFAULT() { return getToken(miniBParser.DEFAULT, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(IF);
				setState(83);
				expresion(0);
				setState(84);
				match(THEN);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0)) {
					{
					{
					setState(85);
					sentencia();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(91);
					match(ELSE);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0)) {
						{
						{
						setState(92);
						sentencia();
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(100);
				match(END);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(SWITCH);
				setState(103);
				expresion(0);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(104);
					match(CASE);
					setState(105);
					expresion(0);
					setState(106);
					match(PUNTOPUNTO);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0)) {
						{
						{
						setState(107);
						sentencia();
						}
						}
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(113);
					match(BREAK);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(120);
					match(DEFAULT);
					setState(121);
					match(PUNTOPUNTO);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0)) {
						{
						{
						setState(122);
						sentencia();
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(130);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniBParser.WHILE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public TerminalNode TO() { return getToken(miniBParser.TO, 0); }
		public TerminalNode NEXT() { return getToken(miniBParser.NEXT, 0); }
		public TerminalNode REPEAT() { return getToken(miniBParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(miniBParser.UNTIL, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ciclo);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(WHILE);
				setState(135);
				expresion(0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0)) {
					{
					{
					setState(136);
					sentencia();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(END);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(FOR);
				setState(145);
				expresion(0);
				setState(146);
				match(TO);
				setState(147);
				expresion(0);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					sentencia();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0) );
				setState(153);
				match(NEXT);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(REPEAT);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					sentencia();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2407394788902L) != 0) );
				setState(161);
				match(UNTIL);
				setState(162);
				expresion(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(miniBParser.VAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LEN() { return getToken(miniBParser.LEN, 0); }
		public TerminalNode ISNAN() { return getToken(miniBParser.ISNAN, 0); }
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode EXIT() { return getToken(miniBParser.EXIT, 0); }
		public TerminalNode CONTINUE() { return getToken(miniBParser.CONTINUE, 0); }
		public TerminalNode INPUT() { return getToken(miniBParser.INPUT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Funcion_usuarioContext funcion_usuario() {
			return getRuleContext(Funcion_usuarioContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcion);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(VAL);
				setState(167);
				expresion(0);
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(LEN);
				setState(169);
				expresion(0);
				}
				break;
			case ISNAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(ISNAN);
				setState(171);
				expresion(0);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(PRINT);
				setState(173);
				expresion(0);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(EXIT);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(CONTINUE);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				match(INPUT);
				setState(177);
				string();
				setState(178);
				identificador();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				funcion_usuario();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funcion_usuarioContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(miniBParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(miniBParser.RPAREN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<TerminalNode> COMA() { return getTokens(miniBParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miniBParser.COMA, i);
		}
		public Funcion_usuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_usuario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterFuncion_usuario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitFuncion_usuario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitFuncion_usuario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_usuarioContext funcion_usuario() throws RecognitionException {
		Funcion_usuarioContext _localctx = new Funcion_usuarioContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcion_usuario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			identificador();
			setState(184);
			match(LPAREN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(185);
				identificador();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(186);
					match(COMA);
					setState(187);
					identificador();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(195);
			match(RPAREN);
			setState(196);
			bloque();
			setState(197);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3506906416678L) != 0)) {
				{
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
				case STRING:
				case SWITCH:
				case LET:
				case IF:
				case WHILE:
				case FOR:
				case REPEAT:
				case VAL:
				case LEN:
				case ISNAN:
				case PRINT:
				case INPUT:
				case LPAREN:
				case EXIT:
				case CONTINUE:
				case IDENTIFICADOR:
					{
					setState(199);
					sentencia();
					}
					break;
				case COMENTARIOLINEA:
					{
					setState(200);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(205);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(miniBParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFICADOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(miniBParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(NUMERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBParserVisitor ) return ((miniBParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(STRING);
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
		case 5:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t\u0002\u0001"+
		"\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001\u0004\u0003\u0004"+
		":\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006\n\u0006\f\u0006"+
		"Z\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006"+
		"a\t\u0006\u0003\u0006c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006m\b"+
		"\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006t\b"+
		"\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006|\b\u0006\n\u0006\f\u0006\u007f\t\u0006\u0003\u0006\u0081\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u008a\b\u0007\n\u0007\f\u0007\u008d\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u0096\b\u0007\u000b\u0007\f\u0007\u0097\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u009e\b\u0007\u000b\u0007"+
		"\f\u0007\u009f\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b6"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00bd\b\t\n\t\f\t"+
		"\u00c0\t\t\u0003\t\u00c2\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n\u00ca\b\n\n\n\f\n\u00cd\t\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0001\n\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0002"+
		"\u0000\u001a\u001e!#\u00ec\u0000 \u0001\u0000\u0000\u0000\u0002*\u0001"+
		"\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b9\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\f\u0084\u0001"+
		"\u0000\u0000\u0000\u000e\u00a4\u0001\u0000\u0000\u0000\u0010\u00b5\u0001"+
		"\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00cb\u0001"+
		"\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018\u00d0\u0001"+
		"\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000\u0000\u001c\u001f\u0003"+
		"\u0002\u0001\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%+\u0003\b\u0004\u0000&+\u0003\u0010"+
		"\b\u0000\'+\u0003\n\u0005\u0000(+\u0003\f\u0006\u0000)+\u0003\u000e\u0007"+
		"\u0000*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0003"+
		"\u0001\u0000\u0000\u0000,0\u0005(\u0000\u0000-/\u0003\u0006\u0003\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000035\u0005+\u0000\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u00008:\u0005\t\u0000\u000098\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0003\u0016"+
		"\u000b\u0000<=\u0005\u001a\u0000\u0000=>\u0003\n\u0005\u0000>\t\u0001"+
		"\u0000\u0000\u0000?@\u0006\u0005\uffff\uffff\u0000@A\u0005\u001f\u0000"+
		"\u0000AB\u0003\n\u0005\u0000BC\u0005 \u0000\u0000CI\u0001\u0000\u0000"+
		"\u0000DI\u0003\u0016\u000b\u0000EI\u0003\u0018\f\u0000FI\u0003\u0010\b"+
		"\u0000GI\u0003\u001a\r\u0000H?\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000"+
		"\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IO\u0001\u0000\u0000\u0000JK\n\u0006\u0000\u0000KL\u0007\u0000"+
		"\u0000\u0000LN\u0003\n\u0005\u0007MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000b"+
		"\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000"+
		"ST\u0003\n\u0005\u0000TX\u0005\u000b\u0000\u0000UW\u0003\u0002\u0001\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Yb\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[_\u0005\f\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000b[\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0005\r\u0000\u0000e\u0085\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000gu\u0003\n\u0005\u0000hi\u0005\u0006\u0000\u0000ij\u0003"+
		"\n\u0005\u0000jn\u0005\'\u0000\u0000km\u0003\u0002\u0001\u0000lk\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qr\u0005\b\u0000\u0000rt\u0001\u0000\u0000\u0000sh\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\u0080\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0007\u0000\u0000y}\u0005\'\u0000\u0000z|\u0003\u0002\u0001\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\r\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084R\u0001"+
		"\u0000\u0000\u0000\u0084f\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u008b\u0003\n\u0005"+
		"\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\r\u0000\u0000"+
		"\u008f\u00a5\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000"+
		"\u0091\u0092\u0003\n\u0005\u0000\u0092\u0093\u0005\u0011\u0000\u0000\u0093"+
		"\u0095\u0003\n\u0005\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0012\u0000\u0000\u009a\u00a5"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0013\u0000\u0000\u009c\u009e"+
		"\u0003\u0002\u0001\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0014\u0000\u0000\u00a2\u00a3\u0003\n\u0005\u0000\u00a3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a4\u0086\u0001\u0000\u0000\u0000\u00a4\u0090\u0001"+
		"\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a5\u000f\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00b6\u0003"+
		"\n\u0005\u0000\u00a8\u00a9\u0005\u0016\u0000\u0000\u00a9\u00b6\u0003\n"+
		"\u0005\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u00b6\u0003\n\u0005"+
		"\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad\u00b6\u0003\n\u0005\u0000"+
		"\u00ae\u00b6\u0005$\u0000\u0000\u00af\u00b6\u0005%\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0019\u0000\u0000\u00b1\u00b2\u0003\u001a\r\u0000\u00b2\u00b3\u0003"+
		"\u0016\u000b\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003"+
		"\u0012\t\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0016"+
		"\u000b\u0000\u00b8\u00c1\u0005\u001f\u0000\u0000\u00b9\u00be\u0003\u0016"+
		"\u000b\u0000\u00ba\u00bb\u0005&\u0000\u0000\u00bb\u00bd\u0003\u0016\u000b"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005 \u0000\u0000"+
		"\u00c4\u00c5\u0003\u0014\n\u0000\u00c5\u00c6\u0005\r\u0000\u0000\u00c6"+
		"\u0013\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003\u0002\u0001\u0000\u00c8"+
		"\u00ca\u0003\u0004\u0002\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u0015\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005)\u0000\u0000\u00cf\u0017\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0001\u0000\u0000\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0002\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u0019\u001e"+
		" *069HOX_bnu}\u0080\u0084\u008b\u0097\u009f\u00a4\u00b5\u00be\u00c1\u00c9"+
		"\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}