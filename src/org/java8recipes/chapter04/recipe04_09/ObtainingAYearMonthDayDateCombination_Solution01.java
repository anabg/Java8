package org.java8recipes.chapter04.recipe04_09;

import java.time.Month;
import java.time.YearMonth;

/**
 * Obtaining a Year-Month-Day Date Combination
 * <p>
 * Problem
 * <p>
 * You would like to obtain the year, year-month, or month of a specified date.
 * <p>
 * Solution #1
 * <p>
 * To obtain the year-month of a specified date, use the java.time.YearMonth class. This class is used to represent the
 * month of a specific year. In the following lines of code, the YearMonth object is used to obtain the year and month of
 * the current date and another specified date.
 * <p>
 * YearMonth yearMo = YearMonth.now();
 * System.out.println("Current Year and month:" + yearMo);
 * YearMonth specifiedDate = YearMonth.of(2000, Month.NOVEMBER);
 * System.out.println("Specified Year-Month: " + specifiedDate);
 * <p>
 * Hereís the result:
 * Current Year and month: 2014-12
 * Specified Year-Month: 2000-11
 * <p>
 * <p>
 * Created by ÊAnita on 15/4/2018.
 */
public class ObtainingAYearMonthDayDateCombination_Solution01 {
    public static void main(String[] args) {


        YearMonth yearMo = YearMonth.now();
        System.out.println("Current Year and month:" + yearMo);
        YearMonth specifiedDate = YearMonth.of(2000, Month.NOVEMBER);
        System.out.println("Specified Year-Month: " + specifiedDate);


    }

}
