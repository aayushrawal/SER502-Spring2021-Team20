
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
	 * Enter a parse tree produced by {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(yaslParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(yaslParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(yaslParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(yaslParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(yaslParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(yaslParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(yaslParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(yaslParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(yaslParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(yaslParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(yaslParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(yaslParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(yaslParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(yaslParser.PrintContext ctx);
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
	 * Enter a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(yaslParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(yaslParser.NumberContext ctx);
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
	 * Enter a parse tree produced by {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional(yaslParser.If_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional(yaslParser.If_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(yaslParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(yaslParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(yaslParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(yaslParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(yaslParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(yaslParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void enterStep_size(yaslParser.Step_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 */
	void exitStep_size(yaslParser.Step_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 */
	void enterTernary_conditional(yaslParser.Ternary_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 */
	void exitTernary_conditional(yaslParser.Ternary_conditionalContext ctx);
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
	 * Enter a parse tree produced by {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void enterRange_loop(yaslParser.Range_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 */
	void exitRange_loop(yaslParser.Range_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(yaslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(yaslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(yaslParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(yaslParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(yaslParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(yaslParser.FactorContext ctx);
}