### **Week 4 - EXAM**


### 1. More on Object-Oriented Programming

0.0/2.0 points (graded)

Select the correct statement or statements regarding object-oriented programming in Java.

**Be sure that you mark all the correct answers (**_ **Wrong answers subtract points** _**).**

1. Two subclasses of the same superclass always have the same number of methods.
2. **Inheritance models the IS-A relationship, in which the objects of the subclass are also objects of the superclass. (Answer)**
3. The number of methods in a superclass is always higher than in each of its subclasses.

**Explanation:**

The subclass (or derived/child class) inherits all the methods of the superclass (or parent class) and can have more methods, which are specific for this child class and for all its subclasses.

### 2. Object-oriented programming

0.0/2.0 points (graded)

In object-oriented programming, every object...

Select the correct option

1. has recursive methods
2. is an attribute of another object
3. inherits from a class
4. **is an instance of a class (Answer)**

### 3. Constructors

0.0/3.0 points (graded)

Which of the following sentences about constructors in Java are correct?

**Be sure that you mark all the correct answers (**_ **Wrong answers subtract points** _**).**

1. The return type void must be included in the declaration of a constructor.
2. Constructors need to receive at least one argument.
3. **A class can have several constructors. (Answer)**
4. Constructors are special methods that cannot be overloaded.
5. **Constructors are used to create objects (instances) of a class. (Answer)**

### 4. Get and Set methods

0.0/4.0 points (graded)

Given two points p1 and p2 represented in the bidimensional space by coordinates x and y, the length of the line that connects these two points (i.e. the distance between these two points) is given by the formula:

![](RackMultipart20200507-4-1m1vsf6_html_a363000ef51c6748.gif)

where x1 and y1 represent the coordinates of p1, and x2 and y2 represent the coordinates of p2.

The following two Java classes, Point and Line, represent bidimensional points and straight lines that connect two points.

**public class Point {**

**private double x = 0;**

**private double y = 0;**

**public Point(int a, int b) {**

**x = a;**

**y = b;**

**}**

**public double getX() {**

**return x;**

**}**

**public double getY() {**

**return y;**

**}**

**}**

**public class Line {**

**private Point p1;**

**private Point p2;**

**public Line (Point firstPoint, Point secondPoint) {**

**p1 = firstPoint;**

**p2 = secondPoint;**

**}**

**}**

We want to implement the method **length()****in the class Line **. This method calculates the distance of the two points that are connected by a straight line. Would the following implementations of** length()** be correct?

NOTE: The method **Math.sqrt(x)** calculates the square root of **x** and the method **Math.pow(x,2)** calculates **x** squared.

**public double length() {**

**return Math.sqrt(Math.pow(p2.getX()-p1.getY(),2)**

**+ Math.pow(p2.getY()-p1.getX(),2));**

**}**

**YES or NO?**** NO**

**public double length() {**

**return Math.sqrt(Math.pow(p2.x-p1.y,2)**

**+ Math.pow(p2.y-p1.x,2));**

**}**

**YES or NO?**** NO**

**public double length() {**

**return Math.sqrt(Math.pow(p2.x-p1.x,2)**

**+ Math.pow(p2.y-p1.y,2));**

**}**

**YES or NO?**** NO**

**public double length() {**

**return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)**

**+ Math.pow(p2.getY()-p1.getY(),2));**

**}**

**YES or NO?**** YES**

### 5. Overloading

0.0/2.0 points (graded)

Which of the following options is an example of overloading:

1. **Two methods with the same name that are implemented in the same class, and that have the same number of parameters but of different types (ANSWER)**
2. Two methods with the same name that are implemented in the same class, and that have the same number and type of parameters
3. Two methods with the same name that are implemented in different classes and that have the same number and type of parameters.
4. Two methods with the same name that are implemented in different classes, and that have the same number of parameters but of different types
5. One method implemented in one class, and another method with the same name, number and type of parameters implemented in a class that inherits from the first one.

### 6. static

0.0/2.0 points (graded)

Given the following class:

**public class Student {**

**static int counter = 0;**

**int id;**

**public Student() {**

**id = counter;**

**counter++;**

**}**

**public static void main(String[] args){**

**Student s1 = new Student();**

**Student s2 = new Student();**

**Student s3 = new Student();**

**System.out.println(s1.id + &quot;&quot; + s2.id + &quot;&quot; + s3.id);**

**System.out.println(s1.counter + &quot;&quot; + s2.counter + &quot;&quot; + s3.counter);**

**}**

**}**

Which is the result printed on screen of executing:

System.out.println(s1.id + &quot;&quot; + s2.id + &quot;&quot; + s3.id);

1. **012**
2. 111
3. 000
4. 234
5. 333
6. 001
7. 123
8. 222

System.out.println(s1.counter + &quot;&quot; + s2.counter + &quot;&quot; + s3.counter);

1. 012
2. 111
3. 000
4. 234
5. **333**
6. 001
7. 123
8. 222

### 7. Inheritance

0.0/2.0 points (graded)

Given MyClass and YourClass classes, as shown below, what line should replace //...[Here]... in YourClass?

**public class MyClass {**

**private int a;**

**public MyClass (int a) {**

**this.a = a;**

**}**

**}**

**public class YourClass extends MyClass {**

**private int b;**

**public YourClass (int a, int b) {**

**//...[Here]...**

**this.b = b;**

**}**

**}**

1. a = a;
2. this.a = a;
3. **super(a); (ANSWER)**
4. MyClass(a);
5. YourClass(a);

### 8. Visibility

0.0/3.0 points (graded)

Select the correct answer/s regarding visibility in Java. When an attribute (instance variable) is defined as private in a class.

**Be sure that you mark all the correct answers (**_ **Wrong answers subtract points** _**).**

1. it can be accessed but it cannot be modified.
2. it can be accessed only once in the program.
3. it can be accessed and modified only from methods of that class and its subclasses.
4. it can be accessed and modified only from methods of that class and its superclass.
5. **it can be accessed and modified only from methods of that class. (ANSWER)**
6. it can be accessed and modified only from private methods of that class.
