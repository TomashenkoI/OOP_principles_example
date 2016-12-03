package com.interlink;

public class Cat extends Animal implements Pet {

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
