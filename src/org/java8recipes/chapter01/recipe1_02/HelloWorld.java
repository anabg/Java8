package org.java8recipes.chapter01.recipe1_02;

/**
 * Created by ÊAnita on 24/1/2017.
 */
public class HelloWorld {



    public static void main (String[] args){

        HelloMessage hm = new HelloMessage();

        System.out.println(hm.getMessage());

        hm.setMessage("Hello, World");

        System.out.println(hm.getMessage());

    }

}
