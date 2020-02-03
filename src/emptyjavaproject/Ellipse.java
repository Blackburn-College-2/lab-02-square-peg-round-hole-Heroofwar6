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
    public Ellipse(double aAxis, double bAxis){
        super(aAxis);
        this.aAxis = aAxis;
        this.bAxis = bAxis;
    }
    public double getPerimeter(){
        return Math.PI * (3*(aAxis + bAxis)-
                Math.sqrt((3*aAxis+bAxis)*(aAxis+3*bAxis)));
    }
    public double getArea(){
        return Math.PI * (aAxis * bAxis);
    }
    @Override
    public String toString(){
        return "New Ellipse of " + aAxis + " by " + bAxis;
    }
}
