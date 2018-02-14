package org.java8recipes.chapter02.recipe2_02;

/**
 * The PoolCalculator class implements Volume, as it contains an implementation for the calculateVolume() method.
 * Therefore, that method can be called on via a method reference and assigned to a variable, which can
 * then be passed as an argument as needed. The following code shows the PoolCalculator class.
 * <p>
 * Created by ÊBelu on 12/2/2017.
 */
public class PoolCalculator implements Volume {

    private double width;
    private double length;
    private double minDepth;
    private double maxDepth;

    public PoolCalculator() {
    }

    public PoolCalculator(double width, double length, double minDepth, double maxDepth) {
        this.width = width;
        this.length = length;
        this.minDepth = minDepth;
        this.maxDepth = maxDepth;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculate the volume
     *
     * @return
     */
    public double calculateVolume() {
        double avgDepth = (minDepth + maxDepth) / 2;
        return avgDepth * length * width;
    }

    /**
     * Returns the number of gallons for a given Volume     * @param vol
     * <p>
     * <p>
     * }
     * * @return
     */
    public double calculateGallons(Volume vol) {
        return 7.48 * vol.calculateVolume();
    }

    /**
     * @return the minDepth
     */
    public double getMinDepth() {
        return minDepth;
    }

    /**
     * @param minDepth the minDepth to set
     */
    public void setMinDepth(double minDepth) {
        this.minDepth = minDepth;
    }

    /**
     * @return the maxDepth
     */
    public double getMaxDepth() {
        return maxDepth;
    }

    /**
     * @param maxDepth the maxDepth to set
     */
    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}