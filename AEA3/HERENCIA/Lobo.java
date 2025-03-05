package AEA3.HERENCIA;

public class Lobo extends Animal{

    public Lobo(){
        int id = this.getId();
        this.setId(++id);
    }

    public Lobo(int id){
        this.setId(id);
    }

    // Own behavior
    private void bark() {
        System.out.println("Lobo '" + this.getId() + "' is howling");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        ();
    }
}