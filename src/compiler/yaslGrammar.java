import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class yaslGrammar {

    public static void main(String[] args) throws IOException {


        String extension = args[0].substring(args[0].length() - 5);
        if (!extension.equals(".yasl")) {
            throw new IllegalArgumentException("extension should be yasl only");
        }


        BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
        String input = "";
        String iterator = "";
        while ((iterator = reader.readLine()) != null) {
            input = input + iterator;
        }


        CharStream inputStream = CharStreams.fromString(input);
        System.out.println(inputStream);
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
