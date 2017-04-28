// Generated from brgccf_lfp2.g4 by ANTLR 4.4
package main;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link brgccf_lfp2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface brgccf_lfp2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(@NotNull brgccf_lfp2Parser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull brgccf_lfp2Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull brgccf_lfp2Parser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull brgccf_lfp2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull brgccf_lfp2Parser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull brgccf_lfp2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull brgccf_lfp2Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull brgccf_lfp2Parser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link brgccf_lfp2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull brgccf_lfp2Parser.ClassDeclarationContext ctx);
}