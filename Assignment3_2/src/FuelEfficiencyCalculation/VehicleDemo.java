package FuelEfficiencyCalculation;



public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");

        Vehicle car = new Car();
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        ((ElectricVehicle) car).charge();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " L/km\n");

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        ((ElectricVehicle) motorcycle).charge();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " L/km\n");

        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        ((ElectricVehicle) bus).charge();
        System.out.println("Fuel Efficiency: " + bus.calculateFuelEfficiency() + " L/km\n");

        Vehicle eCar = new ElectricCar();
        eCar.start();
        eCar.stop();
        System.out.println(eCar.getInfo());
        ((ElectricVehicle) eCar).charge();
        System.out.println("Fuel Efficiency: " + eCar.calculateFuelEfficiency() + " L/km\n");

        Vehicle eMotorcycle = new ElectricMotorcycle();
        eMotorcycle.start();
        eMotorcycle.stop();
        System.out.println(eMotorcycle.getInfo());
        ((ElectricVehicle) eMotorcycle).charge();
        System.out.println("Fuel Efficiency: " + eMotorcycle.calculateFuelEfficiency() + " L/km");
    }
}

