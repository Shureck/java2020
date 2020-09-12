package ru.shureck.java2020.Lab3;

class Head{
    private float brainVolume;
    private String eyeColor;
    private boolean isBald;

    public Head(float brainVolume, String eyeColor, boolean isBald) {
        this.brainVolume = brainVolume;
        this.eyeColor = eyeColor;
        this.isBald = isBald;
    }

    public float getBrainVolume() {
        return brainVolume;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isBald() {
        return isBald;
    }

    public void setBrainVolume(float brainVolume) {
        this.brainVolume = brainVolume;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setBald(boolean bald) {
        isBald = bald;
    }
}
class Legs{
    private float length;
    private float footSize;

    public Legs(float length, float footSize) {
        this.length = length;
        this.footSize = footSize;
    }

    public float getLength() {
        return length;
    }

    public float getFootSize() {
        return footSize;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setFootSize(float footSize) {
        this.footSize = footSize;
    }
}
class Hands{
    private float length;

    public Hands(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
class Body{
    private boolean isFat;

    public Body(boolean isFat) {
        this.isFat = isFat;
    }

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }
}

public class Human {

    private Head head;
    private Legs legs;
    private Hands hands;
    private Body body;
    private String name;
    private int age;
    private float weight;

    public Human(Head head, Legs legs, Hands hands, Body body, String name, int age, float weight) {
        this.head = head;
        this.legs = legs;
        this.hands = hands;
        this.body = body;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Head getHead() {
        return head;
    }

    public Legs getLegs() {
        return legs;
    }

    public Hands getHands() {
        return hands;
    }

    public Body getBody() {
        return body;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
