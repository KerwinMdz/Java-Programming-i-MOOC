
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String whichFile = scanner.nextLine();
        
        try (Scanner filScanner = new Scanner(Paths.get(whichFile))){
            while(filScanner.hasNextLine()){
                String row = filScanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Done");
        }
    }
}
