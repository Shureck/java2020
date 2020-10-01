package ru.shureck.java2020.Lab7;

import java.util.ArrayList;

public class Person {
    private ArrayList<Funrniture> basket = new ArrayList<>();
    private Shop shop;

    public Person(Shop shop) {
        this.shop = shop;
    }

    public void addToBasket(int i){
        if(shop.getElement(i) != null) {
            basket.add(shop.getElement(i));
        }
    }

    public Funrniture getFromBasket(int i){
        if (basket.size()>i){
            return basket.get(i);
        }
        return null;
    }

    public int getTotalCost(){
        int sum=0;
        for (int i = 0; i < basket.size(); i++) {
            sum += basket.get(i).totalCost();
        }
        return sum;
    }
}
