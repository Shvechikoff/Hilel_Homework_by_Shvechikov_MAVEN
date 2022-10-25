package HW21;

import java.util.Scanner;

public class BiologyTest implements Question {

    Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    @Override
    public void test() {
        System.out.println("Question 1. Choose fish from list:");
        System.out.println("1. Goose;" + "\n" + "2. Leopard;" + "\n" + "3. Karp;");
        System.out.println("Your answer: ");
        int answer = scanner.nextInt();
        if (answer == 3) {
            counter++;
        }
        System.out.println("Question 2: Who can fly? ");
        System.out.println("1. Penguin;" + "\n" + "2. Eagle;" + "\n" + "3. Tiger;");
        System.out.println("Your answer: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            counter++;
        }
        System.out.println("Question 1: Choose who have 4 paws: ");
        System.out.println("1. Dog;" + "\n" + "2. Kangaroo;" + "\n" + "3. Ostrich;");
        System.out.println("Your answer: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 1) {
            counter++;
        }
        System.out.println("You have " + counter + " right answers!");
    }
}

