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
        System.out.println("               Customer: " + name);
        System.out.println("       Number of orders: " + orderItemNHumber);
        System.out.println("      Total money spent: " + total_money_spent + " taka");
        System.out.println("-----------------------------------------------------");
    }

    void placeOrderForDrink(String drink, double amount, String ... addOns){
        OrderItem orderDrinks = new OrderItem(drink, amount, name, addOns);
        orderDrinks.serveDrink();
        orderItemNHumber++;
        total_money_spent += orderDrinks.getPrice();
    }
}
