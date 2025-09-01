package AbstractVehicle;



public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String colorOrCapacity;

    public AbstractVehicle(String type, String fuel, String colorOrCapacity) {
        this.type = type;
        this.fuel = fuel;
        this.colorOrCapacity = colorOrCapacity;
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
}

