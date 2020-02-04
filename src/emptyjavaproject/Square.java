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
public class Square extends Rectangle {

    double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }
}
