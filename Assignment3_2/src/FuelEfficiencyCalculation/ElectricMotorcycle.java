package FuelEfficiencyCalculation;



public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electric", "Color: Blue", 0.0);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}

