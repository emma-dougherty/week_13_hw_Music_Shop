package behaviours;

public interface ISell {
    
    public default double calculateMarkup(){
        return ((getSellPrice() - getBoughtPrice()) / getBoughtPrice()) * 100;
    };
    
    public double getBoughtPrice();

    
    public double getSellPrice();
    
    String getName();
}
