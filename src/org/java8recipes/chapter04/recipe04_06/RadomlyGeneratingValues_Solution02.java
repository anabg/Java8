package org.java8recipes.chapter04.recipe04_06;

/**
 *
 * Solution #2
 *
 *  Make use of the Math.random() method. This will produce a double value that is greater than 0.0, but less than 1.0.
 *  The following code demonstrates the use of this method:
 *
 *  double rand = Math.random();

 * Created by �Anita on 1/3/2018.
 */
public class RadomlyGeneratingValues_Solution02 {

    public static void main(String[] args) {

        double rand = Math.random();

        System.out.println("random number " + rand);

    }
}
