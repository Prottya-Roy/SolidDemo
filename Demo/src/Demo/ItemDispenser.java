package Demo;

public interface ItemDispenser {
    void dispenseItem(double amount, String customer, String ... addOns);
    double calculatePrice(double amount);
}
