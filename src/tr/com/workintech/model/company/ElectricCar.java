package tr.com.workintech.model.company;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        return "ElectricCar is started";
    }

    @Override
    public String drive() {
        return "ElectricCar is drove.";
    }
}
