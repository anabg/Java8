package org.java8recipes.chapter04.recipe04_08;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 *  Obtaining a Date Object Given Date Criteria
 *
 *  Problem:
 *
 *  You want to obtain a date object, given a year-month-day specification.
 *
 *  Solution:
 *
 *  Invoke the LocalDate.of() method for the year, month, and day for which you want to obtain the object. For
 *  example, suppose that you want to obtain a date object for a specified date in November of 2000. You could pass that
 *  date criteria to the LocalDate.of() method, as demonstrated in the following lines of code:
 *
 *  LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 11);
 *  System.out.println("Date from specified date: " + date);
 *
 *  Hereís the result:
 *
 *  Date from specified date: 2000-11-11
 *
 *  How It Works
 *
 *  The LocalDate.of() method accepts three values as parameters. Those parameters represent the year, month, and
 *  day. The year parameter is always treated as an int value. The month parameter can be presented as an int value,
 *  which uses an enum that represents the month. The Month enum will return an int value for each month, with
 *  JANUARY returning a 1 and DECEMBER returning a 12. Therefore, Month.NOVEMBER returns an 11. A Month object could
 *  also be passed as the second parameter instead of as an int value. Lastly, the day of the month is specified by passing
 *  an int value as the third parameter to the of() method.
 *
 *
 * Created by ÊAnita on 15/4/2018.
 */
public class ObtainingADateObjectGivenDateCriteria {

    public static void main( String[] args) {


        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 11);
        System.out.println("Date from specified date: " + date);


    }
}
