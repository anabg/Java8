package org.java8recipes.chapter01.recipe1_08;

import java.math.BigInteger;

/**
 *
 * <p>
 * Problem: You want to document some of your java classes to assist in future maintenance.
 * <p>
 * Solution: Use Javadoc to place comments before any class, method, or field that you want to document. To begin such a
 * comment, write the characters /**. Then begin each subsequent line with an asterisk (*). Lastly, close the comment
 * with the characters Comments can be added to the beginning of the classes and fields in the same way. The comments are helpful to
 * you and other programmers maintaining the code, and their specific format enables easy generation of an HTML
 * reference to your code.
 * Generate the HTML reference by invoking the tool named Javadoc. This is a command-line tool that parses a
 * named Java soure file and formulates HTML documentation based upon the defined class elements and Javadoc
 * comments. For example:
 * <p>
 * javadoc JavadocExample.java
 * <p>
 * This command will produce several HTML files containing the documentation for the class, methods, and fields.
 * If no Javadoc comments exist within the source, some default documentation will still produced. To view the
 * documentation, load the following file into your browser:
 * index.html
 * <p>
 * The file will be in the same directory as the class or package that you are documenting. There will also be an
 * index-all.html file giving a strict alphabetical listing of documented entities.
 * Keep in mind that the same rules apply when using the Javadoc tool as when using javac. You must reside within
 * the same directory as the soure file, or prepend the name of the file with the path to where the file located.
 * <p>
 * How It Works:
 * Generating documentation for applications from scratch can be quite tedious. Maintaining documentation can be even
 * more troublesome. The JDK comes packaged with an extensive system for documentation known as Javadoc. Placing
 * some special comments throughout your code source and running a simple command-line tool makes it easy to generate
 * useful documentation and keep it current. Moreover, even if some of the classes, methods, or fields in an application are
 * not commented specifically for the Javadoc utility, default documentation will still be produced for such elements.
 * <p>
 * Formatting the Documentation
 * To create a Javadoc comment, begin with the characters /**. Although optional since Java 1.4, a common practice is to
 * include an asterisk as the first character of every subsequent line within the comment. Another good practice is to indent
 * the comment so that it aligns with the code that is being documented. Lastly, close the comment with the characters
 */ //on a line by themselves at the end. Listing 1-8 shows a methos commented with javadoc.
/** Comments can be added to the beginning of the classes and fields in the same way. The comments are helpful to
 * you and other programmers maintaining the code, and their specific format enables easy generation of an HTML
 * reference to your code.
 * Generate the HTML reference by invoking the tool named Javadoc. This is a command-line tool that parses a
 * named Java soure file and formulates HTML documentation based upon the defined class elements and Javadoc
 * comments. For example:
 *
 * javadoc JavadocExample.java
 *
 * This command will produce several HTML files containing the documentation for the class, methods, and fields.
 * If no Javadoc comments exist within the source, some default documentation will still produced. To view the
 * documentation, load the following file into your browser:
 * index.html
 *
 * The file will be in the same directory as the class or package that you are documenting. There will also be an
 * index-all.html file giving a strict alphabetical listing of documented entities.
 * Keep in mind that the same rules apply when using the Javadoc tool as when using javac. You must reside within
 * the same directory as the soure file, or prepend the name of the file with the path to where the file located.
 *
 * How It Works:
 *Generating documentation for applications from scratch can be quite tedious. Maintaining documentation can be even
 *more troublesome. The JDK comes packaged with an extensive system for documentation known as Javadoc. Placing
 *some special comments throughout your code source and running a simple command-line tool makes it easy to generate
 *useful documentation and keep it current. Moreover, even if some of the classes, methods, or fields in an application are
 *not commented specifically for the Javadoc utility, default documentation will still be produced for such elements.
 *
 * Formatting the Documentation
 * To create a Javadoc comment, begin with the characters /**. Although optional since Java 1.4, a common practice is to
 * include an asterisk as the first character of every subsequent line within the comment. Another good practice is to indent
 * the comment so that it aligns with the code that is being documented. Lastly, close the comment with the characters */

/**Javadoc comments should begin with a short description of the class or method. Fields are rarely commented
 * using Javadoc, unless they are declared public static final (constants), in which case it is a good idea to supply a
 * comment. A comment can be several lines in length, and can even contain more than one paragraph. If you want to
 * break comments into paragraphs, then separate those paragraphs using the <p> tag. Comments can include several
 * tags that indicate various details regarding the method or class that is being commented. Javadoc tags begin with an
 * ampersand (@), and some of the common tags are as follows:
 *
 * @param: Name and description of a parameter
 * @return: What is returned from the method
 * @see: Reference to another piece of code
 *
 * You may also include inline links within Javadoc to reference URLs. To include an inline link, use the tag
 * {@link My Link}, where link is the actual URL that you want to point at and My Link is the text that you want to have
 * appear. There are also many other tags that can be used within Javadoc comments, including {@literal}, {@code},
 * {@value org}, and many others. For a complete listing, see the Javadoc reference on the Oracle Technology
 * Network website.
 *
 * Executing the Tool
 *
 * The Javadoc tool can also be run against entire packages or source. Simply pass a package name to the Javadoc tool
 * rather than individual source file names. For instance, if an application includes a package named org.juneau.beans,
 * all source files within that package can be documented by running the tool as follows:
 *
 * javadoc org.juneau.beans
 *
 * To generate Javadoc for more than one package at a time, separate the package names with spaces as follows:
 *
 * javadoc org.juneau.beans org.juneau.entity
 *
 * Another option is to specify the path to the source files using the ñsourcepath flag. For example:
 *
 * javadoc ñsourcepath /java/src
 *
 * By default, the Javadoc tool will generate HTML and place it into the same package as the code being documented.
 * That result can become a cluttered nightmare if you like to have source files separate from documentation. You can
 * instead set up a destination for the generated documentation by passing the ñd flag to the Javadoc tool.
 *
 * Created by ÊBelu on 29/1/2017.
 */
public class JavadocExample {


    /**
     * Accepts an unlimited number of values and
     * returns the sum
     *
     * @param numbs Must be an array of BigInteger values.
     * @return Sum of all numbers in the array.
     */
    public static BigInteger addNumbers(BigInteger[] numbs) {


        BigInteger result = new BigInteger("0");

        for (BigInteger num : numbs) {


            result = result.add(num);


        }
        return result;
    }


    /**
     * Test the addNumbers method.     * @param args not used
     */


    public static void main(String[] args) {
        BigInteger[] someValues = {BigInteger.TEN, BigInteger.ONE};
        System.out.println(addNumbers(someValues));
    }
}



