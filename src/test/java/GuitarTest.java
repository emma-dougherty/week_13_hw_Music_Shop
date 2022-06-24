import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.instruments.Instrument;
import stock.instruments.InstrumentType;
import stock.instruments.string.Guitar;
import stock.instruments.string.GuitarType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    
    Guitar guitar1;
    
    @Before
    public void before(){
        guitar1 = new Guitar("Taylor 914ce V-Class", "Spruce, Rosewood, Ebony", Manufacturer.TAYLOR, 3500.00, 5075.00, InstrumentType.STRING, GuitarType.ACOUSTIC);
    }
    
    @Test
    public void hasName(){
        assertEquals("Taylor 914ce V-Class", guitar1.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Spruce, Rosewood, Ebony", guitar1.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.TAYLOR, guitar1.getManufacturer());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(3500.00, guitar1.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(5075.00, guitar1.getSellPrice(), 0.00);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar1.getInstrumentType());
    }
    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.ACOUSTIC, guitar1.getGuitarType());
    }
    @Test
    public void canPlay(){
        assertEquals("Twang!", guitar1.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, guitar1.calculateMarkup(), 0.00);
    }
    
}
