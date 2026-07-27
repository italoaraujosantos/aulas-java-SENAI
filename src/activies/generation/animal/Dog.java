package activies.generation.animal;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Au! AU...");
    }

    @Override
    public void move() {
        System.out.println("Correndo!");
    }
}
