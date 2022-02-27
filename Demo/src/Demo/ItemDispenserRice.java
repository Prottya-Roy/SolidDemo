package Demo;

public interface ItemDispenserRice extends ItemDispenser {
    void dispenseItem(int amount, String customer, String category);
    int calculatePrice(int amount);
    void normalRice();
    void polaoRice();
    void KhicuriRice();
}
