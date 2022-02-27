package Demo;

public class FishDispenser implements ItemDispenserFish {
    int unitPrice=0;

    public void dispenseItem(int amount, String customer, String category){
            switch(category){
                case "rui":
                    RuiFish();
                    break;
                case "katol":
                    KatolFish();
                    break;
                case "telapia":
                    TelapiaFish();
                    break;
                case "hilsha":
                    HilshaFish();
                    break;
                case "shrimp":
                    Shrimp();
                    break;
                case "small":
                    SmallFish();
                    break;
            }
    }

    public void RuiFish(){
        unitPrice = 100;
    }

    public void KatolFish(){
        unitPrice = 100;
    }

    public void TelapiaFish(){
        unitPrice = 80;
    }

    public void HilshaFish(){
        unitPrice = 180;
    }

    public void Shrimp(){
        unitPrice = 180;
    }

    public void SmallFish(){
        unitPrice = 50;
    }

    public int calculatePrice(int amount){
        int price = amount * unitPrice;
        return price;
    }
}
