package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithNameAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 26;

        // When
        person.setAge(26);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        // Given
        Person person = new Person("Marci");
        String expected = "Marci";

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAge() {
        // Given
        Person person = new Person(26);
        Integer expected = 26;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDad() {
        // Given
        Person person = new Person();
        Person dad = new Person();
        Person expected = dad;

        // When
        person.setDad(dad);

        // Then
        Person actual = person.getDad();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDad() {
        // Given
        Person person = new Person();
        Person expected = new Person("Dad");

        // When
        person.setDad(expected);
        Person actual = person.getDad();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetMom() {
        // Given
        Person person = new Person();
        Person mom = new Person();
        Person expected = mom;

        // When
        person.setMom(mom);

        // Then
        Person actual = person.getMom();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMom() {
        // Given
        Person person = new Person();
        Person expected = new Person("Mom");

        // When
        person.setMom(expected);
        Person actual = person.getMom();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 5.1;

        // When
        person.setHeight(5.1);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHeight() {
        // Given
        Person person = new Person(6.4);
        Double expected = 6.4;

        // When
        Double actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Double expected = 150.0;

        // When
        person.setWeight(150.0);

        // Then
        Double actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetWeight() {
        // Given
        Person person = new Person();
        Double expected = 135.0;
        person.setWeight(135.0);

        // When
        Double actual = person.getWeight();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetIsFemale() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setIsFemale(true);

        // Then
        boolean actual = person.getIsFemale();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetIsFemale() {
        // Given
        Person person = new Person(false);
        boolean expected = false;

        // When
        boolean actual = person.getIsFemale();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
