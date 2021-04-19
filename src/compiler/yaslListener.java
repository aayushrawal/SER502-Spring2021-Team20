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
	 * Enter a parse tree produced by the {@code strNumInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStrNumInit(yaslParser.StrNumInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strNumInit}
	 * labeled alternative in {@link yaslParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStrNumInit(yaslParser.StrNumInitContext ctx);
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