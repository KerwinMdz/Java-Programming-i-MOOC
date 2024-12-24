
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;
        String longestName = "";
        //int year = 0;
        while(true){
            String yearInput = scanner.nextLine();
            if(yearInput.equals("")){
                break;
            }
            count++;
            String[] yearOutput = yearInput.split(",");
            int outPut = Integer.valueOf(yearOutput[1]);
            String name = yearOutput[0];
            if(name.length() > longestName.length()){
                longestName = name;
            }
            sum+=outPut;
            average = (double)sum / count;
            
        }
        System.out.println("Longest name:" + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
