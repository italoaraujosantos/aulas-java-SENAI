package activies.abstration.animal;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.sound();
        dog.sleep();

        Cat cat = new Cat("Garfield");
        cat.sound();
        cat.sleep();
    }
}

