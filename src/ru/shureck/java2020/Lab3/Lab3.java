package ru.shureck.java2020.Lab3;

public class Lab3 {
    public static void main(String[] args) {

        Human human = new Human(new Head(1240,"green",false),
                        new Legs(90, 45), new Hands(61), new Body(false), "Sam", 19, 68);

        Circle circle = new Circle(20,"red",false);

        Book book = new Book("Брюс Эккель", "Философия Java", 2009, 450);

        System.out.println(circle);
        System.out.println(book);
    }
}
