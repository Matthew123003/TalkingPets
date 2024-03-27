package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog(String name, int age){
        super(name, age);

    }

    @Override
    public String speak() {
        return "Bark!";
    }
}
