package org.java8recipes.chapter01.recipe1_08;

import java.math.BigInteger;

/**
 * Created by ÊAnita on 29/1/2017.
 */
public class JavadocExample {


    /**
     * Accepts an unlimited number of values and
     * returns the sum
     *
     * @param numbs Must be an array of BigInteger values.
     * @return Sum of all numbers in the array.
     */
    public static BigInteger addNumbers(BigInteger[] numbs) {


        BigInteger result = new BigInteger("0");

        for (BigInteger num : numbs) {


            result = result.add(num);


        }
        return result;
    }


    /**
     * Test the addNumbers method.     * @param args not used
     */


    public static void main(String[] args) {
        BigInteger[] someValues = {BigInteger.TEN, BigInteger.ONE};
        System.out.println(addNumbers(someValues));
    }
}



