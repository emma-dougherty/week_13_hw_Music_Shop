package stock.accessories;

import stock.Manufacturer;

public class DrumSticks extends Accessory {
    
    private TipType tipType;
    
    public DrumSticks(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, TipType tipType) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
        this.tipType = tipType;
    }
    
    public TipType getTipType() {
        return tipType;
    }
}
