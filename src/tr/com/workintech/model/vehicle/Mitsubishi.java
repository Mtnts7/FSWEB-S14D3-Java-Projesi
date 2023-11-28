package tr.com.workintech.model.vehicle;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishes engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishes engine is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishes engine is braking";
    }
}
