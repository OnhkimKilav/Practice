package AnonClass;

interface Eat{
    void eat();
}

class Animal implements Eat{

    public void eat() {
        System.out.println("jfjsdfsdg");
    }
}

public class AnonClass {
    public static void main(String[] args) {
        Eat animal = new Animal();
        animal.eat();

        //creating anonymous class and implementation eat method
        Eat animal1 = new Eat() {
            public void eat() {
                System.out.println("animal1 eating...");
            }
        };
        animal1.eat();

    }
}
