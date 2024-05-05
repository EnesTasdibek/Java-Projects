import java.util.Scanner;

public class TasdibekTickets{


public static void main(String[] args){

    
    Scanner keyboard = new Scanner(System.in);



    
    
System.out.print("G' day mate! Welcome to the Australian Open!\n\t");
System.out.print("\nChoose an arena:\n \n[R]od Laver Arena: $225.25\n [M]argaret Court Arena: $177.75\n [J]ohn Cain Arena: $145.50\n\t");


System.out.println("\nEnter R, M or J: ");
String letters = keyboard.nextLine();

System.out.println("\nEnter number of tickets: ");
int ntickets = keyboard.nextInt();


if (letters.equals( "R")){
System.out.println("\nYour day of amazing tennis will cost: "+ ntickets * 225.25);


}else if (letters.equals( "M")){
System.out.println("\nYour day of amazing tennis will cost: "+ ntickets * 177.75);

}

else if (letters.equals( "J")){
System.out.println("\nYour day of amazing tennis will cost: "+ ntickets * 145.50);

}

}

}