package com.interlink;

public class Lion extends Animal implements Pet {

    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void say() {
        System.out.println("roaar");
    }
}
