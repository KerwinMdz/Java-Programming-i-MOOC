
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String teamInput = scan.nextLine();
        int count = 0;
        int win = 0;
        int loss = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
               
                String row = fileReader.nextLine();
                String [] splitRow = row.split(",");

                String hometeam = splitRow[0];
                String visitingTeam = splitRow[1];

                int homeTeamPoints = Integer.valueOf(splitRow[2]);
                int visitingTeamPoints = Integer.valueOf(splitRow[3]);

                if (hometeam.equals(teamInput) || visitingTeam.equals(teamInput)) {
                    count++;

                if (hometeam.equals(teamInput) && homeTeamPoints > visitingTeamPoints) {
                    win++;
                } else if (visitingTeam.equals(teamInput) && visitingTeamPoints > homeTeamPoints) {
                    win++;
                } else {
                    loss++;
                }

            }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
