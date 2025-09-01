package ElectricVehicles;



public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electric", "Color: Blue");
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}


