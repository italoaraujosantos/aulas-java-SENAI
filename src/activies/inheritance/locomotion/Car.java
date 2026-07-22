package activies.inheritance.locomotion;

import javax.swing.*;

public class Car extends Vehicle{
    private String category;
    private String manufacturer;
    private String model;
    private String version;
    private String enginer;
    private String gearbox;

    public Car(){
        super();
    }

    public Car(String VIN, String plate, String color, int manufactureYear, int modelYear, String category, String manufacturer, String model, String version, String enginer, String gearbox) {
        super(VIN, plate, color, manufactureYear, modelYear);
        this.category = category;
        this.manufacturer = manufacturer;
        this.model = model;
        this.version = version;
        this.enginer = enginer;
        this.gearbox = gearbox;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnginer() {
        return enginer;
    }

    public void setEnginer(String enginer) {
        this.enginer = enginer;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void onEnginerCar() {
        System.out.println("liga motor do carro!");
    }
}
