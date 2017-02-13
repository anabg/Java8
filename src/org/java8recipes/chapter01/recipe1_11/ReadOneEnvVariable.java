package org.java8recipes.chapter01.recipe1_11;

/**
 * Created by æAnita on 12/2/2017.
 */
public class ReadOneEnvVariable {


    public static void main(String[] args) {
        if (args.length > 0) {
            String value = System.getenv(args[0]);
            if (value != null) {
                System.out.println(args[0].toUpperCase() + " = " + value);
            } else {
                System.out.println("No such environment variable exists");
            }

        } else {
            System.out.println("No arguments passed");
        }
    }
}
