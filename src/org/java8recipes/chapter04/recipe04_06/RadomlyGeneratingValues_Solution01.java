package org.java8recipes.chapter04.recipe04_06;

import java.util.Random;

/**
 *
 *
 * Created by ÊBelu on 1/3/2018.
 */
public class RadomlyGeneratingValues_Solution01 {

    public static void main(String[] args) {

        // Create a new instance of the Random class
        Random random = new Random();
        // Generates a random Integer int myInt = random.nextInt();

        // Generates a random Double value
        double myDouble = random.nextDouble();

        // Generates a random float
        float myFloat = random.nextFloat();

        // Generates a random Gaussian double
        // mean 0.0 and standard deviation 1.0
        // from this random number generator's sequence.
        double gausDouble = random.nextGaussian();

        // Generates a random Long
        long myLong = random.nextLong();

        // Generates a random boolean
        boolean myBoolean = random.nextBoolean();



    }
}
