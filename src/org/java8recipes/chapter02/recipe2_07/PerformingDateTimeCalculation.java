package org.java8recipes.chapter02.recipe2_07;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * Performing Date-Time Calculations
 * <p>
 * Problem: You want to add a number of days or subtract a number of weeks from a given date or time.
 * <p>
 * Solution: Utilize the built-in utility methods in the LocalDate and LocalTime objects to perform the required calculation.
 * The following code obtains the current date and time and performs some basic calculations on them.
 *
 * LocalDate myDate = LocalDate.now();
 * LocalTime myTime = LocalTime.now();
 *
 * LocalDate datePlusDays = myDate.plusDays(15);
 * System.out.println("Today Plus 15 Days: " + datePlusDays);
 * LocalDate datePlusWeeks = myDate.plusWeeks(8);
 * System.out.println("Today Plus 8 weeks: " + datePlusWeeks);
 *
 * LocalTime timePlusHours = myTime.plusHours(5);
 * LocalTime timeMinusMin = myTime.minusMinutes(30);
 *
 * System.out.println("Time Plus 5 Hours: " + timePlusHours);
 * System.out.println("Time Minus 30 Minutes: " + timeMinusMin);
 *
 * How It Works
 *
 * The Date-Time API makes it easy to perform calculations on dates and times. The LocalDate and LocalTime objects
 * have calculation methods built right in, so there is no more worrying about converting to different types of objects in
 * order to perform calculations. The Date-Time API also allows easy access to the current date or time by enabling you
 * to invoke the now() method on either of those objects.
 *
 * Created by ÊBelu on 14/2/2017.
 */
public class PerformingDateTimeCalculation {

    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDate datePlusDays = myDate.plusDays(15);
        System.out.println("Today Plus 15 Days: " + datePlusDays);
        LocalDate datePlusWeeks = myDate.plusWeeks(8);
        System.out.println("Today Plus 8 weeks: " + datePlusWeeks);
        LocalTime timePlusHours = myTime.plusHours(5);
        LocalTime timeMinusMin = myTime.minusMinutes(30);
        System.out.println("Time Plus 5 Hours: " + timePlusHours);
        System.out.println("Time Minus 30 Minutes: " + timeMinusMin);
        
    }

}
