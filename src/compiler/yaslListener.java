// Generated from C:/Users/dpatel81/Downloads/SER-516-assignment5-master/Antlr/src/a\yasl.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yaslParser}.
 */
public interface yaslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yaslParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(yaslParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(yaslParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(yaslParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(yaslParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(yaslParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(yaslParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intNumInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntNumInit(yaslParser.IntNumInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intNumInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntNumInit(yaslParser.IntNumInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intIdInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntIdInit(yaslParser.IntIdInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intIdInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntIdInit(yaslParser.IntIdInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExprInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterIntExprInit(yaslParser.IntExprInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExprInit}
	 * labeled alternative in {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitIntExprInit(yaslParser.IntExprInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strIdInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStrIdInit(yaslParser.StrIdInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strIdInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStrIdInit(yaslParser.StrIdInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strSenInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStrSenInit(yaslParser.StrSenInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strSenInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStrSenInit(yaslParser.StrSenInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolIdInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolIdInit(yaslParser.BoolIdInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolIdInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolIdInit(yaslParser.BoolIdInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolBInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolBInit(yaslParser.BoolBInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolBInit}
	 * labeled alternative in {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolBInit(yaslParser.BoolBInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclare(yaslParser.IntDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclare(yaslParser.IntDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStrDeclare(yaslParser.StrDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStrDeclare(yaslParser.StrDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclare(yaslParser.BoolDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDeclare}
	 * labeled alternative in {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclare(yaslParser.BoolDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignNum}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignNum(yaslParser.AssignNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignNum}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignNum(yaslParser.AssignNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignBol}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignBol(yaslParser.AssignBolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignBol}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignBol(yaslParser.AssignBolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignString}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignString(yaslParser.AssignStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignString}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignString(yaslParser.AssignStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(yaslParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(yaslParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterAddIdStep(yaslParser.AddIdStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitAddIdStep(yaslParser.AddIdStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterSubIdStep(yaslParser.SubIdStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitSubIdStep(yaslParser.SubIdStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterMulIdStep(yaslParser.MulIdStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitMulIdStep(yaslParser.MulIdStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterDivideIdStep(yaslParser.DivideIdStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideIdStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitDivideIdStep(yaslParser.DivideIdStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterAddNumStep(yaslParser.AddNumStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitAddNumStep(yaslParser.AddNumStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterSubNumStep(yaslParser.SubNumStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitSubNumStep(yaslParser.SubNumStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterMulNumStep(yaslParser.MulNumStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitMulNumStep(yaslParser.MulNumStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterDivNumStep(yaslParser.DivNumStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divNumStep}
	 * labeled alternative in {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitDivNumStep(yaslParser.DivNumStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrement(yaslParser.PreIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrement(yaslParser.PreIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrement(yaslParser.PostIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrement(yaslParser.PostIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrement(yaslParser.PreDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrement(yaslParser.PreDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrement(yaslParser.PostDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postDecrement}
	 * labeled alternative in {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrement(yaslParser.PostDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(yaslParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(yaslParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIfElseCondition(yaslParser.IfElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseCondition}
	 * labeled alternative in {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIfElseCondition(yaslParser.IfElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionOp(yaslParser.ConditionOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionOp(yaslParser.ConditionOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionBoolOp(yaslParser.ConditionBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionBoolOp}
	 * labeled alternative in {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionBoolOp(yaslParser.ConditionBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(yaslParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(yaslParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(yaslParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(yaslParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(yaslParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(yaslParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRange(yaslParser.SimpleRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRange(yaslParser.SimpleRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stepRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void enterStepRange(yaslParser.StepRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stepRange}
	 * labeled alternative in {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void exitStepRange(yaslParser.StepRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(yaslParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(yaslParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(yaslParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(yaslParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpPrecedence(yaslParser.ExpPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPrecedence}
	 * labeled alternative in {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpPrecedence(yaslParser.ExpPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(yaslParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(yaslParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivision(yaslParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivision(yaslParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFact(yaslParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fact}
	 * labeled alternative in {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFact(yaslParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(yaslParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(yaslParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberexpression(yaslParser.NumberexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberexpression}
	 * labeled alternative in {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberexpression(yaslParser.NumberexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(yaslParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(yaslParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#sent_option}.
	 * @param ctx the parse tree
	 */
	void enterSent_option(yaslParser.Sent_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#sent_option}.
	 * @param ctx the parse tree
	 */
	void exitSent_option(yaslParser.Sent_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(yaslParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(yaslParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#special_char}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_char(yaslParser.Special_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#special_char}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_char(yaslParser.Special_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(yaslParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(yaslParser.NumberContext ctx);
}