package activies.inheritance.locomotion;

public class Motorcycle extends Vehicle{
    private String manufacturer;
    private String model;
    private String version;
    private String engineDisplacement;

    public Motorcycle() {
        super();
    }

    public Motorcycle(String VIN, String plate, String color, int manufactureYear, int modelYear, String manufacturer, String model, String version, String engineDisplacement) {
        super(VIN, plate, color, manufactureYear, modelYear);
        this.manufacturer = manufacturer;
        this.model = model;
        this.version = version;
        this.engineDisplacement = engineDisplacement;
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

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(String engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public void onEnginerMotorcycle(){
        System.out.println("ligar motor da moto!");
    }
}
