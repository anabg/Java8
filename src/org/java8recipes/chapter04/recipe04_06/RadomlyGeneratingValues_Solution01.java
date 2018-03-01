package org.java8recipes.chapter04.recipe04_06;

import java.util.Random;

/**
 * Problem: An application that you are developing requires the use of randomly generated numbers.
 *
 * Solution #1
 *  Use the java.util.Random class to help generate the random numbers. The Random class was developed for the
 *  purpose of generating random numbers for a handful of the Java numeric data types. This code demonstrates the use
 *  of Random to generate such numbers:
 *
 * How It Works
 *
 * The java.util.Random class uses a 48-bit seed to generate a series of pseudo-random values. As you can see from
 * the example in the solution to this recipe, the Random class can generate many different types of random number
 * values based on the given seed. By default, the seed is generated based on a calculation derived from the number of
 * milliseconds that the machine has been active. However, the seed can be set manually using the Random setSeed()
 * method. If two Random objects have the same seed, they will produce the same results.
 *
 * It should be noted that there are cases in which the Random class might not be the best choice for generating
 * random values. For instance, if you are attempting to use a thread-safe instance of java.util.Random, you might
 * run into performance issues if you’re working with many threads. In such a case, you might consider using the
 * ThreadLocalRandom class instead. To see more information regarding ThreadLocalRandom, see the documentation at
 * http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadLocalRandom.html.
 *
 * Similarly, if you require the use of a cryptographically secure Random object, consider the use of SecureRandom.
 * Documentation regarding this class can be found at http://docs.oracle.com/javase/8/docs/api/java/security/
 * SecureRandom.html.
 *
 * The java.util.Random class comes in very handy when you need to generate a type-specified random value.
 * Not only is it easy to use but it also provides a wide range of options for return type. Another easy technique is to use
 * the Math.random() method, which produces a double value that is within the range of 0.0 to 1.0, as demonstrated in
 * solution #2. Both techniques provide a good means of generating random values. However, if you need to generate
 * random numbers of a specific type, java.util.Random is the best choice.
 *
 * 
 * Created by �Belu on 1/3/2018.
 */
public class RadomlyGeneratingValues_Solution01 {

    public static void main(String[] args) {

        // Create a new instance of the Random class
        Random random = new Random();

        // Generates a random Integer
        int myInt = random.nextInt();
        System.out.println("Random int " + myInt);

        // Generates a random Double value
        double myDouble = random.nextDouble();
        System.out.println("Random double " + myDouble);

        // Generates a random float
        float myFloat = random.nextFloat();
        System.out.println("Random float " + myFloat);

        // Generates a random Gaussian double
        // mean 0.0 and standard deviation 1.0
        // from this random number generator's sequence.
        double gausDouble = random.nextGaussian();
        System.out.println("Random gausDouble " + gausDouble);

        // Generates a random Long
        long myLong = random.nextLong();
        System.out.println("Random long " + myLong);

        // Generates a random boolean
        boolean myBoolean = random.nextBoolean();
        System.out.println("Random boolean " + myBoolean);


    }
}
