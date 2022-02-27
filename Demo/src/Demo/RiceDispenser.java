package Demo;

public class RiceDispenser implements ItemDispenserRice{
    int unitPrice=0;

    public void dispenseItem(int amount, String customer, String category){
            switch(category){
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

    public void normalRice(){
        unitPrice = 15;
    }

    public void polaoRice(){
        unitPrice = 35;
    }
    public void KhicuriRice(){
        unitPrice=40;
    }

    public int calculatePrice(int amount){
        int price = amount * unitPrice;
        return price;
    }

}
