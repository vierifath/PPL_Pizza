package Pizza;

public class Olive extends PizzaToppings{
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Olive, Harga = 4p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
