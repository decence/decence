# Language Specification
The politeness language is based on politeness and good manners.

Some examples of grace code:

```
/*
 * multi-line comments
 */ 

// single line comments

// boolean expressions
kindly assert(true || false)
kindly assert(!false)
kindly assertNope(!true)
kindly assert(true && (true || false))

// for loop
from i=1 to 10 please
    kindly println i + 2
thanks

// set value to a variable
kindly assign 10 to x

// while loop
unless x < 15 please
    kindly update x to x + 1
thanks

// if condition
incase x < 20 please
    kindly update x to 20
thanks

// println statement
kindly println("Hey there!")

// print statement
// this will not output the endline character 
kindly print("Hey there!")

// function definition
define sum(a, b) please
    kindly return a + b
thanks
```

Things to note:
- no semicolons
- you should (need to) say `please` to start a block, be it conditional, loop, function definition, etc.
- while ending a block, you should say `thanks`
- `kindly` in the beginning of a line would call the inbuilt methods
- this will be a concurrent language
- files should be stored with the extensions: `.pls`

TODO:
- recursive calls
- lists and other data structures

