/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author cameron.shinall
 */
public class Rectangle extends Measurement {

    double width;
    double height;

    public Rectangle(double width, double height) {
        super(width, height);
        this.width = width;
        this.height = height;
    }
    /**
     * 
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     * 
     * @return the height of the rectangle
     */
    public double getHeight() {
        return height;
    }
    /**
     * 
     * @return the area of the rectangle
     */
    public double getArea() {
        return width * height;
    }
    /**
     * 
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
