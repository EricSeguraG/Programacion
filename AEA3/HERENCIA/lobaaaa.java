package AEA3.HERENCIA;

public class lobaaaa extends Animal{

    public Lobo(){
        int id = this.getId();
        this.setId(++id);
    }

    public Lobo(int id){
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