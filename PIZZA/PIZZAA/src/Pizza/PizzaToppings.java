package Pizza;

public abstract class PizzaToppings implements Pizza {
    @Override
    public String getTopping(){
        return "Toppings";
    }
}
