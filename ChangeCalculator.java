import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the cost: $, for costs small or equal than $20");
        double cost = scanner.nextDouble();

    if (cost >= 20) {
            
            System.out.println("Invalid bill amount. Please enter a value <= $20.");
            
            return;
        }

        // Calculate change
        double change = 20 - cost;

        // Display the change breakdown
        
        System.out.println("Your cost is " + cost);
        System.out.println("Your change is "+ change);

        System.out.println("---------------------------------");
        System.out.println("Your change is "+ change);

     
//Calculated the changes one by one with the help of modulus operator, then divided them.

        int tens = (int) (change / 10);
        
        int fives = (int) ((change % 10) / 5);
       
        int ones = (int) ((change % 10 % 5) / 1);
        
        int quarters = (int) ((change % 1) / 0.25);
        
        int dimes = (int) ((change % 1 % 0.25) / 0.1);
        
        int nickels = (int) ((change % 1 % 0.25 % 0.1) / 0.05);
        
        int pennies = (int) ((change % 1 % 0.25 % 0.1 % 0.05) / 0.01);




if (tens == 1) {
    System.out.println(tens + " ten");
} else if (tens > 1) {
    
    System.out.println(tens + " tens");
}


if (fives == 1) {
    System.out.println(fives + " five");
} 
else if (fives > 1) {
    
    System.out.println(fives + " fives");
}


if (ones == 1) {
    
    System.out.println(ones + " one");
} 
else if (ones > 1) {
    System.out.println(ones + " ones");
}


if (quarters == 1) {
    System.out.println(quarters + " quarter");
} 
else if (quarters > 1) {
    
    System.out.println(quarters + " quarters");
}


if (dimes == 1) {
    System.out.println(dimes + " dime");
} 
else if (dimes > 1) {
    
    System.out.println(dimes + " dimes");
}


if (nickels == 1) {
    System.out.println(nickels + " nickel");
} else if (nickels > 1) {
   
    System.out.println(nickels + " nickels");
}


if (pennies == 1) {
    System.out.println(pennies + " penny");
} 
else if (pennies > 1) {
    System.out.println(pennies + " pennies");
}



     
    }

 
}
