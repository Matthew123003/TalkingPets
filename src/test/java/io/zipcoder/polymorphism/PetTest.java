package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testNewCat(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Pet cat = new Cat(expectedName, expectedAge);
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testNewDog(){
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
    public void testNewFish(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Pet fish = new Fish(expectedName, expectedAge);
        String actualName = fish.getName();
        Integer actualAge = fish.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testPetInheritanceFish(){
        // Fish() instanceof Animal;
        Pet fish = new Fish("Mittens", 1);
        Assert.assertTrue(fish instanceof Pet);
    }

    @Test
    public void testPetInheritanceDog(){
        // Dog() instanceof Animal;
        Pet dog = new Dog("Mittens", 1);
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void testPetInheritanceCat(){
        // Cat() instanceof Animal;
        Pet cat = new Cat("Mittens", 1);
        Assert.assertTrue(cat instanceof Pet);
    }
}
