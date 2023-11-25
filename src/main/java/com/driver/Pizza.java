package com.driver;

public class Pizza {
    private final int veg=300;
    private final int nonveg=400;
    private final int topppr=70;
    private final int nontopppr=120;
    private final int cheesepr=80;
    private final int takeaw=20;

    private int price;
    private boolean isVeg;
    private String bill;
    private int topadd;

    private boolean take;
    private boolean topp;
    private boolean cheese;
    public Pizza(boolean isVeg){
        this.isVeg=isVeg;
        if(isVeg){
            price+=veg;

        }
        else
            price+=nonveg;
    }
    public void addExtraCheese(){
        if(!cheese){
            cheese=true;
            price+=cheesepr;
        }
    }
    public void addExtraToppings(){
        if(!topp){
            topp=true;
            if(isVeg){
                price+=topppr;
                topadd=topppr;
            }

            else{
                price+=nontopppr;
                topadd=nontopppr;
            }

        }
    }
    public void addTakeaway(){
        if(!take){
            take=true;
            price+=takeaw;
        }

    }

    public int getPrice() {
        return price;
    }

    public String getBill() {
        if(price>0){
            if(isVeg)
                bill="Base Price Of The Pizza: "+String.valueOf(veg)+"\n";
            else
                bill="Base Price Of The Pizza: "+String.valueOf(nonveg)+"\n";
            if(cheese)
                bill+="Extra Cheese Added: "+String.valueOf(cheesepr)+"\n";
            if(topp){
                bill+="Extra Toppings Added: "+String.valueOf(topadd)+"\n";
            }
            if(take)
                bill+="Paperbag Added: "+String.valueOf(takeaw)+"\n";

        }
        bill+="Total Price: "+String.valueOf(price);

        return bill;
    }
}
