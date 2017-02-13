package org.java8recipes.chapter01.recipe1_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

/**
 * Created by ÊAnita on 25/1/2017.
 */
public class AcceptingInput {


    public static void main(String[] args) {

        BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
        String numberAsString = "";
        long numberAsLong = 0;


        boolean numberIsValid = false;


        do {


            /* Ask the user for the number */

            try {

                System.out.println(" Please enter a number ");

                numberAsString = readIn.readLine();
                System.out.println(" The enter number is " + numberAsString);
            } catch (IOException ex) {
                System.out.println(ex);
            }


            /* Conver the number into binary form */

            try {

                numberAsLong = Long.parseLong(numberAsString);
                numberIsValid = true;
            } catch (NumberFormatException ex) {

                System.out.println(" Not is a number ");

            }
        } while (numberIsValid == false);
    }
}
