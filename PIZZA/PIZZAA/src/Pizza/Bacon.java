package Pizza;

public class Bacon extends PizzaToppings{
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Bacon, Harga = 5p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}