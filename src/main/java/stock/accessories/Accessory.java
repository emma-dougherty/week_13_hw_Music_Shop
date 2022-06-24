package stock.accessories;

import behaviours.ISell;
import stock.Item;
import stock.Manufacturer;

public abstract class Accessory extends Item implements ISell {
    
    public Accessory(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
    }
    
}
