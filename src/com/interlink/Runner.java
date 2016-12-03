package com.interlink;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Pet> listOfPets = new ArrayList<>();
        listOfPets.add(new Cat("Jack", 3, 5.2));
        listOfPets.add(new Dog("Jimmy", 5, 38.5));
        listOfPets.add(new Lion("Simba", 4, 126.2));

        Handler mrAdam = new Handler("Adam", 27, listOfPets);

        mrAdam.getPets().forEach(p -> mrAdam.commandToPetToSay(p));
    }

}
