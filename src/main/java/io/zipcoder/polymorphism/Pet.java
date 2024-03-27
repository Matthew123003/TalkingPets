package io.zipcoder.polymorphism;

public abstract class Pet extends MainApplication {

    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    abstract String speak();
}
