package Pizza;

public class Onion extends PizzaToppings{
    private Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Bawang, Harga = 3p";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
