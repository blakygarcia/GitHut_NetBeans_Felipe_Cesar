/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CESAR L
 */
public class Coches {
  
    private String Placa;
    private String Marca;
    private int Motor;
    
    //CONSTRUCTORES
    public Coches() {
        this.Placa = "";
        this.Marca = "";
        this.Motor = 0;
    } 
    
    
    public Coches(String Placa, String Marca, int Motor) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Motor = Motor;
    }
        
    //GETTER
    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public int getMotor() {
        return Motor;
    }
        
    //SETTER
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setMotor(int Motor) {
        this.Motor = Motor;
    }
 
    
    
    
}
