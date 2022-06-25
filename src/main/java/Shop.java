import behaviours.ISell;
import java.util.ArrayList;

public class Shop {
    
    private String shopName;
    private ArrayList<ISell> stock;
    
    public Shop(String shopName, ArrayList<ISell> stock) {
        this.shopName = shopName;
        this.stock = stock;
    }
    
    public String getShopName() {
        return shopName;
    }
    
    public ArrayList<ISell> getStock() {
        return stock;
    }
    
    public void addItemToStock (ISell item){
        this.stock.add(item);
    }
    
    public void removeItemFromStock (ISell item){
        this.stock.remove(item);
    }
    
    public double getTotalPotentialProfit() {
        double total = 0;
        for (ISell item : stock){
            total += (item.calculateMarkup() * item.getBoughtPrice())/100;
        }
        return total;
    }
    
    public double addDiscount(ISell item, int discount) {
        return item.getSellPrice() - (item.getSellPrice() * discount / 100);
    }
    
    public ISell findItemByName(String searchName)  {
        try {
            String searchLower = searchName.toLowerCase();
            for (ISell item : stock) {
                String itemName = item.getName().toLowerCase();
                if (itemName.equals(searchLower)) {
                    return item;
                }
            }
        }
        catch (NullPointerException npe){
            System.out.println("You can't have a null name");
        }
        return null;
    }
}
