package Demo;

public class OrderItem {
    ItemDispenser itemDispenser;
    int amount;
    String customer;
    String category;
    public OrderItem(String Food, int amount, String customer, String category){
        itemDispenser = ItemDispenserFactory.getItemDispenser(Food);
        this.amount = amount;
        this.customer = customer;
        this.category = category;
    }
    public void serveFood(){
        itemDispenser.dispenseItem(amount, customer, category);
    }
    public int getPrice() {
        return itemDispenser.calculatePrice(amount);
    }
}
