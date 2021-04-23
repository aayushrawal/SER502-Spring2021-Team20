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
	 * Visit a parse tree produced by the {@code strIdInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrIdInit(yaslParser.StrIdInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strSenInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrSenInit(yaslParser.StrSenInitContext ctx);
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
	 * Visit a parse tree produced by the {@code assignNum}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignNum(yaslParser.AssignNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignBol}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBol(yaslParser.AssignBolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignString}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignString(yaslParser.AssignStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(yaslParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddIdStep(yaslParser.AddIdStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubIdStep(yaslParser.SubIdStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulIdStep(yaslParser.MulIdStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideIdStep(yaslParser.DivideIdStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddNumStep(yaslParser.AddNumStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubNumStep(yaslParser.SubNumStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulNumStep(yaslParser.MulNumStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivNumStep(yaslParser.DivNumStepContext ctx);
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
	 * Visit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link yaslParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(yaslParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link yaslParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(yaslParser.PrintExprContext ctx);
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
	 * Visit a parse tree produced by {@link yaslParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(yaslParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(yaslParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRange(yaslParser.SimpleRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stepRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepRange(yaslParser.StepRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intTernary}
	 * labeled alternative in {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTernary(yaslParser.IntTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strTernary}
	 * labeled alternative in {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrTernary(yaslParser.StrTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bolTernary}
	 * labeled alternative in {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBolTernary(yaslParser.BolTernaryContext ctx);
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
	 * Visit a parse tree produced by {@link yaslParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(yaslParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#sent_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_option(yaslParser.Sent_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(yaslParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#special_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_char(yaslParser.Special_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(yaslParser.NumberContext ctx);
}