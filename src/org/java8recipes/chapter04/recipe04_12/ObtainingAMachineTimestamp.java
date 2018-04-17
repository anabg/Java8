package org.java8recipes.chapter04.recipe04_12;

/**
 *
 * Problem
 *
 * You need to obtain a machine-based timestamp from the system.
 *
 * Solution
 * Utilize an Instant class, which represents the start of a nanosecond on the timeline based on machine time. In the
 * following example, an Instant is used to obtain the system timestamp. The Instant is also utilized in other scenarios,
 * such as when calculating different dates based on the Instant.
 * public static void instants(){
 * Instant timestamp = Instant.now();
 * System.out.println("The current timestamp: " + timestamp);
 *
 * //Now minus three days
 * Instant minusThree = timestamp.minus(3, ChronoUnit.DAYS);
 * System.out.println("Now minus three days:" + minusThree);
 *ZonedDateTime atZone = timestamp.atZone(ZoneId.of("GMT"));
 * System.out.println(atZone);
 * Instant yesterday = Instant.now().minus(24, ChronoUnit.HOURS);
 * System.out.println("Yesterday: " + yesterday);
 *
 * }
 *
 *
 * Here is the result:
 * The current timestamp: 2014-12-27T05:36:42.199Z
 * Now minus three days:2014-12-24T05:36:42.199Z
 * 2014-12-27T05:36:42.199Z[GMT]
 * Yesterday: 2014-12-26T05:36:42.253Z
 *
 *
 *
 * How It Works
 * The Date-Time API introduces a new class named Instant, which represents the start of a nanosecond on the
 * timeline in machine-based time. Being based on machine time, the value for an Instant counts from the EPOCH
 * (January 1, 1970 00:00:00Z). Any values prior to the EPOCH are negative, and after the EPOCH the values are positive. The
 * Instant class is perfect for obtaining a machine timestamp, as it includes all pertinent date and time information to
 * the nanosecond.
 * An Instant class is static and immutable, so to obtain the current timestamp, the now() method can be called.
 * Doing so returns a copy of the current Instant. The Instant also includes conversion and calculation methods, each
 * returning copies of the Instant or other types. In the solution, the now() method returns the current timestamp, and
 * then a couple of examples follow, showing how to perform calculations and obtain information on the Instant.
 * The Instant is an important new feature in JDK 8, as it makes it easy to work with current time and date data.
 * The other date and time classes, such as LocalDateTime, are useful as well. However, the Instant is the most accurate
 * timestamp as itís based on nanosecond accuracy
 *
 * Created by ÊAnita on 17/4/2018.
 */
public class ObtainingAMachineTimestamp {

    public static void main (String[] args){
        public static void instants(){
            Instant timestamp = Instant.now();
            System.out.println("The current timestamp: " + timestamp);

            //Now minus three days
            Instant minusThree = timestamp.minus(3, ChronoUnit.DAYS);
            System.out.println("Now minus three days:" + minusThree);
            ZonedDateTime atZone = timestamp.atZone(ZoneId.of("GMT"));
            System.out.println(atZone);

            Instant yesterday = Instant.now().minus(24, ChronoUnit.HOURS);
            System.out.println("Yesterday: " + yesterday);
        }
    }
}
