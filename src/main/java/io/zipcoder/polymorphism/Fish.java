package io.zipcoder.polymorphism;

public class Fish extends Pet {


    public Fish(String name){
        super(name);
    }



    @Override
    String speak() {
        return "Glub glub";
    }
}
