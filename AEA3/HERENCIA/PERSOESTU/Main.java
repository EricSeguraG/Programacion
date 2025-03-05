package HERENCIA.PERSOESTU;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Persona p1 = new Persona("Juan", "Perez", "Calle 1", 20, 1);
        p.imprimir();

        Estudiante e = new Estudiante();
        e.setNombre("juan");
        e.imprimir();
    }
    
}
