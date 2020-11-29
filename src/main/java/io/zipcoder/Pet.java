package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;


public class Pet extends Comparator implements Comparable<Pet> {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(){
        name = "";
    }

    public String speak(){
        return "speech";
    }

    public void setName(String aName){
        this.name = aName;
    }

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Pet pet) {
        return this.getName().compareTo(pet.getName());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
