package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        int nameCompare = pet1.getName().compareTo(pet2.getName());
        if (nameCompare == 0) {
        }

    }
}

//    @Override
//    public int compare(Student customer1, Student customer2) {
//
//        // for comparison
//        int NameCompare = customer1.getName().compareTo(customer2.getName());
//        int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
//
//        // 2-level comparison using if-else block
//        if (NameCompare == 0) {
//            return ((AgeCompare == 0) ? NameCompare : AgeCompare);
//        } else {
//            return NameCompare;
