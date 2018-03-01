package org.java8recipes.chapter04.recipe04_03;

/**
 * Solution #2:
 *  Use the Integer.compare(int,int) method to compare two int values numerically. The following lines could
 *  compare the same int values that were declared in the first solution:
 *
 *  System.out.println("Compare method -> int3 and int1: " + Integer.compare(int3, int1));// Result -1
 *
 *  System.out.println("Compare method -> int2 and int1: " + Integer.compare(int2, int1)); // Result 1
 *
 *
 *  How It Works
 *
 *  The second solution to this recipe demonstrates the integer compare() method that was added to the language in
 *  Java 7. This static method accepts two int values and compares them, returning a 1 if the first int is greater than the
 *  second, a 0 if the two int values are equal, and a -1 if the first int value is less than the second. To use the Integer.compare()
 *  method, pass two int values as demonstrated in the following code:
 *
 *  Integer.compare(int3, int1));
 *  Integer.compare(int2, int1));
 *
 *  Just like in your math lessons at school, these comparison operators will determine whether the first integer is
 *  equal to, greater than, or less than the second integer. Straightforward and easy to use, these comparison operators
 *  are most often seen within the context of an if statement.
 *
 * Created by æBelu on 28/2/2018.
 */
public class ComparingIntValues_Solution02 {

    public static void main (String[] args){

        int int1 = 1;
        int int2 = 10;
        int int3 = -5;

        System.out.println("Compare method -> int3 and int1 " + Integer.compare(int3,int1));
        System.out.println("Compare method -> int2 and int1 " + Integer.compare(int2,int1));

    }
}
