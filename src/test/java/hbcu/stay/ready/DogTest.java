package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;



import java.util.Date;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("pochi", new Date(), 0);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {

        String givename = "pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givename, givenBirthDate, givenId);

        dog.speak();

        String expected = "bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getBirthdateTest() {
        String givenName = "pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Date dogBD = new Date();

        String expectedDate = dogBD.toString();
        String ActualDate = dog.getBirthDate().toString();
        Assert.assertEquals(expectedDate, ActualDate);
    }
    @Test
    public void eatTest() {

        String givenName = "Pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.eat(new Food());
        Integer expectedInt = 1;
        Integer actualInt = dog.getNumberOfMealsEaten();
        Assert.assertEquals(actualInt, expectedInt);
    }

    @Test
    public void getID(){

        String givenName = "Pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.getId();

        Integer expectedInt = 0;
        Integer actualInt = dog.getId();
        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void animalTest(){
        String givenName = "Pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void mammalTest(){
        String givenName = "Pochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }
}

