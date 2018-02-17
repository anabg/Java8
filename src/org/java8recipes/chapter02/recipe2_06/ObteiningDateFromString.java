package org.java8recipes.chapter02.recipe2_06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * Obtaining a Date from a Specified String
 *
 *
 * Problem: You want to obtain a LocalDate object, given a specified string of text that contains a date.
 *
 * Solution: Utilize a DateTimeFormatter to set the format of the specified string of text and then call on the LocalDate.parse()
 * method, passing the string of text as the first argument and the formatter as the second. The following lines of code
 * demonstrate this process.
 *
 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
 * LocalDate yearStart = LocalDate.parse("01/01/2014", formatter);
 *
 *
 * How It Works
 * 
 * The LocalDate object contains several utility methods that can be used to manipulate a date. One such method
 * is parse(), which accepts two arguments, a string-based date and a DateTimeFormatter object that specifies the
 * format of the first argument. This method obtains an instance of LocalDate from the text string, and it returns a
 * DateTimeParseException if the text cannot be parsed due to incorrect formatting.
 *
 * Created by ÊBelu on 13/2/2017.
 */
public class ObteiningDateFromString {

    public static void main (String[] args){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate yearStart = LocalDate.parse("01/01/2014", formatter);

        System.out.println("LocalDate " + yearStart);

    }
}
