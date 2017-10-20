package org.java8recipes.chapter01.recipe1_04;

/**
 * Created by ÊAnita on 25/1/2017.
 * <p>
 * Problem You want to create some variables and manipulate data within your program.
 * Solution Java implements eight primitive data types. There is also special support for
 * the String class type. Listing 1-2 shows an example declaration of each. Draw from the
 * example to declare the variables needed in your own application.
 */
public class DeclarationsExample {

    public static void main(String[] args) {
        boolean BooleanVal = true;  /* Default is false */
        char charval = 'G';     /* Unicode UTF-16 */
        charval = '\u0490';     /* Ukrainian letter Ghe(?) */
        byte byteval;       /*  8 bits, -127 to 127 */
        short shortval;     /* 16 bits, -32,768 to 32,768 */
        int intval;         /* 32 bits, -2147483648 to 2147483647 */
        long longval;       /* 64 bits, -(2^64) to 2^64 - 1 */
        float floatval = 10.123456F; /* 32-bit IEEE 754 */
        double doubleval = 10.12345678987654; /* 64-bit IEEE 754 */
        String message = "Darken the corner where you are!";
        message = message.replace("Darken", "Brighten");
    }
}
