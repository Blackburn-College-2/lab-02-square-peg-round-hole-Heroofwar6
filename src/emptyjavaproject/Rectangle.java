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
    
    public Rectangle(double width, double height){
        super(width);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "New Rectangle: " + width + " " + super.unit + " by "
                + height + " " + super.unit;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return 2 * (width + height);
    }
    
}
