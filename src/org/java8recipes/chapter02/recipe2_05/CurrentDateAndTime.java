package org.java8recipes.chapter02.recipe2_05;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by ÊAnita on 13/2/2017.
 * Incorporating the Current Date and Time
 */

/**
 * Problem You want to obtain the current date and time for use in your application
 *
 * Solution Utilize the new Date-Time API to retrieve the current date and time.
 *
 * How It Works The Date-Time API makes it easy to obtain the current date and time,
 * each as separate entities. To do so, you import the java.time.LocalDate and java.time.LocalTime
 * classes and call upon their static now() methods to retrieve instances of the local date and time, respectively.
 */
public class CurrentDateAndTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();


        System.out.println("LocalDate " + localDate);
        System.out.println("LocalTime " + localTime);


    }
}
