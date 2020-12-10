package Pizza;

public class Ham extends PizzaToppings{
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Ham, Harga = 5p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
