package ModifyCar;

public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, double tankCapacity, double initialSpeed) {
        super(typeName, tankCapacity, initialSpeed);
    }

    @Override
    public void accelerate() {

        if (getGasolineLevel() > 0) {
            // increase speed faster
            double newSpeed = getSpeed() + 30;

            reduceGasoline(5);
            setSpeed(newSpeed);
        } else {
            setSpeed(0);
        }
    }

    @Override
    void decelerate(int amount) {
        if (getGasolineLevel() > 0 && amount > 0) {
            // decelerate faster (1.5x)
            double newSpeed = Math.max(0, getSpeed() - amount * 1.5);
            setSpeed(newSpeed);
            reduceGasoline(1); // small gasoline use during deceleration
        } else {
            setSpeed(0);
        }
    }


    private void reduceGasoline(double amount) {
        try {
            java.lang.reflect.Field field = Car.class.getDeclaredField("gasolineLevel");
            field.setAccessible(true);
            double current = field.getDouble(this);
            field.set(this, Math.max(0, current - amount));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void setSpeed(double speed) {
        try {
            java.lang.reflect.Field field = Car.class.getDeclaredField("speed");
            field.setAccessible(true);
            field.set(this, speed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
