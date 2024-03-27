package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testNewDog(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Dog dog = new Dog(expectedName, expectedAge);
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testDogGetName(){
        //Given
        String expectedName = "Mittens";
        int age = 1;

        //When
        Dog dog = new Dog(expectedName, age);
        String actualName = dog.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testDogGetAge(){
        //Given
        String name = "Mittens";
        int expectedAge = 4;

        //When
        Dog dog = new Dog(name, expectedAge);
        int actualAge = dog.getAge();

        //Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testDogSpeak(){
        //Given
        String expectedSpeak = "Bark!";

        //When
        Dog dog = new Dog("Mittens", 1);
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testDogInheritance(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Pet dog = new Dog(expectedName, expectedAge);
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testPetInheritance(){
        // Dog() instanceof Animal;
        Pet dog = new Dog("Mittens", 1);
        Assert.assertTrue(dog instanceof Pet);
    }
}
