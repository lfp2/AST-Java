// Generated from brgccf_lfp2.g4 by ANTLR 4.4
package main;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brgccf_lfp2Parser}.
 */
public interface brgccf_lfp2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull brgccf_lfp2Parser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull brgccf_lfp2Parser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull brgccf_lfp2Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull brgccf_lfp2Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull brgccf_lfp2Parser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull brgccf_lfp2Parser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull brgccf_lfp2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull brgccf_lfp2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull brgccf_lfp2Parser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull brgccf_lfp2Parser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull brgccf_lfp2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull brgccf_lfp2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull brgccf_lfp2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull brgccf_lfp2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull brgccf_lfp2Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull brgccf_lfp2Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link brgccf_lfp2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull brgccf_lfp2Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link brgccf_lfp2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull brgccf_lfp2Parser.ClassDeclarationContext ctx);
}