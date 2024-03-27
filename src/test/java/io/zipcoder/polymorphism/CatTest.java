package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testNewCat(){
        //Given
        String expectedName = "Mittens";
        Integer expectedAge = 2;

        //When
        Cat cat = new Cat(expectedName, expectedAge);
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testCatGetName(){
        //Given
        String expectedName = "Mittens";
        int age = 1;

        //When
        Cat cat = new Cat(expectedName, age);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testCatGetAge(){
        //Given
        String name = "Mittens";
        int expectedAge = 4;

        //When
        Cat cat = new Cat(name, expectedAge);
        int actualAge = cat.getAge();

        //Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testCatSpeak(){
        //Given
        String expectedSpeak = "Meow!";

        //When
        Cat cat = new Cat("Mittens", 0);
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testCatInheritance(){
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
    public void testPetInheritance(){
        // Cat() instanceof Animal;
        Pet cat = new Cat("Mittens", 1);
        Assert.assertTrue(cat instanceof Pet);
    }

}
