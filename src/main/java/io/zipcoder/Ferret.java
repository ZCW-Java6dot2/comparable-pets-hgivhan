package io.zipcoder;

public class Ferret extends Pet {
    public Ferret(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meep";
    }
}
