package com.org.project;

public class objects_constructors {

    String name = "instance variable";

    {
        System.out.println("Instance block called");
    }

    public static void main(String args[]){

        // Create an object of the class
        objects_constructors obj = new objects_constructors();
        // objects_constructors - class name
        // obj - object name. It is an instance of the class. It is used to access the methods and attributes of the class.
        // new - keyword. It is used to create an object. It allocates memory for the object. It initializes the object. It returns the reference of the object.
        // objects_constructors() - constructor

        // Access the instance variable
        System.out.println(obj.name);

        // Call the method
        obj.display();

    }

    // Constructor
    public objects_constructors(){
        name = "Constructor called name is changed";
        System.out.println(name);
        // Constructor - special method that is called when an object is created
        // Constructor - used to initialize object state
        // Constructor - has the same name as the class
        // Constructor - does not have a return type
        // Constructor - can have parameters
        // Constructor - can be overloaded
        // Constructor - can be private, public, protected, or default
        // Constructor - can be used to set initial values for object attributes
        // Constructor - can be used to perform any necessary actions on object creation
        // A private constructor can only be accessed within the same class. It is commonly used in singleton design patterns or utility classes where you want to restrict the instantiation of the class from outside.
        // Constructor is not mandatory. If you do not define a constructor, the compiler will create a default constructor for you.
    }

    // Method
    public void display(){
        System.out.println("Method called");
    }

    // Order of execution
    // 1. Static block
    // 2. Instance block
    // 3. Constructor
    // 4. Method
    // 5. Main method
    // Static block is executed only once when the class is loaded into memory. It is used to initialize static variables. It is executed before the instance block and constructor.
    // Instance block is executed every time an object is created. It is used to initialize instance variables. It is executed before the constructor.
    // Constructor is executed when an object is created. It is used to initialize object state. It is executed after the instance block.
    // Method is executed when it is called. It is used to define the behavior of an object.
    // Main method is executed when the program is run. It is the entry point of the program.

}
