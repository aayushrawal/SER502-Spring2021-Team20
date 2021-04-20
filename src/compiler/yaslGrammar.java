import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;

public class yaslGrammar {

    public static void main(String[] args) {

        CharStream inputStream = CharStreams.fromString("for(int i = 0; i < 5; i++){int a;}.");
        yaslLexer lexer = new yaslLexer(inputStream);
        CommonTokenStream tokenizer = new CommonTokenStream(lexer);
        yaslParser parser = new yaslParser(tokenizer);
        ParseTree tree = parser.program();
//        parser.addParseListener(new EqiGrammarBaseListener());
//        ParserRuleContext  tree = parser.program();
//        ParserRuleContext  tree = parser.program();
//        System.out.println(tree.toStringTree(parser));
        yaslEvaluate visitor = new yaslEvaluate();
        visitor.visit(tree);
//        System.out.println(visitor.result);

        try {
            PrintWriter writer = new PrintWriter("parseTree.pt", "UTF-8");
//            writer.println(tree);
            writer.println(tree.toStringTree(parser));
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write to the file \n\n\n\n"
                    + e.toString());
        }

    }

}