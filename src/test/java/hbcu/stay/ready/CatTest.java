package hbcu.stay.ready;

import com.sun.xml.internal.bind.v2.model.core.ID;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.speak();

        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthdateTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date catBD = new Date();


        String expectedDate = catBD.toString();
        String actualDate = cat.getBirthDate().toString();
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void eatTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.eat(new Food());
        Integer expectedInt = 1;
        Integer actualInt = cat.getNumberOfMealsEaten();
        Assert.assertEquals(actualInt, expectedInt);
    }

    @Test
    public void getID() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        cat.getId();

        Integer expectedInt = 0;
        Integer actualInt = cat.getId();
        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public  void animalTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        Assert.assertTrue( cat instanceof Animal);
    }
    @Test
    public  void mammalTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        Assert.assertTrue(cat instanceof Animal);

    }
}




