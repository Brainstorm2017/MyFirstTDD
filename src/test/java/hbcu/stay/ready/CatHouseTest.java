package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void addTest(){

        Cat cat = new Cat(null, null,null);

        CatHouse.add(cat);

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
        public void removeCatTest() {

            Cat cat = new Cat(null, null, null);
            CatHouse.add(cat);
            CatHouse.remove(cat);
            Integer expected = 0;
            Assert.assertEquals(expected, CatHouse.getNumberOfCats());
        }
        @Test
        public void removeCatIdTest(){

            Integer givenId = 0;
            Cat cat = new Cat(null,null,givenId);
            CatHouse.add(cat);
            CatHouse.remove(givenId);


            Integer givenId2 = 1;
            Cat cat2 = new Cat(null,null,givenId2);
            CatHouse.add(cat2);


            Integer expected = 1;
            Integer actual = CatHouse.getNumberOfCats();
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void getCatByIdTest(){
            Integer givenId = 1;
            Cat cat = new Cat("Wutang", new Date(),givenId);
            CatHouse.add(cat);
            //CatHouse.remove(givenId);


            Cat idiot = CatHouse.getCatById(1);

            Integer expected = 1;
            Integer actual = idiot.getId();
            Assert.assertEquals(expected, actual);

        }
        @Test
        public void getNumberOfCatsTest(){

            Integer givenId = 1;
            Cat fatso = new Cat("Wutang", new Date(),givenId);
            CatHouse.add(fatso);
            //CatHouse.remove(givenId);
            Cat blu = new Cat("Wutang", new Date(),givenId);
            CatHouse.add(blu);

            Cat casper = new Cat("Wutang", new Date(),givenId);
            CatHouse.add(casper);

            //Cat idiot = CatHouse.getCatById(1);

            Integer expected = 3;
            Integer actual = CatHouse.getNumberOfCats();
            Assert.assertEquals(expected, actual);
    }
}
