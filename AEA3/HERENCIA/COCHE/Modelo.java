package HERENCIA.COCHE;

public class Modelo extends Marca {
    private String color;
    private int kms;

    public Modelo(){
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getKms() {
        return kms;
    }
    public void setKms(int kms) {
        this.kms = kms;
    }
    
}

