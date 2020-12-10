package Pizza;

public class Cheese extends PizzaToppings{
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Keju, Harga = 1p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}