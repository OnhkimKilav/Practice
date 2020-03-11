package SOLID;

public class ISP {
    public static void main(String[] args) {
        IWorker cook = new Cook();
        cook.work();
        cook.eat();
        cook.work();

        Worker waiter = new Waiter();
        waiter.work();
    }
}

interface Worker{
    void work();
}

interface Eater{
    void eat();
}

interface IWorker extends Worker, Eater {

}

class Cook implements IWorker {
    @Override
    public void work() {
        System.out.println("SOLID.Cook is working");
    }

    @Override
    public void eat() {
        System.out.println("SOLID.Cook is eating");
    }
}

class Waiter implements Worker {
    @Override
    public void work() {
        System.out.println("SOLID.Waiter is working");
    }
}
