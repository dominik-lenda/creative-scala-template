# Expressions and values

Expressions describe programs, values are the results of evaluated expressions.

# Types

Types describe set of values.

Example:
1 + 2 is Int the value of this expression is one of the 4.2 billion values
that computer understands to be integers ("whole numbers").

We know types at compile-time because type is a property of expression,
not a value.

Compilation checks that a program is well structured: syntax is correct,
types are checked.

This syntax is incorrect:
`Blabla / \ "S`
This is correct:
`val number = 5`

You can do different things with different types. Not all operations are possible
on all types. For example, type-checker rejects `1.toUpperCase` because you
cannot turn a number into upper case.

Type-checking helps you avoid  many errors before running program.

Types at compile-time and values at run-time

Type tags are at run-time, not types. Tags can be ommited to make programs efficient (type erasure).

Types are a property of expressions so you can determine type of expression when
its evaluation leads to error at run-time.

# Recap

Scala has expressions, values and types.
Evaluation turns expressions into values.
Evaluation is preceeded by compilation, which performs type-checking.


# Literal expressions

The simplest expressions are literals such as `3` or `"Strings of strings"`
A literal evalutes to itself.

# Objects

Object is a grouping of data and operations. 
All values are objects.
Example: 
`2` is an object. Data is 2 and operations are `+, -`, etc.

Operations on objects are called methods.

Syntax to call methods:
`expression.method` or operator style such as `2 + 1` (`2.+(1)`)

