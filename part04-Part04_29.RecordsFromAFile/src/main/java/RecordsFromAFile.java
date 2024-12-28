
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        
        try{
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String [] splitName = row.split(",");
                String names = splitName[0];
                int ages = Integer.valueOf(splitName[1]);
                
                if(ages ==1){
                    System.out.println(names + ", age: " + ages + " year");
                } else
                System.out.println(names + ", age: " + ages + " years");
                     
               

            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        

    }
}
