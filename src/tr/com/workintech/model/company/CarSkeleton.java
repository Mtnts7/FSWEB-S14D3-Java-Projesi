package tr.com.workintech.model.company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return "Engine is starting.";
    }
    public String drive(){
        runEngine();
        return "Car is driving";
    }
    protected String runEngine(){
        return "Engine is running";
    }
    protected String runEngine(ElectricCar electricCar){
        return "ElectricCar engine is running";
    }
    protected String runEngine(GasPoweredCar gasPoweredCar){
        return "GasPowered engine is running";
    }
    protected String runEngine(HybridCar hybridCar){
        return "HybridCar engine is running";
    }


}
