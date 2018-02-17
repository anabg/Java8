package org.java8recipes.chapter02.recipe2_05;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * Date-Time API
 *
 * A new Date-Time API has been introduced in Java 8 and it was developed under JSR 310. The Date-Time API uses
 * the calendar defined in ISO-8601 as the default calendar. Therefore, the calendar is based on the Gregorian calendar
 * system, and in this chapter, you learn how to work with date, time, and time zone data. The Date-Time API adheres
 * to several design principles in an effort to be clear, fluent, immutable, and extensible. The API uses a clear language
 * that is concise and very well defined. It is also very fluent, so code dealing with date-time data is easy to read and
 * understand.
 * This introduction provides a few brief examples of the new API to get your feet wet. To learn about the API in
 * more detail, refer to Chapter 4.
 *
 *
 * Incorporating the Current Date and Time
 *
 * Problem: You want to obtain the current date and time for use in your application
 *
 * Solution: Utilize the new Date-Time API to retrieve the current date and time.The following code demostrates how to do so.
 *
 * LocalDate localDate = LocalDate.now();
 * LocalTime localTime = LocalTime.now();
 *
 *
 * How It Works
 *
 * The Date-Time API makes it easy to obtain the current date and time, each as separate entities. To do so, you
 * import the java.time.LocalDate and java.time.LocalTime classes and call upon their static now() methods to
 * retrieve instances of the local date and time, respectively.  Both the LocalDate and the LocalTime classes cannot be
 * instantiated, as they are immutable and thread-safe.
 *
 * Created by ÊBelu on 13/2/2017.
 */
public class CurrentDateAndTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();


        System.out.println("LocalDate " + localDate);
        System.out.println("LocalTime " + localTime);

    }
}
