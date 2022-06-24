import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.instruments.InstrumentType;
import stock.instruments.brass.Saxaphone;
import stock.instruments.brass.SaxaphoneType;
import stock.instruments.percussion.DrumKit;
import stock.instruments.percussion.DrumKitType;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {
   
   Saxaphone saxaphone;
    
    @Before
    public void before(){
        saxaphone = new Saxaphone("YAS-280", "Gold lacquer finish", Manufacturer.YAMAHA, 680.00, 986.00, InstrumentType.BRASS, SaxaphoneType.ALTO);
    }
    
    @Test
    public void hasName(){
        assertEquals("YAS-280", saxaphone.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Gold lacquer finish", saxaphone.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.YAMAHA, saxaphone.getManufacturer());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(680.00, saxaphone.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(986.00, saxaphone.getSellPrice(), 0.00);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, saxaphone.getInstrumentType());
    }
    @Test
    public void hasSaxType(){
        assertEquals(SaxaphoneType.ALTO, saxaphone.getSaxaphoneType());
    }
    @Test
    public void canPlay(){
        assertEquals("Toot!", saxaphone.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, saxaphone.calculateMarkup(), 0.00);
    }
    
}
