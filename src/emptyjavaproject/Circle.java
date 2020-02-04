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
public class Circle extends Ellipse {

    double radius;

    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
    }
}
