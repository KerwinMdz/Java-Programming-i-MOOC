
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        int additionFormula = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + additionFormula);
    }
}
