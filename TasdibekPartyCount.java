import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TasdibekPartyCount {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("partyResponses.txt");
        Scanner scanner = new Scanner(file);
        int coming = 0;
        int notcoming = 0;
if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

            while (scanner.hasNext()) {
            String response = scanner.next();
            if (response.equals("aye")) {
                coming++;
            } else if (response.equals("naw")) {
                notcoming++;
            }
        }
        scanner.close();
        System.out.println(coming + " muckers coming to the great craic! ");
        System.out.println(notcoming + " sad eegits can't make it. ");
    }
}
