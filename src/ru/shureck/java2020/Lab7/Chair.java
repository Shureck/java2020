package ru.shureck.java2020.Lab7;

public class Chair extends Funrniture{

    public Chair(int cost, int numberOfDetal) {
        super(cost, numberOfDetal);
    }

    @Override
    public int timeToBuild() {
        return getNumberOfDetal()*5;
    }

    @Override
    public String toString() {
        return "Chair "+super.toString();
    }
}
