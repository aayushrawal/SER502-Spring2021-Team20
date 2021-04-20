import java.util.HashMap;

public class yaslEvaluate extends yaslBaseVisitor{

    static HashMap<String, HashMap<String,String>> memory = new HashMap<>();

    @Override
    public Object visitProgram(yaslParser.ProgramContext ctx) {
//        Object res = visitChildren(ctx);
//        System.out.println(res.toString());
        HashMap<String,String> strings = new HashMap<String,String>();
        HashMap<String,String> ints = new HashMap<String,String>();
        HashMap<String,String> bols = new HashMap<String,String>();
        memory.put("STR", strings);
        memory.put("INT", ints);
        memory.put("BOL", bols);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(yaslParser.BlockContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitialization(yaslParser.InitializationContext ctx) {
        return super.visitInitialization(ctx);
    }

    @Override
    public Object visitIntNumInit(yaslParser.IntNumInitContext ctx) {
//        System.out.println(ctx.identifier().getText());
//        System.out.println(ctx.number().getText());
        String id = ctx.identifier().getText();
        String num = ctx.number().getText();
        memory.get("INT").put(id,num);
        return 0;
    }

    @Override
    public Object visitIntIdInit(yaslParser.IntIdInitContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        memory.get("INT").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitIntExprInit(yaslParser.IntExprInitContext ctx) {
        System.out.println(visit(ctx.expression()).toString());
        String id1 = ctx.identifier().getText();
        String value = visit(ctx.expression()).toString();
        memory.get("INT").put(id1,value);
        return 0;

    }

    @Override
    public Object visitStrNumInit(yaslParser.StrNumInitContext ctx) {
        String id1 = ctx.identifier(1).getText();
        String id2 = ctx.identifier(0).getText();
        memory.get("STR").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitBoolIdInit(yaslParser.BoolIdInitContext ctx) {
        String id1 = ctx.identifier(1).getText();
        String id2 = ctx.identifier(0).getText();
        memory.get("BOL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitBoolBInit(yaslParser.BoolBInitContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.bop.getText();
        memory.get("BOL").put(id1,id2);
        //        for (String datatype: memory.keySet()){
//            HashMap<String,String> innerMap = memory.get(datatype);
//            for(String var : innerMap.keySet()){
//                System.out.println(datatype+" "+ var + " " + innerMap.get(var));
//            }
//        }

        return 0;
    }

    @Override
    public Object visitIntDeclare(yaslParser.IntDeclareContext ctx) {
//        System.out.println("Int block");
        String id = ctx.identifier().getText();
        memory.get("INT").put(id,null);
        for (String datatype: memory.keySet()){
            HashMap<String,String> innerMap = memory.get(datatype);
            for(String var : innerMap.keySet()){
                System.out.println(datatype+" "+ var + " " + innerMap.get(var));
            }
        }
        return 0;

    }

    @Override
    public Object visitStrDeclare(yaslParser.StrDeclareContext ctx) {
        String id = ctx.identifier().getText();
        memory.get("STR").put(id,null);
        return 0;
    }

    @Override
    public Object visitBoolDeclare(yaslParser.BoolDeclareContext ctx) {
        String id = ctx.identifier().getText();
        memory.get("BOL").put(id,null);
//        for (String datatype: memory.keySet()){
//            HashMap<String,String> innerMap = memory.get(datatype);
//            for(String var : innerMap.keySet()){
//                System.out.println(datatype+" "+ var + " " + innerMap.get(var));
//            }
//        }

        return 0;
    }

    @Override
    public Object visitIfCondition(yaslParser.IfConditionContext ctx) {
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitIfElseCondition(yaslParser.IfElseConditionContext ctx) {
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block(0));
        } else {
            visit(ctx.block(1));
        }
        return 0;
    }

    @Override
    public Object visitConditionOp(yaslParser.ConditionOpContext ctx) {
        System.out.println("sdfghj");
        int expr1 = Integer.parseInt(visit(ctx.expression(0)).toString());
        int expr2 = Integer.parseInt(visit(ctx.expression(1)).toString());
        String conditionalOp = ctx.conditional_operator.getText();
        switch (conditionalOp) {
            case "==":
                return expr1 == expr2;
            case "<":
                return expr1 < expr2;
            case ">":
                return expr1 > expr2;
            case "<=":
                return expr1 <= expr2;
            case ">=":
                return expr1 >= expr2;
            case "!=":
                return expr1 != expr2;
        }
        return 0;
    }

    @Override
    public Object visitConditionBoolOp(yaslParser.ConditionBoolOpContext ctx) {
        boolean boolVal = Boolean.parseBoolean(ctx.boolean_value.getText());
        return boolVal;
    }

    @Override
    public Object visitAddition(yaslParser.AdditionContext ctx) {
        int left =  (int)visit(ctx.term());
        int right =  Integer.parseInt((String) visit(ctx.expression()));
        int result = left + right;
        return result;

    }

    @Override
    public Object visitSubtraction(yaslParser.SubtractionContext ctx) {
        int left =  (int)visit(ctx.term());
        int right =  Integer.parseInt((String) visit(ctx.expression()));
        int result = left - right;
        return result;
    }

    @Override
    public Object visitExpPrecedence(yaslParser.ExpPrecedenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplication(yaslParser.MultiplicationContext ctx) {
        int left =  Integer.parseInt((String) visit(ctx.factor()));
        int right =  Integer.parseInt((String) visit(ctx.term()));
        int result = left * right;
        return result;

    }

    @Override
    public Object visitDivision(yaslParser.DivisionContext ctx) {
        int left =  Integer.parseInt((String) visit(ctx.factor()));
        int right =  Integer.parseInt((String) visit(ctx.term()));
        int result = left / right;
        return result;

    }

    @Override
    public Object visitFact(yaslParser.FactContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdexpression(yaslParser.IdexpressionContext ctx) {

        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
            }
        }
        return val;
    }

    @Override
    public Object visitNumberexpression(yaslParser.NumberexpressionContext ctx) {
        return ctx.number().getText();
    }

    @Override
    public Object visitIdentifier(yaslParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitNumber(yaslParser.NumberContext ctx) {
        return visitChildren(ctx);
    }

}