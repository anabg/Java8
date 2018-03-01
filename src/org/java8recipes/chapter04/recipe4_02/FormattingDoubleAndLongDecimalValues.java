package org.java8recipes.chapter04.recipe4_02;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * Problem You need to be able to format double and long numbers in your application.
 *
 * Solution Use the DecimalFormat class to format and round the value to the precision your application requires. In the following
 * method, a double value is accepted and a formatted string value is printed:
 *
 * public static void formatDouble(double myDouble){
 *
 *      NumberFormat numberFormatter = new DecimalFormat("##.000");
 *      String result = numberFormatter.format(myDouble);
 *      System.out.println(result);
 * }
 *
 * For instance, if the double value passed into the formatDouble() method is 345.9372, the following will be the result:
 *
 *  345.937
 *
 *  Similarly, if the value .7697 is passed to the method, the following will be the result:
 *
 *  .770
 *
 *  Each of the results is formatted using the specified pattern and then rounded accordingly.
 *
 *
 * How It Works
 *
 * The DecimalFormat class can be used along with the NumberFormat class to round and/or format double or long
 * values. NumberFormat is an abstract class that provides the interface for formatting and parsing numbers. This class
 * provides the ability to format and parse numbers for each locale, and obtain formats for currency, percentage,
 * integers, and numbers. By itself, the NumberFormat class can be very useful as it contains factory methods that can
 * be used to obtain formatted numbers. In fact, little work needs to be done in order to obtain a formatted string. For
 * example, the following code demonstrates calling some factory methods on the NumberFormat class:
 *
 *
 *  // Obtains an instance of NumberFormat class
 *  NumberFormat format = NumberFormat.getInstance();
 *
 *  // Format a double value for the current locale
 *  String result = format.format(83.404);
 *  System.out.println(result);
 *
 *  // Format a double value for an Italian locale
 *  result = format.getInstance(Locale.ITALIAN).format(83.404);
 *  System.out.println(result);
 *
 *  // Parse a String into a Number
 *
 *  try {
 *          Number num = format.parse("75.736");
 *          System.out.println(num);
 * } catch (java.text.ParseException ex){
 *      System.out.println(ex);
 * }
 *
 * To format using a pattern, the DecimalFormat class can be used along with NumberFormat. In the solution to this
 * recipe, you saw that creating a new DecimalFormat instance by passing a pattern to its constructor would return a
 * NumberFormat type. This is because DecimalFormat extends the NumberFormat class. Because the NumberFormat class
 * is abstract, DecimalFormat contains all the functionality that NumberFormat contains, plus added functionality for
 * working with patterns. Therefore, it can be used to work with different formats from the locales just as you have seen
 * in the previous demonstration. This provides the ultimate flexibility when working with double or long formatting.
 * As mentioned previously, the DecimalFormat class can take a string-based pattern in its constructor. You can also
 * use the applyPattern() method to apply a pattern after the fact. Each pattern contains a prefix, numeric part, and
 * suffix, which allow you to format a particular decimal value to the required precision and include leading digits and
 * commas as needed. The symbols used to build patterns are displayed in Table 4-3. Each of the patterns also contains a
 * positive and negative subpattern. These two subpatterns are separated by a semicolon (;) and the negative subpattern
 * is optional. If there is no negative subpattern present, the localized minus sign is used. For instance, a complete
 * pattern example would be ###,##0.00;(###,##0.00).
 *
 *
 * Table 4-3. DecimalFormat Pattern Characters
 * Character Description
 * # Digit; blank if no digit is present
 * 0 Digit; zero if no digit is present
 * . Decimal
 * - Minus or negative sign
 * , Comma or grouping separator
 * E Scientific notation separator
 * ; Positive and negative subpattern separator
 *
 * The DecimalFormat class provides enough flexibility to format double and long values for just about every situation.
 *
 */

public class FormattingDoubleAndLongDecimalValues {

    public static void formatDouble(double myDouble){

        NumberFormat numberFormatter = new DecimalFormat("##.000");
        String result = numberFormatter.format(myDouble);
        System.out.println(result);

    }

    public static void main(String[] args) {


        formatDouble(10.12345678);

    //////////////////
    // Obtains an instance of NumberFormat class
        NumberFormat format = NumberFormat.getInstance();

    // Format a double value for the current locale
        String result = format.format(83.404);
        System.out.println(result);

    // Format a double value for an Italian locale

        result = format.getInstance(Locale.ITALIAN).format(83.404);
        System.out.println(result);

    // Parse a String into a Number
        try {
            Number num = format.parse("75.736");
            System.out.println(num);
        } catch (java.text.ParseException ex) {
            System.out.println(ex);
        }


    }
}
