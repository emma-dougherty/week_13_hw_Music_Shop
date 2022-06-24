package stock.instruments.keyboard;

import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;

public class Synthesizer extends Instrument {
    
    private SynthType synthType;
    private int numOfKeys;
    
    public Synthesizer(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType, SynthType synthType, int numOfKeys) {
        super(name, material, manufacturer, boughtPrice, sellPrice, instrumentType);
        this.synthType = synthType;
        this.numOfKeys = numOfKeys;
    }
    
    public SynthType getSynthType() {
        return synthType;
    }
    
    public int getNumOfKeys() {
        return numOfKeys;
    }
    
    @Override
    public String play() {
        return "Meep!";
    }
}
