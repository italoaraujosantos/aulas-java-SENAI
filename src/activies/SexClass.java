package activies;

import activies.object.Person;

public class SexClass {
    public static void main(String[] args) {
        Person person = new Person("Italo", 1986, 'm', "Blue");

        /*
        person.name = "Italo";
        person.yearBirth = 1986;
        person.genere = 'm';
        person.color = "Blue";

        person.setYearBirth(1990);
        */

        System.out.println(person);


    }
}
