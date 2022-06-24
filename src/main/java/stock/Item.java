package stock;

public abstract class Item {
    
    private String name;
    private String material;
    private Manufacturer manufacturer;
    private double boughtPrice;
    private double sellPrice;
    
    public Item(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice) {
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
    
    public double getBoughtPrice() {
        return boughtPrice;
    }
    
    public double getSellPrice() {
        return sellPrice;
    }
}
