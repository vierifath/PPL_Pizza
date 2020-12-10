package Pizza;

public class Pepperoni extends PizzaToppings{
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Pepperoni, Harga = 4p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}