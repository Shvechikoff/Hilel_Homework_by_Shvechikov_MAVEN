package HW21;

import java.util.Scanner;

public class HW21Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Question mathTest = new MathTest();
        Question bioTest = new BiologyTest();
        int result = 0;
        System.out.println("choose type of tests");
        System.out.println("1. Math test;" + "\n" + "2. Biology Test.");
        result = scanner.nextInt();
        if (result == 1) {
            mathTest.test();
        }
        if (result == 2) {
            bioTest.test();
        }
    }
}