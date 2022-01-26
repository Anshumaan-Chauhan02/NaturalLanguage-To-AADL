// Generated from TextToAADL.g4 by ANTLR 4.9.2

    package lib;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TextToAADLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TextToAADLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#nlparch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlparch(TextToAADLParser.NlparchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(TextToAADLParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(TextToAADLParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#functional_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_stmts(TextToAADLParser.Functional_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#structural_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructural_stmt(TextToAADLParser.Structural_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#functional_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_stmt(TextToAADLParser.Functional_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#energizing_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnergizing_stmt(TextToAADLParser.Energizing_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#struct_multinoun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_multinoun(TextToAADLParser.Struct_multinounContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#multi_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_flow(TextToAADLParser.Multi_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow(TextToAADLParser.FlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToAADLParser#material}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial(TextToAADLParser.MaterialContext ctx);
}