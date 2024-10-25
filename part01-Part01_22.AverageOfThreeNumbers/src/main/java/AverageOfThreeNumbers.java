
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        Integer thirdNum = Integer.valueOf(scanner.nextLine());

        double average = (double) (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average is " + average);

    }
}
