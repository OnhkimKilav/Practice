package SOLID;

public class OCP {
    public static void main(String[] args) {

        Celica2018 celica2018 = new Celica2018();
        workInTaxi(celica2018);

    }
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}

interface Car{
    void workInTaxi();
}

class Toyota implements Car {

    void getPassengers(){
        System.out.println("get passengers");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }
}

class Celica extends Toyota {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    void getPassenger(){
        System.out.println("get one passenger");
    }
}

class Celica2018 extends Celica {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    @Override
    void getPassenger() {
        System.out.println("SOLID.Celica 2018 get one passenger");
    }
}
