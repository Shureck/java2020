package ru.shureck.java2020.Lab7;

public class Table extends Funrniture{

    public Table(int cost, int numberOfDetal) {
        super(cost, numberOfDetal);
    }

    @Override
    public int timeToBuild() {
        return getNumberOfDetal()*10;
    }

    @Override
    public String toString() {
        return "Table "+super.toString();
    }
}
