
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num2;
        int num = scanner.nextInt();
        if(num < 0){
            num2 = num * -1;
            System.out.println(num2);
        }else {
            System.out.println(num);
        }
    }
}
