package org.java8recipes.chapter04.recipe04_11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 *
 * Problem:
 * In your application, you want to display not only the current date, but also the current time.
 *
 * Solution #1:
 *
 *
 * Make use of the LocalDateTime class, which is part of the new Date-Time API, to capture and display the current date
 * and time. The LocalDateTime class contains a method named now(), which can be used to obtain the current date
 * and time together. The following lines of code demonstrate how to do so:
 *
 * LocalDateTime ldt = LocalDateTime.now();
 * System.out.println("Local Date and Time: " + ldt);
 *
 * The resulting LocalDateTime object contains both the date and time, but no time zone information. The
 * LocalDateTime class also contains additional methods that provide options for working with date-time data. For
 * instance, to return a LocalDateTime object with a specified date and time, pass parameters of int type to the
 * LocalDateTime.of() method, as follows:
 *
 * // Obtain the LocalDateTime object of the date 11/11/2000 at 12:00
 * LocalDateTime ldt2 = LocalDateTime.of(2000, Month.NOVEMBER,11,12,00)
 *
 * The following examples demonstrate a handful of the methods that are available in a LocalDateTime object:
 * // Obtain the month from LocalDateTime object
 * Month month = ldt.getMonth();
 * int monthValue = ldt.getMonthValue();
 * System.out.println("Month: " + month);
 * System.out.println("Month Value: " + monthValue);
 *
 * // Obtain day of Month, Week, and Year
 * int day = ldt.getDayOfMonth();
 * DayOfWeek dayWeek = ldt.getDayOfWeek();
 * int dayOfYr = ldt.getDayOfYear();
 * System.out.println("Day: " + day);
 * System.out.println("Day Of Week: " + dayWeek);
 * System.out.println("Day of Year: " + dayOfYr);
 *
 * // Obtain year
 * int year = ldt.getYear();
 * System.out.println("Date: " + monthValue + "/" + day + "/" + year);
 *
 * int hour = ldt.getHour();
 * int minute = ldt.getMinute();
 * int second = ldt.getSecond();
 *
 * System.out.println("Current Time: " + hour + ":" + minute + ":" + second);
 *
 * // Calculation of Months, etc.
 * LocalDateTime currMinusMonths = ldt.minusMonths(12);
 * LocalDateTime currMinusHours = ldt.minusHours(10);
 * LocalDateTime currPlusDays = ldt.plusDays(30);
 * System.out.println("Current Date and Time Minus 12 Months: " + currMinusMonths);
 * System.out.println("Current Date and Time MInus 10 Hours: " + currMinusHours);
 * System.out.println("Current Date and Time Plus 30 Days:" + currPlusDays);
 *
 * Hereís the result:
 * Day: 18
 * Day Of Week: WEDNESDAY
 * Day of Year: 352
 * Date: 12/18/2013
 * Current Time: 23:8:41
 * Current Date and Time Minus 12 Months: 2012-12-18T23:41:34.084
 * Current Date and Time MInus 10 Hours: 2014-12-18T13:41:34.084
 * Current Date and Time Plus 30 Days:2014-01-17T23:41:34.084
 *
 *
 * Created by ÊAnita on 16/4/2018.
 */
public interface ObtainingAndUsingTheDateAndTimeTogether_Solution01 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date and Time" + ldt);

        // Obtain the LocalDateTime object of the date 11/11/2000 at 12:00
        LocalDateTime ldt2 = LocalDateTime.of(2000, Month.NOVEMBER,11,12,00);

        // The following examples demonstrate a handful of the methods that are available in a LocalDateTime object:
        // Obtain the month from LocalDateTime object
        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        System.out.println("Month: " + month);
        System.out.println("Month Value: " + monthValue);

        // Obtain day of Month, Week, and Year
        int day = ldt.getDayOfMonth();
        DayOfWeek dayWeek = ldt.getDayOfWeek();
        int dayOfYr = ldt.getDayOfYear();
        System.out.println("Day: " + day);
        System.out.println("Day Of Week: " + dayWeek);
        System.out.println("Day of Year: " + dayOfYr);

        // Obtain year
        int year = ldt.getYear();
        System.out.println("Date: " + monthValue + "/" + day + "/" + year);

        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);
        // Calculation of Months, etc.
        LocalDateTime currMinusMonths = ldt.minusMonths(12);
        LocalDateTime currMinusHours = ldt.minusHours(10);
        LocalDateTime currPlusDays = ldt.plusDays(30);
        System.out.println("Current Date and Time Minus 12 Months: " + currMinusMonths);
        System.out.println("Current Date and Time MInus 10 Hours: " + currMinusHours);
        System.out.println("Current Date and Time Plus 30 Days:" + currPlusDays);


    }

}


