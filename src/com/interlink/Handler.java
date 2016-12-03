package com.interlink;

import java.util.List;

public class Handler {

    private String name;
    private int age;
    private List<Pet> pets;

    public void commandToPetToSay(Pet pet) {
        pet.say();
    }

    public Handler(String name, int age, List<Pet> pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
