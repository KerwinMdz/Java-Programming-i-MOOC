import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner kbd = new Scanner(System.in);
        ArrayList<Book>books = new ArrayList<>();
        while(true){
            System.out.println("Title: ");
            String bookTitle = kbd.nextLine();

            if(bookTitle.equals("")){
                break;
            }

            System.out.println("Pages: ");
            int bookPages = kbd.nextInt();

            System.out.println("Publication year: ");
            int bookPubYr = kbd.nextInt();

            kbd.nextLine();

            books.add(new Book(bookTitle, bookPages, bookPubYr));
        }
        System.out.println("What information will be printed?");
        String toPrint = kbd.next();
        for(int i = 0; i < books.size(); i++){
            Book bookz = books.get(i);
            if(toPrint.equals("everything")){
                System.out.println(bookz);
            } else if(toPrint.equals("name")){
                System.out.println(bookz.getTitle());
            }
        }
    }
}
