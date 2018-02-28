package org.java8recipes.chapter04.recipe4_01;

/**
 * Problem: You need to be able to round floating-point numbers or doubles in your application to Integer values.
 *
 * Solution: Use one of the java.lang.Math round() methods to round the number into the format you require. The Math class has two methods that can be used for rounding floating-point numbers or Double values. The following code demonstrates how to use each of these methods:
 *
 *  public static int roundFloatToInt(float myFloat){
 *      return Math.round(myFloat);
 *  }
 *
 *  public static long roundDoubleToLong(double myDouble){
 *      return Math.round(myDouble);
 * }
 *
 * The first method, roundFloatToInt(), accepts a floating-point number and uses the java.lang.Math class to
 * round that number to an Integer. The second method, roundDoubleToLong(), accepts a Double value and uses the
 * java.lang.Math class to round that Double to a Long.
 *
 * How It Works
 *
 * The java.lang.Math class contains plenty of helper methods to make our lives easier when working with numbers.
 * The round() methods are no exception as they can be used to easily round floating-point or double values. One
 * version of the java.lang.Math round() method accepts a float as an argument. It will round the float to the closest
 * int value, with ties rounding up. If the argument is NaN, then a zero will be returned. When arguments that are
 * positive or negative infinity are passed into round(), a result equal to the value of Integer.MAX_VALUE or Integer.
 * MIN_VALUE, respectively, will be returned. The second version of the java.lang.Math round() method accepts
 * a double value. The double value is rounded to the closest long value, with ties rounding up. Just like the other round(),
 * if the argument is Not a Number (NaN), a zero will be returned. Similarly, when arguments that are positive or negative
 * infinity are passed into round(), a result equal to the value of Long.MAX_VALUE or Long.MIN_VALUE, respectively, will
 * be returned.
 * Created By Belu
 */

public class RoundingFloatAndDoubleValuesToIntengers {

    public static int roundFloatToInt(float myFloat){
        return Math.round(myFloat);
    }


    public static long roundDoubleToLong(double myDouble){
        return Math.round(myDouble);

    }


    public static void main(String[] args){

        int ri1 = roundFloatToInt(0f);
        int ri2 = roundFloatToInt(0.96f);

        long rl1 = roundDoubleToLong(21.22);
        long rl2 = roundDoubleToLong(28.99);

        System.out.println(ri1);
        System.out.println(ri2);
        System.out.println(rl1);
        System.out.println(rl2);
    }
}
