import stock.Item;

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
}