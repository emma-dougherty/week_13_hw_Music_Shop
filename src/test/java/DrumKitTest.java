import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.instruments.InstrumentType;
import stock.instruments.percussion.DrumKit;
import stock.instruments.percussion.DrumKitType;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {
    
    DrumKit drumKit;
    
    @Before
    public void before(){
        drumKit = new DrumKit("Roland TD-17KVX", "Poplar", Manufacturer.YAMAHA, 680.00, 986.00, InstrumentType.PERCUSSION, DrumKitType.ACOUSTIC, "red");
    }
    
    @Test
    public void hasName(){
        assertEquals("Roland TD-17KVX", drumKit.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Poplar", drumKit.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.YAMAHA, drumKit.getManufacturer());
    }
    @Test
    public void hasColour(){
        assertEquals("red", drumKit.getColour());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(680.00, drumKit.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(986.00, drumKit.getSellPrice(), 0.00);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drumKit.getInstrumentType());
    }
    @Test
    public void hasDrumKitType(){
        assertEquals(DrumKitType.ACOUSTIC, drumKit.getDrumKitType());
    }
    @Test
    public void canPlay(){
        assertEquals("Ba dum tish!", drumKit.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, drumKit.calculateMarkup(), 0.00);
    }
    
}
