package com.uxwind.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  private void boilWater() {
    System.out.println("Boiling water.");
  }

  protected abstract void brew();

  private void pourInCup() {
    System.out.println("Pouring into cup.");
  }

  protected abstract void addCondiments();

  protected boolean customerWantsCondiments() {
    return true;
  }
}
