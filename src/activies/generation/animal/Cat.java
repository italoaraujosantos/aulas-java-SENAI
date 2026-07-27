package activies.generation.animal;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Miau!!");
    }

    @Override
    public void move() {
        System.out.println("Caminha lentamente!");
    }
}
