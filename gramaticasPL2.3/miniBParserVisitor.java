// Generated from miniBParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniBParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniBParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(miniBParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(miniBParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(miniBParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#textos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextos(miniBParser.TextosContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(miniBParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(miniBParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(miniBParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(miniBParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(miniBParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#funcion_usuario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_usuario(miniBParser.Funcion_usuarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(miniBParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(miniBParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(miniBParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniBParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(miniBParser.StringContext ctx);
}