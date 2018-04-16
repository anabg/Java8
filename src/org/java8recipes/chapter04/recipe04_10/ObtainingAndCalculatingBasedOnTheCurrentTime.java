package org.java8recipes.chapter04.recipe04_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Obtaining and Calculating Based on the Current Time
 * <p>
 * Problem
 * <p>
 * You would like to obtain the current time so that it can be used to stamp a given record. You would also like to perform
 * calculations on that time.
 * <p>
 * <p>
 * Solution
 * <p>
 * Use the LocalTime class, which is part of the new Date-Time API, to obtain and display the current time. In the
 * following lines of code, the LocalTime class is demonstrated.
 * <p>
 * LocalTime time = LocalTime.now();
 * System.out.println("Current Time: " + time);
 * <p>
 * Once the time has been obtained, methods can be called against the LocalTime instance to achieve the desired
 * result. In the following lines of code, there are some examples of using the LocalTime methods:
 * <p>
 * // atDate(LocalDate): obtain the local date and time
 * LocalDateTime ldt = time.atDate(LocalDate.of(2011,Month.NOVEMBER,11));
 * System.out.println("Local Date Time object: " + ldt);
 * <p>
 * // of(int hours, int min): obtain a specific time
 * LocalTime pastTime = LocalTime.of(1, 10);
 * <p>
 * // compareTo(LocalTime): compare two times. Positive
 * // return value returned if greater
 * System.out.println("Comparing times: " + time.compareTo(pastTime));
 * <p>
 * <p>
 * // getHour(): return hour in int value (24-hour format)
 * int hour = time.getHour();
 * System.out.println("Hour: " + hour);
 * <p>
 * // isAfter(LocalTime): return Boolean comparison
 * System.out.println("Is local time after pastTime? " + time.isAfter(pastTime));
 * <p>
 * // minusHours(int): Subtract Hours from LocalTime
 * LocalTime minusHrs = time.minusHours(5);
 * System.out.println("Time minus 5 hours: " + minusHrs);
 * <p>
 * // plusMinutes(int): Add minutes to LocalTime
 * LocalTime plusMins = time.plusMinutes(30);
 * System.out.println("Time plus 30 mins: " + plusMins);
 * <p>
 * Here are the results:
 * Current Time: 22:21:08.419
 * Local Date Time object: 2011-11-11T22:21:08.419
 * Comparing times: 1
 * Hour: 22
 * Is local time after pastTime? true
 * Time minus 5 hours: 17:21:08.419
 * Time plus 30 mins: 22:51:08.419
 * <p>
 * <p>
 * How It Works
 * Sometimes it is necessary to obtain the current system time. The LocalTime class can be used to obtain the current
 * time by calling its now() method. Similarly to the LocalDate class, the LocalTime.now() method can be called to
 * return a LocalTime object that is equal to the current time. The LocalTime class also contains several methods
 * that can be utilized to manipulate the time. The examples contained in the solution provide a brief overview of the
 * available methods.
 * Letís take a look at a handful of examples to provide some context for how the LocalTime methods are invoked.
 * To obtain a LocalTime object set to a specific time, invoke the LocalTime.of(int, int) method, passing int
 * parameters representing the hour and minute.
 * <p>
 * // of(int hours, int min): obtain a specific time
 * LocalTime pastTime = LocalTime.of(1, 10);
 * The atDate(LocalDate) instance method is used to apply a LocalDate object to a LocalTime instance, returning
 * a LocalDateTime object (for more information, see Recipe 4-11).
 * LocalDateTime ldt = time.atDate(LocalDate.of(2011,Month.NOVEMBER,11));
 * There are several methods that can be used for obtaining portions of the time. For instance, the getHour(),
 * getMinute(), getNano(), and getSecond() methods can be used to return those specified portions of the LocalTime object.
 * <p>
 * int hour = time.getHour();
 * int min = time.getMinute();
 * int nano = time.getNano();
 * int sec = time.getSecond();
 * <p>
 * Several comparison methods are also available for use. For example, the compareTo(LocalTime) method can be
 * used to compare one LocalTime object to another. isAfter(LocalTime) can be used to determine if the time is after
 * another, and isBefore(LocalTime) is used to specify the opposite. If calculations are needed, several methods are
 * available, including:
 * <p>
 * minus(long amountToSubtract, TemporalUnit unit)
 * minus(TemporalAmount amount)
 * minusHours(long)
 * minusMinutes(long)
 * minusNanos(long)
 * minusSeconds(long)
 * plus(long amountToAdd, TemporalUnit unit)
 * plus(TemporalAmount amount)
 * plusHours(long)
 * plusMinutes(long)
 * plusNanos(long)
 * plusSeconds(long)
 * <p>
 * <p>
 * To see all of the methods contained in the LocalTime class, see the online documentation at
 * http://docs.oracle.com/javase/8/docs/api/java/time/Loca
 * Created by ÊAnita on 15/4/2018.
 */
public class ObtainingAndCalculatingBasedOnTheCurrentTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // atDate(LocalDate): obtain the local date and time
        LocalDateTime ldt = time.atDate(LocalDate.of(2011, Month.NOVEMBER, 11));
        System.out.println("Local Date Time object: " + ldt);

        // of(int hours, int min): obtain a specific time
        LocalTime pastTime = LocalTime.of(1, 10);

        // compareTo(LocalTime): compare two times. Positive
        // return value returned if greater
        System.out.println("Comparing times: " + time.compareTo(pastTime));

        // getHour(): return hour in int value (24-hour format)
        int hour = time.getHour();
        System.out.println("Hour: " + hour);

        // isAfter(LocalTime): return Boolean comparison
        System.out.println("Is local time after pastTime? " + time.isAfter(pastTime));

        // minusHours(int): Subtract Hours from LocalTime
        LocalTime minusHrs = time.minusHours(5);
        System.out.println("Time minus 5 hours: " + minusHrs);

        // plusMinutes(int): Add minutes to LocalTime
        LocalTime plusMins = time.plusMinutes(30);
        System.out.println("Time plus 30 mins: " + plusMins);


        int hour2 = time.getHour();
        int min = time.getMinute();
        int nano = time.getNano();
        int sec = time.getSecond();

    }
}
