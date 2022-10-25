package HW21;

import java.util.Scanner;

public class MathTest implements Question {

    Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    @Override
    public void test() {
        System.out.println("Question 1. 2+2 = :");
        System.out.println("1. 3;" + "\n" + "2. 4;" + "\n" + "3. 5;");
        System.out.println("Your answer: ");
        int answer = scanner.nextInt();
        if (answer == 2) {
            counter++;
        }
        System.out.println("Question 2: 2*3 = :");
        System.out.println("1. 3;" + "\n" + "2. 4;" + "\n" + "3. 6;");
        System.out.println("Your answer: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 3) {
            counter++;
        }
        System.out.println("Question 1: 3+3 = :");
        System.out.println("1. 6;" + "\n" + "2. 4;" + "\n" + "3. 5;");
        System.out.println("Your answer: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            counter++;
        }
        System.out.println("You have " + counter + " right answers!");
    }
}