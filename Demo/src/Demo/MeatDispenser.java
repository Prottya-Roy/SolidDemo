package Demo;

public class MeatDispenser implements ItemDispenserMeat{
    int unitPrice=0;

    public void dispenseItem(int amount, String customer, String category){
            switch(category){
                case "chicken":
                    Chicken();
                    break;
                case "beef":
                    Beef();
                    break;
                case "mutton":
                    Mutton();
                    break;
                case "koyel":
                    Koyel();
                    break;
            }
    }

    public void Chicken() {
        unitPrice = 60;
    }

    public void Beef() {
        unitPrice = 140;
    }

    public void Mutton(){
        unitPrice= 180;
    }
    public void Koyel(){
        unitPrice = 100;
    }

    public int calculatePrice(int amount){
        int price = amount * unitPrice;
        return price;
    }
}
