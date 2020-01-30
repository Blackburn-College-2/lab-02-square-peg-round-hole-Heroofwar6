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
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        
        System.out.println("New Rectangle: " + width + " by " + height);
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
