package org.java8recipes.chapter01.recipe1_04;

/**
 * Created by ÊBelu on 25/1/2017.
 */
public class VisibilityExample {

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.setLong(32768);
        tc.visibleFromEntirePackage = 3.1415926535;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFromEntirePackage);
    }


}
