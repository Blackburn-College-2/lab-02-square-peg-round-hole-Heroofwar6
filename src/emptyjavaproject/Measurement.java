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
public class Measurement {
    double value = 0;
    String unit = "meter(s)";
    
    public Measurement(double value){
        this.value = value;        
    }
    
    public String takeAMeasurement(){
        String howLong = this.value + " " + this.unit;
        return howLong;
    }
}
