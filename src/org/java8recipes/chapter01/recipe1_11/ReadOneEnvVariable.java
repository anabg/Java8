package org.java8recipes.chapter01.recipe1_11;

/**
 *
 * Problem: The application you are developing needs to make use of some environment variables. You want to read the values
 * that have been set from the operating-system level.
 *
 * Solution: Make use of the Java System class to retrieve any environment variable values. The System class has a method called
 * getenv(), which accepts a String argument corresponding to the name of a system environment variable. The
 * method will then return the value of the given variable. If no matching environment variable exists, a NULL value will
 * be returned. Listing 1-9 provides an example. The class ReadOneEnvVariable accepts an environment variable name
 * as a parameter, and displays the variable’s value that has been set at the operating-system level.
 *
 * How It Works:
 * The System class contains many different utilities that can aid in application development. One of those is the
 * getenv() method, which will return a value for a given system environment variable.
 * You can also return the values from all variables, in which case those values are stored in a map. A map is a
 * collection of name/value pairs. Chapter 7 provides additional information about maps, including a recipe showing in
 * detail how to iterate over them.
 * The method invoked to obtain environment variable values in Listings 1-9 and 1-10 is the same. It’s been overloaded
 * to handle both cases shown in the solution. Pass the name of a variable as a string if you want to obtain just that variable’s
 * value. Pass no argument at all to get back the names and values of all variables that are currently set.
 *
 * Created by æBelu on 12/2/2017.
 */
public class ReadOneEnvVariable {


    public static void main(String[] args) {
        if (args.length > 0) {
            String value = System.getenv(args[0]);
            if (value != null) {
                System.out.println(args[0].toUpperCase() + " = " + value);
            } else {
                System.out.println("No such environment variable exists");
            }

        } else {
            System.out.println("No arguments passed");
        }
    }
}
