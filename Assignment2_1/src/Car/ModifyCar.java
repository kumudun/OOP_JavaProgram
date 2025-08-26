package Car;

public class ModifyCar {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;   // new variable to hold tank capacity

    // Constructor 1 (already there)
    public ModifyCar(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        tankCapacity = 100;  // default tank capacity
        this.typeName = typeName;
    }

    // Constructor 2 (new one with extra arguments)
    public ModifyCar(String typeName, double tankCapacity, double initialSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.gasolineLevel = tankCapacity; // assume full tank at start
        this.speed = initialSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankCapacity; // fill up to capacity
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}

