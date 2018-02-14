package org.java8recipes.chapter02.recipe2_02;

/**
 *
 * Calling On an Existing Method from a Lambda Expression:
 *
 *Problem:
 * You are using a lambda expression to call on a single existing method that implements a functional interface, and
 * youdí like to shorten the length of the code required to perform this method call. Moreover, you want to be able to
 * pass the method functionality as an argument.
 *
 *Solution:
 * Utilice a method reference to call on a single existing method that implements a functional interface. In the following
 * example, a pool calculation class implements a functional interface in order to obtain the calculated volume of a pool.
 * The functional interface Volume is as follows:
 *
 * Created by ÊBelu on 12/2/2017.
 */
public interface Volume {

    double calculateVolume();

}
