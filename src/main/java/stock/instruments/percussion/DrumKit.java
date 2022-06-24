package stock.instruments.percussion;

import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;

public class DrumKit extends Instrument {
    
    private DrumKitType drumKitType;
    private String colour;
    
    public DrumKit(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType, DrumKitType drumKitType, String colour) {
        super(name, material, manufacturer, boughtPrice, sellPrice, instrumentType);
        this.drumKitType = drumKitType;
        this.colour = colour;
    }
    
    public DrumKitType getDrumKitType() {
        return drumKitType;
    }
    
    public String getColour() {
        return colour;
    }
    
    @Override
    public String play() {
        return "Ba dum tish!";
    }
}
