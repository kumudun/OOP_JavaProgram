import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci_sequence {
    private final static String FILENAME = "fibonacci.csv";

    public static void main(String[] args) {
        long[] fib = new long[60];
        fib[0] = 0;
        fib[1] = 1;

        // Generate Fibonacci sequence
        for (int i = 2; i < 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Write to CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            writer.write("Index;FibonacciNumber\n");

            for (int i = 0; i < 60; i++) {
                writer.write(i + ";" + fib[i] + "\n");
            }

            System.out.println("Fibonacci sequence saved to " + FILENAME);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

