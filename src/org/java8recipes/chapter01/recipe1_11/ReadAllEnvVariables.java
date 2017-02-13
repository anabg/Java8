package org.java8recipes.chapter01.recipe1_11;

import java.util.Map;

/**
 * Created by æAnita on 12/2/2017.
 * If you are interested in retrieving the entire list of environment variables that is defined on a system,
 * do not pass any arguments to the System.getenv() method. You’ll receive back an object of type Map having all the values.
 */
public class ReadAllEnvVariables {

    public static void main(String[] args) {
        if (args.length > 0) {
            String value = System.getenv(args[0]);
            if (value != null) {
                System.out.println(args[0].toUpperCase() + " = " + value);
            } else {
                System.out.println("No such environment variable exists");
            }
        } else {
            //Get all enviroment variables that are defined in the system.
            //Iterating Through a Map of Environment Variables
            //getenv() method, which will return a value for a given system environment variable
            Map<String, String> vars = System.getenv();
            for (String var : vars.keySet()) {
                System.out.println(var + " = " + vars.get(var));
            }
        }
    }
}
