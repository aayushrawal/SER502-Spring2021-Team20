grammar yasl;
program :  block '.' ;

block :   initialization ';' block
| declaration ';' block
| assignment ';' block
| print ';' block
| step_size ';' block
| unary_operator ';' block
| if_conditional block
| ternary_conditional ';' block
| 'break'';' block
| for_loop block
| while_loop block
| range_loop block
| declaration ';'
| assignment ';'
| print ';'
| if_conditional
| ternary_conditional ';'
| step_size ';'
| for_loop
| while_loop
| range_loop
| unary_operator ';'
| 'break'';'
| initialization ';';

initialization : integer
| string
| boolean;

declaration :  'int' identifier
| 'string' identifier
| 'bool' identifier;

integer : 'int' identifier '=' number
| 'int' identifier '=' identifier
| 'int' identifier '=' expression;

string : 'string' identifier '=' '"' sentence '"'
| 'string' identifier '=' identifier;

boolean : 'bool' identifier '=' identifier
| 'bool' identifier '=' boolean_value;

boolean_value : 'true' | 'false';

assignment : identifier '=' expression
| identifier '=' identifier
| identifier '=' '"' sentence '"'
| identifier '=' boolean_value
| identifier '=' number ;

print : 'print' '(' '"' sentence '"' ')'
|'print' '(' (identifier | number | boolean_value|expression)')';

sentence : (number |identifier| special_char)*;


number : '-'? Digit;
Digit :[0-9]+;

identifier :  Id;
Id:[_a-z][_a-z0-9]*;

special_char : '?' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '_' | '+' | '{' | '}' | '[' | ']' | '|' | ';' | ':' | ',' | '.' | '<' | '>' | '/' | '-' | '=' | '`' | '~' | '\\'|'==' | '<' | '>' | '<=' | '>=' | '!=' | '++'| '--'| '+='| '-='| '*='| '/=';

if_conditional : 'if' '(' condition ')' 'then' '{' block '}'
| 'if' '('condition')' 'then' '{' block '}' 'else' '{' block '}';

condition : expression conditional_operator expression
| boolean_value;
conditional_operator :  '==' | '<' | '>' | '<=' | '>=' | '!=' ;

unary_operator : '++' identifier
| identifier '++'
| '--' identifier
| identifier '--';

step_size : identifier '+=' identifier
| identifier '-=' identifier
| identifier '*=' identifier
| identifier '/=' identifier
| identifier '+=' number
| identifier '-=' number
| identifier '*=' number
| identifier '/=' number;


ternary_conditional : (identifier|declaration) '=' expression conditional_operator expression '?' (expression|'"'sentence'"'|boolean_value|ternary_conditional) ':' (expression|'"'sentence'"'|boolean_value|ternary_conditional);

while_loop : 'while' '(' condition ')' '{' block '}';

for_loop : 'for' '(' integer ';'  condition ';'  (unary_operator | step_size) ')' '{' block '}';

range_loop : 'for'  identifier  'in' 'range' '('number ',' number')' '{' block '}'
|'for'  identifier  'in' 'range' '('number ',' number ',' number ')' '{' block '}';

expression : term '+' expression
| term '-' expression
| term;

term : factor '*' term
| factor '/' term
| factor;

factor : identifier
| number;

WS: [ \r\n\t]+ -> skip ;
