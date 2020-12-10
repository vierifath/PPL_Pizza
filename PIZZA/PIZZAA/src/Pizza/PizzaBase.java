package Pizza;

public class PizzaBase implements Pizza{
    @Override
    public String getTopping(){
        return "Base/Adonan, Harga = 5p\n";
    }

    public int getPrice(){
        return 5;
    }
}
