
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        while (true) {
            String names = scanner.nextLine();
            if(names.equals("")){
                break;
            }
            items.add(new Item(names));
        }

        System.out.println(items);
    }
}
