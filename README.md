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
| `17-Inheritance/1-Simple/` | `Inher.java` | Single inheritance — `EngineerStudent extends Student`, so one object can call both the inherited `markAttendance()` and its own `attendLab()` |
| `17-Inheritance/2-Multi-level/` | `Multi.java` | Multi-level inheritance — a chain of `Student` → `EngineerStudent` → `CSEEngineerStudent`, where the last class collects the methods of both classes above it |
| `17-Inheritance/3-Hierarchical/` | `Hier.java` | Hierarchical inheritance — `EngineerStudent` and `CSEEngineerStudent` both extend `Student` as siblings, so `attendLab()` is no longer reachable from a `CSEEngineerStudent` |
| `17-Inheritance/4-Super/` | `Super.java`, `Super2.java` | The `super` keyword — `EngStudent` overrides `print()` and calls `super.print()` for the parent's half of the output, and `Super2.java` adds `super(name, age, rn)` so the parent constructor sets the inherited fields |
| `18-Abstraction/BasicAbs/` | `Abs.java` | Abstraction with an abstract class — `Car` gives `start()` a body and leaves `accelerate()` and `brake()` abstract, so `FuelCar` and `ElectricCar` must override them |
| `18-Abstraction/Interface/` | `Inter.java` | Abstraction with an interface — `Car` declares `start()`, `accelerate()`, and `brake()` with no bodies, and `FuelCar` / `ElectricCar` `implements` all three |
| `19-Polymorphism/` | `Poly.java` | Runtime polymorphism — `A a = new B()` calls `B.getX()`, with commented-out notes on why `static`, `private`, `final` methods and fields are not polymorphic |
| `20-AutoBoxing-AbstractClasses-Pojo/AutoBoxing/` | `Auto.java` | Autoboxing and unboxing — the three places the conversion happens (assignment, method call, arithmetic), with the live example left as `Integer x = null; int y = x;` to show the `NullPointerException` unboxing throws |
| `20-AutoBoxing-AbstractClasses-Pojo/AbstractClasses/` | `Demo.java`, `Demo2.java` | `Demo.java` compares two `Integer` objects with `==`, `intValue()`, and `equals()`; `Demo2.java` is an abstract `Animal` with a constructor, an abstract `makesound()`, and a concrete `sleep()`, extended by `Dog` |
| `20-AutoBoxing-AbstractClasses-Pojo/Pojos/` | `Ab.java`, `Pojos.java` | POJOs — `Ab.java` currently holds the file/class naming questions answered in `interview-questions/`, and `Pojos.java` is an empty placeholder |
| `21-Nested-Class/static-class/` | `Nested.java` | Static nested class — `Outer.Inner` built with `new Outer.Inner(outer)` and no enclosing instance, so it reads `static` `x` directly but needs an `Outer` passed in for `y`, plus a `BankAccount` helper and a list of use cases |
| `21-Nested-Class/inner-class/` | `Inner.java` | Inner (non-static nested) class — created with `outer.new Inner()`, with the commented-out `Outer.this.x` showing how to reach the shadowed outer field |
| `21-Nested-Class/local-class/` | `Local.java` | Local class — `class Local` declared inside `greet()`, capturing the effectively final local `y`, with the places a local class may be declared listed at the bottom |
| `21-Nested-Class/anonymous-class/` | `Anon.java` | Anonymous class — `new Person() { ... }` overriding `introduce()` and adding its own `name` field and `greet()` method, next to the named-subclass version kept as a comment |
| `22-Types-of-input/Console-Input/` | `Console.java` | Console output — `System.out` versus `System.err`, both `PrintStream` fields of `System`, with `err` used for the invalid-age message |
| `22-Types-of-input/File-Input/` | `Input.java` | Reading raw bytes — `System.in.read()` returns one `int`, cast to `char` to print it, and the method has to declare `throws IOException` |
| `22-Types-of-input/Memory-Input/` | `Demo3.java` | `BufferedReader` wrapped around `InputStreamReader(System.in)` to read a whole line, with the byte → character → line path written out step by step in the comment |
| `22-Types-of-input/Network-Input/` | `Demo4.java` | `Scanner` — `nextInt()` followed by `nextLine()`, which is the classic case where the leftover newline is consumed by the second call |
| `23-Immutable-class/` | `Demo.java`, `Demo2.java` | Immutable classes — `Demo.java` shows a `final` class with `final` fields that is still not immutable, because `getCollege()` hands out the real `College` and the caller edits it; `Demo2.java` fixes it with a defensive copy in both the constructor and the getter |
| `24-Important-class-in-java/` | `Demo.java`, `Demo2.java` | The `Object` methods — `toString()`, `equals()`, `hashCode()` with `Objects.hash`, `getClass()`, and `clone()` with `Cloneable`; `Demo2.java` covers `getClass().getName()` and `instanceof` across `Animal` and `Dog` |
| `25-Java-Enum/` | `Demo.java` … `Demo5.java` | Enums — the `static final` constants they replace and what is wrong with them, a plain `enum`, an enum with a field and constructor, constant-specific bodies overriding an `abstract` method, and the built-in `values()`, `valueOf()`, `name()`, `ordinal()` |
| `26-Interfaces/` | `Demo.java` … `Demo7.java` | Interfaces in depth — polymorphism through a `Payment` reference, interface constants, multiple inheritance with `implements A, B`, one interface extending another, `default` / `static` / `private` methods, the diamond problem, and the class-wins resolution rule |
| `27-String/` | `Demo.java`, `Demo2.java`, `Demo3.java` | Strings in depth — the string pool and why `==` differs for literals and `new String(...)`, compile-time versus run-time concatenation, and what immutability costs inside a loop |
| `27-String2/` | `Demo.java`, `Demo2.java`, `Demo3.java` | The `String` API — every `String` constructor, the instance methods grouped by job (length, character access, comparison, searching, transformation, conversion, formatting), and `StringBuilder` with its capacity growth |
| `28-Generics/` | `Demo.java` … `Demo7.java` | Generics — the upcasting and downcasting they replace, an `Object`-based `Box` that loses its type, the same `Box<T>` that keeps it, two type parameters, generic methods with type inference, and upper bounds with `extends Number` and `extends Animal & Swimmable` |
| `29-WildCards/` | `Demo.java` … `Demo5.java` | Wildcards — why generics are invariant while arrays are not, the unbounded `List<?>`, the upper-bounded `? extends Animal` for reading, the lower-bounded `? super Animal` for writing, and how `<?>` differs from `<T>` |
| `30-Iterable-Interface/` | `Demo.java`, `Demo2.java`, `Demo3.java` | `Iterable` and `Iterator` — walking a `Collection` with `hasNext()` / `next()`, a custom `NameContainer implements Iterable<String>` returning an anonymous `Iterator`, and the `ConcurrentModificationException` a fail-fast iterator throws |
| `31-Java-Collection/` | `Demo.java` | The `Collection` interface — `size()`, `isEmpty()`, `contains()`, `toArray()` in both forms, `add()`, `remove()`, `addAll()`, `containsAll()`, `removeAll()`, `retainAll()`, and `clear()`, each kept as a commented-out line |
| `32-Java-List-Interface/` | `Demo.java` | What `List` adds on top of `Collection` — index access with `get()` and `set()`, `addAll()` at a position, `indexOf()` / `lastIndexOf()`, `ListIterator` walking backwards, and the immutable `List.of()` and `List.copyOf()` |
| `33-Java-Set-Map-Interface/` | `Demo.java` | `Set` and `Map` — a `HashSet` with `contains()`, and a `HashMap` with `put()`, `get()`, and `containsKey()` |
| `34-Set-and-Map-Method/` | `Demo.java` … `Demo5.java` | `Set` and `Map` implementations in depth — the four constructor forms of `LinkedHashSet` and `LinkedHashMap`, the `SortedSet` / `NavigableSet` methods on `TreeSet`, the full `Map` API, and `TreeMap`'s navigation methods |
| `35-Java-Queue-Interface/` | `Demo.java`, `Demo2.java` | `Queue` — the throwing and returning halves of the API (`add` / `offer`, `element` / `peek`, `remove` / `poll`) on an `ArrayDeque`, and a `PriorityQueue` as a min-heap and, with a comparator, a max-heap |
| `36-Comparable-Interface-In-Java/` | `Demo.java`, `Demo2.java` | `Comparable` — a `Student` with `compareTo()` sorting by marks then name for `Collections.sort()`, and the same class in a `TreeSet`, where `compareTo()` rather than `equals()` decides what counts as a duplicate |
| `37-Java-Lambdas-and-Functional-Interface/` | `Demo.java`, `Demo2.java` | Lambdas — the same `Comparator` written three ways, as a named class, an anonymous class, and a lambda, plus a hand-written functional interface `Calculate` implemented by `(a, b) -> a + b` |
| `interview-questions/` | `01-public-class-and-file-name.md` | Written answers to interview questions, in tables — why one `public` class per file, why its name must match the file name, and how `javac` and the JVM each apply that rule |

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
- `extends` gives the subclass every field and method of the superclass without repeating them. The parent stays usable on its own, which is why each of the three files still creates a plain `Student` next to the subclass object.
- Inheritance runs one way only. `EngineerStudent` can call `markAttendance()`, but a `Student` reference cannot call `attendLab()` — the parent knows nothing about what its children add.
- Multi-level means each class extends the one before it. `CSEEngineerStudent extends EngineerStudent extends Student` in `Multi.java`, so its object reaches `attendCSELab()`, `attendLab()`, and `markAttendance()` alike.
- Hierarchical means several classes extend the same parent. In `Hier.java` both `EngineerStudent` and `CSEEngineerStudent` extend `Student` directly, so they are siblings and share nothing with each other — that is why `es.attendLab()` is commented out there but works in `Multi.java`, where the same call sits in a chain.
- The three files each redeclare their own `Student`, `EngineerStudent`, and `CSEEngineerStudent` so every folder compiles on its own. Compile each one from its own folder; the class names would collide otherwise.
- Java has no multiple inheritance of classes — a class may name only one superclass in `extends`. Several classes sharing one parent, as in `Hier.java`, is hierarchical inheritance, not multiple.
- A subclass method with the same name and parameters as the parent's overrides it. `EngStudent.print()` is what runs for an `EngStudent` object; the parent version is reachable only through `super.print()`, which is how both files print the `Student` line and the college line from one call.
- `super` reaches the parent's copy of something the subclass has redeclared. `rn` exists in both `Student` and `EngStudent`, so inside `EngStudent` the plain name `rn` means its own field and `super.rn` means the parent's — the commented-out line in `print()` spells that out.
- Shadowing a field is not overriding it. Both `rn` fields exist at once in the same object, so `Super.java` prints `Sriji,14,0` — `Student.print()` reads the parent's `rn`, which nothing assigned.
- `super(...)` calls a parent constructor and must be the first statement in the subclass constructor, the same rule `this(...)` follows. `EngStudent` in `Super2.java` hands `name`, `age`, and `rn` up to `Student` and keeps only `college` for itself, so the parent's `rn` is set to `101` and the output becomes `Sriji,14,101`.
- A constructor with no explicit `super(...)` gets an implicit call to the parent's no-argument constructor, so the parent must still have one. `Super2.java` writes `Student() {}` back in for that reason, after adding the parameterized constructor.
- `Super.java` and `Super2.java` sit in the same folder and both declare `Student` and `EngStudent`, so compile them one at a time. `javac Super.java Super2.java` in a single command is a duplicate-class error, and compiling one after the other overwrites the shared `.class` files.
- Abstraction is showing what an object does and hiding how it does it. Java offers two ways, one folder each: an abstract class in `18-Abstraction/BasicAbs/` and an interface in `18-Abstraction/Interface/`.
- An `abstract` class cannot be instantiated — `new Car()` does not compile. It can still hold ordinary methods with bodies, which is why `Car.start()` in `Abs.java` prints for both subclasses without either one writing it out.
- A class that extends an abstract class must override every `abstract` method or be declared `abstract` itself. `FuelCar` and `ElectricCar` implement `accelerate()` and `brake()` for that reason.
- An interface declares methods without bodies, and a class picks it up with `implements` instead of `extends`. Its methods are implicitly `public`, so the overrides in `Inter.java` must say `public` — dropping it is a weaker-access compile error.
- Choose an abstract class when the subclasses share state or partly-written behaviour, and an interface when only the contract is shared. A class extends one class but may implement any number of interfaces, which is how Java gets multiple inheritance of type.
- `Abs.java` and `Inter.java` both declare `Car`, `FuelCar`, and `ElectricCar`, so they live in separate folders and are compiled from their own folder. Together in one folder they would be a duplicate-class error.
- Polymorphism is one reference type behaving as several. `A a = new B()` compiles against `A` but dispatches at runtime to `B`, so `a.getX()` prints `20` — the object decides, not the reference.
- Only instance methods are polymorphic. Fields are resolved from the reference type, so the commented-out `a.x` in `Poly.java` would print `10` even though the object is a `B` — that is shadowing, not overriding.
- `static`, `private`, and `final` methods cannot be overridden — `static` belongs to the class, `private` is invisible to the subclass, and `final` forbids it. A `final` class cannot be extended at all.
- Autoboxing is the compiler converting a primitive to its wrapper (`int` → `Integer`) and unboxing is the way back. It happens in three places, listed at the bottom of `Auto.java`: assignments, method calls, and arithmetic — `int sum = a + b` with two `Integer` operands unboxes both, adds, and leaves a primitive.
- Unboxing `null` throws a `NullPointerException`, which is the case `Auto.java` leaves uncommented. `Integer x = null; int y = x;` compiles cleanly and fails at run time, because the generated call is `x.intValue()` on a null reference.
- `==` on wrappers compares references, not values. `Demo.java` uses `200`, which is outside the `Integer` cache, so `a == b` is `false` while `a.intValue() == b.intValue()` and `a.equals(b)` are both `true`. Values from `-128` to `127` come from a shared cache and would compare `true` with `==` — a difference that is exactly why `equals()` is the right tool.
- `new Integer(20)` is deprecated since JDK 9 and removed in JDK 16. `Integer.valueOf(20)` is the replacement, and it is what a plain `Integer a = 20;` compiles to.
- An abstract class can do everything a normal class can except be instantiated. `Animal` in `Demo2.java` has a constructor, a field, an abstract `makesound()`, and a concrete `sleep()`; `Dog` calls that constructor with `super(name)`.
- The abstract-class questions answered in `Demo2.java`: it can have constructors, `static` members, `private` methods, and `final` methods, and it may declare no abstract method at all. It cannot be `final` — `abstract` needs a subclass and `final` forbids one, so the two together are a compile error.
- An abstract class has a constructor even though no object of it is ever made. The constructor runs as part of building the subclass object, which is why `super(name)` in `Dog` is what sets `Animal.name`.
- `Pojos.java` is an empty placeholder, the same as `Package-16/Pack.java` — `javac` accepts it and produces no `.class`.
- Java has four kinds of nested class, one folder each under `21-Nested-Class/`: static nested, inner, local, and anonymous. The split that matters is `static` or not — a static nested class is just a class that happens to live inside another, while an inner class carries a hidden reference to the object that created it.
- A static nested class needs no enclosing instance: `new Outer.Inner(outer)`. That is why `Inner.fun()` in `Nested.java` reads the `static` field `x` straight but has to be handed an `Outer` to read the instance field `y` — the commented note on that line is the compile error you get without it.
- An inner class needs an instance to be created from: `outer.new Inner()`, or `new Outer().new Inner()` in one go. Plain `new Outer.Inner()` does not compile, which is the commented-out line at the top of `Inner.java`.
- An inner class reaches a shadowed outer field with `Outer.this.x`. `Inner.java` declares its own `x`, so the plain name means the inner one and the qualified form is the only way to the outer.
- `static` members inside an inner class need JDK 16 or newer. `Inner.java` declares `static int x` and `static void fun2()`, so it will not compile on JDK 15 or earlier, where an inner class could hold only `static final` constants.
- A local class is declared inside a method, constructor, initializer, `if`, or loop, and is visible only there. It may use a local variable of the enclosing method only if that variable is effectively final — uncommenting `y++` in `Local.java` breaks `sayHello()`, because the capture is a copy taken at creation time.
- An anonymous class declares and instantiates a subclass in one expression: `new Person() { ... }`. The superclass needs an accessible constructor, which is why `Person` writes one out. Extra members can be added, as `Anon.java` does with `name` and `greet()`, but they are reachable only from inside — `p2` is typed `Person`, so only overridden methods can be called through it.
- An anonymous class of an interface with one abstract method can be written as a lambda instead. `Person` is a class, not an interface, so `Anon.java` keeps the full form.
- Every nested class compiles to its own file with a mangled name — `Outer$Inner.class` for a named one, `Outer$1Local.class` for a local class, and `Anon$1.class` for an anonymous one. The number is assigned in the order they appear.
- The four folders under `22-Types-of-input/` are named for the four sources input can come from, but every example so far reads from the console — `File-Input/`, `Memory-Input/`, and `Network-Input/` hold `System.in` variants, not a file, an in-memory buffer, or a socket. The folder names are the plan; the files are the console versions of each API.
- `System.out` and `System.err` are both `PrintStream` fields of `System`. They are separate streams, so `err` can be redirected away from `out` — that is the point of sending the invalid-age message to `err` in `Console.java`.
- `System.in.read()` reads one byte and returns it as an `int`, or `-1` at end of stream. That is why `Input.java` casts to `char` to print `A` instead of `65`, and why the `int` return type cannot be `char` — there would be no room for the `-1`.
- Reading from `System.in` throws a checked `IOException`, so every example that touches it either catches it or, as here, declares `throws IOException` on `main`.
- `BufferedReader` reads a whole line, `InputStreamReader` turns bytes into characters, and `System.in` supplies the bytes — the three wrap in that order, which is the path spelled out in the comment at the bottom of `Demo3.java`.
- `Scanner.nextInt()` leaves the newline in the buffer, so the `nextLine()` right after it in `Demo4.java` returns an empty string rather than the next line. The fix is an extra `nextLine()` to consume the leftover, or reading the number with `nextLine()` and parsing it.
- `final` on the class and `final` on every field is not enough for immutability. `Demo.java` has both and still lets `s1.getCollege().name = "IIT B"` through, because `final` freezes the reference, not the object it points at — the `College` behind it is still mutable.
- A defensive copy is the fix, and it is needed in two places: in the constructor, so the caller's `College` and the field stop being the same object, and in the getter, so the returned one is a copy too. `Demo2.java` does both, which is why the same edit leaves it printing `IIT G`.
- Primitive and `String` fields need no copy — a primitive is copied by value and `String` is already immutable. Only mutable reference fields like `College` do.
- Every class extends `Object` whether or not it says so, which is why `toString()`, `equals()`, `hashCode()`, `getClass()`, and `clone()` are available on anything. `Demo.java` writes `extends Object` out to make that explicit.
- `equals()` and `hashCode()` must be overridden together. Two objects that are `equal` have to return the same hash, or they break every hash-based collection — `Objects.hash(name, age)` in `Demo.java` uses the same fields the `equals()` above it compares, which is the rule.
- `Student.equals()` compares names with `==`, which happens to work here only because both are the same interned literal `"Aditya"`. Two `String`s built at run time would fail that check — `name.equals(s.name)`, or `Objects.equals` to survive `null`, is the correct form.
- `clone()` needs the class to implement `Cloneable` or `super.clone()` throws `CloneNotSupportedException`. It gives a shallow copy: reference fields are shared with the original, which is the same trap the defensive copies in `23-Immutable-class/` work around.
- `instanceof` is true for the class and any subclass, so `d instanceof Animal` is true for a `Dog`, while `a instanceof Dog` is false for a plain `Animal` — inheritance runs one way, the same as in `17-Inheritance/`.
- An enum is a fixed set of constants that is also a real type. The `public static final int` version in `Demo.java` compiles just as well but has no type safety — any `int` fits the variable, `Role.ADMIN` and `Role.MANAGER` are both `2` with nothing to catch it, and comparing a status with `==` against a `String` literal is fragile.
- An enum constant can carry data. `Direction` in `Demo3.java` declares `private int degree`, a constructor, and a getter, and each constant passes its value in the declaration — `NORTH(0)`. The constructor is implicitly private and runs once per constant.
- An enum can declare an `abstract` method that every constant implements in its own body, as `move()` does in `Demo4.java`. That gives per-constant behaviour without a `switch`.
- Every enum gets `values()`, `valueOf(String)`, `name()`, and `ordinal()` for free, all used in `Demo5.java`. `name()` always returns the declared constant name, while `toString()` can be overridden — which is exactly why `equals()` on an enum should never be replaced and `==` is safe.
- The five files in `25-Java-Enum/` share class names — three of them declare `enum Direction`, and `Demo.java` and `Demo2.java` both declare `PaymentStatus`. Compile them one at a time, the same rule as `17-Inheritance/4-Super/`.
- A field in an interface is implicitly `public static final`, so `PI_VALUE` in `Demo2.java` is a constant reached as `MathConstant.PI_VALUE` without any implementing object. There is no such thing as an interface instance field.
- A class may implement any number of interfaces, which is how Java gets multiple inheritance of type without the ambiguity of multiple `extends`. `C implements A, B` in `Demo3.java` simply owes both `fun()` and `fun2()`.
- One interface extends another with `extends`, not `implements` — `interface Dog extends Animal` in `Demo4.java`. A class picking up `Dog` then owes both `bark()` and the inherited `eat()`.
- Since Java 8 an interface may carry `default` and `static` methods, and since Java 9 `private` ones. `Demo5.java` has all three: `drive()` is inherited by `Car` unchanged, `accelerate()` is a private helper the default method calls, and `brake()` is `static` — reachable only as `Vehicle.brake()`, never through an instance, which is why the `v.brake()` line stays commented out.
- `default` methods exist so an interface can gain a method without breaking every class that already implements it. That is why `List` and the rest of the JDK collections could add methods in Java 8.
- The diamond problem comes back with `default` methods: `D implements B, C` in `Demo6.java` inherits two `fun()` bodies with equal claim. Java refuses to pick, so the class must override — that override is required, not optional, and `B.super.fun()` is how it would call one of them explicitly.
- When a superclass method and an interface `default` method collide, the class wins. `Demo7.java` is that rule — even with `C.fun()` deleted, `B.fun()` would beat `A.fun()`, because a concrete class method always outranks a default.
- String literals live in the string pool and identical ones are the same object, so `s1 == s2` is `true` in `27-String/Demo.java`. `new String("Aditya")` forces a fresh object on the heap, so `s3 == s4` is `false` — `equals()` is what compares the text.
- Concatenation of two literals is folded by the compiler, so `"Ja" + "va"` is already `"Java"` at compile time and lands in the pool. Concatenating a variable is a run-time operation that builds a new heap object, which is why `s4 == s5` is `false` in `Demo2.java`.
- Reassigning a `String` never changes it. `s8 = "World"` points the variable at a different pooled object and leaves `"Hello"` untouched — immutability is the whole reason the pool can be shared safely in the first place.
- `s += i` in a loop creates a new `String` every pass, so `Demo3.java` builds and throws away five objects to produce `"01234"`. `StringBuilder` is the fix, and it is what the compiler already uses for a single concatenation expression.
- The files in `26-Interfaces/` reuse the names `A`, `B`, and `C` across `Demo3.java`, `Demo6.java`, and `Demo7.java`, and `27-String/` has a `Demo.java` beside `12-Strings/`. Compile each file from its own folder, one at a time.
- A `String` can be built from another `String`, a `char[]`, a `byte[]`, or a `StringBuilder`/`StringBuffer`, with an offset-and-count form for the two arrays — `new String(arr, 0, 6)` in `27-String2/Demo.java` takes the first six characters, and `new String(arr2, 0, 2)` turns bytes `97, 98` into `"ab"`.
- The array constructors copy. Editing `arr` after `new String(arr)` leaves the string alone, which is what keeps `String` immutable even when it is built from something mutable.
- `equals()` compares text and `==` compares references, so `equals()` is the one to use on strings. `compareTo()` is the third option and returns a number, not a boolean — negative, zero, or positive for dictionary order, which is what sorting needs.
- `isEmpty()` is length zero; `isBlank()` (Java 11) is also true for whitespace only. The same split appears in `trim()` versus `strip()` — `strip()` is the Unicode-aware one and is the better default on modern JDKs.
- `replace()` takes literal text but `replaceAll()` takes a regular expression, so `replaceAll(".", "x")` replaces every character rather than the dots. `split()` is regex too.
- `substring(begin, end)` includes `begin` and excludes `end`, the same half-open convention the rest of the JDK uses.
- `String.format("Hello %s, your age is %s", name, age)` is the readable alternative to a chain of `+`, and `Demo2.java` prints both to compare them. `%s` works for any type, since it calls `toString()`.
- `intern()` returns the pooled copy of a string, so `s5.intern() == "Hello"` is true even when `s5` came from `new String("Hello")` — it is the manual way into the pool that literals get for free.
- A `StringBuilder` is a mutable string: `append()`, `insert()`, `delete()`, `replace()`, `reverse()`, and `setCharAt()` all change it in place instead of returning a new object, which is what makes it the fix for the loop in `27-String/Demo3.java`.
- A `StringBuilder` starts with capacity 16 and grows to `2 * old + 2` when it overflows, so 17 characters of content leaves capacity at 34 in `Demo3.java`. `trimToSize()` shrinks it back to 17, and `ensureCapacity()` reserves room up front to skip the regrowth.
- `StringBuilder` and `StringBuffer` have the same API; `StringBuffer` is synchronized and slower, so `StringBuilder` is the default unless the object is genuinely shared across threads.
- Strings are spread across three folders, in the order they were learned: `12-Strings/` declares one, `27-String/` covers the pool and immutability, and `27-String2/` covers the API. `27-String2/` also repeats the `Demo`/`Demo2`/`Demo3` file names, so compile from the folder you mean.
- Upcasting to `Object` is automatic and always safe, because every class is an `Object`. Downcasting back is the caller's promise, and the compiler accepts it on the reference type alone — which is why `(String) obj3` in `28-Generics/Demo.java` compiles even though `obj3` holds an `Integer`, and fails at run time with a `ClassCastException`.
- That is the problem generics solve. The `Object`-based `Box` in `Demo2.java` accepts anything, but the type is gone by the time you read it back, so `(String) b1.getValue()` on a `Box` holding `10` is a run-time crash the compiler could not see.
- `Box<T>` in `Demo3.java` moves the same mistake to compile time. `T` is a type parameter in the declaration and `Box<Integer>` supplies a type argument, so `getValue()` returns an `Integer` and no cast is needed — `b1.getValue() + 5` just works.
- The diamond `new Box<>(10)` lets the compiler infer the argument from the variable's type, so it does not have to be written twice.
- A class can take several type parameters — `Pair<T, U>` in `Demo4.java`. The letters are convention only: `T` for type, `E` for element, `K`/`V` for key and value, `U` for a second one.
- A method can be generic on its own, independent of its class. The parameter goes before the return type: `public static <T> T getResult(T x)`. The caller never writes the type — `printPair(11, 23)` in `Demo5.java` infers it from the arguments.
- An upper bound restricts what `T` may be. `Box<T extends Number>` in `Demo6.java` guarantees a `Number`, which is what makes `value.doubleValue()` legal inside the class — without the bound, `T` is only known to be an `Object`.
- Several bounds are joined with `&`, as in `Box<T extends Animal & Swimmable>` in `Demo7.java`. At most one may be a class and it has to come first; the rest are interfaces. `Fish` satisfies both, `Dog` does not, so `Box<Dog>` would not compile.
- `extends` is used for both class and interface bounds — there is no `implements` in a type parameter, whatever the bound actually is.
- Generics are compile-time only. The compiler erases them and inserts the casts itself, so `Box<Integer>` and `Box<String>` are the same class at run time — which is why a type parameter cannot be a primitive (`Box<int>` does not compile; `Box<Integer>` and autoboxing are the way).
- Generics are invariant: a `Dog` is an `Animal`, but `List<Dog>` is not a `List<Animal>`. The commented-out assignment at the top of `29-WildCards/Demo.java` is the one the compiler rejects, and rejecting it is what stops a `Cat` from being added through an `Animal` reference to a list of dogs.
- Arrays are covariant instead, so `Animal[] animals = dogs` compiles. That hole is checked at run time rather than compile time: `animals[4] = new Animal()` in `Demo.java` throws an `ArrayStoreException`, because the object behind the reference is still a `Dog[]`. Generics chose the compile error over the run-time one.
- `List<?>` means a list of some unknown type. You can read from it as `Object` and check `getClass()`, but nothing can be added except `null` — the compiler cannot know what the element type is, so no value is provably safe. That is why `values.add(new Dog())` stays commented out in `Demo2.java`.
- `List<? extends Animal>` accepts a `List<Dog>`, a `List<Cat>`, or a `List<Animal>`, and every element is known to be at least an `Animal`, so reading is safe. Adding is still barred — the list might really be a `List<Cat>`, and a `Dog` would not belong in it. Read from it, do not write to it.
- `List<? super Animal>` goes the other way: the list holds `Animal` or something above it, so any `Animal` or subclass can be added — `Demo4.java` adds an `Animal`, a `Dog`, a `Cat`, and a `Labrador`. Reading gives back only `Object`, since the actual element type could be as wide as `Object`.
- That pair is the PECS rule: **P**roducer **E**xtends, **C**onsumer **S**uper. If the parameter supplies values to you, bound it with `extends`; if it receives values from you, bound it with `super`.
- A bound sits on the wildcard, not on the variable: `List<? extends Animal>` is a parameter type, and `List<Integer>` will not match it — the commented-out line in `Demo3.java` marks that case.
- `<T>` and `<?>` are not interchangeable. `T` is a name, so it can be reused to tie several places together — `fun(T a, T b)` in `Demo5.java` forces both arguments to the same type. `?` has no name, so it can say "some type" once and nothing more; use `T` when the type must be referred to again, `?` when it need not be.
- `Demo.java` through `Demo4.java` in `29-WildCards/` each redeclare `Animal`, `Dog`, and `Cat`, so compile them one at a time from the folder, the same as `17-Inheritance/4-Super/` and `25-Java-Enum/`.
- `Iterable` is the top of the collections hierarchy and its whole job is one method, `iterator()`. `Collection` extends it, `List` and `Set` extend `Collection`, and `Map` sits outside — a `Map` is not a `Collection`, which is why it is iterated through `keySet()`, `values()`, or `entrySet()`.
- The enhanced `for` loop is sugar for an `Iterator`. Anything that implements `Iterable` works in it, which is why `for (String name : container)` runs in `Demo2.java` without the loop knowing that `NameContainer` is backed by an array.
- An `Iterator` is a one-way, one-use cursor: `hasNext()` asks, `next()` returns and advances. Getting a second one means calling `iterator()` again.
- Collection iterators are fail-fast. Changing the collection through the collection itself while an iterator is open throws a `ConcurrentModificationException` on the next `next()` — that is what `30-Iterable-Interface/Demo3.java` demonstrates. `Iterator.remove()` is the supported way to remove during a walk.
- `list.remove(3)` and `list.remove(Integer.valueOf(3))` are different methods. The `int` version removes by index and the `Object` version removes by value, so an unboxed `int` silently picks the index overload — the trap `Demo3.java` walks into before it throws.
- `Collection` is the shared contract: `add`, `remove`, `contains`, `size`, `isEmpty`, `clear`, `iterator`, `toArray`, and the bulk `addAll` / `removeAll` / `retainAll` / `containsAll`. `retainAll` is the intersection — it keeps only what the argument also holds.
- `contains()` and `remove(Object)` are decided by `equals()`, which is why `24-Important-class-in-java/` overrides `equals()` and `hashCode()` together. A class with neither is found only by identity.
- `toArray()` has two forms. The no-argument one returns `Object[]`; passing a typed empty array, `toArray(new Integer[0])`, gives back an `Integer[]` — the argument is there to carry the type, not the size.
- `List` is the ordered, index-addressed `Collection`, and everything it adds is about position: `get`, `set`, `add(index, e)`, `addAll(index, c)`, `indexOf`, `lastIndexOf`, and `subList`. Duplicates are allowed.
- `ListIterator` is the two-way version, and `list.listIterator(3)` starts it at index 3 so `hasPrevious()` / `previous()` can walk back. It can also `set` and `add` during the walk, which a plain `Iterator` cannot.
- `List.of(...)` and `List.copyOf(...)` return **immutable** lists. Any `add`, `set`, or `remove` on one throws `UnsupportedOperationException` — including the `l2.add(7)` left live at the end of `32-Java-List-Interface/Demo.java`. Wrap in `new ArrayList<>(...)` to get a modifiable copy.
- A `Set` holds no duplicates and a `HashSet` keeps no order; `add` returns `false` when the element is already there. Membership is decided by `hashCode()` first and `equals()` second, so both must be overridden for a custom class to behave in one.
- A `Map` stores key-value pairs with unique keys — `put` on an existing key replaces the value and returns the old one. Values may repeat freely, which is why `101` and `103` can both map to `"Aditya"` in `33-Java-Set-Map-Interface/Demo.java`.
- `map.get(key)` returns `null` for a missing key rather than throwing, so `containsKey()` is the way to tell "absent" from "present but null". `getOrDefault()` covers the common case in one call.
- The three `Set` implementations differ only in order: `HashSet` keeps none, `LinkedHashSet` keeps insertion order, and `TreeSet` keeps sorted order. `HashMap`, `LinkedHashMap`, and `TreeMap` are the same three choices for keys.
- Initial capacity and load factor are the two tuning knobs on the hash-based ones. `new LinkedHashSet<>(100, 0.8f)` sizes the table at 100 and rehashes when it is 80% full — the default is 16 and `0.75f`. Both are performance settings only; behaviour is identical either way.
- A `TreeSet` is a red-black tree, so `first()`, `last()`, `add()`, and `contains()` are all O(log n) rather than the O(1) a `HashSet` averages. That cost buys the ordering methods.
- The range methods split into two families. `SortedSet` gives `headSet`, `tailSet`, and `subSet`, where the lower bound is inclusive and the upper is exclusive by default; `NavigableSet` adds the explicit forms — `headSet(80, true)` — plus `lower`, `floor`, `higher`, `ceiling`, `pollFirst`, `pollLast`, and `descendingSet`.
- `floor` and `ceiling` include the element itself while `lower` and `higher` are strict, which is the only difference between the two pairs.
- `put()` always overwrites and returns the old value, or `null` if the key was new. `putIfAbsent()` leaves an existing value alone and returns it — the pair is spelled out at the bottom of `34-Set-and-Map-Method/Demo3.java`.
- A `Map` is viewed as a collection three ways: `keySet()` for the keys, `values()` for the values, and `entrySet()` for the pairs. `entrySet()` is the one to loop over when both halves are needed, since it avoids a `get()` per key.
- `Map.of(...)` is immutable in the same way `List.of(...)` is, so the `map2.put(103, "Rohan")` at the end of `Demo3.java` throws `UnsupportedOperationException`. It is also capped at 10 pairs — `Map.ofEntries()` is the unlimited form.
- Every `Queue` method comes in two flavours: `add`, `element`, and `remove` throw on failure, while `offer`, `peek`, and `poll` return `false` or `null` instead. The returning half is the right default; the throwing half is only for when an empty queue is genuinely a bug.
- `35-Java-Queue-Interface/Demo.java` leaves the `queue.remove()` line live on an empty `ArrayDeque`, which throws `NoSuchElementException` — the exact difference from `poll()` on the line below it.
- A `PriorityQueue` is a binary heap, not a FIFO queue. It orders by natural ordering, so a `PriorityQueue<Integer>` is a min-heap; passing a comparator flips it, which is what `(a, b) -> b - a` does in `Demo2.java`. Only `peek()` and `poll()` see that order — iterating the queue does not.
- `Comparable` puts the ordering inside the class as `compareTo()`, which is what `Collections.sort()`, `TreeSet`, and `TreeMap` use when no comparator is given. It returns a negative number, zero, or a positive number, not a boolean.
- `this.marks - other.marks` is the short form and it is fine for small numbers, but subtraction overflows for large ones. `Integer.compare(a, b)` is the safe version, and chaining a second field after a tie — marks, then name — is what makes the order total.
- A `TreeSet` and `TreeMap` decide duplicates with `compareTo()`, not `equals()`. Two students with the same marks *and* name would collapse into one entry in `36-.../Demo2.java` however different their other fields were, which is why the comparison must agree with `equals()`.
- `Comparator` is the ordering kept outside the class, so several can exist at once — sort by name, by roll number, or by marks. `37-.../Demo.java` writes the same one three ways: a named class, an anonymous class, then a lambda.
- A lambda is shorthand for an instance of a functional interface — an interface with exactly one abstract method. `Comparator` qualifies, and so does the hand-written `Calculate` in `Demo2.java`, which is why `(a, b) -> a + b` is a legal value for it. The parameter types are inferred from that single method.
- The two files in `36-Comparable-Interface-In-Java/` and `37-.../Demo.java` each declare their own `Student`, so compile them one at a time from their own folder.
- `interview-questions/` holds written answers rather than runnable code, one Markdown file per topic. The first covers why a file may hold only one `public` class and why its name must match the file, including how `javac` and the JVM apply that rule at their own level.
