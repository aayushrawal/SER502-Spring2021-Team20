grammar yasl;

program : block '.';

block : initialization ';'
| initialization ';' block
| declaration ';'
| declaration ';' block
| if_conditional block
| if_conditional
| while_loop block
| while_loop
| unary_operator ';' block
| unary_operator ';'
| step_size ';' block
| step_size ';'
| assignment ';'
| assignment ';' block
| for_loop
| for_loop block
| range_loop
| range_loop block
| ternary_conditional ';' block
| ternary_conditional ';'
| print ';' block
| print ';'

;

initialization : integer
| string
| bool;

integer: 'int' identifier '=' number                #intNumInit
| 'int' identifier '=' identifier                   #intIdInit
| 'int' identifier '=' expression                   #intExprInit
;


string : 'string' identifier '=' identifier       #strIdInit
|'string' identifier '=' '"' sentence '"'         #strSenInit;

bool : 'bool' identifier '=' identifier           #boolIdInit
| 'bool' identifier '=' bop=('true' | 'false')    #boolBInit
;

declaration :  'int' identifier     # intDeclare
| 'string' identifier               # strDeclare
| 'bool' identifier                 # boolDeclare
;

assignment : identifier '=' number                #assignNum
| identifier '=' boolean_value=('true' | 'false') #assignBol
| identifier '=' '"' sentence '"'                 #assignString
|identifier '=' expression                        #assignExpr
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

print : 'print' '(' '"' sentence '"' ')' #printStr
|'print' '(' (expression)')'             #printExpr
;


if_conditional : 'if' '(' condition ')' 'then' '{' block '}' #ifCondition
| 'if' '('condition')' 'then' '{' block '}' 'else' '{' block '}' #ifElseCondition ;

condition : expression conditional_operator=('==' | '<' | '>' | '<=' | '>=' | '!=') expression #conditionOp
| boolean_value=('true' | 'false') #conditionBoolOp;

while_loop : 'while' '(' condition ')' '{' block '}';

for_loop : 'for' '(' integer ';'  condition ';'  option ')' '{' block '}';
option : unary_operator | step_size;

range_loop : 'for'  identifier  'in' 'range' '('number ',' number')' '{' block '}'  #simpleRange
|'for'  identifier  'in' 'range' '('number ',' number ',' number ')' '{' block '}'  #stepRange
;

ternary_conditional : 'int' identifier  '=' condition '?' expression ':' expression #intTernary
|'string' identifier  '=' condition '?' '"' sentence '"' ':' '"' sentence '"' #strTernary
|'bool' identifier  '=' condition '?' boolean_value=('true' | 'false') ':' boolean_value=('true' | 'false') #bolTernary;

expression : term '+' expression #addition
| term '-' expression #subtraction
| term #expPrecedence;

term : factor '*' term #multiplication
| factor '/' term #division
| factor #fact;

factor : identifier #idexpression
| number #numberexpression;

sentence : sent_option*;
sent_option : number |identifier| special_char;

identifier : ID;
ID : [a-z][a-zA-Z0-9_]*;

special_char : Special_char;
Special_char : [$&+,:;=?@#|'<>.^*()%!-];

number : Digit;

Digit : '0'
    | '-'?[1-9][0-9]*
    ;

WS  : [ \t\r\n]+ -> skip;
