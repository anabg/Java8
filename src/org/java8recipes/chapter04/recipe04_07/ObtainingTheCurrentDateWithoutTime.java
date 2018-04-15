package org.java8recipes.chapter04.recipe04_07;

import java.time.Clock;
import java.time.LocalDate;

/**
 *
 * Problem:
 *
 * You are developing an application for which you would like to obtain the current date, not including the time, to
 * display on a form.
 *
 * Solution:
 *
 * Make use of the Date-Time API to obtain the current date. The LocalDate class represents an ISO calendar in the
 * year-month-day format. The following lines of code capture the current date and display it:
 *
 * LocalDate date = LocalDate.now();
 * System.out.println("Current Date:" + date);
 *
 * How It Works:
 *
 * The Date-Time API makes it easy to obtain the current date, without including other information such as time. To do
 * so, import the java.time.LocalTime class and call on its now() method. The LocalTime class cannot be instantiated,
 * as it is immutable and thread-safe. A call to the now() method returns another LocalDate object, containing the
 * current date in the year-month-day format.
 * Another version of the now() method accepts a java.time.Clock object as a parameter and returns the date
 * based on that clock. For instance, the following lines of code demonstrate how to obtain a Clock that represents the
 * system time:
 * Clock clock = Clock.systemUTC();
 * LocalDate date = LocalDate.now(clock);
 * In previous releases, there were other ways to obtain the current date, but usually the time came with the date
 * and then formatting had to be done to remove the unneeded time digits. The new java.time.LocalDate class makes
 * it possible to work with dates separate from times.
 *
 * Created by ÊAnita on 15/4/2018.
 */
public class ObtainingTheCurrentDateWithoutTime {

    public static void main( String[] args) {


        LocalDate date = LocalDate.now();
        System.out.println("Current Date:" + date);

        Clock clock = Clock.systemUTC();
        LocalDate clockDate = LocalDate.now(clock);
        System.out.println("Current Date - clock:" + clockDate);

    }
}
