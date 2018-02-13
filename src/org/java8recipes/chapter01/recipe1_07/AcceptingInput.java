package org.java8recipes.chapter01.recipe1_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * <p>
 * Problem:
 * You are interested in writing a command-line or terminal application that will accept user input from the keyboard.
 * <p>
 * Solution:
 * <p>
 * Make use of the java.io.BufferedReader and java.io.InputStreamReader classes to read keyboard entry and store
 * it into local variables. Listing 1-7 shows a program that will keep prompting for input until you enter some characters
 * that represent a valid value of type long.
 * <p>
 * How It Works:
 * <p>
 * Quite often our applications need to accept user input of some kind. Granted, most applications are not used from
 * the command-line or terminal nowadays, but having the ability to create an application that reads input from the
 * command-line or terminal helps to lay a good foundation, and may be useful in some applications. Terminal input
 * can also be useful un developing administrative applications tha you or a system administrator may use.
 * Two helper classes were used in the solution to this recipe. They are java.io.BufferedReader and
 * java.io.InputStreamReader. The early portion of the code that's using those classes is especially important to
 * understand:
 * <p>
 * BufferedReader readIn = new BufferedReader( new InputStreamReader(System.in));
 * <p>
 * The innermost object in this statement is Syste.in. It represents the keyboard. You do not need to declare
 * System.in. Javas's runtime environment creates the object for you. It is simply "there" to be used.
 * System.in provides access to raw bytes of data from the input device, which is the keyboard in our example. It is
 * the job of the InputStreamReader class to take those bytes and convert them into characters in your current character
 * set. System.in is passed to the InputStreamReader() constructor to create an InputStreamReader object.
 * InputStreamReader knows about characters, but not about lines. It is the BufferedReader class's job to detect
 * line break's in the input stream, and to enable you to conveniently read a line at a time. BufferedReader also aids
 * efficiency by allowing physical reads from the input device to be done in different-size chunks than by which your
 * application consumes the data. This aspect can make a difference when the input stream is a large file rather than the
 * keyboard.
 * Following is how the program in Listing 1-7 makes use of an instance (named readIn) of the BufferedReader
 * class to read a line of input from the keyboard:
 * <p>
 * numberAsString = readIn.readLine();
 * <p>
 * Executing this statement triggers the following sequene:
 * 1. System.in returns a sequence of bytes.
 * 2. InputStreamReader converts those bytes into characters
 * 3. BufferedReader breaks the character stream into lines input.
 * 4. readLine() returns one line of input to the application.
 * <p>
 * I/O calls must be wrapped in try...catch blocks. These blocks catch any exceptions that may occur. The try part
 * in the example will fail in the event a conversion is unsuccessful. A failure prevents the numberIsValid flag from being
 * set to true, which causes the do loop to make another iteration so that user can try again at entering a valid value.
 * The following statement at the top of Listing 1-7 deserves some mention:
 * import java.io.*;
 * <p>
 * This statement makes available the classes and the methods defined in the java.io package. These include
 * InputStreamReader and BufferedReader. Also included is the IOException class used in the firt try...catch block.
 *
 * Created by ÊBelu on 25/1/2017.
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
