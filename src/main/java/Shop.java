import stock.Item;
import stock.instruments.Instrument;
import stock.instruments.string.Guitar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    
    private String shopName;
    private ArrayList<Item> stock;
    
    public Shop(String shopName, ArrayList<Item> stock) {
        this.shopName = shopName;
        this.stock = stock;
    }
    
    public String getShopName() {
        return shopName;
    }
    
    public ArrayList<Item> getStock() {
        return stock;
    }
    
    public void addItemToStock (Item item){
        this.stock.add(item);
    }
    
    public void removeItemFromStock (Item item){
        this.stock.remove(item);
    }
    
    public double getTotalPotentialProfit() {
        double total = 0;
        for (Item item : stock){
            total += (item.calculateMarkup() * item.getBoughtPrice())/100;
        }
        return total;
    }
    
    public double addDiscount(Item item, int discount) {
        return item.getSellPrice() - (item.getSellPrice() * discount / 100);
    }
}
