package stock.accessories;

import stock.Manufacturer;

public class GuitarStrings extends Accessory{
    
    private StringType stringType;
    
    public GuitarStrings(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, StringType stringType) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
        this.stringType = stringType;
    }
    
    public StringType getStringType() {
        return stringType;
    }
    
}
