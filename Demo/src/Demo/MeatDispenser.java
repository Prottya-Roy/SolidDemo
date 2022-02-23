package Demo;

public class MeatDispenser implements ItemDispenserMeat{
    double unitPrice=0;

    public void dispenseItem(double amount, String customer, String... addOns){
        for(String addOn : addOns){
            switch(addOn){
                case "chicken":
                    Chicken();
                    break;
                case "beef":
                    Beef();
                    break;
            }
        }
    }

    public void Chicken(){
        unitPrice = 90;
    }

    public void Beef(){
        unitPrice = 140;
    }

    public double calculatePrice(double amount){
        double price = amount * unitPrice;
        return price;
    }
}
