
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner fileReader = new Scanner(Paths.get("data.txt"))){
         while(fileReader.hasNextLine()){
            String row = fileReader.nextLine();
            System.out.println(row);
         }   
        } catch (Exception e){
            System.out.println("Finished");
        }

    }
}
