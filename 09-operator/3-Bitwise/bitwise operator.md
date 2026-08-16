# Bitwise Operators in Java

Bitwise operators work on the individual **bits** of a number, not on its decimal value.
They only work with integer types: `byte`, `short`, `int`, `long`, `char`. (Not `float`/`double`.)

In Java an `int` is **32 bits** and stored in **two's complement** form (leftmost bit = sign bit).

---

## 1. All Bitwise Operators at a Glance

| Operator | Name | Type | Rule | Example (`a = 5`, `b = 3`) | Result |
|---|---|---|---|---|---|
| `&` | Bitwise AND | Binary | Result bit is `1` only if **both** bits are `1` | `5 & 3` | `1` |
| `\|` | Bitwise OR | Binary | Result bit is `1` if **at least one** bit is `1` | `5 \| 3` | `7` |
| `^` | Bitwise XOR | Binary | Result bit is `1` only if bits are **different** | `5 ^ 3` | `6` |
| `~` | Bitwise NOT / Complement | Unary | **Flips** every bit (`0`→`1`, `1`→`0`) | `~5` | `-6` |
| `<<` | Left Shift | Binary | Shifts bits **left**, fills right side with `0` | `5 << 1` | `10` |
| `>>` | Signed Right Shift | Binary | Shifts bits **right**, fills left side with the **sign bit** | `5 >> 1` | `2` |
| `>>>` | Unsigned Right Shift | Binary | Shifts bits **right**, always fills left side with `0` | `-8 >>> 28` | `15` |

---

## 2. Truth Table (bit level)

| Bit A | Bit B | `A & B` | `A \| B` | `A ^ B` | `~A` |
|---|---|---|---|---|---|
| 0 | 0 | 0 | 0 | 0 | 1 |
| 0 | 1 | 0 | 1 | 1 | 1 |
| 1 | 0 | 0 | 1 | 1 | 0 |
| 1 | 1 | 1 | 1 | 0 | 0 |

---

## 3. Worked Example — `a = 5`, `b = 3`

Binary (last 8 bits shown for clarity):

```
a = 5  ->  0000 0101
b = 3  ->  0000 0011
```

| Expression | Bit-by-bit Working | Binary Result | Decimal |
|---|---|---|---|
| `a & b` | `0101` AND `0011` | `0000 0001` | `1` |
| `a \| b` | `0101` OR `0011` | `0000 0111` | `7` |
| `a ^ b` | `0101` XOR `0011` | `0000 0110` | `6` |
| `~a` | flip all 32 bits of `5` | `1111 ... 1010` | `-6` |
| `a << 1` | shift left 1, add one `0` on right | `0000 1010` | `10` |
| `a << 2` | shift left 2 | `0001 0100` | `20` |
| `a >> 1` | shift right 1, drop last bit | `0000 0010` | `2` |
| `a >>> 1` | same as `>>` for positive numbers | `0000 0010` | `2` |

---

## 4. Shift Operators in Detail

| Operator | Direction | Fills With | Effect on Value | Works Like |
|---|---|---|---|---|
| `<<` | Left | `0` | Value gets **bigger** | `x * 2^k` |
| `>>` | Right | Copy of sign bit (`0` for +, `1` for −) | Value gets **smaller**, sign kept | `x / 2^k` (rounds toward −∞) |
| `>>>` | Right | Always `0` | Sign is **destroyed** — negatives become huge positives | unsigned division |

### `>>` vs `>>>` on a negative number

| Expression | Binary Result (32-bit) | Decimal |
|---|---|---|
| `-8` | `1111 1111 ... 1111 1000` | `-8` |
| `-8 >> 1` | `1111 1111 ... 1111 1100` | `-4` |
| `-8 >>> 1` | `0111 1111 ... 1111 1100` | `2147483644` |

> There is **no `<<<` operator** in Java. Left shift never needs a sign-safe version.

---

## 5. Compound Assignment Forms

| Operator | Meaning | Example | Same As |
|---|---|---|---|
| `&=` | AND and assign | `a &= b;` | `a = a & b;` |
| `\|=` | OR and assign | `a \|= b;` | `a = a \| b;` |
| `^=` | XOR and assign | `a ^= b;` | `a = a ^ b;` |
| `<<=` | Left shift and assign | `a <<= 2;` | `a = a << 2;` |
| `>>=` | Right shift and assign | `a >>= 2;` | `a = a >> 2;` |
| `>>>=` | Unsigned shift and assign | `a >>>= 2;` | `a = a >>> 2;` |

> `~` has **no** compound form, because it is a unary operator.

---

## 6. Important Rules to Remember

| Rule | Explanation |
|---|---|
| `~n == -(n + 1)` | Because of two's complement. `~5` → `-6`, `~0` → `-1` |
| `x ^ x == 0` | Any number XOR itself is `0` |
| `x ^ 0 == x` | XOR with `0` keeps the number unchanged |
| `x & 0 == 0` | AND with `0` always clears everything |
| `x \| 0 == x` | OR with `0` keeps the number unchanged |
| Shift count is masked | For `int`, only the low **5 bits** of the shift count are used → `x << 33` behaves like `x << 1`. For `long`, low **6 bits** are used. |
| Small types get promoted | `byte`, `short`, `char` are promoted to `int` before the operation, so the result is an `int` |
| `&` `\|` on `boolean` | Also legal, but then they are **logical** operators that do **not** short-circuit (unlike `&&` and `\|\|`) |

---

## 7. Operator Precedence (highest → lowest)

| Rank | Operators |
|---|---|
| 1 | `~` (unary) |
| 2 | `<<` `>>` `>>>` |
| 3 | `<` `>` `<=` `>=` |
| 4 | `==` `!=` |
| 5 | `&` |
| 6 | `^` |
| 7 | `\|` |
| 8 | `&&` |
| 9 | `\|\|` |

> `&`, `^`, `\|` have **lower** precedence than `==`.
> So `a & 1 == 1` is read as `a & (1 == 1)` and will not compile.
> Always write `(a & 1) == 1`.

---

## 8. Common Bit Tricks

| Goal | Code | Why It Works |
|---|---|---|
| Check if number is odd | `(n & 1) == 1` | Last bit is `1` only for odd numbers |
| Check if number is even | `(n & 1) == 0` | Last bit is `0` for even numbers |
| Multiply by 2 | `n << 1` | Shifting left once doubles the value |
| Divide by 2 | `n >> 1` | Shifting right once halves the value |
| Read the k-th bit | `(n >> k) & 1` | Move bit k to position 0, then mask it |
| Set the k-th bit to 1 | `n \| (1 << k)` | OR with a mask that has only bit k set |
| Clear the k-th bit to 0 | `n & ~(1 << k)` | AND with a mask that has only bit k cleared |
| Toggle the k-th bit | `n ^ (1 << k)` | XOR flips exactly that one bit |
| Swap two numbers without temp | `a ^= b; b ^= a; a ^= b;` | XOR cancels itself out |
| Check if power of 2 | `n > 0 && (n & (n - 1)) == 0` | A power of 2 has exactly one bit set |
| Find the lowest set bit | `n & -n` | Isolates the rightmost `1` bit |
| Count set bits | `Integer.bitCount(n)` | Built-in helper method |
| Print binary form | `Integer.toBinaryString(n)` | Built-in helper method |

---

## 9. Full Runnable Example

```java
public class Bitw {
    public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a & b   = " + (a & b));    // 1
        System.out.println("a | b   = " + (a | b));    // 7
        System.out.println("a ^ b   = " + (a ^ b));    // 6
        System.out.println("~a      = " + (~a));       // -6
        System.out.println("a << 1  = " + (a << 1));   // 10
        System.out.println("a >> 1  = " + (a >> 1));   // 2
        System.out.println("a >>> 1 = " + (a >>> 1));  // 2

        int n = -8;
        System.out.println("-8 >> 1  = " + (n >> 1));   // -4
        System.out.println("-8 >>> 1 = " + (n >>> 1));  // 2147483644

        System.out.println("binary of 5 = " + Integer.toBinaryString(5));
    }
}
```

Expected output:

```
a & b   = 1
a | b   = 7
a ^ b   = 6
~a      = -6
a << 1  = 10
a >> 1  = 2
a >>> 1 = 2
-8 >> 1  = -4
-8 >>> 1 = 2147483644
binary of 5 = 101
```
