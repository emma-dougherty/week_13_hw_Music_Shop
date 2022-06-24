package stock.instruments.string;

import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;

public class Guitar extends Instrument {
    
    private String colour;
    private GuitarType guitarType;
    
    public Guitar(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType, GuitarType guitarType) {
        super(name, material, manufacturer, boughtPrice, sellPrice, instrumentType);
        this.guitarType = guitarType;
    }
    
    public String getColour() {
        return colour;
    }
    
    public GuitarType getGuitarType() {
        return guitarType;
    }
    
    @Override
    public String play() {
        return "Twang!";
    }
}
