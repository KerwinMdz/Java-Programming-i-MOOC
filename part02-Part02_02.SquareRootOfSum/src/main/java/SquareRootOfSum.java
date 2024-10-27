
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        double squareroot = Math.sqrt(sum);

        System.out.println((int)squareroot);

    }
}
