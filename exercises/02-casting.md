# Exercise 9 — Casting, Rounding & Overflow Lab

## Part A — Casting predictions

Predict first. Then run.

| # | Expression | Predicted | Actual |
|---|---|---|---|
| 1 | `(int) 9.99` | | |
| 2 | `(int) -9.99` | | |
| 3 | `Math.round(9.5)` | | |
| 4 | `Math.round(9.4)` | | |
| 5 | `Math.round(-9.5)` | | |
| 6 | `(double) 7 / 2` | | |
| 7 | `(double) (7 / 2)` | | |
| 8 | `Math.round(3.14159 * 100) / 100.0` | | |

**#6 and #7 look almost identical and give different answers. Explain the difference precisely.**

[your answer]

---

## Part B — The overflow lab

Run this:

```java
int max = Integer.MAX_VALUE;
System.out.println("Max int:      " + max);
System.out.println("Max + 1:      " + (max + 1));
System.out.println("Max + 2:      " + (max + 2));

int min = Integer.MIN_VALUE;
System.out.println("Min int:      " + min);
System.out.println("Min - 1:      " + (min - 1));
```

**1. What is `Integer.MAX_VALUE`?**

It is a constant in Java that represents the maximum positive integer value that can be stored in an integer, (2^31 - 1).

**2. What happened when you added 1 to it? Was there an error message?**

The value became the negative of the maximum value, which is the minimum value. There was no error, its just reset to the minimum value.

**3. Why is silently wrapping around more dangerous than crashing with an error?**

Because when you gte an error, you knwo to fix something. Since tehre's no error here, you may think the program is running fine, but so amny calculations are incorrect that would require looking through the whole code to find out the issue and debug it.

**4. In 2014 a very popular music video broke YouTube's view counter. Based on this lab, what do you think happened?**

The view maximum was exceeded, and either reset itself mack to the minimum value, or the platform had to increase its maximim value available.

**5. Name one thing your project might count that could get large. Would `int` be enough?**

Certain tailored prescriptions, but that's usually only 3-5 numbers/decimals, so I think 'int' should be more than enough.

---

## Part C — Floating point

Run this:

```java
System.out.println(0.1 + 0.2);
System.out.println(0.1 + 0.2 == 0.3);
```

**1. What did you expect? What did you get?**

I expected the first line to print "0.3" and the second line to print an error. Instead, the first line printed 0.3000000000004 and the second line printed false.

**2. Given this, why do you think real banking software stores money as a whole number of *cents* instead of a `double` number of dollars?**

Maybe because doubles are also not so accurate. Doubles round, just like here, where it would've ignored the .0000004 after the .3, so maybe it's to be as exact as possible and that's why they do it.

**3. If you can't use `==` to compare two doubles, what could you do instead? Write a line of code.**

You can use the absolute and most accurate math function: 

boolean equal = Math.abs((0.1 + 0.2) - 0.3) < 1-9; 
//  I remember learning this trick in my coding class in 9th grade
