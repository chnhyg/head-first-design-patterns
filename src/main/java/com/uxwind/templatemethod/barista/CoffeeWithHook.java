package com.uxwind.templatemethod.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  protected void brew() {
    System.out.println("Dripping coffee through filter.");
  }

  protected void addCondiments() {
    System.out.println("Adding sugar and milk.");
  }

  protected boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    return "yes";
  }
}
