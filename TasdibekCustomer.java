public class TasdibekCustomer {
    private String name;
    private String id;
    private String color;
    private String phoneNumber;
    private double orderTotal;

    public TasdibekCustomer(String name, String id, String color, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.color = color;
        this.phoneNumber = phoneNumber;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void display() {
        int discount;

        if (id.startsWith("A")) {
            discount = 20;
        } else if (id.startsWith("B")) {
            discount = 15;
        } else if (id.startsWith("C")) {
            discount = 10;
        } else if (id.startsWith("D")) {
            discount = 5;
        } else {
            return;
        }

        String formatNum = String.format("(%s) %s-%s", phoneNumber.substring(0, 3), phoneNumber.substring(3, 6),
                phoneNumber.substring(6));

        double finalTotal = orderTotal - (orderTotal * discount / 100);

        System.out.println("Customer: " + name);

        System.out.println("Customer ID: " + id);

        System.out.println("Belt Color: " + color);

        System.out.println("Phone number: " + formatNum);

        System.out.printf("Total: %.2f\n", orderTotal);

        System.out.println("Discount: " + discount + "%");

        System.out.printf("Total after discount: %.2f\n", finalTotal);

        System.out.println("-------------------------------------");
    }
}
