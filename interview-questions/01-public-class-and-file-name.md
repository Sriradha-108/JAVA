# Public class and file name

Two questions that always come together, because they have the same answer: the compiler needs a rule that turns a **type name into a file path** without searching.

---

## Q1. Why only one `public` class per file?

| | |
| --- | --- |
| **Short answer** | A `public` class is visible to every other package, so any file in the project may refer to it. The compiler has to find its source from the name alone. One `public` class per file makes that lookup a single, predictable file open instead of a scan of every `.java` file on the source path. |
| **Is it a language rule?** | Partly. JLS §7.6 makes it *optional* — a compiler may enforce it "if and only if the host system supports it". Because file systems do support it, `javac` enforces it. So it is a **compiler** restriction, not a JVM one. |
| **What is allowed** | Any number of **non-public** (package-private) classes in the same file. Only one may be `public`. This is exactly what `18-Abstraction/BasicAbs/Abs.java` does — `public class Abs` plus package-private `Car`, `FuelCar`, `ElectricCar`. |
| **What it buys you** | Compilation on demand. If `Poly.java` mentions `Student`, the compiler opens `Student.java` and nothing else. Without the rule it would have to parse every source file to discover where `Student` lives. |
| **The error** | `class Car is public, should be declared in a file named Car.java` |
| **Design side** | It also enforces the convention that the file name tells you the public API of that file. One outward-facing type, one file. |

---

## Q2. Why must the `public` class match the file name?

| | |
| --- | --- |
| **Short answer** | It completes the mapping. Fully-qualified name → file path: `college.Student` → `college/Student.java`. Name and folder both carry information, so the compiler can resolve a reference by building a path instead of searching. |
| **Package half** | The `package` statement must match the folder. `package college;` only compiles from a file inside `college/`. |
| **Class half** | The `public` class name must match the file's base name. Together the two rules make source location deterministic. |
| **Why only for `public`** | A package-private class is reachable only from inside its own package, which is a much smaller search space, so no naming rule is needed for it. |
| **The error** | `class Student is public, should be declared in a file named Student.java` |
| **Relaxed since JDK 11** | In single-file source mode (`java Poly.java`, JEP 330) the file name does **not** have to match — the launcher compiles in memory and runs the first top-level class with a `main`. The rule returns as soon as you use `javac`. |

---

## How the JVM deals with it

The key point for an interview: **the JVM never sees your `.java` file.** These two rules are `javac`'s. The JVM has its own, similar rule one level down.

| Stage | Unit | Rule that applies | Who enforces it |
| --- | --- | --- | --- |
| Compile time | `Abs.java` | One `public` class, name matches file | `javac` |
| Output | `Abs.class`, `Car.class`, `FuelCar.class`, `ElectricCar.class` | **One `.class` file per class**, public or not | `javac` |
| Run time | `Abs.class` | Binary name → file: `college.Student` → `college/Student.class` on the classpath | JVM class loader |

| | |
| --- | --- |
| **`.java` count vs `.class` count** | They do not match. One source file produces as many class files as it declares classes. `Abs.java` alone produces four — check the folder after `javac Abs.java`. |
| **How the JVM finds a class** | `ClassLoader.loadClass("college.Student")` replaces each `.` with `/`, appends `.class`, and looks for `college/Student.class` in each classpath entry. Same name-to-path trick as the compiler, applied to compiled output. |
| **Why the `.class` name must match** | The class file stores its own binary name in its `this_class` constant-pool entry. If the loader asks for `Student` and the bytes say something else, it throws `NoClassDefFoundError: ... (wrong name: ...)`. |
| **Loading is lazy** | Classes are loaded on first active use, not up front, which is why the name-to-path mapping has to be exact — there is no index to fall back on. |
| **Nested and anonymous classes** | They get mangled names on disk: `Outer$Inner.class`, `Outer$1.class` for an anonymous class. Still one file each. |
| **Entry point** | `java Abs` means "load the class named `Abs` and call its `public static void main(String[])`". The JVM is given a *class* name, never a file name — which is why `java Abs.class` fails. |

---

## One-line summary

> One public class per file, named after the file, is a **compiler** rule that makes `type name → source path` deterministic. The JVM enforces the matching rule one level down: `binary name → .class path`, one class file per class, loaded lazily by name.

---

## Related in this repo

| Where | What it shows |
| --- | --- |
| [`18-Abstraction/BasicAbs/Abs.java`](../18-Abstraction/BasicAbs/Abs.java) | One `public class Abs` next to three package-private classes — legal, and it compiles to four `.class` files |
| [`Package-16/college/Student.java`](../Package-16/college/Student.java) | `package college;` matching the folder, plus a non-public `Teacher` in the same file |
| [`Package-16/Pack2.java`](../Package-16/Pack2.java) | Two classes named `Student` told apart by package, since the simple name alone is not unique |
| [`17-Inheritance/4-Super/`](../17-Inheritance/4-Super/) | `Super.java` and `Super2.java` both declare `Student` in one folder — compile them one at a time or the shared `.class` files collide |
