package AEA3.HERENCIA;

public class Tigre extends Animal{

    public Tigre(){
        int id = this.getId();
        this.setId(++id);
    }

    public Tigre(int id){
        this.setId(id);
    }

    // Own behavior
    private void bark() {
        System.out.println("Tigre '" + this.getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}