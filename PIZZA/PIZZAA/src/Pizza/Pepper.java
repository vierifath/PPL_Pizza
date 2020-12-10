package Pizza;

public class Pepper extends PizzaToppings{
    private Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Paprika, Harga = 2p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
