package org.java8recipes.chapter03.recipe3_01;

/**
 * Strings
 *
 * Strings are one of the most commonly used data types in any programming language. They can be used for obtaining
 * text from a keyboard, printing messages to a command-line, and much more. Given the fact that strings are used so
 * often, there have been many features added to the String object over time in order to make them easier to work with.
 * After all, a string is an object in Java, so it contains methods that can be used to manipulate the contents of the string.
 * Strings are also immutable in Java, which means that their state cannot be changed or altered. This makes them a
 * bit different to work with than some of the mutable, or changeable, data types. It is important to understand how to
 * properly make use of immutable objects, especially when attempting to change or assign different values to them.
 *
 * This chapter focuses on some of the most commonly used String methods and techniques for working with
 * String objects. We also cover some useful techniques that are not inherent of String objects.
 *
 *  Obtaining a Subsection of a String
 *
 * Problem: You would like to retrieve a portion of a string.
 *
 * Solution: Use the substring() method to obtain a portion of the string between two different positions. In the solution that
 * follows, a string is created and then various portions of the string are printed out using the substring() method.
 *
 * How It Works
 *
 * The String object contains many helper methods. One such method is substring(), which can be used to obtain
 * portions of the string. There are two variations of the substring() method. One of them accepts a single argument,
 * that being the starting index; and the other accepts two arguments: startingindex and endingindex. Having two
 * variations of the substring() method makes it seem as though the second argument is optional; if it is not specified,
 * the length of the calling string is used in its place. It should be noted that indices begin with zero, so the first position
 * in a string has the index of 0, and so on.
 *
 * As you can see from the solution to this recipe, the first use of substring() prints out the entire contents of the
 * string. This is because the first argument passed to the substring() method is 0, and the second argument passed
 * is the length of the original string. In the second example of substring(), an index of 5 is used as the first argument,
 * and an index of 20 is used as the second argument. This effectively causes only a portion of the string to be printed,
 * beginning with the character in the string that is located in the sixth position, or index 5 because the first position
 * has an index of 0; and ending with the character in the string that is located in the 20th position, the index of 19. The
 * third example specifies only one argument; therefore, the result will be the original string beginning with the position
 * specified by that argument.
 *
 * Created by ÊBelu on 22/2/2017.
 */
public class  ObtainingASubsectionOfAString {

    public static void substringExample() {
        String originalString = "This is the original String";
        System.out.println(originalString.substring(0, originalString.length()));
        System.out.println(originalString.substring(5, 20));
        System.out.println(originalString.substring(12));
    }


    public static void main ( String[] args){

        ObtainingASubsectionOfAString.substringExample();

    }
}
