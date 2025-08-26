import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] number = new int[size];

        System.out.println("Enter the integers: ");

        for (int i = 0; i < size; i++) {
            number[i] = scanner.nextInt();
        }

        int[] newArray = new int[size];
        int index =0;

        for (int i = 0; i < size; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (number[i] == newArray[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newArray[index++] = number[i];
            }
        }
        System.out.println("The array without the duplicate: ");
        for (int i = 0; i < index; i++) {
            System.out.print(newArray[i] + " ");


        }
    }
}

