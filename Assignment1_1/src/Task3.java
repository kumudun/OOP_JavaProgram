import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // create a scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        //calculate the sum of three numbers
        System.out.println("The sum of the numbers is " + (first + second + third));

        //calculate the product of three numbers
        System.out.println("The product of the numbers is " + (first * second * third));

        //calculate the average of the three numbers
        System.out.println("The average of the numbers is " + ((first + second + third)/3.0));
    }
}