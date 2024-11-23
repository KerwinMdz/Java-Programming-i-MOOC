
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String [] ageOfOldest = input.split(",");
            int age = Integer.valueOf(ageOfOldest[1]);
            String name= ageOfOldest[0];
            if(age > oldestAge){
                oldestAge = age;
                oldestName = name;
            }
            
        }
        System.out.println("Age of the oldest: " + oldestName);

    }
}
