package DefaultMethod;

public class Default {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}

interface A{
    static int add(int x, int y){
        return x+y;
    }
    void printHello(String message);
    default void print(){
        System.out.println("Hello");
    }
}

class B implements A{


    @Override
    public void printHello(String message) {
        System.out.println(message);
    }
}
