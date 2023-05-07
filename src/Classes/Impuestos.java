/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;


public class Impuestos {
    
    private static Impuestos instance;
    private Vehiculo V;
    private double descuento;
    private boolean limpiar;
    private static double DPP;
    private static double DSP;
    private static double DTC;
    
    public Impuestos() throws FileNotFoundException, IOException{
        V=new Vehiculo("", "", "", 0);        
        limpiar=false;
        DPP=0.3;
        DSP=0.1;
        DTC=0.05;        
    }
    
    public static Impuestos getInstance() throws FileNotFoundException, IOException {        
        if(instance==null) {
            instance=new Impuestos();
        }        
        return instance;
    }

    public void setV(Vehiculo V) {
        this.V = V;
    }

    public Vehiculo getV() {
        return V;
    }

    public double getTotal() {
        return V.getValor()*descuento;
    }

    public void setTotalDPP() {
        this.descuento = DPP;
    }
    
    public void setTotalDSP() {
        this.descuento = DSP;
    }
    
    public void setTotalDTC() {
        this.descuento = DTC;
    }
    
    public boolean getLimpiar() {
        return limpiar;
    }
    
    public void setLimpiar(boolean limpiar) {
        this.limpiar=limpiar;
    }
}
