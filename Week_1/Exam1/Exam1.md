GRADED TEST

More on operators
0.0/4.0 points (graded)

1. We want to check in Java whether the value of an integer variable x is not between integers 10 and 50, including both (i.e. we want to check if the value of x is not 10, 11, 12, ... 48, 49, 50).

Be sure that you mark all the correct answers (Wrong answers subtract points):

A. 50 < x < 10
B. 50 =< x && x =< 10
C. 50 < x || !(x > 9) (ANSWER)
D. 51 ≤ x ≤ 9
E. 50 < x || x < 10 (ANSWER)
F. 50 ≤ x && x ≤ 10
G. 50 <= x || x <= 10
H. 51 <= x <= 9

Explanation:
<, <=, >, and >= are binary operators, where the operator goes between the operands. Moreover, ≤ is not an operator in Java, it has two symbols <=. To understand the other choices, bear in mind that && should read as and and || as or. It also helps to associate && with set intersection ∩, || with set union ∪, and ! with set complement.

Operators
0.0/1.0 point (graded)

2. Which of the operators in the dropdown menu should be placed in the IF statement of
the following code segment to get the value 10 printed on screen as result?

int n = 10;
if (n _____ 5 == 0) {
   System.out.println(n);
} else {
   System.out.println(n - 1);
}

A. +
B. -
C. *
D. /
E. % (ANSWER)
F. ==
G. !=
H. ++
I. --
J. >
K. >=

Explanation:
The condition in the IF statement must be met to get the value 10 printed on screen. Arithmetic operators +, -, * and / does not allow to obtain "0" using the value of "n" and the integer "5". Operator % (integer reminder or modulo operator) from the division between "n" and "5" is "0", meeting this way the condition in the IF statement. Increment and decrement operators (++, --) and relational operators >, >= do not make sense in this exercise.

Data Types
0.0/1.0 point (graded)

3. Given the following code segment:

int a = 4;
int b = 2;
int c = a/b;
String result = a+"/"+b+"="+c;
System.out.println (result);

Select the output displayed by the program when it is executed:

Be sure that you mark all the correct answers (Wrong answers subtract points):

A. Error, incompatible types
B. 4"/"2="2"
C. a/b=c
D. 4/2=2 (ANSWER)

Explanation:
The program outputs a String containing the division of two operands and its result, i.e.: 4 divided by 2. As the program has declared all integer variables, the output given is casted to integer, which in this case happens to be 2.

Boolean operators
0.0/5.0 points (graded)

4. Complete the following truth table dragging and dropping the values (true/false) for each of the expressions, considering the given values of p, q and r.

Be sure that you mark all the correct answers (otherwise you will get 0 points):

true
false

Explanation:
For (p && q) || r, all solutions where p or are false while r is also false return negative. Otherwise they return positive. !(p && (q || r)) follows a similar logic, except that the operan ! inverts the result.

Solution:
(p && q) || r	          !(p && (q || r))
  false	                      true
  true	                      true
  false	                      true
  true	                      true
  false	                      true
  true	                      false
  true	                      false
  true	                      false





Conditional
0.0/3.0 points (graded)

5. Consider the following distribution of grades in a certain high school.

Score (Integer) 	           Letter Grade
90 or above 	                     A
From 80 to 89 inclusive 	         B
From 70 to 79 inclusive 	         C
From 60 to 69 inclusive 	         D
Below 60 	                         F

Indicate if the following code segments assign the correct string to grade for a given integer score:

if (score >= 90) {
   grade = "A";
} else if (score >= 80) {
   grade = "B";
} else if (score >= 70) {
   grade = "C";
} else if (score >= 60) {
   grade = "D";    
} else {
   grade = "F";
}

Yes (ANSWER)
No

if (score >= 90) {
   grade = "A";
}
if (score >= 80 && score <= 89) {
   grade = "B";
}
if (score >= 70 && score <= 79) {
   grade = "C";
}
if (score >= 60 && score <= 69) {
   grade = "D";    
}
if (score < 60) {
   grade = "F";
}

Yes (ANSWER)
No

if (score >= 90) {
   grade = "A";
}
if (80 <= score <= 89) {
   grade = "B";
}
if (70 <= score <= 79) {
   grade = "C";
}
if (60 <= score <= 69) {
   grade = "D";
}
if (score < 60) {
   grade = "F";
}

Yes
No (ANSWER)

Printing
0.0/2.0 points (graded)

6. Given the following three Strings:

String a = "This is a String.";
String b = "This is another String.";
String c = "Another String this is.";

Write the result printed on screen of running the following Java code segment:
Be sure that you write the exact result printed on screen (Otherwise you will not get points):

if (b.length() > c.length()) {
   System.out.println(b);
} else if (c.length() > b.length()) {
   System.out.println(c);
} else {
   System.out.println(b.charAt(0) + "E" + c.charAt(0));
}

ANSWER = TEA

Explanation:
Lengths are equal. Thus, the first character of each String is concatenated with the character "E" in between.

Write the result printed on screen of running the following Java code segment:
Be sure that you write the exact result printed on screen (Otherwise you will not get points):

if (a.length() > b.length()) {
   System.out.println(a);
} else if (b.length() > a.length()) {
   System.out.println(b);
} else {
   System.out.println(a + b);
}

ANSWER = This is another String.

Explanation:
The length of b is greater than the length of a

More on Data Types
0.0/2.0 points (graded)

7. Given the following code segment:

int a = 5;
int b = 2;
String c = "52";
String result = a+"+"+b+"="+c;
System.out.println (result);


Select the output displayed by the program when it is executed:
Be sure that you mark all the correct answers (Wrong answers subtract points):

A. 5"+"2="7"
B. 5+2="c"
C. 5+2=52 (ANSWER)
D. 5+2="5+2"
E. 5+2=7

Explanation:
As we have seen in the course, the operand +, when applied to Strings, results in the concatenation of their characters. Thus, the program outputs a String containing the concatenation of two numbers, i.e.: "5" concat "2" is "52".

Programs
0.0/2.0 points (graded)

8. Which is the value of the variables q and r after running the following code segment?

int p = 1;
int q = 2;
int r = 3;
if (r > p + q) {
   r = 2 * p;
}
else if (r < p + q) {
   r = 2 * q;
}
else {
   q = 2 * r;
}

Enter the value of r: 3
Enter the value of q: 6

Explanation

The conditions r > p + q and r < p + q are not met and so the statements r = 2 * p; and r = 2 * q; are not executed. After these two conditions we find an ELSE statement in which q = 2 * r; is executed.
