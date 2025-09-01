package ElectricVehicles;



public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric Car", "Electric", "Color: White");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}

