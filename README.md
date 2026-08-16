# JAVA

Java practice programs — notes and examples written while learning the language.

## Contents

| Folder | File | Topic |
| --- | --- | --- |
| `java-1st-program/` | `Demo.java` | First program — printing to console with `System.out.println` |
| `Vaiables/` | `Var.java` | Primitive data types — `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| `Diff-number-sys-rep/` | `Diff_reprsentaion.java` | Number system literals — binary (`0b`), octal (`0`), hexadecimal (`0X`), underscore separators, scientific notation |

## Requirements

- JDK 8 or newer (`java -version` to check)

## How to run

Compile and run any program from its folder:

```bash
cd java-1st-program
javac Demo.java
java Demo
```

```bash
cd Vaiables
javac Var.java
java Var
```

With JDK 11+ a single-file program can be run directly, without compiling first:

```bash
java Var.java
```

## Notes

Compiled `.class` files are build output and are excluded from the repository via `.gitignore`.
