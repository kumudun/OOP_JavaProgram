package FuelEfficiencyCalculation;



public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car", "Electric", "Color: White", 0.0);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}


