package org.java8recipes.chapter04.recipe04_03;

/**
 *
 * Problem: You need to compare two or more int values.
 * Solution #1:
 *  Use the comparison operators to compare integer values against one another. In the following example, three int
 *  values are compared against each other, demonstrating various comparison operators:
 *  As you can see, comparison operators will generate a Boolean result.
 *
 *  int int1 = 1;
 *  int int2 = 10;
 *  int int3 = -5;
 *
 *  System.out.println(int1 == int2);   // Result:  false
 *  System.out.println(int3 == int1);   // Result:  false
 *  System.out.println(int1 == int1);   // Result:  true
 *  System.out.println(int1 > int3);    // Result:  true
 *  System.out.println(int2 < int3);    // Result:  false
 *
 * How It Works
 * Perhaps the most commonly used numeric comparisons are against two or more int values. The Java language makes
 * it very easy to compare an int using the comparison operators (see Table ).
 *
 * Comparison Operators
 * Operator Function
 * == Equal to
 * != Not equal to
 * > Greater than
 * < Less than
 * >= Greater than or equal to
 * <= Less than or equal to
 *
 *
 * Created by æBelu on 28/2/2018.
 */
public class ComparingIntValues_Solution01 {


    public static void main (String[] args){

        int int1 = 1;
        int int2 = 10;
        int int3 = -5;

        System.out.println(int1 == int2);
        System.out.println(int3 == int2);
        System.out.println(int1 == int1);
        System.out.println(int1 > int3);
        System.out.println(int1 < int2);

    }


}
