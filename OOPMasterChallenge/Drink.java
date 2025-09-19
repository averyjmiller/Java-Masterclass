package OOPMasterChallenge;

public class Drink {
  private String type;
  private char size;
  private double price;

  public Drink() {
    type = "Coke";
    size = 'S';
    price = getSizingPrice(size);
  }
  
  public String getType() {
    return type;
  }

  public char getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public void setDrink(String type, char size) {
    this.type = type;
    this.size = size;
    price = getSizingPrice(size);
  }

  public double getSizingPrice(char size) {
    return switch(size) {
      case 'S' -> 1.19;
      case 'M' -> 1.89;
      case 'L' -> 2.49;
      default -> 1.19;
    };
  }

  @Override
  public String toString() {
    return "Drink{" + 
            "type='" + type + "'" +
            ", size='" + size + "'" +
            ", price='" + price + "'}";
  }
}
