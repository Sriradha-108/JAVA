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
| `14-Object-Oreiented-Programming/1-Class/` | `Class.java` | Classes and objects — a `Student` class with fields and methods, creating objects with `new`, setting fields through the reference, and calling `markAttendance()` and `print()` on each object |
| `14-Object-Oreiented-Programming/2-Constructor/1-Basic/` | `Constructor.java` | What a constructor is for, and the default values instance variables start with — `0`, `0.0`, `false`, `null` — versus local variables, which have none |
| `14-Object-Oreiented-Programming/2-Constructor/2-Default/` | `Default.java` | The default (no-argument) constructor — writing it out explicitly, and why it is optional when no other constructor exists |
| `14-Object-Oreiented-Programming/2-Constructor/3-Parameterized/` | `Para.java` | Parameterized constructor — passing the field values to `new Student("Sriji", 14, 101, "Mohan")` instead of assigning them one at a time |
| `14-Object-Oreiented-Programming/2-Constructor/4-overload/` | `Overload.java` | Constructor overloading — five `Student` constructors taking 0 to 4 arguments, each using `this.name = name` to separate the field from the parameter |
| `14-Object-Oreiented-Programming/2-Constructor/5-Chaining/` | `Chaining.java` | Constructor chaining — each shorter constructor calls the next with `this(...)` until the 4-argument one does the assigning, so the defaults live in one place |
| `14-Object-Oreiented-Programming/3-Call-by-value/` | `Callval.java` | Call by value — `addTen(x, y)` changes only its own copies, so `x` and `y` in `main` still print `4,5` afterwards |
| `14-Object-Oreiented-Programming/4-Call-by-reference/` | `Callref.java` | Passing an object — `addTen(r1)` writes through the reference to `r.x` and `r.y`, so the change is visible back in `main` |
| `14-Object-Oreiented-Programming/5-Static-Keyword/` | `Static.java` | The `static` keyword — `college` and `grade` shared by every `Student` and reached through the class name, versus per-object fields like `name` and `age` |
| `14-Object-Oreiented-Programming/6-Final-Keyword/` | `Final.java` | The `final` keyword — `static final double PI = 3.14` as a class constant, a blank `final` local assigned once, and commented-out notes on assigning a `final` field from a constructor or a static block |
| `14-Object-Oreiented-Programming/7-String[] args/` | `StringArgsDemo.java` | Command-line arguments — reading `args.length` and looping over `args[i]` to print each value passed after the class name |
| `15-Encapsulation/` | `Encap.java` | Encapsulation — `private` fields reached only through public methods: a `BankAccount` whose `balance` changes via `deposit()` / `withdraw()` and is read with `getbalance()`, and a `Student` read and renamed with `getName()` / `setName()` |
| `Package-16/` | `Pack2.java`, `college/Student.java`, `school/Student.java` | Packages — two classes both named `Student`, one in package `college` and one in package `school`, told apart in `Pack2.java` by their fully qualified names, with the `import` forms kept as comments |

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

A program that reads `String[] args` takes its values after the class name:

```bash
cd "14-Object-Oreiented-Programming/7-String[] args"
javac StringArgsDemo.java
java StringArgsDemo input.txt output.txt
```

A program that uses packages is compiled and run from the folder that holds the package directories, not from inside them:

```bash
cd Package-16
javac college/Student.java school/Student.java Pack2.java
java Pack2
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
- A class is the blueprint and an object is the instance built from it. `new Student()` allocates one object, and each object keeps its own copy of the fields, which is why `s1` and `s2` print different values.
- Fields that are never assigned hold their defaults — `null` for `String`, `0` for `int` — the same defaults array elements get.
- `Class.java` nests `Student` as a `static` nested class so both live in one file. A nested class must be `static` to be instantiated from `main` without an enclosing instance; the alternative is a separate top-level class in its own file.
- A constructor has the same name as its class and no return type, not even `void`. It runs once, when `new` creates the object.
- Instance variables get default values; local variables do not. `int x;` inside a method is a compile error if read before assignment — see the commented-out lines in `Constructor.java`.
- The compiler supplies a no-argument constructor only when the class declares none. Once `Para.java` adds a parameterized one, `new Student()` stops compiling unless the no-argument version is written back in, which is what `Overload.java` does.
- `this.name = name` assigns the parameter to the field of the same name. Without `this`, the nearer name wins and the line assigns the parameter to itself.
- `this(...)` calls another constructor of the same class and must be the first statement in the constructor. `Chaining.java` funnels every constructor into the 4-argument one, so the `"unknown"` defaults are written once instead of five times.
- Java is always call by value. For a primitive the copied value is the number itself, so `Callval.java` cannot change `x` and `y` in `main`. For an object the copied value is the reference, so `Callref.java` reaches the same object and its edits stick — reassigning `r` itself inside the method would still change nothing in `main`.
- A `static` field belongs to the class, not to any object: one copy shared by all instances, reached as `Student.college`. A `static` method can only touch `static` members directly, which is why `main` is `static` — the JVM calls it before any object exists.
- `final` means assign once. A `final` local can be declared without a value and assigned later, as long as that happens exactly once before it is read — that is why `x` in `Final.java` compiles. A `final` instance field must be set in its declaration or in every constructor; a `static final` field must be set in its declaration or in a static block, since no constructor runs for it.
- `String[] args` holds whatever is typed after the class name — `java StringArgsDemo input.txt output.txt` makes `args.length` 2. The array is empty, never `null`, when no arguments are passed, and every element is a `String` even if it looks like a number.
- `14-Object-Oreiented-Programming/7-String[] args/` has spaces and brackets in its name, so quote it when changing into it: `cd "7-String[] args"`.
- Encapsulation is the fields being `private` and the access going through public methods. `BankAccount.balance` cannot be set from `main` — the commented-out `ba.balance = 10000.00;` in `Encap.java` does not compile — so the only way in is `deposit()` and `withdraw()`, which is where a rule like "no negative deposit" would go.
- A field needs a getter only if it should be readable and a setter only if it should be writable. `Student` in `Encap.java` exposes `getName()` and `setName()` but leaves `age` and `rollNo` with neither, so they can be set once by the constructor and never changed afterwards.
- A `package` statement must be the first line of the file, and the folder name has to match the package name — `package college;` only works from a file inside a `college/` folder.
- The package folders sit under `Package-16/`, so `javac` and `java` are run from `Package-16/` with the path spelled out (`javac college/Student.java`). Running them from inside `college/` puts the `.class` file where the package name no longer matches, and `java` then cannot find the class.
- Two classes can share a simple name as long as they are in different packages. Only one of them can be imported into a file, which is why `Pack2.java` leaves both imports commented out and writes `college.Student` and `school.Student` in full instead.
- A file may hold only one `public` class, and it must match the file name. `college/Student.java` also declares `Teacher` without `public`, so `Teacher` is visible inside package `college` only.
- `Package-16/Pack.java` is an empty file kept as a placeholder — `javac` accepts it and produces no `.class`.
