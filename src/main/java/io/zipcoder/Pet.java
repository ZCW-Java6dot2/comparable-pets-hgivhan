package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;


public class Pet implements Comparable<Pet> {
    String name;
    Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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
        int answer = this.getName().compareTo(pet.getName());
        if (answer == 0){
            return this.getAge().compareTo(pet.getAge());
        }
        else return answer;


        //sort by name and then type if names tie, can make age or something else
                //comparator do reverse... or vice versa here

    }
}
