1. More on Object Oriented Programming
0.0/2.0 points (graded)


Select the correct statement or statements regarding object oriented programming in Java.
Be sure that you mark all the correct answers (Wrong answers subtract points).

A. Two subclasses of the same superclass always have the same number of methods.
B. Inheritance models the IS-A relationship, in which the objects of the subclass are
   also objects of the superclass. (ANSWER)
C. The number of methods in a superclass is always higher than in each of its subclasses.

#Explanation:
The subclass (or derived/child class) inherits all the methods of the superclass (or parent class) and can have more methods, which are specific for this child class and for all its subclasses.

2. Object oriented programming
0.0/2.0 points (graded)

In object oriented programming, every object...
Select the correct option

A. has recursive methods
B. is an attribute of another object
C. inherits from a class
D. is an instance of a class (ANSWER)

#Explanation:
Objects are always instances from a class. The process of creating objects from a class is called instantiation.

3. Constructors
0.0/3.0 points (graded)

Which of the following sentences about constructors in Java are correct?
Be sure that you mark all the correct answers (Wrong answers subtract points).


A. The return type void must be included in the declaration of a constructor.
B. Constructors need to receive at least one argument.
C. A class can have several constructors.
D. Constructors are special methods that cannot be overloaded.
E. Constructors are used to create objects (instances) of a class.

4. Get and Set methods
0.0/4.0 points (graded)

Given two points p1 and p2 represented in the bi-dimensional space by coordinates x and y,
the length of the line that connects these two points (i.e. the distance between these two points) is given by the formula:

****d = √(x₂-x₁)² + (y₂ - y₁)²***

where x1 and y1 represent the coordinates of p1, and x2 and y2 represent the coordinates of p2.


The following two Java classes, Point and Line, represent bi-dimensional points and straight lines that connect two points.

a)
public class Point {
    private double x = 0;
    private double y = 0;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

b)
public class Line {
    private Point p1;
    private Point p2;

    public Line (Point firstPoint, Point secondPoint) {
        p1 = firstPoint;
        p2 = secondPoint;
    }
}

We want to implement the method length() in the class Line. This method calculates the distance of the two points that are connected by a straight line. Would the following implementations of length() be correct?

NOTE: The method Math.sqrt(x) calculates the square root of x and the method Math.pow(x,2) calculates x squared.


A. public double length() {
    return Math.sqrt(Math.pow(p2.getX()-p1.getY(),2)
            + Math.pow(p2.getY()-p1.getX(),2));
}

YES/NO?

B. public double length() {
    return Math.sqrt(Math.pow(p2.x-p1.y,2)
            + Math.pow(p2.y-p1.x,2));
}

YES/NO?

C. public double length() {
    return Math.sqrt(Math.pow(p2.x-p1.x,2)
            + Math.pow(p2.y-p1.y,2));
}

YES/NO?

D. public double length() {
    return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)
            + Math.pow(p2.getY()-p1.getY(),2));
}

YES/NO?


5. Overloading
0.0/2.0 points (graded)

Which of the following options is an example of overloading:


A. Two methods with the same name that are implemented in the same class, and that
   have the same number of parameters but of different types
B. Two methods with the same name that are implemented in the same class, and that
   have the same number and type of parameters
C. Two methods with the same name that are implemented in different classes and that
   have the same number and type of parameters.
D. Two methods with the same name that are implemented in different classes, and that
   have the same number of parameters but of different types
E. One method implemented in one class, and another method with the same name, number and
   type of parameters implemented in a class that inherits from the first one.
