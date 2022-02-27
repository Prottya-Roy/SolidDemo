package Demo;

public interface ItemDispenser {
    void dispenseItem(int amount, String customer, String category);
    int calculatePrice(int amount);
}
