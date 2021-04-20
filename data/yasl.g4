grammar yasl;

program : block '.';

block : initialization ';'
| initialization ';' block
| declaration ';'
| declaration ';' block
| condition ';'
| condition ';' block
| if_conditional ';' block
| if_conditional ';'
| while_loop block
| while_loop
| unary_operator ';' block
| unary_operator ';'
| step_size ';' block
| step_size ';'
;

initialization : integer
| string
| bool;

integer: 'int' identifier '=' number               #intNumInit
| 'int' identifier '=' identifier                   #intIdInit
| 'int' identifier '=' expression                   #intExprInit
;

string : 'string' identifier '=' identifier       #strNumInit
;

bool : 'bool' identifier '=' identifier #boolIdInit
| 'bool' identifier '=' bop=('true' | 'false')       #boolBInit
;

declaration :  'int' identifier     # intDeclare
| 'string' identifier               # strDeclare
| 'bool' identifier                 # boolDeclare
;

step_size : identifier '+=' identifier #addIdStep
| identifier '-=' identifier           #subIdStep
| identifier '*=' identifier           #mulIdStep
| identifier '/=' identifier           #divideIdStep
| identifier '+=' number               #addNumStep
| identifier '-=' number               #subNumStep
| identifier '*=' number               #mulNumStep
| identifier '/=' number               #divNumStep
;

unary_operator : '++' identifier #preIncrement
| identifier '++'                #postIncrement
| '--' identifier                #preDecrement
| identifier '--'                #postDecrement;

if_conditional : 'if' '(' condition ')' 'then' '{' block '}' #ifCondition
| 'if' '('condition')' 'then' '{' block '}' 'else' '{' block '}' #ifElseCondition ;

condition : expression conditional_operator=('==' | '<' | '>' | '<=' | '>=' | '!=') expression #conditionOp
| boolean_value=('true' | 'false') #conditionBoolOp;

while_loop : 'while' '(' condition ')' '{' block '}';

expression : term '+' expression #addition
| term '-' expression #subtraction
| term #expPrecedence;

term : factor '*' term #multiplication
| factor '/' term #division
| factor #fact;

factor : identifier #idexpression
| number #numberexpression;

identifier : ID;
ID : [a-z][a-zA-Z0-9_]*;

number : Digit;

Digit : '0'
    | '-'?[1-9][0-9]*
    ;

WS  : [ \t\r\n]+ -> skip;
