package FuelEfficiencyCalculation;



public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected String colorOrCapacity;
    protected double fuelEfficiency; // liters per km

    public AbstractVehicle(String type, String fuel, String colorOrCapacity, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.colorOrCapacity = colorOrCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return type + " Information:\nType: " + type + "\nFuel: " + fuel + "\n" + colorOrCapacity;
    }

    @Override
    public void charge() {
        System.out.println("No possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}

