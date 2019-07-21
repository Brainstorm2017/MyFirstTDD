package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrieveName = dog.getName();
        Date retrieveBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenName, retrieveName);
        Assert.assertEquals(givenBirthDate, retrieveBirthDate);
    }
    @Test
    public void createCatTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String retrieveName = cat.getName();
        Date retrieveBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenName, retrieveName);
        Assert.assertEquals(givenBirthDate, retrieveBirthDate);
    }

}
