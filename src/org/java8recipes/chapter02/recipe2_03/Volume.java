package org.java8recipes.chapter02.recipe2_03;

/**
 * Providing a Default Method Implementation in an Interface
 * Problem:
 * You want to add a new method to an existing interface without breaking backward compatibility with other code.
 *
 * Solution: Develop a default method (a.k.a. defender method) within the interface so that any classes implementing the interface
 * are not required to provide an implementation of the new method. To do so, add the new default keyword to
 * the interface declaration and provide a method implementation. The following interface Volume includes a default
 * method implementation for the calculateVolume method:
 *
 * Created by æBelu on 13/2/2017.
 */
public interface Volume {

    /**
     * Calculate pool volume given depth values and measurement values.
     * For  a pool with variable depth, the minDepth should be depthValues[0], and
     * the maxDepth should be passed as depthValues[1].
     * This interface can accept multiple measurement values, but it expects
     * measurementValues[0] == length, or measurementValues[0] == radius
     * measurementValues[1] == width
     * @param depthValues
     * @param measurementValues
     * @return
     */


    default double calculateVolume(Double[] depthValues, Double[] measurementValues) {
        double length, width, radius, minDepth, maxDepth, avgDepth = 0;
        if (depthValues.length > 1) {
            minDepth = depthValues[0];
            maxDepth = depthValues[1];
            avgDepth = (minDepth + maxDepth) / 2;
        } else if (depthValues.length == 1) {
            avgDepth = depthValues[0];
        }
        if (measurementValues.length > 1) {
            length = measurementValues[0];
            width = measurementValues[1];
            radius = 0;
        } else {
            length = 0;
            width = 0;
            radius = measurementValues[0];
        }
        if (radius == 0) {
            return length * width * avgDepth;
        } else {
            return (radius * radius) * 3.14 * avgDepth;
        }
    }

    ;
}
