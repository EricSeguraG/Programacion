package HERENCIA.COCHE;

public class MainCoche {
    public static void main(String[] args) {
        Coche c = new Coche();
        c.setTipovehiculo("Suv");
        c.setId(1);
        System.out.println(c.getId());
        System.out.println(c.getTipovehiculo());
        
        Marca m = new Marca();
        m.setMarca("Nissan");
        m.setModelo("Maxima");
        m.setVelocidad(100);
        m.setId(2);
        System.out.println(m.getId());
        System.out.println(m.getMarca());
        System.out.println(m.getModelo());
        System.out.println(m.getVelocidad());
        
        Modelo mo = new Modelo();
        mo.setMarca("Nissan");
        mo.setModelo("Maxima");
        mo.setVelocidad(100);
        mo.setColor("Blanco");
        mo.setKms(100);
        mo.setId(3);
        System.out.println(mo.getId());
        System.out.println(mo.getMarca());
        System.out.println(mo.getModelo());
        System.out.println(mo.getVelocidad());
        System.out.println(mo.getColor());        
        System.out.println(mo.getKms());
    }
    
}
