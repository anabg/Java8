package org.java8recipes.chapter04.recipe04_09;

import java.time.Month;
import java.time.MonthDay;

/**
 * Obtaining a Year-Month-Day Date Combination
 * <p>
 * To obtain the month-day for the current date or a specified date, simply make use of the java.time.MonthDay class.
 * The following lines of code demonstrate how to obtain a month-day combination.
 * <p>
 * MonthDay monthDay = MonthDay.now();
 * System.out.println("Current month and day: " + monthDay);
 * MonthDay specifiedDate = MonthDay.of(Month.NOVEMBER, 11);
 * System.out.println("Specified Month-Day: " + specifiedDate);
 * <p>
 * Current month and day: --12-14
 * Specified Month-Day: --11-11
 * <p>
 * Note that by default, MonthDay does not return a very useful format. For more help with formatting, see Recipe 4-17.
 * <p>
 * How It Works
 * <p>
 * The Date-Time API includes classes that make it easy to obtain the information that your application requires for a
 * date. Two of those are the YearMonth and MonthDay classes. The YearMonth class is used to obtain the date in yearmonth
 * format. It contains a few methods that can be used to obtain the year-month combination. As demonstrated in
 * the solution, you can call the now() method to obtain the current year-month combination. Similar to the LocalDate
 * class, YearMonth also contains an of() method that accepts a year in int format, and an number that represents the
 * month of the year. In the solution, the Month enum is used to obtain the month value.
 * Similar to the YearMonth class, MonthDay obtains the date in a month-day format. It also contains a few different
 * methods for obtaining the month-day combination. Solution #2 demonstrates two such techniques. Obtaining
 * the current month-day combination by calling the now() method and using the of() method to obtain a monthday
 * combination for a specified date. The of() method accepts an int value for the month of the year as its first
 * parameter, and for the second parameter it accepts an int value indicating the day of the month.
 * <p>
 * <p>
 * Created by ÊAnita on 15/4/2018.
 */
public class ObtainingAYearMonthDayDateCombination_Solution02 {

    public static void main(String[] args) {


        MonthDay monthDay = MonthDay.now();
        System.out.println("Current month and day: " + monthDay);
        MonthDay specifiedDate = MonthDay.of(Month.NOVEMBER, 11);
        System.out.println("Specified Month-Day: " + specifiedDate);


    }


}
