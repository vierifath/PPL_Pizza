package Pizza;

public class Chicken extends PizzaToppings{
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getTopping() + "Ayam, Harga = 5p \n";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
