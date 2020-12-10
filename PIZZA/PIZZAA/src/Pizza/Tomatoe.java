package Pizza;

public class Tomatoe extends PizzaToppings{
    private Pizza pizza;

    public Tomatoe(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Tomat, Harga = 1p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
