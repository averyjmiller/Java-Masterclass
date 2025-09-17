package CompositionChallenge.src;

public class SmartKitchen {
  private CoffeeMaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;

  public SmartKitchen() {
    brewMaster = new CoffeeMaker();
    dishWasher = new DishWasher();
    iceBox = new Refrigerator();
  }

  public CoffeeMaker getBrewMaster() {
    return brewMaster;
  }

  public DishWasher getDishWasher() {
    return dishWasher;
  }

  public Refrigerator getIceBox() {
    return iceBox;
  }

  public void setKitchenState(boolean coffeeFlag, boolean dishFlag, boolean fridgeFlag) {
    brewMaster.setHasWorkToDo(coffeeFlag);
    dishWasher.setHasWorkToDo(dishFlag);
    iceBox.setHasWorkToDo(fridgeFlag);
  }

  public void doKitchenWork() {
    brewMaster.brewCoffee();
    dishWasher.doDishes();
    iceBox.orderFood();
  }
}

class Refrigerator {
  private boolean hasWorkToDo;

  public Refrigerator() {}

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void orderFood() {
    if(hasWorkToDo) {
      System.out.println("Ordering Food");
      hasWorkToDo = false;
    }
  }
}

class DishWasher {
  private boolean hasWorkToDo;

  public DishWasher() {}

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void doDishes() {
    if(hasWorkToDo) {
      System.out.println("Washing Dishes");
      hasWorkToDo = false;
    }
  }
}

class CoffeeMaker {
  private boolean hasWorkToDo;

  public CoffeeMaker() {}

  public void setHasWorkToDo(boolean hasWorkToDo) {
    this.hasWorkToDo = hasWorkToDo;
  }

  public void brewCoffee() {
    if(hasWorkToDo) {
      System.out.println("Brewing Coffee");
      hasWorkToDo = false;
    }
  }
}
