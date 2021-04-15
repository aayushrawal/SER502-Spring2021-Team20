
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
	 * Visit a parse tree produced by {@link yaslParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(yaslParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(yaslParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(yaslParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(yaslParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#boolean_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value(yaslParser.Boolean_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(yaslParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(yaslParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(yaslParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(yaslParser.NumberContext ctx);
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
	 * Visit a parse tree produced by {@link yaslParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_conditional(yaslParser.If_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(yaslParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(yaslParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(yaslParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#step_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_size(yaslParser.Step_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#ternary_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_conditional(yaslParser.Ternary_conditionalContext ctx);
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
	 * Visit a parse tree produced by {@link yaslParser#range_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_loop(yaslParser.Range_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(yaslParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(yaslParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaslParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(yaslParser.FactorContext ctx);
}