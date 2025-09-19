package OOPMasterChallenge;

import java.util.ArrayList;

public class Burger {
  private String type;
  private double price;
  private ArrayList<String> toppings;

  public Burger() {
    type = "Regular";
    price = getBurgerPrice(type);
    toppings = new ArrayList<>();
  }

  public static double getBurgerPrice(String type) {
    return switch(type) {
      case "Regular" -> 4.99;
      case "Quarter-pounder" -> 5.99;
      case "Cheese" -> 5.29;
      case "BLT" -> 6.99;
      case "Deluxe" -> 12.99;
      default -> 4.99;
    };
  }

  public static double getToppingPrice(String topping) {
    return switch(topping) {
        case "Pickles" -> 1.99;
        case "Tomatoes" -> 1.25;
        case "Onions" -> 0.99;
        case "Lettuce" -> 0.89;
        case "Bacon" -> 2.99;
        default -> 0.00;
    };
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  public void getToppings() {
    for(String topping : toppings) {
      System.out.println(topping);
    }
  }

  public void setBurger(String type) {
    this.type = type;
    price = getBurgerPrice(type);
  }

  public void addToppings(String... topping) {
    boolean isDeluxe = (type.equals("Deluxe"));
    int maxToppings = (isDeluxe) ? 5 : 3;

    for(int i = 0; i < topping.length && toppings.size() < maxToppings; i++) {
      toppings.add(topping[i]);
      if(!isDeluxe) {
        price += getToppingPrice(topping[i]);
      }
    }
  }

  @Override
  public String toString() {
    return "Burger{" + 
            "type='" + type + "'" +
            ", toppings='" + toppings + "'" +
            ", price='" + price + "'}";
  }
}
