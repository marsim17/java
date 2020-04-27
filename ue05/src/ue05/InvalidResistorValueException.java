/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05;

/**
 *
 * @author simon
 */
public class InvalidResistorValueException extends Exception {

    private double invalidValue;
    
    public InvalidResistorValueException(double invalidValue) {
        this.invalidValue = invalidValue;
        
        if(invalidValue <= 0) {
            
        }
        else if (invalidValue > 10000000){
            
        }
    }  
}
