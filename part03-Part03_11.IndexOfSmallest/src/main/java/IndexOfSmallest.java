
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }

        // after that, the program prints the smallest number
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int getNum = numbers.get(i);
            if (smallest > getNum) {
                smallest = getNum;
            }
        }
        System.out.println("Smallest number: " + smallest);

        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < numbers.size(); i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
