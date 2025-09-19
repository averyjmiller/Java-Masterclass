package OOPMasterChallenge;

public class Main {
  public static void main(String[] args) {
    Order order = new Order();
    order.setBurger("Cheese");
    order.setToppings("Pickles", "Lettuce", "Tomatoes");
    order.setDrink("Diet Coke", 'M');
    order.setSide("Onion Rings");
    System.out.println(order);
    order.getTotalPrice();
  }
}

