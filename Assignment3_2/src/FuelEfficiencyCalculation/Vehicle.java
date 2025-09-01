package FuelEfficiencyCalculation;



public interface Vehicle {
    void start();
    void stop();
    String getInfo();
    double calculateFuelEfficiency(); // liters per kilometer
}

