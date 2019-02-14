package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Person mom;
    private Person dad;
    private boolean isFemale;
    private double height;
    private double weight;


    public Person() {
        this("",Integer.MAX_VALUE);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(double height) {
        this.height = height;
    }

    public Person(boolean b) {
        this.isFemale = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    public Person getDad() {
        return this.dad;
    }

    public Person getMom() {
        return this.mom;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setIsFemale(boolean b) {
        this.isFemale = b;
    }

    public boolean getIsFemale() {
        return this.isFemale;
    }
}
