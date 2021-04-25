import java.util.HashMap;

public class yaslEvaluate extends yaslBaseVisitor{

    static HashMap<String, HashMap<String,String>> memory = new HashMap<>();

    @Override
    public Object visitProgram(yaslParser.ProgramContext ctx) {

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
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitialization(yaslParser.InitializationContext ctx) {
        return super.visitInitialization(ctx);
    }

    @Override
    public Object visitIntNumInit(yaslParser.IntNumInitContext ctx) {
        String id = ctx.identifier().getText();
        String num = ctx.number().getText();
        memory.get("INT").put(id,num);
        return 0;
    }

    @Override
    public Object visitIntIdInit(yaslParser.IntIdInitContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        boolean keyExists = false;
        for (String integer : memory.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = memory.get(integer);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        memory.get("INT").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }

        return 0;
    }

    @Override
    public Object visitIntExprInit(yaslParser.IntExprInitContext ctx) {
        String id1 = ctx.identifier().getText();
        String value = visit(ctx.expression()).toString();
        memory.get("INT").put(id1,value);
        return 0;

    }

    @Override
    public Object visitStrIdInit(yaslParser.StrIdInitContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();

        boolean keyExists = false;
        for (String string : memory.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = memory.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        memory.get("STR").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitStrSenInit(yaslParser.StrSenInitContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.sentence().getText();
        memory.get("STR").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitBoolIdInit(yaslParser.BoolIdInitContext ctx) {
        String id1 = ctx.identifier(0).getText();
        String id2 = ctx.identifier(1).getText();
        boolean keyExists = false;
        for (String string : memory.keySet()) {
            if (!keyExists) {
                HashMap<String, String> innerMap = memory.get(string);
                for (String name: innerMap.keySet()) {
                    String key = name.toString();
                    if (key.equals(id2)) {
                        String value = innerMap.get(name).toString();
                        memory.get("BOL").put(id1,value);
                        keyExists = true;
                        break;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitBoolBInit(yaslParser.BoolBInitContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.bop.getText();
        memory.get("BOL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitIntDeclare(yaslParser.IntDeclareContext ctx) {
        String id = ctx.identifier().getText();
        memory.get("INT").put(id,null);
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
        return 0;
    }

    @Override
    public Object visitAssignExpr(yaslParser.AssignExprContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = visit(ctx.expression()).toString();
        memory.get("INT").put(id1, id2);
        return 0;
    }

    @Override
    public Object visitAssignBol(yaslParser.AssignBolContext ctx) {

        String id1 = ctx.identifier().getText();
        String id2 = ctx.boolean_value.getText();
        memory.get("BOL").put(id1,id2);
        return 0;
    }

    @Override
    public Object visitAssignString(yaslParser.AssignStringContext ctx) {
        String id1 = ctx.identifier().getText();
        String id2 = ctx.sentence().getText();
        memory.get("STR").put(id1,id2);
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
        return 0;
    }

    @Override
    public Object visitSubIdStep(yaslParser.SubIdStepContext ctx) {
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
        return 0;
    }

    @Override
    public Object visitMulIdStep(yaslParser.MulIdStepContext ctx) {
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
        return 0;

    }

    @Override
    public Object visitDivideIdStep(yaslParser.DivideIdStepContext ctx) {
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
        return 0;

    }

    @Override
    public Object visitAddNumStep(yaslParser.AddNumStepContext ctx) {
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1+=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
        return 0;
    }

    @Override
    public Object visitSubNumStep(yaslParser.SubNumStepContext ctx) {
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1-=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
        return 0;
    }

    @Override
    public Object visitMulNumStep(yaslParser.MulNumStepContext ctx) {
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1*=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
        return 0;
    }

    @Override
    public Object visitDivNumStep(yaslParser.DivNumStepContext ctx) {
        int val1 = 0;
        int val2 = 0;
        String id1 = ctx.identifier().getText();
        String id2 = ctx.number().getText();
        for(String integer :memory.keySet()){
            HashMap<String,String> innerMap = memory.get(integer);
            if(innerMap.containsKey(id1)){
                val1= Integer.parseInt(innerMap.get(id1));
                val2= Integer.parseInt(id2);
                val1/=val2;
                memory.get("INT").put(id1, String.valueOf(val1));
            }
        }
        return 0;
    }

    @Override
    public Object visitPreIncrement(yaslParser.PreIncrementContext ctx) {

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
        return val;
    }

    @Override
    public Object visitPostIncrement(yaslParser.PostIncrementContext ctx) {
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
        return val;
    }

    @Override
    public Object visitPreDecrement(yaslParser.PreDecrementContext ctx) {
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
        return val;
    }

    @Override
    public Object visitPostDecrement(yaslParser.PostDecrementContext ctx) {
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
        return val;
    }

    @Override
    public Object visitPrintStr(yaslParser.PrintStrContext ctx) {
        String res = ctx.sentence().getText();
        System.out.println(res.replaceAll("[\"]",""));
        return 0;
    }

    @Override
    public Object visitPrintExpr(yaslParser.PrintExprContext ctx) {
        System.out.println(visit(ctx.expression()));
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
    public Object visitWhile_loop(yaslParser.While_loopContext ctx) {

        while((boolean)visit(ctx.condition()))
        {
            visit(ctx.block());
        }

        return 0;
    }

    @Override
    public Object visitFor_loop(yaslParser.For_loopContext ctx) {
        for(visit(ctx.integer());(boolean)visit(ctx.condition());visit(ctx.option()))
        {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitOption(yaslParser.OptionContext ctx) {
        return super.visitOption(ctx);
    }

    @Override
    public Object visitSimpleRange(yaslParser.SimpleRangeContext ctx) {
        int val1 = Integer.parseInt(ctx.number(0).getText());
        int val2 = Integer.parseInt(ctx.number(1).getText());
        String x = ctx.identifier().getText();
        memory.get("INT").put(x,null);
        for(int a =val1 ; a < val2; a++ )
        {   memory.get("INT").put(x, String.valueOf(a));
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitStepRange(yaslParser.StepRangeContext ctx) {
        int val1 = Integer.parseInt(ctx.number(0).getText());
        int val2 = Integer.parseInt(ctx.number(1).getText());
        int step = Integer.parseInt(ctx.number(2).getText());
        String x = ctx.identifier().getText();
        memory.get("INT").put(x,null);
        for(int a =val1 ; a < val2; a+=step )
        {   memory.get("INT").put(x, String.valueOf(a));
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitIntTernary(yaslParser.IntTernaryContext ctx) {
        int a=0;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a =Integer.parseInt((String) visit(ctx.expression(0)));
        } else {
            a =Integer.parseInt((String) visit(ctx.expression(1)));
        }
        memory.get("INT").put(id, String.valueOf(a));
        return 0;
    }

    @Override
    public Object visitStrTernary(yaslParser.StrTernaryContext ctx) {
        String a= null;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a = ctx.sentence(0).getText();
        } else {
            a = ctx.sentence(1).getText();
        }
        memory.get("STR").put(id, a);
        return 0;
    }

    @Override
    public Object visitBolTernary(yaslParser.BolTernaryContext ctx) {
        String a= null;
        String id = ctx.identifier().getText();
        if((boolean)visit(ctx.condition())) {
            a =ctx.boolean_value.getText();
        } else {
            a =ctx.boolean_value.getText();
        }
        memory.get("BOL").put(id, String.valueOf(a));
        return 0;
    }



    @Override
    public Object visitAddition(yaslParser.AdditionContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.expression())));
        int result = left + right;
        return result;
    }

    @Override
    public Object visitSubtraction(yaslParser.SubtractionContext ctx) {
        int left = Integer.parseInt(String.valueOf(visit(ctx.term())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.expression())));
        int result = left - right;
        return result;
    }

    @Override
    public Object visitExpPrecedence(yaslParser.ExpPrecedenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplication(yaslParser.MultiplicationContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int result = left * right;
        return result;

    }

    @Override
    public Object visitDivision(yaslParser.DivisionContext ctx) {
        int left =  Integer.parseInt(String.valueOf(visit(ctx.factor())));
        int right =  Integer.parseInt(String.valueOf(visit(ctx.term())));
        int result = left / right;
        return result;

    }

    @Override
    public Object visitFact(yaslParser.FactContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdexpression(yaslParser.IdexpressionContext ctx) {
        int val1 = 0;
        String val2 = null;
        String id = ctx.identifier().getText();
        if(id.getClass().equals("class java.lang.Integer"))
        {
            for (String datatype : memory.keySet()) {
                HashMap<String, String> innerMap = memory.get(datatype);
                if (innerMap.containsKey(id)) {
                    val1 = Integer.parseInt(innerMap.get(id));
                }
            }
            return val1;
        }else{
            for (String datatype : memory.keySet()) {
                HashMap<String, String> innerMap = memory.get(datatype);
                if (innerMap.containsKey(id)) {
                    val2 = (innerMap.get(id));
                }
            }
            return val2;
        }
    }

    @Override
    public Object visitNumberexpression(yaslParser.NumberexpressionContext ctx) {
        return ctx.number().getText();
    }

    @Override
    public Object visitSentence(yaslParser.SentenceContext ctx) {
        System.out.println(ctx.sent_option());
        return 0;
    }

    @Override
    public Object visitSent_option(yaslParser.Sent_optionContext ctx) {
        return super.visitSent_option(ctx);
    }

    @Override
    public Object visitIdentifier(yaslParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSpecial_char(yaslParser.Special_charContext ctx) {
        return super.visitSpecial_char(ctx);
    }

    @Override
    public Object visitNumber(yaslParser.NumberContext ctx) {
        return visitChildren(ctx);
    }

}