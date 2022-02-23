package Demo;

public class FishDispenser implements ItemDispenserFish {
    double unitPrice=0;

    public void dispenseItem(double amount, String customer, String... addOns){
        for(String addOn : addOns){
            switch(addOn){
                case "rui":
                    RuiFish();
                    break;
                case "small":
                    SmallFish();
                    break;
            }
        }
    }

    public void RuiFish(){
        unitPrice = 100;
    }

    public void SmallFish(){
        unitPrice = 50;
    }

    public double calculatePrice(double amount){
        double price = amount * unitPrice;
        return price;
    }
}
