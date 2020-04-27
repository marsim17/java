/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue04;

/**
 *
 * @author simon
 */
public class Serienschaltung {
    private double strom;
    private double spannung;
    private double [] widerstandsFeld;
        
    private void updateSpannung() {
        
        if(widerstandsFeld == null) {
            return;
        }
        
        double gesamtwiderstand = 0;
        
        for(int i = 0; i < widerstandsFeld.length; i++) {
            gesamtwiderstand += widerstandsFeld[i];
        }
        this.spannung = gesamtwiderstand * this.strom;
    }
    
    public void addWiderstand(double widerstandInOhm) {
        if(widerstandsFeld == null) {
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = widerstandInOhm;
        }
        else {
            double [] widerstandsFeld1 = widerstandsFeld;
            widerstandsFeld = new double[widerstandsFeld.length + 1];
            widerstandsFeld[widerstandsFeld.length - 1] = widerstandInOhm;
            for(int i = 0; i < widerstandsFeld1.length; i++) {
                widerstandsFeld[i] = widerstandsFeld1[i];
            }
        }
        updateSpannung();
    }
    
    public double getStrom() {
        return this.strom;
    }
    
    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    }
    
    public double getSpannung() {
        return this.spannung;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
    
    
}