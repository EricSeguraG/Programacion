package HERENCIA.PERSOESTU;

public class Estudiante extends Persona {
    private String curso;  
    private String asignatura;    
    private String centro;
    private int notas;

public Estudiante(){
    this.setId(getId()+1);
    this.setEdad(getEdad());
    this.setNombre(getNombre());
    this.setApellido(getApellido());
    this.setDireccion(getDireccion());

    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public String getCentro() {
        return centro;
    }
    public void setCentro(String centro) {
        this.centro = centro;
    }
    public int getNotas() {
        return notas;
    }
    public void setNotas(int notas) {
        this.notas = notas;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Asignatura: " + this.getAsignatura());
        System.out.println("Centro: " + this.getCentro());
        System.out.println("Notas: " + this.getNotas());
    
}
}