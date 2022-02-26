package Demo;

public class Customer {
    String name;
    int orderItemNHumber;
    double total_money_spent;

    public Customer(String name){
        this.name = name;
        orderItemNHumber = 0;
        total_money_spent = 0;
    }

    void printCustomerDetails(){
        System.out.println("Customer: " + name);
        System.out.println("Total money spent: " + total_money_spent + " taka");
        System.out.println("Thanks you for coming...");
    }

    void placeOrderForFood(String drink, double amount, String ... addOns){
        OrderItem orderFood = new OrderItem(drink, amount, name, addOns);
        orderFood.serveFood();
        orderItemNHumber++;
        total_money_spent += orderFood.getPrice();
    }
}
