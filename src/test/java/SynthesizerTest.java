import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.instruments.InstrumentType;
import stock.instruments.keyboard.SynthType;
import stock.instruments.keyboard.Synthesizer;


import static org.junit.Assert.assertEquals;

public class SynthesizerTest {
    
    Synthesizer synthesizer;
    
    @Before
    public void before(){
        synthesizer = new Synthesizer("Roland JUPITER-X 61-Key", "NA", Manufacturer.ROLAND, 1600.00, 2320.00, InstrumentType.KEYBOARD, SynthType.DIGITAL, 61);
    }
    
    @Test
    public void hasName(){
        assertEquals("Roland JUPITER-X 61-Key", synthesizer.getName());
    }
    
    public void hasMaterial(){
        assertEquals("SNA", synthesizer.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.ROLAND, synthesizer.getManufacturer());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(1600.00, synthesizer.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(2320.00, synthesizer.getSellPrice(), 0.00);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, synthesizer.getInstrumentType());
    }
    @Test
    public void hasSynthType(){
        assertEquals(SynthType.DIGITAL, synthesizer.getSynthType());
    }
    @Test
    public void canPlay(){
        assertEquals("Meep!", synthesizer.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, synthesizer.calculateMarkup(), 0.00);
    }
    
}
