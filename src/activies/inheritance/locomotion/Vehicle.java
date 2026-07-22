package activies.inheritance.locomotion;

public class Vehicle {
    private String VIN;
    private String plate;
    private String color;
    private int manufactureYear;
    private int modelYear;

    public Vehicle(String VIN, String plate, String color, int manufactureYear, int modelYear) {
        this.VIN = VIN;
        this.plate = plate;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.modelYear = modelYear;
    }

    public Vehicle() {

    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }


}
