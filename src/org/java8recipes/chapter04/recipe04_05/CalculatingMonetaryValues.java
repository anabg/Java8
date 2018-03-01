package org.java8recipes.chapter04.recipe04_05;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * Problem: You are developing an application that requires the use of monetary values and you are not sure which data type to
 * use for storing and calculating currency values.
 *
 * Solution: Use the BigDecimal data type to perform calculation on all monetary values. Format the resulting calculations using the
 * NumberFormat.getCurrencyInstance() helper method. In the following code, three monetary values are calculated
 * using a handful of the methods that are part of the BigDecimal class. The resulting calculations are then converted into
 * double values and formatted using the NumberFormat class. First, take a look at how these values are calculated:
 *
 * BigDecimal currencyOne = new BigDecimal("25.65");
 * BigDecimal currencyTwo = new BigDecimal("187.32");
 * BigDecimal currencyThree = new BigDecimal("4.86");
 * BigDecimal result = null; String printFormat = null;
 *
 * // Add all three values
 * result = currencyOne.add(currencyTwo).add(currencyThree);
 * // Convert to double and send to formatDollars(), returning a String
 * printFormat = formatDollars(result.doubleValue());
 * System.out.println(printFormat);
 *
 * // Subtract the first currency value from the second
 * result = currencyTwo.subtract(currencyOne);
 * printFormat = formatDollars(result.doubleValue());
 * System.out.println(printFormat);
 *
 * Next, let�s take a look at the formatDollars() method that is used in the code. This method accepts a double
 * value and performs formatting on it using the NumberFormat class based on the U.S. locale. It then returns a string
 * value representing currency:
 *
 * public static String formatDollars(double value){
 *      NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
 *      return dollarFormat.format(value);
 *  }
 *
 *  As you can see, the NumberFormat class allows for currency to be formatted per the specified locale. This can be
 *  very handy if you are working with an application that deals with currency and has an international scope.
 *
 *  $217.83
 *  $161.6
 *
 *  How It Works
 *
 *  How It Works Many people attempt to use different number formats when working with currency. While it might be possible to use
 *  any type of numeric object to work with currency, the BigDecimal class was added to the language to help satisfy the
 *  requirements of working with currency values, among other things. Perhaps the most useful feature of the BigDecimal
 *  class is that it provides control over rounding. This is essentially why such a class is so useful for working with
 *  currency values. The BigDecimal class provides an easy API for rounding values, and also makes it easy to convert to
 *  double values, as the solution to this recipe demonstrates.
 *  To provide specific rounding with the BigDecimal class, you should use a MathContext object or the
 *  RoundingMode enumeration values. In either case, such precision can be omitted by using a currency-formatting
 *  solution such as the one demonstrated in the solution example. BigDecimal objects have mathematical
 *  implementations built into them, so performing such operations is an easy task. The arithmetic operations that you
 *  can use are described in Table.
 *
 *  BigDecimal Arithmetic Methods
 *  Method Description
 *  add() Adds one BigDecimal object value to another.
 *  subtract() Subtracts one BigDecimal object value from another.
 *  multiply() Multiplies the value of one BigDecimal object by another.
 *  abs() Returns the absolute value of the given BigDecimal object value.
 *  pow(n) Returns the BigDecimal to the power of n; the power is computed to unlimited precision.
 *
 *  After performing the calculations you require, call the doubleValue() method on the BigInteger object to
 *  convert and obtain a double. You can then format the double using the NumberFormat class for currency results.
 *
 *
 * Created by �Belu on 1/3/2018.
 */
public class CalculatingMonetaryValues {

    public static String formatDollars(double value){
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return dollarFormat.format(value);
    }


    public static void main(String[] args) {

        BigDecimal currencyOne = new BigDecimal("25.65");
        BigDecimal currencyTwo = new BigDecimal("187.32");
        BigDecimal currencyThree = new BigDecimal("4.86");
        BigDecimal result = null;
        String printFormat = null;

        // Add all three values
        result = currencyOne.add(currencyTwo).add(currencyThree);
        // Convert to double and send to formatDollars(), returning a String
        printFormat = formatDollars(result.doubleValue());
        System.out.println(printFormat);

        // Subtract the first currency value from the second
        result = currencyTwo.subtract(currencyOne);
        printFormat = formatDollars(result.doubleValue());
        System.out.println(printFormat);

    }

}
