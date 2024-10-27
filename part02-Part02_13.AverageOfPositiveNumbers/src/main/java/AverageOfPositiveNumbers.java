
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amount = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                amount += 1;
                sum += num;
            }
        }
        if (amount == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println((double) sum / amount);

    }
}
