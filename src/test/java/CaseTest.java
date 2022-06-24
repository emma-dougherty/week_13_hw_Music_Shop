import org.junit.Before;
import org.junit.Test;
import stock.Manufacturer;
import stock.accessories.Case;
import stock.accessories.CaseType;
import stock.instruments.InstrumentType;
import stock.instruments.percussion.DrumKitType;

import static org.junit.Assert.assertEquals;

public class CaseTest {
    
    Case instrumentCase;
    
    @Before
    public void before() {
        instrumentCase = new Case("Deluxe Protector Case SG", "Rugged polyethylene shell", Manufacturer.GIBSON, 120.00, 174, CaseType.GUITAR, "black");
    }
    
    @Test
    public void hasName(){
        assertEquals("Deluxe Protector Case SG", instrumentCase.getName());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Rugged polyethylene shell", instrumentCase.getMaterial());
    }
    @Test
    public void hasManufacturer(){
        assertEquals(Manufacturer.GIBSON, instrumentCase.getManufacturer());
    }
    @Test
    public void hasColour(){
        assertEquals("black", instrumentCase.getColour());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(120, instrumentCase.getBoughtPrice(), 0.00);
    }
    @Test
    public void hasSellPrice(){
        assertEquals(174, instrumentCase.getSellPrice(), 0.00);
    }
    @Test
    public void hasCaseType(){
        assertEquals(CaseType.GUITAR, instrumentCase.getCaseType());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(45.00, instrumentCase.calculateMarkup(), 0.00);
    }
    
}
