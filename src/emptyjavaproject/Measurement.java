/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author krigsdator
 */
public class Measurement {

    double value1 = 0;
    double value2 = 0;
    String unit = "meter(s)";

    public Measurement(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     *
     * @return a string that measures the given shape
     */
    @Override
    public String toString() {
        String howLong = this.value1 + " " + this.unit + " by "
                + this.value2 + " " + this.unit;
        if (this.value1 == this.value2) {
            howLong = this.value1 + " " + this.unit;
        }
        return howLong;
    }

    /**
     *
     * @param area the area of the given shape
     * @param perimeter the perimeter of the given shape
     * @return a string that gives the ratio of perimeter to area
     */
    public String getEfficiency() {
        return "The ratio of perimeter to area for this shape is "
                + this.value1 + ":" + this.value2;
    }
}
