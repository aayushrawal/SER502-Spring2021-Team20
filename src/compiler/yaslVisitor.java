// Generated from C:/Users/dpatel81/Downloads/SER-516-assignment5-master/Antlr/src/a\yasl.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link yaslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface yaslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link yaslParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(yaslParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(yaslParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(yaslParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intNumInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNumInit(yaslParser.IntNumInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intIdInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntIdInit(yaslParser.IntIdInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExprInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExprInit(yaslParser.IntExprInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strNumInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrNumInit(yaslParser.StrNumInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolIdInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdInit(yaslParser.BoolIdInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolBInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBInit(yaslParser.BoolBInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclare(yaslParser.IntDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrDeclare(yaslParser.StrDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclare(yaslParser.BoolDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrement(yaslParser.PreIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrement(yaslParser.PostIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrement(yaslParser.PreDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrement(yaslParser.PostDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(yaslParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseCondition(yaslParser.IfElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOp(yaslParser.ConditionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBoolOp(yaslParser.ConditionBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(yaslParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(yaslParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(yaslParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPrecedence(yaslParser.ExpPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(yaslParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(yaslParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fact}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(yaslParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdexpression(yaslParser.IdexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpression(yaslParser.NumberexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(yaslParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(yaslParser.NumberContext ctx);
}