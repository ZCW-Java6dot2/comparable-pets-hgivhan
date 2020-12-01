package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetTest {
    @Test
    public void testSetName() {
        Pet pet = new Pet();
        String expected = "Marvel";
        pet.setName("Marvel");
        String actual = pet.getName();

        assertEquals(expected, actual);


    }
//
//    @Test
//    public void getAge() {
//    }
//
//    @Test
//    public void setAge() {
//    }
//
//    @Test
//    public void compareTo() {
//    }

    @Test
    public void testComparable1() {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.setName("Tabby");
        pet2.setName("Abby");
        Integer actual = pet1.compareTo(pet2);

        assertTrue(actual > 0);
    }

    @Test
    public void testComparable2(){
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.setName("Abby");
        pet2.setName("Abby");
        pet1.setAge(4);
        pet2.setAge(3);
        Integer actual = pet1.compareTo(pet2);

            assertTrue(actual > 0);
    }

    @Test
    public void testPetComparator1(){
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.setAge(5);
        pet2.setAge(10);
        Integer actual = pet1.getAge().compareTo(pet2.getAge());

        assertTrue(actual < 0);

    }

    @Test
    public void testPetComparator2(){
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.setAge(5);
        pet2.setAge(5);
        pet1.setName("Georgie");
        pet1.setName("Gigi");
        Integer actual = pet1.compareTo(pet2);

        assertTrue(actual > 0);

    }

//    public int compare(Pet pet1, Pet pet2) {
//        int answer = pet1.getAge().compareTo(pet2.getAge());
//        if (answer == 0){
//            return pet1.getName().compareTo(pet2.getName());
//        }
//        else {
//            return answer;
//        }
//    }

    }
