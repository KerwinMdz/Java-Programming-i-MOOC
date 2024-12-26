import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }

            System.out.println("Duration: ");
            int duration = scanner.nextInt();

            scanner.nextLine();

            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int duration = scanner.nextInt();

        for(int i = 0; i < programs.size(); i++){
            TelevisionProgram tvProgram = programs.get(i);
            if(tvProgram.getDuration() <= duration){
                System.out.println(programs.get(i));
            }
        }
    
    }
}
