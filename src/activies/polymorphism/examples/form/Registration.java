package activies.polymorphism.examples.form;

public class Registration {
    private String name;
    private int age;
    private String position;
    private boolean active;

    public Registration(String name, int age, String position, boolean active) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.active = active;
    }

    public Registration(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public Registration(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public Registration(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", active=" + active +
                '}';
    }
}
