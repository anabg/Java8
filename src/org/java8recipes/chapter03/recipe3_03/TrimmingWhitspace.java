package org.java8recipes.chapter03.recipe3_03;

/**
 *
 * Trimming Whitespace
 *
 * Problem: One of the strings you are working with contains some whitespace on either end. You would like to get rid of that
 * whitespace
 *
 * Solution: Use the string trim() method to eliminate the whitespace. In the following example, a sentence is printed including
 * whitespace on either side. The same sentence is then printed again using the trim() method to remove the
 * whitespace so that the changes can be seen.
 *
 * String myString = " This is a String that contains whitespace.   ";
 * System.out.println(myString);
 * System.out.println(myString.trim());
 *
 * The output will print as follows:
 *   This is a String that contains whitespace.
 *  This is a String that contains whitespace.
 *
 *  How It Works
 *
 *  Regardless of how careful we are, whitespace is always an issue when working with strings of text. This is especially the
 *  case when comparing strings against matching values. If a string contains an unexpected whitespace character then
 *  that could be disastrous for a pattern-searching program. Luckily, the Java String object contains the trim() method
 *  that can be used to automatically remove whitespace from each end of any given string.
 *  The trim() method is very easy to use. In fact, as you can see from the solution to this recipe, all that is required
 *  to use the trim() method is a call against any given string. Because strings are objects, they contain many helper
 *  methods, which can make them very easy to work with. After all, strings are one of the most commonly used data
 *  types in any programming language . . . so theyíd better be easy to use! The trim() method returns a copy of the
 *  original string with all leading and trailing whitespace removed. If, however, there is no whitespace to be removed,
 *  the trim() method returns the original string instance. It does not get much easier than that!
 *  
 * Created by ÊBelu on 25/2/2017.
 */
public class TrimmingWhitspace {

    public static void main(String[] args) {

        String myString = " This is a String that contains whitespace.   ";

        System.out.println(myString);
        System.out.println(myString.trim());
    }
}
