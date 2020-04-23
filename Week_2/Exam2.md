1. For the given for loops, select the number of iterations that are performed (the number of times that the code within the loop is executed), assuming a and b two integers so that a <= b and both integers greater than or equal to zero (a >= 0 and b >= 0)

for (int i = a; i < b; i++):

A. b-a (ANSWER)
B. b-a+1
C. b
D. a
D. b-a+2

for (int i = a; i <= b; i++):

A. b-a
B. b-a+1 (ANSWER)
C. b
D. a
D. b-a+2

Explanation:
When programming a loop, you should always know how many times you want the loop to execute.
One of the most common errors is to forget to count the last value. If you want a loop to execute exactly 5 times you should use:

for (int i = 1; i <= 5; i++)
(OR)
for (int i = 0; i < 5; i++)

But never:
for (int i = 0; i <= 5; i++)

Because it is executed 6 times.

Arrays
2.0/3.0 points (graded)

2. Consider the following code segment:

int array[] = {81,13,10,34,23,234,8,33};
int value = array[0];
int value2 = value;
for (int element : array){
    if (element > value){
        value = element;
    }
    if (element < value2){
        value2 = element;
    }
}
System.out.println(value+" "+value2);

How many iterations does the loop perform for the given array? ANSWER: 8
Which are the values of the variables named value and value2 at the end of the loop?

value: 234
value2: 8

Explanation:
This code stores in value the maximum value of the array and in value2 the minimum value of the array.
At the beginning of the code, both value and value2 are set to the first element of the array, that is, value=value2= array[0] = 81

Within the loop, the variable element is set in each iteration to a value of the array. So, the first iteration element=81, the second element=13, the third element=10, and so on.

The number of iterations is equal to the number of elements on the array, that is, 8.

Each iteration element is first compared with value, and if element is greater than value, the code makes value = element. As the loop goes through all the elements in the array, at the end of the code, value = 234, that is the maximum value within the array.

The same happens with value2, but it will store the minimum value of the array, that is, value2 = 8

Representation of unsigned numbers
4.0/4.0 points (graded)

3. Given the following table of unsigned numbers, fill in the gaps.

Use 8 bits for the binary representation and uppercase for the hexadecimal representation. If your binary representation has less than 8 bits, please fill with 0. That is, if you have a 1010 in binary, answer with 00001010.

Decimal	              Binary	           Hexadecimal
  170	               10101010                AA

  207                11001111                CF


Explanation:
              Decimal	              Binary	                   Hexadecimal
                170	            170 = 128 + 32 + 8 + 2       170 = 10 * 16 + 10
                                170 = 10101010b                  170 = 0xAA

        0xCF = 12*16 + 15
    0xCF = 192 + 15 = 207
                                0xC = 12 = 1100b
                                0xF = 15 = 1111b
                                0xCF = 11001111b	                   CF

Representation of Programs
3.0/3.0 points (graded)

4. Select all the true statement/s.
Be sure that you mark all the correct answers (Wrong answers subtract points).


A. Java is portable. However, once you compile a Java source code into bytecodes, these are dependent on the platform.
B. Java is not portable. All its statements are dependent on the platform.
C. Both Java source code and bytecodes are portable. (ANSWER)

Explanation:
The Java source code is portable. We write it once and run it anywhere (WORA). But the bytecode is also portable since it is expected to run on any computer or device that has a Java Virtual Machine (JVM) installed. The JVM is the one responsible for translating the bytecode into something that is understandable by the computer or device.

Representation of signed numbers
1.0/2.0 points (graded)

5. We have only 5 bits for representing signed numbers in two's complement.

What is the highest signed integer? Write its decimal value (including the sign only if negative).
Answer: 15

What is the lowest signed integer? Write its decimal value (including the sign only if negative).
Answer: 16

Explanation:
If we have 5 bits to represent using 2's complement a number, the lowest signed integer that can be represented is -24 and the highest one is 24-1.

More on loops
5.0/6.0 points (graded)

6. Given a positive integer number, we want to know all its prime factors, i.e. the prime numbers that divide the given number.

For example, if the number is number = 5022004,
that is, number = 13* 13* 17 * 19* 23* 2*2 , we want to print out this output:

2 13 17 19 23

Another example: if the number is number = 2122848 , we want to print out this output:

2 3 7 13

First of all, we need to decide the algorithm and the type of loops to use.

We know that a number will have at least 2 factors: 1 and itself; other factors (if any) will be between these two numbers.
As we will not print the 1, we will check all the numbers between 2 and itself (including both).

Select the most suitable outer loop:

A. factor = 1
   while (factor <= number){
    ___________
    factor++;
}

B. for (int factor = 2; factor <= number; factor++) - ANSWER

C. for (int factor = 2; factor < number; factor++)

D. for (int factor = 1; factor <= number; factor++)

E. factor = 2
   while (factor < number){
    ___________
    factor++;
}


So, we have already decided the type of outer loop. Then, we need to check if the number is divisible by the factor. The operation number % factor returns a 0 if number is divisible by factor (its remainder is 0).

However, a number can be divisible several times by a factor. For example, 4 has as factors 2 and 1. The same factors also apply to 8 or 16. So, once a number is found to be divisible by a factor, we should divide the number by this factor until it is no longer a factor of the quotient. We need an inner loop (that goes inside the outer loop).

Select the code segment that can be used to implement the inner loop:
Be sure that you mark all the correct answers (Wrong answers subtract points):

A. while (number % factor != 0){
   number = number / factor;
}

B. while (number % factor == 0){
   number = number / factor;
}

C. while (number % factor == 0){
   factor = number / factor;
}

ANSWER is (B)


Finally, we want to print only once the found factor. Different solutions can be implemented here.
We will use a variable, count set to zero outside the outer loop.

Select all the possible correct solutions to this problem:
Be sure that you mark all the correct answers (Wrong answers subtract points):


A. Within the inner loop: we increment the variable (count++).
   Outside the inner loop but within the outer loop: we check the value of count.
   If it is different from 0 (if (count != 0)), we print the factor and we reset the variable to 0 (count= 0)


B. Within the inner loop: we increment the variable (count++).
   Outside the inner loop but within the outer loop: we check its value.
   If it is different from 1 (if (count != 1)), we print the factor and reset the variable to 0 (count= 0).


C. Within the inner loop: we set the variable to 1 (count=1).
   Outside the inner loop but within the outer loop: we check its value.
   If it is different from 1 (if (count != 1)), we print the factor. We reset the variable to 0 (count= 0) (outside the inner loop but within the outer loop).


D. Within the inner loop: we increment the variable (count++) and we check if its value
   is different from 1
   If it is different from 1 (if (count != 1)), we print the factor.
   Outside the inner loop but within the outer loop: we reset the variable to 0 (count= 0).


E. Within the inner loop: we increment the variable (count++) and we check if its value is 1.
   If its value is 1 (if (count == 1)), we print the factor.
   Outside the inner loop but within the outer loop: we reset the variable to 0 (count= 0).

ANSWER is (E)


Explanation:
One possible correct solution is we increment the variable within the inner loop. When we finish the inner loop, we check its value. If it is different from zero, we print the factor (outside the inner loop but within the outer loop) and set again the variable to 0:

int number = 13 * 13 * 17 * 19 * 23 * 2 * 2;
int count = 0;
for (int factor = 2; factor <= number; factor++){
    while (number % factor == 0){
        count ++;
        number = number /factor;
    }
    if (count != 0){
        System.out.println(factor + " ");
        count  = 0;
    }
}
Another possible solution is we increment the variable and check if its value is one within the inner loop. If so, we print the factor within the inner loop. When we finish the inner loop, we set again the variable to 0:

int number = 13* 13* 17 * 19* 23* 2*2;
int count = 0;
for (int factor = 2; factor <= number; factor++){
    while (number % factor == 0){
        count ++;
        number = number /factor;
        if (count == 1){
            System.out.println(factor + " ");
        }
    }
    count  = 0;
}
