package HERENCIA.PERSOESTU;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Persona p1 = new Persona("Juan", "Perez", "Calle 1", 20, 1);
        p1.imprimir();

        Estudiante e = new Estudiante();
        e.setId(2);
        e.setNombre("Perro");
        e.setApellido("Sanxe");
        e.setEdad(20);
        e.setDireccion("calle cuenca");
        e.setAsignatura("programacion with Marina");
        e.setCurso("Dam 1");
        e.setCentro("Prat");
        e.setNotas(10);
        e.imprimir();
    }
    
}
