package com.uxwind.decorator.starbuzz;

public abstract class Beverage {
  public enum Size {
    TALL {
      public String toString() {
        return "Tall";
      }
    },
    GRANDE {
      public String toString() {
        return "Grande";
      }
    },
    VENTI {
      public String toString() {
        return "Venti";
      }
    },
  }

  protected Size size = Size.TALL;

  protected String description = "Unknown Beverage";

  public void setSize(Size size) {
    this.size = size;
  }

  public Size getSize() {
    return this.size;
  }

  public String getDescription() {
    return String.format("%s %s", size.toString(), description);
  }

  public abstract double cost();
}
