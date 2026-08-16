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
