# JAVA

Java practice programs — notes and examples written while learning the language.

Folders are numbered in the order the topics were learned.

## Contents

| Folder | File | Topic |
| --- | --- | --- |
| `01-java-1st-program/` | `Demo.java` | First program — printing to console with `System.out.println` |
| `02-Vaiables/` | `Var.java` | Primitive data types — `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| `03-Diff-number-sys-rep/` | `Diff_reprsentaion.java` | Number system literals — binary (`0b`), octal (`0`), hexadecimal (`0X`), underscore separators, scientific notation |
| `04-Floating-number/` | `Float.java` | Floating-point precision — printing a `float` with `System.out.printf("%.20f%n", f)` to show it cannot store `0.7` exactly |
| `05-Negative-number/` | `Neg.java` | Negative floating-point values |
| `06-Implicit-conversion/` | `Impl.java` | Widening (implicit) conversion — `byte` to `int`, `char` to `int` |
| `07-Explicit-conversion/` | `Expl.java` | Narrowing (explicit) casts — `int` to `byte` overflow, truncating `float` to `int`, and why `boolean` cannot be cast |
| `08-Auto-Type-Promotion/` | `Auto.java` | Automatic type promotion in expressions — mixed `byte`/`char`/`short`/`int`/`float`/`double` arithmetic and its result type |
| `09-operator/1-Arithmatic/` | `Arith.java` | Arithmetic operators — `+`, `-`, `*`, `/`, `%`, compound assignment (`+=`, `-=`, `*=`, `/=`, `%=`), pre/post increment and decrement |
| `09-operator/2-Relational/` | `Rela.java` | Relational operators — `==`, `!=`, `<`, `>`, `<=`, `>=` and their `boolean` results |
| `09-operator/3-Bitwise/` | `Bitw.java`, `bitwise operator.md` | Bitwise operators — `&`, `\|`, `^`, `~`, `<<`, `>>`, `>>>`, with a full reference sheet in Markdown |
| `09-operator/4-Logical/` | `Logical.java` | Logical operators — short-circuit `&&` / `\|\|` versus non-short-circuit `&` / `\|` |
| `09-operator/5-Assignment/` | `Assign.java` | Assignment and comparison of assigned values |
| `10-Conditional-Statement/1-Selection/` | `Selection.java` | Selection statements — `if`, `if-else`, nested `if`, `if-else-if` ladder, classic `switch` with `break`, and arrow-label `switch` (JDK 14+) |
| `10-Conditional-Statement/2-Iteration/` | `Iteration.java` | Iteration statements — `while`, `do-while`, `for` (infinite, missing-init, comma-separated forms), nested loops, star patterns, and labelled `break`/`continue` |
| `10-Conditional-Statement/3-Jump/` | `Jump.java` | Jump statements — `break` and `continue` in practice: prime-number check and printing odd numbers |
| `11-Arrays/1-D-Array/` | `Arrays.java` | One-dimensional arrays — both declaration forms (`int[] a` and `int a[]`), `new int[3]`, index assignment, `length`, and filling/printing with a `for` loop |
| `11-Arrays/Multi-Dimension-Arrays/` | `MultiArrays.java` | Multi-dimensional arrays — rectangular `new int[3][3]`, jagged arrays (`new int[3][]` with rows of different lengths), array initialiser literals, and nested-loop traversal with `marks[row].length` |
| `12-Strings/` | `Strings.java` | Strings — declaring `String` variables and concatenation with `+` |
| `13-Function/1-Basic-Function/` | `Fun.java` | Functions — the four shapes of a `static` method: no input/no output, input/no output, no input/output, input/output, plus calling and printing a returned value |
| `13-Function/2-Function-overloading/` | `overloading.java` | Function overloading — same name with a different number of parameters, different parameter types, or a different parameter order |
| `13-Function/3-Chaining-of-function/` | `Chain.java` | Chaining of functions — `fun1` calls `fun2` calls `fun3`, showing the order in which the call stack unwinds |
| `13-Function/4-scope-of-a-variable/` | `Scope.java` | Scope of a variable — a `static` field visible to the whole class versus locals that live only inside their own method |
| `13-Function/5-Recursive/` | `Recursive.java` | Recursion — Fibonacci series with a `fib` method that calls itself, using `n == 0 \|\| n == 1` as the base case |

## Requirements

- JDK 8 or newer (`java -version` to check)

## How to run

Compile and run any program from its folder:

```bash
cd 01-java-1st-program
javac Demo.java
java Demo
```

```bash
cd 02-Vaiables
javac Var.java
java Var
```

With JDK 11+ a single-file program can be run directly, without compiling first:

```bash
java Var.java
```

## Notes

- Compiled `.class` files are build output and are excluded from the repository via `.gitignore`.
- Some files keep alternative examples commented out, so uncomment a block to try that case.
- `09-operator/3-Bitwise/bitwise operator.md` is a written reference for the bitwise operators — truth tables, shift behaviour, precedence, and common bit tricks.
- `switch` accepts `byte`, `short`, `int`, `char`, enums, and — since JDK 7 — `String`. Duplicate case labels are not allowed.
- A labelled `break` exits the labelled loop entirely, while a labelled `continue` jumps to the next iteration of the labelled loop — see `Iteration.java` for both.
- Array elements get default values on creation — `0` for numeric types, `false` for `boolean`, `null` for references — so `new int[3]` already holds `0 0 0`.
- Array `length` is a field, not a method: `a.length` with no brackets. For a 2-D array, `marks.length` is the number of rows and `marks[row].length` is the length of that row, which is what makes jagged arrays possible.
- `11-Arrays/1-D-Array/Arrays.java` declares a class named `Arrays`, which shadows `java.util.Arrays` in that file — import the JDK class under a different name if both are ever needed together.
- A `return;` at the end of `main` is optional — a `void` method returns on its own once the last statement runs.
- Overloading is resolved from the parameter list only. Two methods that differ solely in return type do not compile, which is why `Fun.java` and `overloading.java` use different names (`fun` and `fun2`) for that pair.
- Every recursive method needs a base case that returns without calling itself, or the calls never stop and the stack overflows. `fib` in `Recursive.java` returns `1` for both `n == 0` and `n == 1`, so the printed series starts `1 1 2 3 5`.
