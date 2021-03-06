package ru.shureck.java2020.Lab2;

import java.util.Arrays;
import java.util.Scanner;

class Dog {
    private String name;
    private int age;
    Dog(String name_, int age_){
        name = name_;
        age = age_;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageToHum(){
        return this.age*8;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Nersery{
    private Dog[] dogs;
    private int pos=0;
    Scanner scanner = new Scanner(System.in);
    public Nersery(int n){
        dogs = new Dog[n];
    }

    public void changeArrLen(int n){
        dogs = Arrays.copyOf(dogs, n);
    }

    public void addDogs(int n){
        for(int i=pos;i<n;i++) {
            dogs[i] = new Dog(scanner.next(), scanner.nextInt());
        }
        pos += n;
    }

    @Override
    public String toString() {
        return "Nersery{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nersery nersery = new Nersery(scanner.nextInt());
        nersery.addDogs(5);
        System.out.println(nersery);
        nersery.changeArrLen(scanner.nextInt());
        System.out.println(nersery);
    }
}
