package org.java8recipes.chapter03.recipe3_02;

/**
 * Created by ÊAnita on 22/2/2017.
 * <p>
 * Problem: An application that you are writing needs to have the ability to compare two or more string values.
 * <p>
 * Solution: Use the built-in equals(), equalsIgnoreCase(), compareTo(), and compareToIgnoreCase() methods to compare the values contained within the strings.
 * The following is a series of tests using different string-comparison operations. As you can see, various if statements are used to print out messages if the comparisons are equal:
 *
 *
 * How It Works: One of the trickier parts of using a programming language can come when attempting to compare two or more values.
 * In the Java language, comparing strings can be fairly straightforward, keeping in mind that you should not use the == for string comparison.
 * This is because the comparison operator (==) is used to compare references, not values of strings.
 * One of the most tempting things to do when programming with strings in Java is to use the comparison operator, but you must not because the results can vary.
 * In the solution to this recipe, you can see various different techniques for comparing string values.
 * The equals() method is a part of every Java object.
 * The Java string equals() method has been overridden so that it will compare the values contained within the string rather than the object itself.
 * As you can see from the following examples that have been extracted from the solution to this recipe, the equals() method is a safe way to compare strings.
 * // Comparison is equal
 * if (one.equals(var1)){    System.out.println ("String one equals var1 using equals"); }
 * // Comparison is NOT equal if (one.equals(two)){    System.out.println ("String one equals two using equals"); }
 * The equals() method will first check to see whether the strings reference the same object using the == operator;
 * it will return true if they do. If they do not reference the same object, equals() will compare each string character- by-character
 * to determine whether the strings being compared to each other contain exactly the same values.
 * What if one of the strings has a different case setting than another? Do they still compare equal to each other using  equals()?
 * The answer is no, and that is why the equalsIgnoreCase() method was created.
 * Comparing two values  using equalsIgnoreCase() will cause each of the characters to be compared without paying attention to the case.
 * The following examples have been extracted from the solution to this recipe:
 * // Comparison is NOT equal if (two.equals(var2)){    System.out.println ("String two equals var2 using equals"); }
 * // Comparison is equal if (two.equalsIgnoreCase(var2)){    System.out.println ("String two equals var2 using equalsIgnoreCase"); }
 * The compareTo()and compareToIgnoreCase() methods perform a lexicographical comparison of the strings.
 * This comparison is based upon the Unicode value of each character contained within the strings.
 * The result will be a negative integer if the string lexicographically precedes the argument string. The result will be a positive integer if the
 * string lexicographically follows the argument string.
 * The result will be zero if both strings are lexicographically equal to each other.
 * The following excerpt from the solution to this recipe demonstrates the compareTo() method:
 * // Comparison is equal if (one.compareTo(var1) == 0){    System.out.println("One is equal to var1 using compareTo()"); }
 * Inevitably, many applications contain code that must compare strings at some level.
 * The next time you have an application that requires string comparison, consider the information discussed in this recipe before you write the code.
 */
public class ComparingStrings {

    public static void main(String[] args) {


        String one = "one";
        String two = "two";
        String var1 = "one";
        String var2 = "Two";
        String pieceone = "o";
        String piecetwo = "ne";
        // Comparison is equal
        if (one.equals(var1)) {
            System.out.println("String one equals var1 using equals");
        }

        // Comparison is NOT equal
        if (one.equals(two)) {
            System.out.println("String one equals two using equals");
        }
        // Comparison is NOT equal
        if (two.equals(var2)) {
            System.out.println("String two equals var2 using equals");
        }
        // Comparison is equal, but is not directly comparing string values using ==
        if (one == var1) {
            System.out.println("String one equals var1 using ==");
        }
        // Comparison is equal
        if (two.equalsIgnoreCase(var2)) {
            System.out.println("String two equals var2 using equalsIgnoreCase");
        }
        System.out.println("Trying to use == on Strings that are pieced together");
        String piecedTogether = pieceone + piecetwo;
        // Comparison is equal
        if (one.equals(piecedTogether)) {
            System.out.println("The strings contain the same value using equals");
        }
        // Comparison is NOT equal using ==
        if (one == piecedTogether) {
            System.out.println("The string contain the same value using == ");
        }
        // Comparison is equal
        if (one.compareTo(var1) == 0) {
            System.out.println("One is equal to var1 using compareTo()");
        }


    }
}
