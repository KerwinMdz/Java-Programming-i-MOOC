
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNum = scanner.nextInt();

        int result = 0;
        for(int i = 0; i < lastNum; i++){
            result += i;
            result++;
        }
        System.out.println("The sum is " + result);

    }
}
