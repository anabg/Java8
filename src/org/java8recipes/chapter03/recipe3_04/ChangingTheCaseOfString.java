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
 *  given string contains an uppercase letter, and the toUpperCase() method is called against it, the uppercase letter is
 *  ignored. The same concept holds true for calling the toLowerCase() method. Any punctuation or numbers contained
 *  within the given string are also ignored.
 *  There are two variations for each of these methods. One of the variations does not accept any arguments, while
 *  the other accepts an argument pertaining to the locale you want to use. Calling these methods without any arguments
 *  will result in a case conversion using the default locale. If you want to use a different locale, you can pass the desired
 *  locale as an argument, using the variation of the method that accepts an argument. For instance, if you want to use an
 *  Italian or French locale, you would use the following code:
 *
 *  System.out.println(str.toUpperCase(Locale.ITALIAN));
 *  System.out.println(str,toUpperCase(new Locale("it","US")));
 *  System.out.println(str,toUpperCase(new Locale("fr","CA")));
 *
 *  Converting strings to upper or lowercase using these methods can make life easey. They are also very useful
 *  for comparing strings that are taken as input from an application. Consider the case in wich a user is prompted to
 *  enter a username, and the result is saved into a string. Now consider that later in the program that string is compared
 *  against all the usernames stored within a database to ensure that the username is valid. What happens if the person
 *  who entered the username types it with an uppercase first character? What happens if the username is stored
 *  within the database in all uppercase? The comparison will never be equal. In such a case, a developer can use the
 *  toUpperCase() method to alleviate the problem. Calling this method against the strings that are being compared will
 *  result in a comparison in which the case is the same in both strings.
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
