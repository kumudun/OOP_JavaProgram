import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter a number for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter a number for c: ");
        double c = scanner.nextDouble();

        double sqrtpart = b * b - 4 * a * c;

        if (sqrtpart > 0) {     //for  roots
            double root1 = -b + Math.sqrt(sqrtpart) / (2 * a);
            double root2 = -b - Math.sqrt(sqrtpart) / (2 * a);
            System.out.println("Root 1 : " + root1 +"  " + "Root 2 :" +root2);


            }
        else if (sqrtpart == 0) {
            double root = -b / (2 * a);
            System.out.println("Root : " + root);

        }
        else {
            System.out.println("No real root");

            scanner.close();
        }


    }
}



