package io.zipcoder.polymorphism;

public class Fish extends Pet {


    public Fish(String name, int age){
        super(name, age);
    }



    @Override
    String speak() {
        return "Glub glub!";
    }
}
