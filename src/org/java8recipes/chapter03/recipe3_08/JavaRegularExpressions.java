package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 *
 * Java Regex
 * The Java Regex or Regular Expression is an API to define pattern for searching or manipulating strings.
 *
 * It is widely used to define constraint on strings such as password and email validation. After learning java regex tutorial, you will be able to test your own regular expressions by the Java Regex Tester Tool.
 *
 * Java Regex API provides 1 interface and 3 classes in java.util.regex package.
 * java.util.regex package
 * It provides following classes and interface for regular expressions. The Matcher and Pattern classes are widely used in java regular expression.
 * 1-MatchResult interface
 * 2-Matcher class
 * 3-Pattern class
 * 4-PatternSyntaxException class
 *
 *
 *
 * Matcher class
 *
 * It implements MatchResult interface. It is a regex engine i.e. used to perform match operations on a character sequence.
 *
 * No.	Method	Description
 * 1	boolean matches()	test whether the regular expression matches the pattern.
 * 2	boolean find()	finds the next expression that matches the pattern.
 * 3	boolean find(int start)	finds the next expression that matches the pattern from the given start number.
 * 4	String group()	returns the matched subsequence.
 * 5	int start()	returns the starting index of the matched subsequence.
 * 6	int end()	returns the ending index of the matched subsequence.
 * 7	int groupCount()	returns the total number of the matched subsequence.
 *
 *
 *
 * Pattern class
 *
 * It is the compiled version of a regular expression. It is used to define a pattern for the regex engine.
 *
 * No.	Method	Description
 *
 * 1	static Pattern compile(String regex)	compiles the given regex and return the instance of pattern.
 * 2	Matcher matcher(CharSequence input)	creates a matcher that matches the given input with pattern.
 * 3	static boolean matches(String regex, CharSequence input)	It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern.
 * 4	String[] split(CharSequence input)	splits the given input string around matches of given pattern.
 * 5	String pattern()	returns the regex pattern.
 *
 *
 *



 *
 * There are three ways to write the regex example in java.
 */
public class JavaRegularExpressions {

    public static void main(String args[]) {
        //1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }

}
