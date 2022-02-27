package Demo;

public class Customer {
    String name;
    int total_money_spent=0;

    public Customer(String name){
        this.name = name;
    }

    void printCustomerDetails(){
        System.out.println("Customer: " + name);
        System.out.println("Total amount: " + total_money_spent + " taka");
        System.out.println("Thanks you for coming...");
        System.out.println("Hope you had a great time here!!!");
    }

    void placeOrderForFood(String Food, int amount, String name, String categoryName){
        OrderItem orderItem = new OrderItem(Food, amount, name, categoryName);
        orderItem.serveFood();
        total_money_spent = total_money_spent +  orderItem.getPrice();
    }
}
