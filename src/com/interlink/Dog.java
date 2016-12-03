package com.interlink;

public class Dog extends Animal implements Pet {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void say() {
        System.out.println("woof");
    }
}
