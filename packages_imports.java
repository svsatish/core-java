import java.util.Date;

// import - keyword
// java.util.Date - import statement

// import - used to import classes from a package
// import - used to make classes available in the current file
// default import - used to import classes from the java.lang package. No need to import classes from this package.
// import java.util.* - used to import all classes from the java.util package
// Recommended to use fully qualified names to avoid naming conflicts instead of wildcards

// package - used to organize classes
// package - used to prevent naming conflicts
// package - used to control access
// package - used to make code more readable
// package - used to make code more maintainable
// package - used to make code more reusable
// package - used to make code more secure
// package - used to make code more scalable
// package - used to make code more testable
// package - used to make code more portable
// package - used to make code more efficient
// package - used to make code more flexible
// package - used to make code more robust
// package must be the first statement in a Java file
// package can have sub-packages and are separated by dots
// syntax: package package_name like package com.example; or package com.example.demo; or package com.example.demo.test;

// default package - used to define classes without a package
// default package - used to define classes in the root directory
// default package - used to define classes in the unnamed package


public class packages_imports {

    public static void main(String args[]){

        Date date = new Date();
        System.out.println(date);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);

    }
}
