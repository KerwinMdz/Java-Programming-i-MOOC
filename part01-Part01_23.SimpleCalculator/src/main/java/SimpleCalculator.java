
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;
        int product = firstNum * secondNum;
        double quotient = (double) firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + sum);
        System.out.println(firstNum + " - " + secondNum + " = " + diff);
        System.out.println(firstNum + " * " + secondNum + " = " + product);
        System.out.println(firstNum + " / " + secondNum + " = " + quotient);

    }
}
