package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 *
 * No.	Character Class	Description
   1	[abc]	a, b, or c (simple class)
   2	[^abc]	Any character except a, b, or c (negation)
   3	[a-zA-Z]	a through z or A through Z, inclusive (range)
   4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
   5	[a-z&&[def]]	d, e, or f (intersection)
   6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
   7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
  */
public class RegexCharacterClasses {

    public static void main(String args[]){
        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

        System.out.println(Pattern.matches("[abc]", "a"));//true (among a or b or c)
        System.out.println(Pattern.matches("[^abc]", "a"));//false (because is not different that a or b or c)
        System.out.println(Pattern.matches("[a-zA-Z]", "a"));//true (because the character 'a' is included in the range)
        System.out.println(Pattern.matches("[a-zA-Z]", "2"));//false (because the character '2' is not included in the range)
        System.out.println(Pattern.matches("[a-d[m-p]]", "g"));//false (because this is the union a through d or m through p and 'g' is not ingluded)
        System.out.println(Pattern.matches("[a-d[m-p]]", "b"));//true (because this is the union a through d or m through p and 'b' it is included)
        System.out.println(Pattern.matches("[a-z&&[def]]", "b"));//false (intersection between a through z and def and 'b' is not included)
        System.out.println(Pattern.matches("[a-z&&[def]]", "d"));//true (intersection between a through z and def and 'd' it is included) intersection
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "d"));//true (a through z, except for b and c: [ad-z]) (subtraction)
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));//false (a through z, except for b and c: [ad-z]) (subtraction)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "b"));//true (a through z, and not m through p: [a-lq-z](subtraction)
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m"));//false (a through z, and not m through p: [a-lq-z](subtraction)
    }

}
