
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        int SumOfTwoNumbers = firstNum + secondNum;
        System.out.println("The sum of the numbers is " + SumOfTwoNumbers);

    }
}
