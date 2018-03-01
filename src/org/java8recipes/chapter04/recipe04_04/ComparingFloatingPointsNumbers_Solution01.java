package org.java8recipes.chapter04.recipe04_04;

/**
 * Problem: You need to compare two or more floating-point values in an application.
 * Solution #1
 *  Use the Float objectís compareTo() method to perform a comparison of one float against another. The following
 *  example shows the compareTo() method in action:
 *
 * Float float1 = new Float("9.675");
 * Float float2 = new Float("7.3826");
 * Float float3 = new Float("23467.373");
 *
 * System.out.println(float1.compareTo(float3));  // Result: -1
 * System.out.println(float2.compareTo(float3));  // Result: -1
 * System.out.println(float1.compareTo(float1));  // Result: 0
 * System.out.println(float3.compareTo(float2));  // Result: 1
 *
 * The result of calling the compareTo() method is an integer value. A negative result indicates that the first float
 * is less than the float that it is being compared against. A zero indicates that the two float values are equal. Lastly, a
 * positive result indicates that the first float is greater than the float that it is being compared against.
 *
 * How It Works
 *
 * The most useful way to compare two float objects is to use the compareTo() method. This method will perform a
 * numeric comparison against the given float objects. The result will be an integer value indicating whether the first
 * float is numerically greater than, equal to, or less than the float that it is compared against. If a float value is NaN, it is
 * considered to be equal to other NaN values or greater than all other float values. Also, a float value of 0.0f is greater
 * than a float value of -0.0f.
 * An alternative to using compareTo() is the compare() method, which is also native to the Float class. The
 * compare() method was introduced in Java 1.4, and it is a static method that compares two float values in the same
 * manner as compareTo(). It only makes the code read a bit differently. The format for the compare() method is as follows:
 *
 * Float.compare(primitiveFloat1, primitiveFloat2)
 *
 * The compare() method shown will actually make the following call using compareTo():
 *
 * new Float(float1).compareTo(new Float(float2)
 *
 * In the end, the same results will be returned using either compareTo() or compare().
 * 
 * Created by ÊBelu on 28/2/2018.
 */
public class ComparingFloatingPointsNumbers_Solution01 {

    public static void main(String[] args) {


        Float float1 = new Float("9.675");
        Float float2 = new Float("7.3826");
        Float float3 = new Float("23467.373");

        System.out.println(float1.compareTo(float3));  // Result: -1
        System.out.println(float2.compareTo(float3));  // Result: -1
        System.out.println(float1.compareTo(float1));  // Result: 0
        System.out.println(float3.compareTo(float2));  // Result: 1
    }
}
