package activies.inheritance.locomotion;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle moto = new Motorcycle();

        car.setCategory("Hatch");
        car.setManufacturer("GM");
        car.setModel("Celta");
        car.setVersion("LT");
        car.setGearbox("Manual");
        car.setManufactureYear(2012);
        car.setModelYear(2013);
        car.onEnginerCar();


        moto.setManufacturer("Honda");
        moto.setModel("CG-160");
        moto.setVersion("Sport");
        moto.setEngineDisplacement("160");
        moto.setManufactureYear(2025);
        moto.setModelYear(2025);
        moto.onEnginerMotorcycle();

    }
}
