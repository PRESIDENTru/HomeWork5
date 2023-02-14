package com.company;

public class TestPerson extends Person {

    public TestPerson(String name, int hp, int damage) throws CreatePersonException {
        super(name, hp, damage);

        if (!name.equals("Test")) {
            throw new CreatePersonException();
        }
    }
}
