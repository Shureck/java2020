package ru.shureck.java2020.Lab7;

public abstract class Funrniture {
    private int cost;
    private int numberOfDetal;

    public Funrniture(int cost, int numberOfDetal) {
        this.cost = cost;
        this.numberOfDetal = numberOfDetal;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberOfDetal() {
        return numberOfDetal;
    }

    public void setNumberOfDetal(int numberOfDetal) {
        this.numberOfDetal = numberOfDetal;
    }

    public abstract int timeToBuild();

    public int totalCost(){
        return timeToBuild() * 10 + cost;
    }
}
