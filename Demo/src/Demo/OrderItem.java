package Demo;

public class OrderItem {
    ItemDispenser itemDispenser;
    double amount;
    String customer;
    String addOns[];
    public OrderItem(String drink, double amount, String customer, String[] addOns){
        itemDispenser = ItemDispenserFactory.getItemDispenser(drink);
        this.amount = amount;
        this.customer = customer;
        this.addOns = addOns;
    }
    public void serveDrink(){
        itemDispenser.dispenseItem(amount, customer, addOns);
    }
    public double getPrice() {
        return itemDispenser.calculatePrice(amount);
    }
}
