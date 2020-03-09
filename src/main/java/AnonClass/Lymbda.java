package AnonClass;

interface Operation {
    int calculate(int x, int y);
}

interface Operationeble<T>{
    T calculate (T x, T y);
}

public class Lymbda {
    final static int Z = 10;

    public static void main(String[] args) {
        Operation operation = (int x, int y) -> x + y;
        Operation operation1 = (int x, int y) -> x * y;

        Operation operation2 = (int x, int y) -> {
            int i = x + y;
            return i + Z;
        };

        Operation operation3 = (x, y) -> {
            if (y == 0)
                return 0;
            else return x / y;
        };

        Operationeble<Integer> operationeble1 = (x, y) -> x + y;
        Operationeble<String> operationeble2 = (x, y) -> x + y;

        int res = operation3.calculate(50, 10);
        int res1 = operation3.calculate(5, 0);
        System.out.println(res);
        System.out.println(res1);

        System.out.println(operationeble1.calculate(10, 50));
        System.out.println(operationeble2.calculate("23", "25"));

    }
}
