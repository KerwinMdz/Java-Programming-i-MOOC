
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTotal = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            } else {
                numTotal+=1;
                sum += num;
            }
        }
        System.out.println("Number of numbers: " + numTotal);
        System.out.println("Sum of the numbers: " + sum);

    }
}
