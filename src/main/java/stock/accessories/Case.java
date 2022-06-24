package stock.accessories;

import stock.Manufacturer;

public class Case extends Accessory {
    
    private CaseType caseType;
    private String colour;
    
    public Case(String name, String material, Manufacturer manufacturer, double boughtPrice, double sellPrice, CaseType caseType, String colour) {
        super(name, material, manufacturer, boughtPrice, sellPrice);
        this.caseType = caseType;
        this.colour = colour;
    }
    
    public CaseType getCaseType() {
        return caseType;
    }
    
    public String getColour() {
        return colour;
    }
}
