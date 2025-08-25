import java.util.Scanner;

public class MaltiplicationQuestions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score; // number of correct answers


        do {
            score = 0;

            // Ask 10 random multiplication questions
            for (int i = 1; i <= 10; i++) {
                int num1 = (int)(Math.random() * 10) + 1;
                int num2 = (int)(Math.random() * 10) + 1;
                int answer = num1 * num2;

                System.out.print("Question " + i + ": What is " + num1 + " * " + num2 + "? ");
                int question = scanner.nextInt();

                if (question == answer) {
                    System.out.println("Correct!");
                    score++;

                } else {
                    System.out.println("Wrong!");
                }
            }

            // Check score
            if (score == 10) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("New set of problems!");
            }



        } while (score < 10); // repeat until perfect score
    }
}


