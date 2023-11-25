package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
       super(isVeg);
       super.addExtraCheese();
       super.addExtraToppings();
    }

    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getBill() {
        return super.getBill();
    }
}
