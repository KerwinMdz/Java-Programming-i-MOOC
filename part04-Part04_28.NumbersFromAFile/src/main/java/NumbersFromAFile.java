
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        //convert to int
    
        int count = 0;
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                //list.add(fileReader.nextLine());
                int row = Integer.valueOf(fileReader.nextLine());
                if(row >= lowerBound && row <= upperBound){
                    count++;
            }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
