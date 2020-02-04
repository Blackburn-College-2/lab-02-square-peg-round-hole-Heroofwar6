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
public class Ellipse extends Measurement {

    double aAxis;
    double bAxis;

    public Ellipse(double aAxis, double bAxis) {
        super(aAxis, bAxis);
        this.aAxis = aAxis;
        this.bAxis = bAxis;
    }
    /**
     * 
     * @return I looked up what the perimeter of an ellipse was and I got this
     *  formula and I'm really irritated with it, but it's the best response I
     *  got so this is going to return something close to the perimeter
     */
    public double getPerimeter() {
        return Math.PI * (3 * (aAxis + bAxis)
                - Math.sqrt((3 * aAxis + bAxis) * (aAxis + 3 * bAxis)));
    }
    /**
     * 
     * @return returns the area of the ellipse
     */
    public double getArea() {
        return Math.PI * (aAxis * bAxis);
    }
}
