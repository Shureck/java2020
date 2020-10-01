package ru.shureck.java2020.Lab7;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Funrniture> list = new ArrayList<>();

    public Shop(ArrayList<Funrniture> list) {
        this.list = list;
    }

    public Shop(){

    }

    public void addElement(Funrniture f){
        list.add(f);
    }

    public Funrniture getElement(int i){
        if (list.size()>i){
            return list.get(i);
        }
        return null;
    }
}
