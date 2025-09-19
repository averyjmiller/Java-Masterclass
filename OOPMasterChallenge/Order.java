package OOPMasterChallenge;

public class Order {
  private Burger burger;
  private Drink drink;
  private Side side;
  private double totalPrice;

  public Order() {
    this.burger = new Burger();
    this.drink = new Drink();
    this.side = new Side();
    setTotalPrice();
  }

  public void getTotalPrice() {
    System.out.println("Total bill: " + totalPrice);
  }

  public void setBurger(String type) {
    burger.setBurger(type);
    setTotalPrice();
  }

  public void setToppings(String... topping) {
    burger.addToppings(topping);
    setTotalPrice();
  }

  public void setDrink(String type, char size) {
    drink.setDrink(type, size);
    setTotalPrice();
  }

  public void setSide(String type) {
    side.setSide(type);
    setTotalPrice();
  }

  public void setTotalPrice() {
    totalPrice = burger.getPrice() +
                  drink.getPrice() +
                  side.getPrice();
  }

  @Override
  public String toString() {
    return "Itemized List:\n" +
            burger.toString() + "\n" +
            drink.toString() + "\n" +
            side.toString();
  }
}
