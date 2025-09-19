package OOPMasterChallenge;

public class Side {
  private String type;
  private double price;

  public Side() {
    this.type = "Fries";
    price = getSidePrice(type);
  }

  public double getSidePrice(String type) {
    return switch(type) {
      case "Fries" -> 2.99;
      case "Nuggets" -> 3.49;
      case "Onion Rings" -> 4.99;
      case "Chips" -> 3.19;
      default -> 2.99;
    };
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  public void setSide(String type) {
    this.type = type;
    price = getSidePrice(type);
  }

  @Override
  public String toString() {
    return "Side{" + 
            "type='" + type + "'" +
            ", price='" + price + "'}";
  }

}
