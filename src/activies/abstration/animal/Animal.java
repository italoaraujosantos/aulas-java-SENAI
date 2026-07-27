package activies.abstration.animal;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void sound();

    public void sleep() {
        System.out.println(name+ " está dormindo!");
    }
}
