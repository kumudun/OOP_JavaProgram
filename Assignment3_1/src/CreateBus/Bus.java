package CreateBus;

public class Bus extends Car {
    private int passengerCount;
    private int maxPassengers;

    // Constructor for Bus
    public Bus(String typeName, int maxPassengers) {
        super(typeName);
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
    }

    // Constructor with tank capacity and initial speed
    public Bus(String typeName, double tankCapacity, double initialSpeed, int maxPassengers) {
        super(typeName, tankCapacity, initialSpeed);
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
    }


    public void passengerEnter(int number) {
        if (number > 0) {
            passengerCount = Math.min(maxPassengers, passengerCount + number);
        }
    }


    public void passengerExit(int number) {
        if (number > 0) {
            passengerCount = Math.max(0, passengerCount - number);
        }
    }


    public int getPassengerCount() {
        return passengerCount;
    }


    public int getMaxPassengers() {
        return maxPassengers;
    }
}

