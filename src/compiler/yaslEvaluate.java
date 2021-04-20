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
        System.out.println("A");
        return super.visitInitialization(ctx);
    }

    @Override
    public Object visitIntNumInit(yaslParser.IntNumInitContext ctx) {
//        System.out.println(ctx.identifier().getText());
//        System.out.println(ctx.number().getText());
        System.out.println("B");
        String id = ctx.identifier().getText();
        String num = ctx.number().getText();
        memory.get("INT").put(id,num);
        return 0;
    }

    @Override
    public Object visitIntIdInit(yaslParser.IntIdInitContext ctx) {
        System.out.println("C");
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        memory.get("INT").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitIntExprInit(yaslParser.IntExprInitContext ctx) {
        System.out.println("D");
        System.out.println(visit(ctx.expression()).toString());
        String id1 = ctx.identifier().getText();
        String value = visit(ctx.expression()).toString();
        memory.get("INT").put(id1,value);
        return 0;

    }

    @Override
    public Object visitStrIdInit(yaslParser.StrIdInitContext ctx) {
        System.out.println("E");
        String id1 = ctx.identifier(1).getText();
        String id2 = ctx.identifier(0).getText();
        memory.get("STR").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitBoolIdInit(yaslParser.BoolIdInitContext ctx) {
        System.out.println("F");
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        memory.get("BOL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitBoolBInit(yaslParser.BoolBInitContext ctx) {
        System.out.println("G");
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
        System.out.println("H");
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
        System.out.println("I");
        String id = ctx.identifier().getText();
        memory.get("STR").put(id,null);
        return 0;
    }

    @Override
    public Object visitBoolDeclare(yaslParser.BoolDeclareContext ctx) {
        System.out.println("J");
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
    public Object visitAssignExpr(yaslParser.AssignExprContext ctx) {
        System.out.println("K");
        String id1 = ctx.identifier().getText();
        String id2 = ctx.expression().getText();
        String val = null;
        for(String datatype :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(datatype);
            if(innerMap.containsKey(id2)){
                val= innerMap.get(id2);
                System.out.println(val);
            }
        }
        if(val.toLowerCase().equals("true") || val.toLowerCase().equals("false")) {
            memory.get("BOL").put(id1, val);
        } else {
            memory.get("INT").put(id1, val);
        }
        for (String datatype: memory.keySet()){
            HashMap<String,String> innerMap = memory.get(datatype);
            for(String var : innerMap.keySet()){
                System.out.println(datatype+" "+ var + " " + innerMap.get(var));
            }
        }
        return 0;
    }


    @Override
    public Object visitAssignBol(yaslParser.AssignBolContext ctx) {
        System.out.println("M");
        String id1 = ctx.identifier().getText();
        String id2 = ctx.boolean_value.getText();
        memory.get("BOL").put(id1,id2);
        for (String datatype: memory.keySet()){
            HashMap<String,String> innerMap = memory.get(datatype);
            for(String var : innerMap.keySet()){
                System.out.println(datatype+" "+ var + " " + innerMap.get(var));
            }
        }
        return 0;
    }

    @Override
    public Object visitAssignNum(yaslParser.AssignNumContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        memory.get("INT").put(id1,id2);
        return 0;
    }


    @Override
    public Object visitAddIdStep(yaslParser.AddIdStepContext ctx) {
        System.out.println("O");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(innerMap.get(id2));
                val1+=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitSubIdStep(yaslParser.SubIdStepContext ctx) {
        System.out.println("P");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(innerMap.get(id2));
                val1-=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitMulIdStep(yaslParser.MulIdStepContext ctx) {
        System.out.println("Q");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(innerMap.get(id2));
                val1*=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;

    }

    @Override
    public Object visitDivideIdStep(yaslParser.DivideIdStepContext ctx) {
        System.out.println("R");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(innerMap.get(id2));
                val1/=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;

    }

    @Override
    public Object visitAddNumStep(yaslParser.AddNumStepContext ctx) {
        System.out.println("S");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        System.out.println(id1);
        String id2 = ctx.number().getText();
        System.out.println(id2);
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1+=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitSubNumStep(yaslParser.SubNumStepContext ctx) {
        System.out.println("T");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        System.out.println(id1);
        String id2 = ctx.number().getText();
        System.out.println(id2);
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1-=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitMulNumStep(yaslParser.MulNumStepContext ctx) {
        System.out.println("U");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        System.out.println(id1);
        String id2 = ctx.number().getText();
        System.out.println(id2);
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1*=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitDivNumStep(yaslParser.DivNumStepContext ctx) {
        System.out.println("V");
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        System.out.println(id1);
        String id2 = ctx.number().getText();
        System.out.println(id2);
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1/=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
//        System.out.println(val1);
        return 0;
    }

    @Override
    public Object visitPreIncrement(yaslParser.PreIncrementContext ctx) {
        System.out.println("W");
//        System.out.println("dfghj");
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                ++val;
                memory.get("INT").put(id, String.valueOf(val));
            }
        }
//        System.out.println(val);
        return val;
    }

    @Override
    public Object visitPostIncrement(yaslParser.PostIncrementContext ctx) {
        System.out.println("X");
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                val++;
                memory.get("INT").put(id, String.valueOf(val));
            }
        }
//        System.out.println(val);
        return val;
    }

    @Override
    public Object visitPreDecrement(yaslParser.PreDecrementContext ctx) {
        System.out.println("Y");
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                --val;
                memory.get("INT").put(id, String.valueOf(val));
            }
        }
//        System.out.println(val);
        return val;
    }

    @Override
    public Object visitPostDecrement(yaslParser.PostDecrementContext ctx) {
        System.out.println("Z");
        int val = 0;
        String id = ctx.identifier().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id)){
                val= Integer.parseInt(innerMap.get(id));
                val--;
                memory.get("INT").put(id, String.valueOf(val));
            }
        }
//        System.out.println(val);
        return val;
    }

    @Override
    public Object visitIfCondition(yaslParser.IfConditionContext ctx) {
        System.out.println("AA");
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitIfElseCondition(yaslParser.IfElseConditionContext ctx) {
        System.out.println("AB");
        if((boolean)visit(ctx.condition())) {
            visit(ctx.block(0));
        } else {
            visit(ctx.block(1));
        }
        return 0;
    }

    @Override
    public Object visitConditionOp(yaslParser.ConditionOpContext ctx) {
        System.out.println("AC");
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
        System.out.println("AD");
        boolean boolVal = Boolean.parseBoolean(ctx.boolean_value.getText());
        return boolVal;
    }

    @Override
    public Object visitWhile_loop(yaslParser.While_loopContext ctx) {
        System.out.println("AE");

        while((boolean)visit(ctx.condition()))
        {
            visit(ctx.block());
        }

        return 0;
    }

    @Override
    public Object visitFor_loop(yaslParser.For_loopContext ctx) {
        System.out.println("AP");
        for(visit(ctx.integer());(boolean)visit(ctx.condition());visit(ctx.option()))
        {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitAddition(yaslParser.AdditionContext ctx) {
        System.out.println("AF");
        int left =  (int)visit(ctx.term());
        int right =  Integer.parseInt((String) visit(ctx.expression()));
        int result = left + right;
        return result;

    }

    @Override
    public Object visitSubtraction(yaslParser.SubtractionContext ctx) {
        System.out.println("AG");
        int left =  (int)visit(ctx.term());
        int right =  Integer.parseInt((String) visit(ctx.expression()));
        int result = left - right;
        return result;
    }

    @Override
    public Object visitExpPrecedence(yaslParser.ExpPrecedenceContext ctx) {
        System.out.println("AH");
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplication(yaslParser.MultiplicationContext ctx) {
        System.out.println("AI");
        int left =  Integer.parseInt((String) visit(ctx.factor()));
        int right =  Integer.parseInt((String) visit(ctx.term()));
        int result = left * right;
        return result;

    }

    @Override
    public Object visitDivision(yaslParser.DivisionContext ctx) {
        System.out.println("AJ");
        int left =  Integer.parseInt((String) visit(ctx.factor()));
        int right =  Integer.parseInt((String) visit(ctx.term()));
        int result = left / right;
        return result;

    }

    @Override
    public Object visitFact(yaslParser.FactContext ctx) {
        System.out.println("AK");
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdexpression(yaslParser.IdexpressionContext ctx) {
        System.out.println("AL");
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
        System.out.println("AM");
        return ctx.number().getText();
    }

    @Override
    public Object visitIdentifier(yaslParser.IdentifierContext ctx) {
        System.out.println("AN");
        return visitChildren(ctx);
    }

    @Override
    public Object visitNumber(yaslParser.NumberContext ctx) {
        System.out.println("AO");
        return visitChildren(ctx);
    }

}