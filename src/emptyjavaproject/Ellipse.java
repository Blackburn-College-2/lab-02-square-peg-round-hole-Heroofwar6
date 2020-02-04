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
public class Ellipse {

    double aAxis;
    double bAxis;

    public Ellipse(double aAxis, double bAxis) {
        this.aAxis = aAxis;
        this.bAxis = bAxis;
    }

    /**
     *
     * @return returns the perimeter of the ellipse
     */
    public double getPerimeter() {
        return 2 * (Math.PI * this.aAxis * this.bAxis);
    }

    /**
     *
     * @return returns the area of the ellipse
     */
    public double getArea() {
        return Math.PI * (aAxis * bAxis);
    }

    /**
     *
     * @return returns the radius's of the Ellipse
     */
    public String toString() {
        Measurement writtenOut = new Measurement(this.aAxis, this.bAxis);
        if (this.aAxis == this.bAxis) {
            return "Circle with radius of " + writtenOut.toString();
        }
        return "Ellipse with radius' of " + writtenOut.toString();
    }

    /**
     *
     * @return returns the ratio of perimeter to area of the ellipse
     */
    public String getEfficiency() {
        Measurement efficiency = new Measurement(this.getPerimeter(), this.getArea());
        return efficiency.getEfficiency();
    }
}
