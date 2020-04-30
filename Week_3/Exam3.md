1. Guessing the Return Value
0.0/2.0 points (graded)

Consider the following method:

int foo(int[] array, int num){
    int i = array.length - 1;
    while (i >= 0){
        if (array[i] > num){
            return i;
        }
        i--;
    }
    return i;
}
Assuming that we are calling the method with a non empty array.

What can we say about a call to this method that returns a -1?

A. The method does not work properly.
B. All values in the array are different from num.
C. All values in the array are greater than num
D. All values in the array are greater than or equal to num
E. All values in the array are less than or equal to num (ANSWER)
F. All values in the array are less than num

What can we say about a call to this method that returns a 12?

A. The method does not work properly.
B. All values in the array with indices from 13 to array.length-1 are different from num.
C. All values in the array with indices from 13 to array.length-1 are less than num
D. All values in the array with indices from 13 to array.length-1 are less than or equal to num (ANSWER)
E. All values in the array with indices from 13 to array.length-1 are greater than num
F. All values in the array with indices from 13 to array.length-1 are greater than or equal to num


Explanation:
The method explores the array from its end to its beginning searching for the first value that is greater than num.
For example, if we declare int array[] = {12, 13, 14, 1, 2, 3, 5}; and the call to the method is position = foo(array, 7);.
Within the method, int i = array.length -1 = 7 - 1= 6.
The loop will check if 6=i >= 0. If so, it will check if the position array[i] > num. As array[i] = array[6] = 5 is lower than 7, the method will decrement i.
This behaviour will continue until array[i] > num or when we finish checking the array, that is, when i == -1.
As turns out, array[2] = 14 is greater than 7. So, the method returns 2, the position of the last element greater than num.
If our array is int array[] = {2, 3, 4, 1, 2, 3, 5};, and the call to the method is position = foo(array, 7); the method will return a -1, telling us that there is no element greater than 7.



2. Finding the length of the longest block of sorted values
0.0/2.0 points (graded)


The method countSorted is intended to find the length of the longest consecutive block of sorted values in an array, where sorted means that the next element in the array is higher than or equal to the previous element in the array.

For example, if the array arr contains the values [25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13], the call countSorted(arr) should return 8, the length of the longest consecutive block of sorted numbers: 3, 3, 3, 5, 12, 12, 13, 13.

However, the method countSorted that you can see below does not work as intended.

Line  1: int countSorted(int[] array){
Line  2:     int count = 1;
Line  3:     int max = 1;
Line  4:     for (int k = 1; k < array.length; k++) {
Line  5:         if (array[k-1] <= array[k]) {
Line  6:             count++;
Line  7:         } else {
Line  8:             if (count > max) {
Line  9:                 max = count;
Line 10:             }
Line 11:             count = 1;
Line 12:         }
Line 13:     }
Line 14:     return max;
Line 15: }
Line 16: int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
Line 17: System.out.println(countSorted(arr));

Enter the value printed on screen by this code segment (Line 17):


Which of the following changes should be made in the code so that the method works as intended?

Be sure that you mark all the correct answers (Wrong answers subtract points):


A. It should return count instead of max
B. Before line 14, it should check if count is greater than max and, in that case, do max = count+1;
C. It should return max +1
D. Before line 14, it should check if count is greater than max and, in that case, do max = count;


3. Fill the gaps
0.0/7.0 points (graded)

Consider the following methods:

int foo(String x, int number, int[] array){
    number = array.length;
    x = x + "xAtfoo";
    for (int i=0; i < number; i++){
        array[i] = array[i] + x.length();
    }
    x = x + "Success";
    return x.length();
}
void bar(){
    String s = new String("Hello");
    int num = 6;
    int [] array = {1, 2, 3, 4};
    int result = 0;
    result = foo(s, num, array);
}

Assuming that we call the method bar(), fill the gaps with the values of the variables before and after the execution of result = foo(s, num, array);
