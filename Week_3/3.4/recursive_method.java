Consider the following method:

/** @param x an integer such that x >= 0
*/
public void generate(int x)
{
    System.out.print(x % 10);
    if ((x / 10) != 0) {
        generate(x / 10);
    }
    System.out.print(x % 10);
}

What is printed when generate(123) is called?


generate(123) Pt.1 print(x%10) == print (123%10) == print(3)

//Remember % finds the remainder. 10 fits in 123 12 times, leaving 3.

generate(123) Pt.2 (123/10 != 0) == (12 != 0) == true

/*executes the recursive call for generate(x/10). Remember that well go back to this
flow once the recursion stops calling (i.e. it terminates). */

generate(12) Pt.1 print(12%10) == print(2)

generate(12) Pt.2 (12/10 != 0) == (1 != 0) == true

//executes generate(12/10)

generate(1) Pt.1 print(1%10) == print(1)

generate(1) Pt.2 (1/10 != 0) == (0 != 0) == false

//doesn’t execute generate(1/10), therefore we continue the rest of the code

generate(1) Pt.3 print(1%10) == print(1)

//finishes this recursive call, goes back to the previous one since it stopped midway

generate(12) Pt.3 print(12%10) == print(2)

generate(123) Pt.3 print(123%10) == print(3)

Returns 321123 if you read out all the prints in order.
