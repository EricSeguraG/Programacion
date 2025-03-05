package HERENCIA.COCHE;

public class Marca extends Coche {  
    private String marca;
    private String modelo;
    private int velocidad;


    public Marca(){
        
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getVelocidad() {
        return velocidad;
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
