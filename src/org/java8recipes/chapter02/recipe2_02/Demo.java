package org.java8recipes.chapter02.recipe2_02;

/**
 *
 * A method reference can now be used to assign the functionality of the calculateVolume() method to a variable.
 * In the following code, the method reference is assigned to a variable identified as volume,
 * and then the volume variable is passed to the calculateGallons() method.
 *
 *
 * How It Works:
 *
 * Lambda expressions allow you to encapsulate functionality and assign to a variable for later use, if desired.
 * Believe it or not, there is a simplified variation of a lambda expression referred to as a method reference. If a class
 * contains a method that is derived from the implementation of a functional interface, then that method can be obtained or
 * ìcapturedî and assigned to a variable for later use. The concept being that the method contains functionality that can
 * be assigned to a variable of the same type as the functional interface.
 * In the example for this recipe, a functional interface identified as Volume contains a single abstract method,
 * calculateVolume(). The PoolCalculator class implements the Volume interface, as it contains an implementation of
 * the calculateVolume() method. To capture this method via a method reference, you can use the following syntax on
 * an instance of the PoolCalculator class:
 *
 * poolCalculator::calculateVolume
 *
 * The double colon operator is used to indicate a method reference. In this example, a reference to an instance
 * method of a specific object is used. However there are various types of method references; to learn more about
 * them refer to Chapter 6.
 *
 * Created by ÊBelu on 12/2/2017.
 */
public class Demo {

    public static void main(String[] args) {

        PoolCalculator calculator = new PoolCalculator();
        calculator.setLength(32);
        calculator.setWidth(16);
        calculator.setMinDepth(4);
        calculator.setMaxDepth(8);
        Volume volume = calculator::calculateVolume;
        double poolVolume = volume.calculateVolume();
        System.out.println("Volume of the pool is: " + poolVolume + " cubic feet");
        System.out.println("Gallons in the pool: " + calculator.calculateGallons(volume));


    }
}
