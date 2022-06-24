import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.instruments.InstrumentType;
import stock.instruments.woodwind.Bagpipe;
import stock.instruments.woodwind.BagpipeType;

import static org.junit.Assert.assertEquals;

public class BagpipeTest {
    
    Bagpipe bagpipe;
    
    @Before
    public void before(){
        bagpipe = new Bagpipe("Scottish Blackwood Bagpipes", "Blackwood, synthetic material", Manufacturer.BAGPIPES_GALORE, 680.00, 986.00, InstrumentType.WOODWIND, BagpipeType.SCOTTISH);
    }
    
    @Test
    public void hasName(){
        assertEquals("Scottish Blackwood Bagpipes", bagpipe.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Blackwood, synthetic material", bagpipe.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.BAGPIPES_GALORE, bagpipe.getManufacturer());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(680.00, bagpipe.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(986.00, bagpipe.getSellPrice(), 0.00);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, bagpipe.getInstrumentType());
    }
    @Test
    public void hasGuitarType(){
        assertEquals(BagpipeType.SCOTTISH, bagpipe.getBagpipeType());
    }
    @Test
    public void canPlay(){
        assertEquals("Wail!", bagpipe.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, bagpipe.calculateMarkup(), 0.00);
    }
    
}
