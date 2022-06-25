package stock.instruments;
import behaviours.IPlay;
import behaviours.ISell;
import stock.Manufacturer;

public abstract class Instrument implements IPlay, ISell {
    
    private String name;
    private String material;
    private Manufacturer manufacturer;
    private double boughtPrice;
    private double sellPrice;
    private InstrumentType instrumentType;
    
    public Instrument(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        
        this.name = name;
        this.material = material;
        this.manufacturer = manufacturer;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
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
    
    @Override
    public double getBoughtPrice() {
        return boughtPrice;
    }
    
    @Override
    public double getSellPrice() {
        return sellPrice;
    }
    
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
