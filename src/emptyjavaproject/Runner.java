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
        Rectangle shape3 = new Square(5.0);
        Rectangle shape4 = new Square(2.0);
        
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
    }
    
}
