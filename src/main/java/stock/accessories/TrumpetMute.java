package stock.accessories;

import stock.Manufacturer;

public class TrumpetMute extends Accessory {
    
    private TrumpetMuteType trumpetMuteType;
    
    public TrumpetMute(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, TrumpetMuteType trumpetMuteType) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
        this.trumpetMuteType = trumpetMuteType;
    }
    
    public TrumpetMuteType getTrumpetMuteType() {
        return trumpetMuteType;
    }
}
