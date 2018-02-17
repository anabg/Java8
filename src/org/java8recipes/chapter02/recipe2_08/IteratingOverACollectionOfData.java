package org.java8recipes.chapter02.recipe2_08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Streams API
 *
 * Collections play an integral role in many Java applications. The release of Java 8 introduced the Streams API, which
 * changes the way that collections of data can be used, making solutions more productive and maintainable.
 * The Streams API allows you to traverse over a collection of elements and perform aggregate operations, pipeline two or
 * more operations, perform parallel execution, and more. This section provides a glimpse of the Streams API.
 *
 * <p>
 * Iterating Over a Collection of Data
 * <p>
 * Problem: Your application contains a list of objects and you want to iterate over that list and print out a field for each object.
 * <p>
 * Solution: Utilize the new Java Streams API to iterate over the list of data and perform a task for each element. In the following
 * lines of code, a list is populated with sample data. It is then iterated by generating a stream, and then each element is
 * printed to the command-line using a lambda expression.
 *
 * List<String> myList = new ArrayList();
 *
 * Populate the list
 *
 * for(int x = 0; x <= 10; x++){
 *  myList.add("Test " + x);
 *}
 *
 * Print each element within the list
 *
 * myList.stream().forEach((value)->{
 *  System.out.println(value);
 * });
 *
 * How It Works:
 *
 * The new Streams API enhances the usability of Java Collection types, making it easy to iterate and perform tasks
 * against each element in the collection. In the solution to this recipe, an array of strings is generated, and then a
 * stream is created from the array. Using the stream, each element of the array is printed to the command-line via
 * the forEach() terminal operation. The Streams API allows the compiler to determine the best way to iterate over a
 * collection (internal iteration). A stream is a sequence of object references that can be generated on all collection types.
 * The Streams API makes it possible to perform a sequence of aggregate operations on those object references and
 * return a result or apply the changes to the objects inline. This is otherwise known as a pipeline. The pseudocode for
 * generating and using a stream is as follows:
 *
 * Collection -> (Stream) -> (Zero or More Intermediate Operations) -> (Terminal Operation)
 *
 * Created by ÊBelu on 14/2/2017.
 */
public class IteratingOverACollectionOfData {


    public static void main(String[] args) {
        List<String> myList = new ArrayList();
    // Populate the list
        for (int x = 0; x <= 10; x++) {
            myList.add("Test " + x);
        }
    // Print each element within the list
        myList.stream().forEach((value) -> {
            System.out.println(value);
        });


    }
}
