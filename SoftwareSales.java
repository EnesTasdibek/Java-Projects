import java.util.Scanner;


public class SoftwareSales {
    

public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of packages purchased: ");
    double PP = keyboard.nextDouble();


    double discount;
    double total;
    double all;

    if ((PP >= 10) && (PP <=19)){
    discount = .2 * PP * 99.00;
    System.out.printf("Your discount is: $%.2f\n",discount);
    all = PP * 99.00;
    total = all - discount;
    System.out.printf("Your total is: $%.2f\n",total);
}
    else if ((PP >=20) && (PP <=49)){
        discount = .3 * PP * 99.00;
        System.out.printf("Your discount is: $%.2f\n",discount);
        all = PP * 99.00;
        total = all - discount;
        System.out.printf("Your total is: $%.2f\n",total);
    }
        else if ((PP >=50) && (PP <=99)){
            discount = .4 * PP * 99.00;
            System.out.printf("Your discount is: $%.2f\n",discount);
            all = PP * 99.00;
            total = all - discount;
            System.out.printf("Your total is: $%.2f\n",total);
        }

            else if (PP >=100){
                discount = .5 * PP * 99.00;
                System.out.printf("Your discount is: $%.2f\n",discount);
                all = PP * 99.00;
                total = all - discount;
                System.out.printf("Your total is: $%.2f\n",total);
           
            }

            else if ((PP >=0) && (PP <=9)){
                discount = 0;
                System.out.printf("Your discount is: $%.2f\n",discount);
                all = PP * 99.00;
                total = all;
                System.out.printf("Your total is: $%.2f\n",total);
            }





            keyboard.close();













}
}


