package Pizza;

public class Tuna extends PizzaToppings{
    private Pizza pizza;

    public Tuna(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Ikan Tuna, Harga = 4p\n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
