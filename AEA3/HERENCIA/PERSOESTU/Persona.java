package HERENCIA.PERSOESTU;

public class Persona {
    private static int id;
    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(){
    }
    public Persona(String nombre, String apellido, String direccion, int edad, int id){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void imprimir(){
        System.out.println("Id: " + this.getId());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Direccion: " + this.getDireccion());
    }

}

