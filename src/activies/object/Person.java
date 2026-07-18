package activies.object;

import java.beans.ConstructorProperties;

public class Person {
    public String name;
    public int yearBirth;
    public char genere;
    public String color;

    public Person(String name, int yearBirth, char genere, String color) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.genere = genere;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearBirth=" + yearBirth +
                ", genere=" + genere +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
