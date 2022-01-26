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
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(TextToAADLParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(TextToAADLParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(TextToAADLParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(TextToAADLParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(TextToAADLParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(TextToAADLParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#it}.
	 * @param ctx the parse tree
	 */
	void enterIt(TextToAADLParser.ItContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#it}.
	 * @param ctx the parse tree
	 */
	void exitIt(TextToAADLParser.ItContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(TextToAADLParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(TextToAADLParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#them}.
	 * @param ctx the parse tree
	 */
	void enterThem(TextToAADLParser.ThemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#them}.
	 * @param ctx the parse tree
	 */
	void exitThem(TextToAADLParser.ThemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(TextToAADLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(TextToAADLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#struct_verb}.
	 * @param ctx the parse tree
	 */
	void enterStruct_verb(TextToAADLParser.Struct_verbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#struct_verb}.
	 * @param ctx the parse tree
	 */
	void exitStruct_verb(TextToAADLParser.Struct_verbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#func_verb}.
	 * @param ctx the parse tree
	 */
	void enterFunc_verb(TextToAADLParser.Func_verbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#func_verb}.
	 * @param ctx the parse tree
	 */
	void exitFunc_verb(TextToAADLParser.Func_verbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#energy}.
	 * @param ctx the parse tree
	 */
	void enterEnergy(TextToAADLParser.EnergyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#energy}.
	 * @param ctx the parse tree
	 */
	void exitEnergy(TextToAADLParser.EnergyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#solid}.
	 * @param ctx the parse tree
	 */
	void enterSolid(TextToAADLParser.SolidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#solid}.
	 * @param ctx the parse tree
	 */
	void exitSolid(TextToAADLParser.SolidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#liquid}.
	 * @param ctx the parse tree
	 */
	void enterLiquid(TextToAADLParser.LiquidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#liquid}.
	 * @param ctx the parse tree
	 */
	void exitLiquid(TextToAADLParser.LiquidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextToAADLParser#gas}.
	 * @param ctx the parse tree
	 */
	void enterGas(TextToAADLParser.GasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextToAADLParser#gas}.
	 * @param ctx the parse tree
	 */
	void exitGas(TextToAADLParser.GasContext ctx);
}