package org.java8recipes.chapter03.recipe3_07;

/**
 * Created by ÊAnita on 26/2/2017.
 */
public class IteratingOverTheCharactersOfTheString {

    public static void main(String[] args) {

        String str = "Break down into chars";

        System.out.println(str);

        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }


        //using a traditional loop version

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }

    }
}
