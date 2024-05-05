import java.util.Scanner;

public class TasdibekTickets2{


public static void main(String[] args){

    
    Scanner keyboard = new Scanner(System.in);



    
    
System.out.print("G' day mate! Welcome to the Australian Open!\n\t");
System.out.print("\nChoose an arena:\n \n[R]od Laver Arena: $225.25\n [M]argaret Court Arena: $177.75\n [J]ohn Cain Arena: $145.50\n\t");


System.out.println("\nEnter R, M or J: ");
String letters = keyboard.nextLine();

System.out.println("\nEnter number of tickets: ");
int ntickets = keyboard.nextInt();



switch(letters){

case "R":
System.out.printf("\nYour day of amazing tennis will cost: $%.2f",(ntickets * 225.25));

break;

case "M":
System.out.printf("\nYour day of amazing tennis will cost: $%.2f",(ntickets * 177.75));

break;

case "J":
System.out.printf("\nYour day of amazing tennis will cost: $%.2f",(ntickets * 145.50));

default:
System.out.println("oops, please check if you entered an upper-case letter or one of the three letters and try again for first question");
}

}

}