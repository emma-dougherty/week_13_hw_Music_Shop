package stock.instruments.woodwind;

import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;

public class Bagpipe extends Instrument {
    
    private BagpipeType bagpipeType;
    
    public Bagpipe(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType, BagpipeType bagpipeType) {
        super(name, material, manufacturer, boughtPrice, sellPrice, instrumentType);
        this.bagpipeType = bagpipeType;
    }
    
    public BagpipeType getBagpipeType() {
        return bagpipeType;
    }
    
    @Override
    public String play() {
        return "Wail!";
    }
}
