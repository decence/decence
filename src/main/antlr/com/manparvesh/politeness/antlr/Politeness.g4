grammar Politeness;

program   : 'begin' statement+ 'end';

statement : assign | add | print | println;

assign    : 'kindly set ' NUMBER 'to' ID ;
print     : 'kindly print(' (NUMBER | ID) ')' ;
println   : 'kindly println(' (NUMBER | ID) ')' ;
add       : NUMBER '+' NUMBER ;

// variable names
ID     : [a-z]+ ;
// integer
NUMBER : [0-9]+ ;
// skip any number of whitespaces when inside a sentence
WS     : [ \n\t]+ -> skip;

// todo strings
// todo decimals
