package activies.polymorphism.examples.form;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Registration person1 = new Registration("Ana", 21, "Programadora", true);
        Registration person2 = new Registration("Lorrayne", 29, false);
        Registration person3 = new Registration("Larrisa");
        ArrayList<Registration> registrations = new ArrayList<>();
        registrations = create(person1);
        registrations = create(person2);
        registrations = create(person3);

    }

    public static ArrayList<Registration> create(Registration registration){
        ArrayList<Registration> registrations = new ArrayList<>();
        registrations.add(registration);
        return registrations;
    }

    public static ArrayList<Registration> classify(ArrayList<Registration> registrations) {

        return registrations;
    }
}
