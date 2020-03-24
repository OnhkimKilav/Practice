package Patterns.AbstractFactory.banking;

import Patterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java codes...");
    }
}
