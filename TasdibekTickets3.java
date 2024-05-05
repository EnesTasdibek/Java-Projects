import java.util.Scanner;

public class TasdibekTickets3{// Enes Kayra Tasdibek, Australian Open Tickets Assignment Part 3, CISS 110

static Scanner keyboard = new Scanner(System.in);
public static void main(String[] args){

    displayTicketPrices();//call void like this
    char arena = getArena();
    int ntickets = getNumTickets();
    double totalPrice = calculateTotalPrice(arena, ntickets);
    displayTotalPrice(totalPrice);//call void like this

}  


    public static void displayTicketPrices(){

        System.out.print("G' day mate! Welcome to the Australian Open!\n\t");
        System.out.print("\nChoose an arena:\n \n [R]od Laver Arena: $225.25\n [M]argaret Court Arena: $177.75\n [J]ohn Cain Arena: $145.50\n\t");
    }


    public static char getArena(){

        System.out.println("\nEnter R, M or J: ");
        String letters = keyboard.nextLine();
        		
        while(!letters.equals("R") && !letters.equals("M") && !letters.equals("J")){

        System.out.println("Enter a valid value");
        displayTicketPrices();
        letters = keyboard.nextLine();
        }
        return letters.charAt(0);


        }


    public static int getNumTickets(){

    int ntickets;

    do {
            System.out.println("\nEnter number of tickets: ");
            ntickets = keyboard.nextInt();
    } while (ntickets < 1 || ntickets > 20);

    return ntickets;
   
        
    
    }

    public static double calculateTotalPrice(char arena, int ntickets){


        
            double price;
        switch(arena){ //switch to "arena" from "letters"

            
            
            case 'R':
            //System.out.printf("\nYour day of amazing tennis will cost: $%.2f",);-----------previous code
            price = (ntickets * 225.25);
            break;
            
            case 'M':
            //System.out.printf("\nYour day of amazing tennis will cost: $%.2f",); -----------previous code
            price = (ntickets * 177.75);
            break;
            
            case 'J':
            //System.out.printf("\nYour day of amazing tennis will cost: $%.2f",);-----------previous code
            price = (ntickets * 145.50);
            
            default:
            System.out.println("oops, please check if you entered an upper-case letter, or one of the three letters and try again");
            price=0;
        
        }

return applyTax(price);//send value to the applyTax

    }

    public static void displayTotalPrice(double totalPrice){
		
        System.out.printf("\nYour day of amazing tennis will cost: $%.2f", totalPrice);

    }

    public static double applyTax(double price){


        //The	method	calculateTotalPrice() will	define	two	parameters,	arena and	
        //numTickets.		The	parameter	arena will	be	either be a	char or	an	int depending	on
        //what	was	returned	from	getArena().		The	parameter	numTickets will	be	an	int
        //because getNumTickets()returns	an	int.			It	is	in	this	method	that	you	will	put	the	
        //switch statement	from	the	previous	assignment and	this method	will	calculate	the cost of	
        //the	tickets. Once	the	cost	of	the	tickets,	based	on	the price	of	the	arena and	number	of	
        //tickets, has	been	calculated,	send	this	value	to	the	method	applyTax(). The	method	
        //applyTax() will	define	a	double	as	a	parameter	and	return	a	double.		This	method	will	
        //add	the	taxes	to	the	total	price.		The	tax	rate	is	10%.
       return price + (price / 10.0);
    
    
    
    }

}