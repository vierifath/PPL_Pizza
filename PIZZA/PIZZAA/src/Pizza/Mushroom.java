package Pizza;

public class Mushroom extends PizzaToppings{
    private Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Jamur, Harga = 3p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
