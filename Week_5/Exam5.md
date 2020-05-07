1. Abstract classes
0.0/2.0 points (graded)
Given the following code where two classes are defined:

public abstract class Figure {
    public String name;

    public Figure (String n){
        name=n;
    }

    public String toString(){
        return name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();   

}
public class Circle extends Figure{
    private double radius;
    private final double PI=3.1415;

    public Circle (double r, String name){
       	super(name);
       	radius=r;
    }

    public String toString(){
        return "I'm a circle of radius "+radius;    	
    }

    public double calculateArea(){
       	return PI*radius*radius;
    }

    public double getPerimeter(){
       	return 2*PI*radius;
    }
}

Select which sentences are correct
Be sure that you mark all the correct answers (Wrong answers subtract points).


A. This code will compile, but will give an error during execution if the method calculatePerimeter() is called from another class
B. This code will not compile
C. The class Figure cannot be instantiated, as it is an abstract class
D. Circle does not need to implement the method calculatePerimeter() as it already has a getPerimeter() method
E. The class Circle is a subclass of Figure, and thus all the methods in Figure are automatically implemented in Circle
F. The class Circle cannot be instantiated, as it inherits from an abstract class
unanswered

Imagine that the class Secretary extends the abstract class Employee. Select which statements are correct to create an instance of the Secretary class.

Be sure that you mark all the correct answers (Wrong answers subtract points).


A. Secretary secretary=new Employee();
B. Secretary secretary=new Secretary();
C. Employee secretary=new Secretary();
D. Employee secretary=(Secretary)(new Employee());

2. Class Integer: Max value and Min value
0.0/1.0 point (graded)
Given the following code:


public class HelloInteger{
    public static void main(String []args){
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
    }
}
Enter the number printed on screen by this program:

3. The correct statement
0.0/2.0 points (graded)
For each of the following sets of statements, choose the correct one.

1)

A. An abstract class does not contain non-abstract methods (except for static methods).
B. Both abstract classes and interfaces require a constructor method to be implemented.
C. An interface does not contain non-abstract methods (except for static methods

2)

A. Interfaces are not allowed in Java versions prior before Java 8.0.
B. It is possible to instantiate an interface if it has been extended by other classes.
C. An interface may have attributes, but they must be static and final (constants).

3)

A. For a given abstract class, all its methods must be overridden in the classes that extend this abstract class.
B. For a given abstract class, all its abstract methods must be overridden in the classes that extend this abstract class.
C. An abstract method can be partially implemented in the abstract class, but it must be fully implemented in the classes extending this abstract class.

4)

A. One difference between interfaces and abstract classes is that the latter can implement non-abstract methods
B. One difference between interfaces and abstract classes is that the formers only contain final parameters
C. There are no differences between interfaces and abstract classes

4. Drawing the UML Class Diagram
0.0/3.0 points (graded)

Given the two UML blocks for classes shown in the Figure, select which elements should be included in each part marked with a circled number. You must infer the required information from the source code of the class Elephant, which is:

public class Elephant extends Animal{
    public String origin; // ASIA or AFRICA

    public void bathe (){
        System.out.println (super.owner+" must bathe the elephant from "+origin);
    }

    public boolean ride (){
        if (super.age < 5){
            System.out.println ("The elephant is to young to ride");
            return false;
        }else if (super.isSleeping()){
            System.out.println ("The elephant is sleeping now");
            return false;
        }else{
            return true;
        }
     }
}






5. String methods
0.0/3.0 points (graded)

Given the following code:

String a=new String ("abcdefg");
String b=new String ("ABCDEFG");
String c=new String ("AbcdefG");
String d=new String ("cde");

What are the results printed on screen by the following statements:

a) System.out.println (a.equalsIgnoreCase(b));

false
true


b) System.out.println (c.substring(2,4));

cde
cd
def
de


c) System.out.println (a.equals(b));

false
true

6. Understanding the code
0.0/3.0 points (graded)

Given the following program written in Java:

package myUtils.system;
import java.io*;

class UtilitiesSystem{
     public static void main (String args[]){
          foo();
     }
     public static void foo (){
          File pwd=new File(System.getProperty("user.dir"));
          if (pwd.isDirectory()){
               File [] bar=pwd.listFiles();
               for (int i=0;i<bar.length;i++){
                   System.out.println (bar[i].getName());
               }
          }else{
              System.out.println ("Error. The argument is not a directory");
          }
     }
}

Select the correct sentences.
Be sure that you mark all the correct answers (Wrong answers subtract points).


A. Any external class can access the method foo() from class UtilitiesSystem, after importing the package "myUtils.system".
B. The program will not compile, as the class System is not imported.
C. All classes from the package "java.io" are available in this program
D. Any external class can access the method foo() from class UtilitiesSystem, after importing the package "myUtils".
E. The method foo() prints the directories of the system.
F. The method foo() prints all the files and directories of the directory from which the program is executed.
G. The program will not compile, as the class File is not imported.
H. The message "Error. The argument is not a directory" will be printed in case that the variable "user.dir" is not initialized.
I. The message "Error. The argument is not a directory" is never printed.

7. The area of a circle
0.0/3.0 points (graded)

Suppose that you want to create a method that returns the area of a circle, whose radius is given by parameter. To avoid negative values for the parameter received, this method internally transforms it into positive by using the absolute value. Complete the following method circleArea using methods and attributes from the class Math. Indicate the correct attribute or method of the class Math that must replace the hyphens in lines 2, 3 and 4.

Line  1:  public double circleArea (double radius){
Line  2:      double first=Math.--;
Line  3:      double second=Math.---(radius);
Line  4:      double third=Math.---(second,2);
Line  5:      return first*third;
Line  6:  }

Line 2:

Line 3:

Line 4:

7. Finding the appropriate method
0.0/3.0 points (graded)

Use the Standard Java Library documentation to find information of classes and methods that perform the following operations. Indicate the exact name of the package, the name of the class and the name of the method (without parenthesis nor arguments).

For example, if the question were to find the package, class and method that calculates the square root of a number, then the correct answer would be:

Package		   Class		Method
java.lang		  Math		 sqrt

1 - Determine the current system properties:

Package	     Class	   Method



2 - Get the default time zone for the host where the program is running:

Package	     Class	   Method


3 - Check whether a file is a directory:

Package	     Class	   Method
