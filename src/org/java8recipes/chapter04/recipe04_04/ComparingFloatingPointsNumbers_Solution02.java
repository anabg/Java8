package org.java8recipes.chapter04.recipe04_04;

/**
 * Solution #2
 *  Use the Float class compare() method to perform the comparison. The following example demonstrates the use of
 *  the Float.compare(float, float) method.
 *
 *  Float float1 = new Float("9.675");
 *  Float float2 = new Float("7.3826");
 *  Float float3 = new Float("23467.373");
 *
 *  System.out.println(Float.compare(float1, float3));  // Result: -1
 *  System.out.println(Float.compare(float2, float3));  // Result: -1
 *  System.out.println(Float.compare(float1, float1));  // Result: 0
 *  System.out.println(Float.compare(float3, float2));  // Result: 1

 * Created by ÊBelu on 28/2/2018.
 */
public class ComparingFloatingPointsNumbers_Solution02 {

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
