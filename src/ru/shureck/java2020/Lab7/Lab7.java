package ru.shureck.java2020.Lab7;

public class Lab7 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Person person = new Person(shop);
        shop.addElement(new Chair(40,13));
        shop.addElement(new Table(600,80));
        shop.addElement(new Chair(11,9));
        shop.addElement(new Table(86,20));

        person.addToBasket(2);
        person.addToBasket(1);
        System.out.println(person.getTotalCost());
    }
}
