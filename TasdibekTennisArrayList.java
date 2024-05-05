import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TasdibekTennisArrayList {
    
    TasdibekTennisPlayer classObj = new TasdibekTennisPlayer();

    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<TasdibekTennisPlayer> tennisPlayerList = new ArrayList<TasdibekTennisPlayer>();
        fillTennisArrayList(tennisPlayerList);
        printTennisPlayers(tennisPlayerList);
    }

    public static void fillTennisArrayList(ArrayList<TasdibekTennisPlayer> tennisPlayerList) throws FileNotFoundException{

        File file = new File("tennisplayers.txt");
        Scanner scanner = new Scanner(file);
        if (!file.exists()) {
            System.out.println("File not found");
            return;}

        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            String country = scanner.nextLine();
            int rank = Integer.parseInt(scanner.nextLine());
            int age = Integer.parseInt(scanner.nextLine());
            int wins = Integer.parseInt(scanner.nextLine());
            int losses = Integer.parseInt(scanner.nextLine());

            TasdibekTennisPlayer player = new TasdibekTennisPlayer(name, country, rank, age, wins, losses);
            tennisPlayerList.add(player);
        }

    }
        
        public static void printTennisPlayers(ArrayList<TasdibekTennisPlayer> tennisPlayerList) {
            int i = 0;
            while (i < tennisPlayerList.size()) {
                tennisPlayerList.get(i).displayPlayer();
                i++;
            }
    
        

}

}