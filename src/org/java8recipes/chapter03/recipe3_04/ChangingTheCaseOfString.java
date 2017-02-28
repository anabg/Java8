package org.java8recipes.chapter03.recipe3_04;

import java.util.Locale;

/**
 * Created by ÊAnita on 25/2/2017.
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
