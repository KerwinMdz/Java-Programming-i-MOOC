
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]");
        int grades = scan.nextInt();
        if(grades >= 0 && grades <= 49){
            System.out.println("Grade: failed");
        } else if (grades >= 50 && grades <= 59){
            System.out.println("Grade: 1");
        } else if (grades >= 60 && grades <= 69){
            System.out.println("Grade: 2");
        } else if (grades >= 70 && grades <= 79){
            System.out.println("Grade: 3");
        } else if (grades >= 80 && grades <= 89){
            System.out.println("Grade: 4");
        } else if (grades >= 90 && grades <= 100) {
            System.out.println("Grade: 5");
        } else if (grades > 100){
            System.out.println("Grade: incredible");
        } else {
            System.out.println("Grade: impossible!");
        }
    }
}
