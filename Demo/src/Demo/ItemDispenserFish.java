package Demo;

public interface ItemDispenserFish {
    void dispenseItem(double amount, String customer, String ... addOns);
    double calculatePrice(double amount);
    void RuiFish();
    void SmallFish();
}
