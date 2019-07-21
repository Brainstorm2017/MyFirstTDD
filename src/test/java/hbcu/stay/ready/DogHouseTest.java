package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void removeDogTest() {

        Dog dog = new Dog(null, null, null);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 0;
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeCatIdTest() {

        Integer givenId = 0;
        Dog dog = new Dog(null, null, givenId);
        DogHouse.add(dog);
        DogHouse.remove(givenId);


        Integer givenId2 = 1;
        Dog dog2 = new Dog(null, null, givenId2);
        DogHouse.add(dog2);


        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        Integer givenId = 1;
        Dog dog = new Dog("Wutang", new Date(), givenId);
        DogHouse.add(dog);
        //CatHouse.remove(givenId);


        Dog idiot = DogHouse.getDogById(1);

        Integer expected = 1;
        Integer actual = idiot.getId();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getNumberOfDogsTest(){

        Integer givenId = 1;
        Dog fatso = new Dog("Wutang", new Date(),givenId);
        DogHouse.add(fatso);
        //CatHouse.remove(givenId);
        Dog blu = new Dog("Wutang", new Date(),givenId);
        DogHouse.add(blu);

        Dog casper = new Dog("Wutang", new Date(),givenId);
        DogHouse.add(casper);

        //Dog idiot = DogHouse.getDogById(1);

        Integer expected = 3;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}