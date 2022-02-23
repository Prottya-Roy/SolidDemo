package Demo;

public class RiceDispenser implements ItemDispenserRice{
    double unitPrice=0;

    public void dispenseItem(double amount, String customer, String... addOns){
        for(String addOn : addOns){
            switch(addOn){
                case "normal":
                    normalRice();
                    break;
                case "polao":
                    polaoRice();
                    break;
                case "khicuri":
                    KhicuriRice();
                    break;
            }
        }
    }

    public void normalRice(){
        unitPrice = 15;
    }

    public void polaoRice(){
        unitPrice = 40;
    }
    public void KhicuriRice(){
        unitPrice=35;
    }

    public double calculatePrice(double amount){
        double price = amount * unitPrice;
        return price;
    }

}
