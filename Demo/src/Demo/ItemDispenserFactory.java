package Demo;

public class ItemDispenserFactory {
    public static ItemDispenser getItemDispenser(String item){
        switch(item){
            case "Rice":
                return (ItemDispenser) new RiceDispenser();
            case "Fish":
                return (ItemDispenser) new FishDispenser();
            case "Meat":
                return (ItemDispenser) new MeatDispenser();
            default:
                return null;
        }
    }
}
