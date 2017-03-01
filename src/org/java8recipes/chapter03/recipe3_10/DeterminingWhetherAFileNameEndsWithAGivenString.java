package org.java8recipes.chapter03.recipe3_10;

import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 28/2/2017.
 */
public class DeterminingWhetherAFileNameEndsWithAGivenString {

    public static void main(String args[]) {

        String fleName="ana.java";
        if(fleName.endsWith(".txt")){
            System.out.println("Text file");
        } else if ( fleName.endsWith( ".doc" ) ){
            System.out.println("Document file");
        } else if ( fleName.endsWith( ".xls" ) ){
            System.out.println("Excel file");
        } else if ( fleName.endsWith( ".java" ) ){
            System.out.println("Java source file");
        } else {
            System.out.println("Other type of file");
        }
    }

}
