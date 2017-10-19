package org.java8recipes.chapter01.recipe1_05;

/**
 * Created by ÊAnita on 25/1/2017.
 */
public class StringConversion {


    public static void main(String[] args) {

        double pi;
        String strval;


        pi = Double.parseDouble("3.1416");

        /*
        * Returns the string representation of the {@code double} argument.
        * */
        System.out.println(String.valueOf(pi));

        /*
        * Returns a string representation of the {@code double}
        * argument.
        * */
        System.out.println(Double.toString(pi));
    }
}
