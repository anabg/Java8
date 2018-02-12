package org.java8recipes.chapter01.recipe1_06;

/**
 * Created by ÊAnita on 25/1/2017.
 *
 * Problem: You want to pass a value into a Java application via the command-line.
 *
 * Solution: Run the application using the java command, and specify the arguments that you want to pass into it after the
 * application name. If you¥re passing more than one argument, each should be separated by a space. For example,
 * suppose you want to pass the argument to the class PassingArguments.
 * First, make sure to compile the program so that you have a .class file to execute. You can do that from within
 * NetBeans by right-clicking the file and choosing the "Compile File" option from the context menu.
 * Next, open a Command Prompt or terminal window and traverse into the build\classes directory for your project.
 * (See Recipe 1-3 for an extensive discussion of executing from the command-line) For example:
 * cd <path-to-project>\Java8Recipes\build\classes
 * Now issue a java command to execute the class, and type some arguments on the command-line following the
 * class name. The following example passes two arguments:
 * java org.java8recipes.chapter01.recipe1_06.PassingArguments Upper Peninsula
 *
 * you should see the following output:
 *
 * Arguments that were passed to the program:
 * Upper
 * Penninsula
 *
 * Spaces separate arguments. Enclose strings in double quotes when you want to pass an argument containing s
 * paces or other special characters. For example:
 * java org.java8recipes.chapter01.recipe1_06.PassingArguments "Upper Peninsula"
 *
 * The output now shows just one argument:
 *
 * Arguments that were passed to the program:
 * Upper Penninsula
 *
 * The doucle quotes translate the string "Upper Peninsula" into a single argument
 *
 * How It Works:
 *
 * All java classes that are executable from the command-line or terminal contain a main() method. If you look at the
 * signature for the main() method, you can see that it accepts a String[] argument. In other words, you can pass an
 * array of String objects into the main() method. Command-line interpreters such as the Windows Command Prompt
 * and the various Linux and Unis shells build an array of strigns out of youurs command-line arguments, and pass that
 * array to the main() method on your behalf.
 * The main() method in the example displays each argument that is passed. First, the length of the array named
 * args is tested to see whether it is a greater than zero. If it is, the method will loop through each of the arguments in the
 * array by executing a for loop, dislaying each argument along the way. If there are no arguments passed, the length
 * of the args array will be zero, and a message indicating such will be printed. Otherwise you see a different message
 * followed by a list of arguments.
 * Command-line interpreters recongnize spaces and sometimes other characters as delimiters. It's generally safe
 * to pass numeric values as arguments delimited by spaces without bothering to enclose each value within quotes.
 * However, you should get into the habit of enclosing characters-string arguments in double quotes, as shown in the final
 * solution example. Do that to eliminate any ambiguity over where each argument begins and ends.
 *
 * NOTE: All arguments are seen by Java as character strings. If you pass numeric values as parameters, they enter
 * Java as character strings in human-readable form. You can convert them into their appropriate numeric types using the
 * conversion methods in Recipe 1-5.
 *
 */
public class PassingArguments {

    public static  void main (String [] args) {

        if (args.length > 0) {

            System.out.println( "Arguments that were passed to the program " );
            for( String arg : args) {
                System.out.println( arg );
            }
        }
        else System.out.println( " No arguments passed to the methods " );

    }
}
