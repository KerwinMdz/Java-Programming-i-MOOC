
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outPut = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] ageOfOldest = input.split(",");
            int age = Integer.valueOf(ageOfOldest[1]);
            if(age > outPut){
                outPut = age;
            }
            
        }
        System.out.println("Age of the oldest: " + outPut);

    }
}
