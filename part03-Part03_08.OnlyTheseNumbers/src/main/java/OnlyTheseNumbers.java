
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print("From where? ");
            int from = scanner.nextInt();
            System.out.print("To where? ");
            int to = scanner.nextInt();
            System.out.println(numbers.get(from));
            System.out.println(numbers.get(to));
            break;
        }
    }
}
