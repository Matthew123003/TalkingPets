package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void testNewFish(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Fish fish = new Fish(expectedName, expectedAge);
        String actualName = fish.getName();
        Integer actualAge = fish.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testFishGetName(){
        //Given
        String expectedName = "Mittens";
        int age = 1;

        //When
        Fish fish = new Fish(expectedName, age);
        String actualName = fish.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testFishGetAge(){
        //Given
        String name = "Mittens";
        int expectedAge = 4;

        //When
        Fish fish = new Fish(name, expectedAge);
        int actualAge = fish.getAge();

        //Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testFishSpeak(){
        //Given
        String expectedSpeak = "Glub glub!";

        //When
        Fish fish = new Fish("Mittens", 1);
        String actualSpeak = fish.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testFishInheritance(){
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
    public void testPetInheritance(){
        // Fish() instanceof Animal;
        Pet fish = new Fish("Mittens", 1);
        Assert.assertTrue(fish instanceof Pet);
    }
}
