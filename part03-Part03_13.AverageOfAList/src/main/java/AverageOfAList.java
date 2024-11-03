
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while (true) {
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            numbers.add(input);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        for(Integer num : numbers){
            sum += num;
        }
        System.out.println("Average: " + (double) sum / numbers.size());
    }
}
