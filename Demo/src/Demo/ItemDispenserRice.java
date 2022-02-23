package Demo;

public interface ItemDispenserRice {
    void dispenseItem(double amount, String customer, String ... addOns);
    double calculatePrice(double amount);
    void normalRice();
    void polaoRice();
    void KhicuriRice();
}
