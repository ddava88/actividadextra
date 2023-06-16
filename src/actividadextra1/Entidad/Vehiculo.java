/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra1.Entidad;

/**
 *
 * @author XSF
 */
public class Vehiculo {

    private String marca;
    private int amo;
    private String tipo;
    private String modelo;
    private double metros; 

  
  

    
    //contructores
    public Vehiculo() {
    }

    public Vehiculo(String marca, int amo, String tipo, String modelo, double metros) {
        this.marca = marca;
        this.amo = amo;
        this.tipo = tipo;
        this.modelo = modelo;
        this.metros = metros;
    }



    
    // Getters
    
      public double getMetros() {
        return metros;
    }
    public String getMarca() {
        return marca;
    }

    public int getAmo() {
        return amo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    //setters
    
      public void setMetros(double metros) {
        this.metros = metros;
    }

    public void setAmo(int amo) {
        this.amo = amo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
