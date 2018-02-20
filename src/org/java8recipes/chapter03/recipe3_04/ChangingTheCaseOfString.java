package org.java8recipes.chapter03.recipe3_04;

import java.util.Locale;

/**
 *  Changing the Case of a String
 *
 *  Problem: A portion of your application contains case-sensitive string values. You want to change all the strings to uppercase
 *  before they are processed in order to avoid any case-sensitivity issues down the road.
 *
 *  Solution: Make use of the toUpperCase() and toLoweCase() methods. The String object provides these two helper methods
 *  to assist in performing a case change for all of the characters in a given string.
 *  For example, given the string in the following code, each of the two methods will be called:
 *
 *  String str = "This String will change case.";
 *  System.out.println(str,toUpperCase());
 *  System.out.println(str,toLowerCase());
 *
 *  The following output will be produced:
 *
 *  THIS STRING WILL CHANGE CASE.
 *  this string will change case.
 *
 *  How it Works:
 *
 *  To ensure that the case of every character within a given string is either upper or lowercase, use the toUpperCase()
 *  and toLowerCase() methods, respectively. There are a couple of items to note when using these methods. First, if a
 *  

 * Created by ÊBelu on 25/2/2017.
 */
public class ChangingTheCaseOfString {

    public static void main(String[] args) {

        String str = "This String will change case.";

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str);

        System.out.println(str.toLowerCase(Locale.ENGLISH));

    }
}
