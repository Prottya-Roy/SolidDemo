package Demo;

public interface ItemDispenserMeat {
    void dispenseItem(double amount, String customer, String ... addOns);
    double calculatePrice(double amount);
    void Chicken();
    void Beef();
}
