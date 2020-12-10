package Pizza;

public class Pineapple extends PizzaToppings{
    private Pizza pizza;

    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Nanas, Harga = 2p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
