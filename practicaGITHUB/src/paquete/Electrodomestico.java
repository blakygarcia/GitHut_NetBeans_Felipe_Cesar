/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author luism
 */
public class Electrodomestico {

    //Atributos o variables de instancia
    private int codigo;
    private String nombre;
    private String marca;
    private double precio;

    //Constructores
     public Electrodomestico() {
        this.codigo = 0;
        this.nombre = "";
        this.marca = "";
        this.precio = 0.0;
    }
    
    public Electrodomestico(int codigo, String nombre, String marca, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
    
    //Propiedades Get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    //Propiedades Set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
