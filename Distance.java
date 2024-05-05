import java.util.Scanner;
public class Distance {
	
	public static void main(String[] args) {
		// Declare values to store user input.
		int speed = 0,
			hours = 0;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt user for speed and hour values.
		System.out.print("Enter vehicle speed (in mph): ");
		speed = keyboard.nextInt();
		
// Input validation to ensure speed is a positive number or 0
while(speed <= 0){
    System.out.print("Enter vehicle speed (in mph): ");
    speed = keyboard.nextInt();
}
		
		System.out.print("Enter traveling time (in hours): ");
		hours = keyboard.nextInt();
		
		// Input validation: Hours must be greater than 1
		while(hours < 1){
			System.out.print("Enter traveling time (in hours): ");
			hours = keyboard.nextInt();
			}
		
		// Declare counter variable to count loop iterations.
		int hr = 1;
		
		// Construct while-loop to display report data.
		while(hours >= 1){
			System.out.println("After " + hr + " hour(s) the distance is " + hr * speed + " miles.");
            hr++;
			hours--;
		}
	}
}