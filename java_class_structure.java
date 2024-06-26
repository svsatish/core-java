// package must be the first statement in a Java file like package com.example; or package com.example.demo; or package com.example.demo.test;
// package is used to organize classes, prevent naming conflicts, control access, make code more readable, maintainable, reusable, secure, scalable, testable, portable, efficient, flexible, robust
// import java.util.Date; or import java.util.Random; or import java.util.*; or import java.util.Date; or import java.util.Random;
// import is used to import classes from a package, make classes available in the current file, import all classes from the java.util package
public class java_class_structure {
// public - access modifier
// class - keyword
// java_class_structure - class name
// {} - code block
// class - used to define a new class
// class - used to define a blueprint for objects
// class - used to define attributes and methods
// We can have many classes in a single file, but only one of them can be public.
// The name of the file must match the name of the public class.
// A class can have any number of methods.
// A class can have any number of attributes.
// A class can have any number of constructors.
// A class can have any number of blocks.
// A class can have any number of nested classes.
// A class can have any number of interfaces.
// A class can have any number of annotations.
// A class can have any number of enum types.
// A class is a logical representation of a real-world entity.

    // Class variables - attributes
    private int x = 5;
    private int y = 10;
    // int - data type
    // x - variable name
    // 5 - variable value
    // private - access modifier
    // private - only accessible within the class
    // private - cannot be accessed from outside the class
    // private - used to protect data
    // private - used to hide data
    // private - used to prevent data modification
    // private - used to prevent data access

    // getter method - used to access the value of a private variable
    public int getXValue() {
        return x;
    }

    // setter method - used to set the value of a private variable
    public int setXValue(int x) {
        return this.x = x;
        // this - keyword
        // this - refers to the current object
    }

    // Constructor
    public java_class_structure() {
    // public - access modifier
    // java_class_structure - constructor name
    // () - parameter list
    // {} - code block
    // constructor - special method that is called when an object is created
    // constructor - used to initialize object state
    // constructor - has the same name as the class
    // constructor - does not have a return type
    // constructor - can have parameters
    // constructor - can be overloaded
    // constructor - can be private, public, protected, or default
    // constructor - can be used to set initial values for object attributes
    // constructor - can be used to perform any necessary actions on object creation
    // A private constructor can only be accessed within the same class. It is commonly used in singleton design patterns or utility classes where you want to restrict the instantiation of the class from outside.
    }

    // Class method - behavior
    public void myMethod() {
    // public - access modifier
    // void - return type
    // myMethod - method name
        System.out.println("Hello World");
        // System.out.println() - used to print output
    }

    // Main method
    public static void main(String[] args) {
    // public - access modifier - it should be public because it is called by the JVM as it is outside our project and it should be accessible from anywhere
    // static - keyword - it should be static because the JVM is going to call it without creating an object of the class
    // void - return type - it should be void because the main method does not return anything
    // main - method name - it should be main because the JVM looks for the main method to start the execution of the program
    // String[] args - parameter list - it should be String[] args because the main method accepts a single argument of type String array
    // the main() method is the entry point of the program - it is the first method that is called when the program is executed
    // the main() method is always public, static, and void
    // String[] args - command line arguments
    // String[] args - can be named anything
    // String[] args - can be used to pass arguments to the main method
    // String[] args - can be used to pass arguments to the main method

        java_class_structure myObj = new java_class_structure();
        // java_class_structure - class name
        // myObj - object name
        // = - assignment operator
        // new - keyword
        // java_class_structure() - constructor
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        myObj.myMethod();
        // myObj - object name
        // myMethod() - method name
        // myMethod() - method call

    }
}
