package org.java8recipes.chapter04.recipe04_11;

import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 *
 * If you need to be more precise regarding the calendar, use the java.util.Calendar class. Although working with the
 * Calendar class will make your code longer, the results are much more precise. The following code demonstrates just a
 * handful of the capabilities of using this class to obtain the current date:
 * Calendar gCal = Calendar.getInstance();
 *
 * // Month is based upon a zero index, January is equal to 0,
 * // so we need to add one to the month for it to be in
 * // a standard format
 * int month = gCal.get(Calendar.MONTH) + 1;int day = gCal.get(Calendar.DATE);
 * int yr = gCal.get(Calendar.YEAR);
 * String dateStr = month + "/" + day + "/" + yr;
 * System.out.println(dateStr);
 * int dayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
 * // Print out the integer value for the day of the week
 * System.out.println(dayOfWeek);
 *
 * int hour = gCal.get(Calendar.HOUR);
 * int min = gCal.get(Calendar.MINUTE);
 * int sec = gCal.get(Calendar.SECOND);
 * // Print out the time
 * System.out.println(hour + ":" + min + ":" + sec);
 *
 *
 * // Create new DateFormatSymbols instance to obtain the String
 * // value for dates
 * DateFormatSymbols symbols = new DateFormatSymbols();
 * String[] days = symbols.getWeekdays();
 * System.out.println(days[dayOfWeek]);
 * // Get crazy with the date!
 * int dayOfYear = gCal.get(Calendar.DAY_OF_YEAR);
 * System.out.println(dayOfYear);
 * // Print the number of days left in the year
 * System.out.println("Days left in " + yr + ": " + (365-dayOfYear));
 * int week = gCal.get(Calendar.WEEK_OF_YEAR);
 * // Print the week of the year
 * System.out.println(week);
 *
 *
 * As demonstrated by this code, it is possible to obtain more detailed information regarding the current date when
 * using the Calendar class. The results of running the code will look like the following:
 * 9/10/2011
 * 7
 * 2:45:57
 * Saturday
 * 253
 * Days left in 2011: 112
 * 37
 *
 *
 * How It Works
 *
 * Many applications require the use of the current calendar date. It is often also necessary to obtain the current time.
 * There are different ways to do that, and the solution to this recipe demonstrates three of them. The Date-Time APIincludes a LocalDateTime class that enables you to capture the current date and time by invoking its now() method.
 * A specified date and time can be obtained by specifying the corresponding int and Month type parameters when
 * calling LocalDateTime.of(). There are also a multitude of methods available for use via a LocalDateTime instance,
 * such as getHours(), getMinutes(), getNanos() and getSeconds(), which allow for finer-grained control of the
 * date and time. An instance of LocalDateTime also contains methods for performing calculations, conversions,
 * comparisons, and more. For brevity, all of the methods are not listed here, but for more information, refer to the
 * online documentation at http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html. Solution
 * #1 to this recipe demonstrates the use of the LocalDateTime, showcasing how to perform calculations and obtainportions of the date and time for further use.
 * By default, the java.util.Date class can be instantiated with no arguments to return the current date and time.
 * The Date class can also be used to return the current time of day via the getTime() method. As mentioned in the
 * solution, the getTime() method returns the number of milliseconds since January 1, 1970, 00:00:00 GMT, representedby the Date object that is in use. There are several other methods that can be called against a Date object with regard
 * to breaking down the current date and time into more granular intervals. For instance, the Date class has the methods
 * getHours(), getMinutes(), getSeconds(), getMonth(), getDay(), getTimezoneOffset(), and getYear().
 * However, it is not advisable to use any of these methods, with the exception of getTime(), because each has been
 * deprecated by the use of the java.time.LocalDateTime and the java.util.Calendar get() method. When some
 * method or class is deprecated, that means it should no longer be used because it might be removed in some future
 * release of the Java language. However, a few of the methods contained within the Date class have not been tagged as
 * deprecated, so the Date class will most likely be included in future releases of Java. The methods that were left intact
 * include the comparison methods after(), before(), compareTo(), setTime(), and equals(). Solution #2 to this
 * recipe demonstrates how to instantiate a Date object and print out the current date and time.
 * As mentioned previously, the Date class has many methods that have become deprecated and should no longer
 * be used. In solution #3 of this recipe, the java.util.Calendar class is demonstrated as one successor for obtaining
 * much of this information. The Calendar class was introduced in JDK 1.1, at which time many of the Date methods
 * were deprecated. As you can see from solution #3, the Calendar class contains all the same functionality that is
 * included in the Date class, except the Calendar class is much more flexible. The Calendar class is actually an abstract
 * class that contains methods that are used for converting between a specific time and date, and manipulating the
 * calendar in various ways. The Calendar, as demonstrated in solution #3, is one such class that extends the Calendar
 * class and therefore provides this functionality. The Calendar class has gained a few new methods in Java 8. The new
 * methods in java.util.Calendar are listed in Table 4-6
 *
 *
 * Table 4-6. New Methods for java.util.Calendar in Java 8
 * Method Name                 Description
 * getAvailableCalendarTypes() Returns un-modifiable set containing all supported calendar types.
 * getCalendarType()           Returns the calendar type of this calendar.
 * toInstant()                 Converts to an instant.
 *
 * For some applications, the Date class will work fine. For instance, the Date class can be useful when working with
 * timestamps. However, if the application requires detailed manipulation of dates and times then it is advisable to use a
 * LocalDateTime or the Calendar class, which both include all the functionality of the Date class and more features as
 * well. All solutions to this recipe are technically sound; choose the one that best suits the needs of your application
 *
 *
 * Created by ÊAnita on 16/4/2018.
 */
public class ObtainingAndUsingTheDateAndTimeTogether_Solution03 {

    public static void main(String args[]){

        Calendar gCal = Calendar.getInstance();
        // Month is based upon a zero index, January is equal to 0,
        // so we need to add one to the month for it to be in
        // a standard format
        int month = gCal.get(Calendar.MONTH) + 1;int day = gCal.get(Calendar.DATE);
        int yr = gCal.get(Calendar.YEAR);
        String dateStr = month + "/" + day + "/" + yr;
        System.out.println(dateStr);
        int dayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
        // Print out the integer value for the day of the week
        System.out.println(dayOfWeek);
        int hour = gCal.get(Calendar.HOUR);
        int min = gCal.get(Calendar.MINUTE);
        int sec = gCal.get(Calendar.SECOND);

        // Print out the time
        System.out.println(hour + ":" + min + ":" + sec);

        // Create new DateFormatSymbols instance to obtain the String
        // value for dates
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] days = symbols.getWeekdays();
        System.out.println(days[dayOfWeek]);
        // Get crazy with the date!
        int dayOfYear = gCal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
        // Print the number of days left in the year
        System.out.println("Days left in " + yr + ": " + (365-dayOfYear));
        int week = gCal.get(Calendar.WEEK_OF_YEAR);
        // Print the week of the year
        System.out.println(week);
    }
}
