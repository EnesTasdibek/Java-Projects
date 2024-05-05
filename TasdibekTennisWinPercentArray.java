import java.util.Scanner;

public class TasdibekTennisWinPercentArray {
    
    public static void main (String args[]) {
        
    Scanner keyboard = new Scanner(System.in);
        
    System.out.println("What is the tennis player's name?:");
        String name = keyboard.nextLine();
        
    System.out.println("How many years has " + name + " been playing competitively?:");
        int numYears = keyboard.nextInt();
        
    System.out.println("What year did the player begin playing competitively?:");
        int firstYear = keyboard.nextInt();
        
    double[] winPercentages = new double[numYears];
        
    for (int i = 0; i < numYears; i++) {
            int year = firstYear + i;
            System.out.println("Enter wins for year " + year + ":");
            int numWins = keyboard.nextInt();
            
            System.out.println("Enter losses for year " + year + ":");
            int numLosses = keyboard.nextInt();
            
            // (wins/(wins+losses))	
            double winPercentage = (double) numWins / (numWins + numLosses);
            winPercentages[i] = winPercentage;
        }
        
        
    keyboard.close();
        
    printWinPercentages(name, firstYear, winPercentages);
    
}
    
    
    
    
    
    public static void printWinPercentages(String name, int firstYear, double[] winPercentages) {
        System.out.println(name + "'s Winning Percentage By Year:");
        for (int i = 0; i < winPercentages.length; i++) {
            int year = firstYear + i;
            double winPercentage = winPercentages[i];
            System.out.printf("Year: %d Winning Percentage: %.1f%%\n", year, winPercentage * 100);
        }
    
    
    
    
    
    
    
    }
}
