// Generated from miniBParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniBParser}.
 */
public interface miniBParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniBParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(miniBParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(miniBParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(miniBParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(miniBParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(miniBParser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(miniBParser.TextosContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(miniBParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(miniBParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(miniBParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(miniBParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(miniBParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(miniBParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(miniBParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(miniBParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#funcion_usuario}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_usuario(miniBParser.Funcion_usuarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#funcion_usuario}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_usuario(miniBParser.Funcion_usuarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(miniBParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(miniBParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(miniBParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(miniBParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(miniBParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(miniBParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniBParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(miniBParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniBParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(miniBParser.StringContext ctx);
}