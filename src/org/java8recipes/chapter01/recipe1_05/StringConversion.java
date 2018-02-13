package org.java8recipes.chapter01.recipe1_05;

/**
 *
 * Problem: You have a value in a primitive data type, and you want to represent that value as a human-readable string.
 * Or, you want to go in the other direction by converting a human-readable string into a primitive data type.
 *
 * Solution: Follow one of the patterns from Listing 1-5. The listing shows conversion from a string to a double-precision
 * floating-point value, and shows two methods for getting back to a string again.
 *
 * How it works:
 * The solution illustrates some conversion patterns that work for all the primitive types. First, there is the conversion of
 * a floating-point number from its human-readable representation into the IEEE 754 format used by the java language
 * for floating-point arithmetic
 *
 * pi = Double.parseDouble("3.1416");
 *
 * Notice the pattern. You can replace Double with Float, or by Long, or by whatever other type is your target data
 * type. Each primitive type has a corresponding wrapper class by the same name but with the initial letter uppercase.
 * The primitive type here is double, and  the corresponding wrapper is Double. The wrapper classes implement helper
 * methods such as Double.parseDouble(), Long.parseLong(), Boolean.parseBoolean(), and so forth. These parse
 * methods convert human-readable representation into values of the respective types.
 * Going the other way, it is often easiest to invoke String.valueOf(). The String class implements this method,
 * and it is overloaded for each of the primitive data types. Alternatively, the wrapper classes also implement toString()
 * methods that you can invoke to convert values of the underlying type into their human-readable forms. It´s your own
 * preference as to wich approach to take.
 * Convertions targeting the numeric types require come exception handling to be practicañ. You generally need to
 * gracefully accommodate a case in wich a character-string value is expected to be a valid numeric representation, but
 * it´s not. Chapter 9 covers exception-handling in detail, and the upcoming Recipe 1-7 provides a simple example to get you started.
 *
 *
 * Created by æBelu on 25/1/2017.
 */
public class StringConversion {


    public static void main(String[] args) {

        double pi;
        String strval;


        // Return a double value from an string
        pi = Double.parseDouble("3.1416");

        strval = String.valueOf(pi);

        /*
        * Returns the string representation of the {@code double} argument.
        * */
        System.out.println(strval);

        /*
        * Returns a string representation of the {@code double}
        * argument.
        * */
        System.out.println(Double.toString(pi));
    }
}
