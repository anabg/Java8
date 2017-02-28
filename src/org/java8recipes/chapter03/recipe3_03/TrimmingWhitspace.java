package org.java8recipes.chapter03.recipe3_03;

/**
 * Created by ÊAnita on 25/2/2017.
 */
public class TrimmingWhitspace {

    public static void main(String[] args) {

        String myString = " This is a String that contains whitespace.   ";

        System.out.println(myString);
        System.out.println(myString.trim());
    }
}
