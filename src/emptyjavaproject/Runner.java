/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle shape1 = new Rectangle(1.0, 2.0);
        Rectangle shape2 = new Rectangle(4.0, 7.0);
        Square shape3 = new Square(5.0);
        Square shape4 = new Square(2.0);
        Ellipse shape5 = new Ellipse(1.0, 2.0);
        Ellipse shape6 = new Ellipse(4.0, 7.0);
        Circle shape7 = new Circle(5.0);
        Circle shape8 = new Circle(2.0);
        
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
        System.out.println(shape4.toString());
        System.out.println(shape5.toString());
        System.out.println(shape6.toString());
        System.out.println(shape7.toString());
        System.out.println(shape8.toString());
    }
    
}
