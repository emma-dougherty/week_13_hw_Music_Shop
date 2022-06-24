package stock.instruments.brass;

import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;

public class Saxaphone extends Instrument {
    
    private SaxaphoneType saxaphoneType;
    
    public Saxaphone(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType, SaxaphoneType saxaphoneType) {
        super(name, material, manufacturer, boughtPrice, sellPrice, instrumentType);
        this.saxaphoneType = saxaphoneType;
    }
    
    public SaxaphoneType getSaxaphoneType() {
        return saxaphoneType;
    }
    
    @Override
    public String play() {
        return "Toot!";
    }
}
