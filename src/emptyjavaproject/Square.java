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
public class Square extends Rectangle{
    double side;
    
    public Square (double height, double width, double side){
      super(height, width);
      this.side = side;
        
        System.out.println("New Square: " + side);
    }
}
