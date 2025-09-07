package Calculator;

// Calculator.java
public class Calculator {
    private int total;

    // Constructor
    public Calculator() {
        total = 0;
    }

    // Reset method
    public void reset() {
        total = 0;
    }

    // A method that adds an integer to the calculator and a negative integer should throw an exception.
    public void add(int... numbers) {
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed: " + number);
            }
            total += number;
        }
    }




    // Get current value
    public int getValue() {
        return total;
    }

    // Temporary main method for testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            int[] nums = {12, 10, 8};
            calc.add(nums);
            System.out.println("Total: " + calc.getValue());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

