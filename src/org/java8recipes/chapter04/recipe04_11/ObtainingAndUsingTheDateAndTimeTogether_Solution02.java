package org.java8recipes.chapter04.recipe04_11;

import java.util.Date;

/**
 *
 * If you only need to obtain the current date without going into calendar details, use the java.util.Date class to
 * generate a new Date object. Doing so will cause the new Date object to be equal to the current system date. In the
 * following code, you can see how easy it is to create a new Date object and obtain the current date:
 * Date date = new Date();
 * System.out.println(date);
 * System.out.println(date.getTime());
 * The result will be a Date object that contains the current date and time taken from the system that the code is
 * run on, including the time zone information, as shown following listing. The time is the number of milliseconds since
 * January 1, 1970, 00:00:00 GMT.
 * Sat Sep 10 14:45:57 CDT 2011
 * 131568395762
 *
 *
 * Created by ÊAnita on 16/4/2018.
 */
public class ObtainingAndUsingTheDateAndTimeTogether_Solution02 {

    public static void main(String args[]){

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
