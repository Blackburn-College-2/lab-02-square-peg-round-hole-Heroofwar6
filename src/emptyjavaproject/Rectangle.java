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
public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
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

    /**
     *
     * @return returns the sides of the rectangle
     */
    public String toString() {
        Measurement writtenOut = new Measurement(this.height, this.width);
        if (this.height == this.width) {
            return "Square of sides " + writtenOut.toString();
        }
        return "Rectangle of sides " + writtenOut.toString();
    }

    /**
     *
     * @return returns the ratio of the perimeter to the area
     */
    public String getEfficiency() {
        Measurement efficiency = new Measurement(this.getPerimeter(), this.getArea());
        return efficiency.getEfficiency();
    }

}
