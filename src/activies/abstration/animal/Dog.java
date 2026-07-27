package activies.abstration.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Au! Au! Au...");
    }


}
