package Demo;

public interface ItemDispenserMeat extends ItemDispenser {
    void dispenseItem(int amount, String customer, String category);
    int calculatePrice(int amount);
    void Chicken();
    void Beef();
    void Mutton();
    void Koyel();
}
