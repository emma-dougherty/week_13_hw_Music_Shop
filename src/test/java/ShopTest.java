import org.junit.Before;
import org.junit.Test;
import stock.Item;
import stock.Manufacturer;
import stock.accessories.Case;
import stock.accessories.CaseType;
import stock.instruments.InstrumentType;
import stock.instruments.brass.Saxaphone;
import stock.instruments.brass.SaxaphoneType;
import stock.instruments.keyboard.SynthType;
import stock.instruments.keyboard.Synthesizer;
import stock.instruments.percussion.DrumKit;
import stock.instruments.percussion.DrumKitType;
import stock.instruments.string.Guitar;
import stock.instruments.string.GuitarType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ShopTest {
    
    Shop shop;
    ArrayList<Item> stock;
    Guitar guitar1;
    Guitar guitar2;
    Saxaphone saxaphone;
    DrumKit drumKit;
    Synthesizer synthesizer;
    Case instrumentCase;
    
    @Before
    public void before(){
        guitar1 = new Guitar("Taylor 914ce V-Class", "Spruce, Rosewood, Ebony", Manufacturer.TAYLOR, 3500.00, 5075.00, InstrumentType.STRING, GuitarType.ACOUSTIC);
        guitar2 = new Guitar("American Professional II Stratocaster MN", "Alder", Manufacturer.FENDER, 1050.00, 1522.50, InstrumentType.STRING, GuitarType.ELECTRIC);
        saxaphone = new Saxaphone("YAS-280", "Gold lacquer finish", Manufacturer.YAMAHA, 680.00, 986.00, InstrumentType.BRASS, SaxaphoneType.ALTO);
        drumKit = new DrumKit("Roland TD-17KVX", "Poplar", Manufacturer.YAMAHA, 680.00, 986.00, InstrumentType.PERCUSSION, DrumKitType.ACOUSTIC, "red");
        synthesizer = new Synthesizer("Roland JUPITER-X 61-Key", "NA", Manufacturer.ROLAND, 1600.00, 2320.00, InstrumentType.KEYBOARD, SynthType.DIGITAL, 61);
        instrumentCase = new Case("Deluxe Protector Case SG", "Rugged polyethylene shell", Manufacturer.GIBSON, 120.00, 174, CaseType.GUITAR, "black");
        stock = new ArrayList<Item>();
        stock.add(guitar1);
        stock.add(guitar2);
        stock.add(saxaphone);
        stock.add(drumKit);
        stock.add(synthesizer);
        stock.add(instrumentCase);
        shop = new Shop("Melodious", stock);
    }
    
    @Test
    public void hasName(){
        assertEquals("Melodious", shop.getShopName());
    }
    @Test
    public void hasStock(){
        assertEquals(6, shop.getStock().size());
    }
    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar2);
        assertEquals(7, shop.getStock().size());
    }
    @Test
    public void canRemoveItemFromStock(){
        shop.removeItemFromStock(guitar1);
        assertEquals(5, shop.getStock().size());
    }
    @Test
    public void canGetTotalPotentialProfit(){
        assertEquals(3433.50, shop.getTotalPotentialProfit(),0.00);
    }
    @Test
    public void canAddDiscountToSpecificItemType(){
        assertEquals(4567.50, shop.addDiscount(guitar1, 10), 0.00);
    }
    @Test
    public void canFindItemByName(){
        assertEquals(guitar1, shop.findItemByName("Taylor 914ce V-Class"));
    }
    @Test
    public void canCatchExceptionIfFindItemByNameNull(){
        assertNull(shop.findItemByName(""));
    }
}
