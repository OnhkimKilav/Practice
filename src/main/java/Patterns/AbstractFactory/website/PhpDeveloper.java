package Patterns.AbstractFactory.website;

import Patterns.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code ");
    }
}
