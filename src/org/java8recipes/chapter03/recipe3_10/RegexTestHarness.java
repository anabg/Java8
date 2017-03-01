package org.java8recipes.chapter03.recipe3_10;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 28/2/2017.
 */
public class RegexTestHarness {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while (true) {

            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter input string to search");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println(String.format("I found the text" +
                                 " \"%s\" starting at " +
                                 "index %d and ending at index %d.%n",
                         matcher.group(),
                         matcher.start(),
                         matcher.end()));
                found = true;
            }
            if (!found) {
                System.out.println(String.format("No match found.%n"));
            }
        }
    }
}
