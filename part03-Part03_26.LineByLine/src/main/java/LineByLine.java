
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){ 
        System.out.print("");
        String input = scanner.nextLine();
        if(input.equals("")){
            break;
        }
        String [] splitInput = input.split(" ");
        for(int i = 0; i < splitInput.length; i++){
            System.out.println(splitInput[i]);
        } 
    }
        

    }
}
