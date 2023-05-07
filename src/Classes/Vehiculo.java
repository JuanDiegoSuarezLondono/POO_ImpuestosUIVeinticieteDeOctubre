/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

        
public class Vehiculo {
    
    private String marca;
    private String Linea;
    private String Modelo;
    private int Valor;

    public Vehiculo(String marca, String Linea, String Modelo, int Valor) {
        this.marca = marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.Valor = Valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return Linea;
    }

    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
}
