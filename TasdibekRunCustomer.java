import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TasdibekRunCustomer {

    public static void main(String[] args) {
        TasdibekCustomer[] customers = new TasdibekCustomer[8];
        int index = 0;

        try (Scanner input = new Scanner(new File("customerInput.txt"))) {
            while (input.hasNextLine()) {
                String name = input.nextLine();
                String id = input.nextLine();
                String color = input.nextLine();
                String phoneNumber = input.nextLine();
                double orderTotal = Double.parseDouble(input.nextLine());

                TasdibekCustomer customer = new TasdibekCustomer(name, id, color, phoneNumber);
                customer.setOrderTotal(orderTotal);
                customers[index] = customer;
                index++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        printCustomers(customers);
    }

    public static void printCustomers(TasdibekCustomer[] customers) {
        for (TasdibekCustomer customer : customers) {
            if (customer != null) {
                customer.display();
            }
        }
    }
}
