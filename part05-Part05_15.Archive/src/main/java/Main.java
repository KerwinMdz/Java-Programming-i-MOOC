
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive archive = new Archive(identifier, name);
            if (archives.contains(archive)) {
                continue;
            } else {
                archives.add(archive);
            }

        }
        System.out.println("==Items==");

        for (Archive archiveTest : archives) {
            System.out.println(archiveTest.getIdentifier() + ": " + archiveTest.getName());
        }

    }
}
