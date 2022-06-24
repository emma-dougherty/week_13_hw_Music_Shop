import org.junit.Before;
import org.junit.Test;
import stock.Item;
import stock.Manufacturer;
import stock.instruments.InstrumentType;
import stock.instruments.string.Guitar;
import stock.instruments.string.GuitarType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    
    Shop shop;
    ArrayList<Item> stock;
    Guitar guitar;
    
    @Before
    public void before(){
        guitar = new Guitar("Taylor 914ce V-Class", "Spruce, Rosewood, Ebony", Manufacturer.TAYLOR, 3500.00, 5075.00, InstrumentType.STRING, GuitarType.ACOUSTIC);
        stock = new ArrayList<Item>();
        stock.add(guitar);
        shop = new Shop("Melodious", stock);
    }
    
    @Test
    public void hasName(){
        assertEquals("Melodious", shop.getShopName());
    }
    @Test
    public void hasStock(){
        assertEquals(1, shop.getStock().size());
    }
    
    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar);
        assertEquals(2, shop.getStock().size());
    }
    
    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(1, shop.getStock().size());
    }
    
}
