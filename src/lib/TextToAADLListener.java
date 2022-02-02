// Generated from TextToAADL.g4 by ANTLR 4.9.2

    package lib;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TextToAADLParser}.
 */
public interface TextToAADLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#nlparch}.
	 * @param ctx the parse tree
	 */
	void enterNlparch(TextToAADLParser.NlparchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#nlparch}.
	 * @param ctx the parse tree
	 */
	void exitNlparch(TextToAADLParser.NlparchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(TextToAADLParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(TextToAADLParser.SentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(TextToAADLParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(TextToAADLParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#functional_stmts}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_stmts(TextToAADLParser.Functional_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#functional_stmts}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_stmts(TextToAADLParser.Functional_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#structural_stmts}.
	 * @param ctx the parse tree
	 */
	void enterStructural_stmts(TextToAADLParser.Structural_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#structural_stmts}.
	 * @param ctx the parse tree
	 */
	void exitStructural_stmts(TextToAADLParser.Structural_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#structural_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStructural_stmt(TextToAADLParser.Structural_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#structural_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStructural_stmt(TextToAADLParser.Structural_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#connection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConnection_stmt(TextToAADLParser.Connection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#connection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConnection_stmt(TextToAADLParser.Connection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#functional_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_stmt(TextToAADLParser.Functional_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#functional_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_stmt(TextToAADLParser.Functional_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#energizing_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnergizing_stmt(TextToAADLParser.Energizing_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#energizing_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnergizing_stmt(TextToAADLParser.Energizing_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#struct_multinoun}.
	 * @param ctx the parse tree
	 */
	void enterStruct_multinoun(TextToAADLParser.Struct_multinounContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#struct_multinoun}.
	 * @param ctx the parse tree
	 */
	void exitStruct_multinoun(TextToAADLParser.Struct_multinounContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#multi_flow}.
	 * @param ctx the parse tree
	 */
	void enterMulti_flow(TextToAADLParser.Multi_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#multi_flow}.
	 * @param ctx the parse tree
	 */
	void exitMulti_flow(TextToAADLParser.Multi_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#flow}.
	 * @param ctx the parse tree
	 */
	void enterFlow(TextToAADLParser.FlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#flow}.
	 * @param ctx the parse tree
	 */
	void exitFlow(TextToAADLParser.FlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#material}.
	 * @param ctx the parse tree
	 */
	void enterMaterial(TextToAADLParser.MaterialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#material}.
	 * @param ctx the parse tree
	 */
	void exitMaterial(TextToAADLParser.MaterialContext ctx);
}