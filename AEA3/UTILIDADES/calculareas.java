package AEA3.UTILIDADES;

public class calculareas {
    public double triangle(double altura, double base){
        return (altura*base)/2;
    }
    public double quadrat(double ladito){
        return Math.pow(ladito, 2);
    }
    public double rectangle(double altura, double base){
        return altura*base;
    }
    public double trapezi(double altura, double base, double alturaTrap){
        return ((altura*base)*alturaTrap)/2;
    }
    public double rombe(double diametre, double mitj){
        return (diametre*mitj)/2;
    }
    public double paralelogram(double base, double altura){
        return base*altura;
    }
    public double cercle(double radio){
        return Math.pow(radio, 2)*Math.PI;
    }


    
}
