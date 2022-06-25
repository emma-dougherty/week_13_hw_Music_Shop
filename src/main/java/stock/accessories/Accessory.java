package stock.accessories;

import behaviours.ISell;
import stock.Manufacturer;

public abstract class Accessory implements ISell {
    
    private String name;
    private String material;
    private Manufacturer manufacturer;
    private double boughtPrice;
    private double sellPrice;
    
    public Accessory(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice) {
        this.name = name;
        this.material = material;
        this.manufacturer = manufacturer;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    
    @Override
    public double getBoughtPrice() {
        return boughtPrice;
    }
    
    @Override
    public double getSellPrice() {
        return sellPrice;
    }
}
