import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bill amount
        System.out.print("Enter the bill amount (<= $20): $");
        double billAmount = scanner.nextDouble();

        // Check if bill amount is valid
        if (billAmount > 20 || billAmount <= 0) {
            System.out.println("Invalid bill amount. Please enter a value <= $20.");
            return;
        }

        calculateChange(billAmount);
    }

    private static void calculateChange(double billAmount) {
        int remainingCents = (int) (billAmount * 100);

        // Calculate number of tens
        int tens = remainingCents / 1000;
        remainingCents %= 1000;

        // Calculate number of fives
        int fives = remainingCents / 500;
        remainingCents %= 500;

        // Calculate number of ones
        int ones = remainingCents / 100;
        remainingCents %= 100;

        // Calculate number of quarters
        int quarters = remainingCents / 25;
        remainingCents %= 25;

        // Calculate number of dimes
        int dimes = remainingCents / 10;
        remainingCents %= 10;

        // Calculate number of nickels
        int nickels = remainingCents / 5;
        remainingCents %= 5;

        // Remaining cents are pennies
        int pennies = remainingCents;

        // Output the results
        System.out.println("Change breakdown:");
        if (tens > 0) {
            System.out.println(tens + " ten(s)");
        }
        if (fives > 0) {
            System.out.println(fives + " five(s)");
        }
        if (ones > 0) {
            System.out.println(ones + " one(s)");
        }
        if (quarters > 0) {
            System.out.println(quarters + " quarter(s)");
        }
        if (dimes > 0) {
            System.out.println(dimes + " dime(s)");
        }
        if (nickels > 0) {
            System.out.println(nickels + " nickel(s)");
        }
        if (pennies > 0) {
            System.out.println(pennies + " pennies");
        }
    }
}
