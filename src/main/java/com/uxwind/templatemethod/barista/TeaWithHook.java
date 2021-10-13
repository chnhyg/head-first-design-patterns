package com.uxwind.templatemethod.barista;

public class TeaWithHook extends CaffeineBeverageWithHook {
  protected void brew() {
    System.out.println("Steeping the tea.");
  }

  protected void addCondiments() {
    System.out.println("Adding lemon.");
  }

  protected boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    return "yes";
  }
}
