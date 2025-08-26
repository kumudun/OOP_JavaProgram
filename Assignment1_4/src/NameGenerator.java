import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many random names do you want to generate? ");
        int amount = scanner.nextInt();

        // Arrays of first and last names
        String[] firstNames = {"Roshini", "Dilmi", "Poorni", "Chathu", "Chandina"};
        String[] lastNames = {"Smith", "Perera", "Silva", "Brown", "White"};

        // Generate random names
        for (int i = 0; i < amount; i++) {
            int firstIndex = (int)(Math.random() * firstNames.length);
            int lastIndex = (int)(Math.random() * lastNames.length);

            String fullName = firstNames[firstIndex] + " " + lastNames[lastIndex];
            System.out.println(fullName);
        }

        scanner.close();
    }
}






