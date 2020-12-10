package Pizza;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBase();

        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Tuna(pizza);
        pizza = new Pepper(pizza);
        pizza = new Tomatoe(pizza);
        
        System.out.println("Deskripsi Pesanan: \n" + pizza.getTopping());
        System.out.println("Total Harga: \n" + pizza.getPrice() + "p");
    }
}
