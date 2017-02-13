package org.java8recipes.chapter01.recipe1_04;

/**
 * Created by ÊAnita on 25/1/2017.
 */
public class TestClass {

    private long visibleOnlyInThisClass;
    double visibleFromEntirePackage;

    void setLong(long val) {
        visibleOnlyInThisClass = val;
    }

    long getLong() {
        return visibleOnlyInThisClass;
    }
}
