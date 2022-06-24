package stock.instruments;
import behaviours.IPlay;
import stock.Item;
import stock.Manufacturer;

public abstract class Instrument extends Item implements IPlay {
    
    private InstrumentType instrumentType;
    
    public Instrument(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
        this.instrumentType = instrumentType;
    }
    
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
