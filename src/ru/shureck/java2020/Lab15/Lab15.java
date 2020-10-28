package ru.shureck.java2020.Lab15;

public class Lab15 {
    public static void main(String[] args) {
        BestArray bestArray = new BestArray();
        bestArray.add(3);
        System.out.println(bestArray);
        bestArray.add(5);
        System.out.println(bestArray);
        bestArray.add(989);
        System.out.println(bestArray);
        bestArray.add(134);
        System.out.println(bestArray);
        bestArray.add(12);
        System.out.println(bestArray);
        bestArray.remove(989);
        System.out.println(bestArray);
        System.out.println(bestArray.getMax());
        System.out.println(bestArray.getMin());
        System.out.println(bestArray.getAverage());
    }

}
