package Test;

import Logging.SomeClass;

import java.util.Objects;

public class StaticClass {
    int notStaticY;
    static int staticY;

    public StaticClass(int notStaticY) {
        this.notStaticY = notStaticY;
    }

    static public class A {
        int i;
        int j;

        void join() {
            StaticClass staticClass = new StaticClass(70);
            staticClass.notStaticY = 100;
            StaticClass.staticY = 100;
        }


    }

    public class B {
        void work() {
            StaticClass.this.notStaticY = 100;
        }
    }

    protected Object test(int i, int j, String str) throws Exception{
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaticClass that = (StaticClass) o;
        return notStaticY == that.notStaticY;
    }

    @Override
    public int hashCode() {

        return Objects.hash(notStaticY);
    }
}

class Test extends StaticClass implements Cloneable{
    public int p;

    public Test(int notStaticY, int p) {
        super(notStaticY);
        this.p = p;
    }

    @Override
    public String test(int i1, int j1, String str1) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Test test = (Test) o;
        return p == test.p;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), p);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

class Demo{
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test1 = new Test(77, 4);
        Test test2 = new Test(75, 4);
        Test test3 = new Test(77, 4);
        Test test4 = (Test) test1.clone();
        StaticClass staticClass1 = new StaticClass(23);
        StaticClass staticClass2 = new StaticClass(29);
        StaticClass staticClass3 = new StaticClass(23);

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
        System.out.println(test4.hashCode());
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test3));
        System.out.println(test1.equals(test4));
        System.out.println(staticClass1.hashCode());
        System.out.println(staticClass2.hashCode());
        System.out.println(staticClass3.hashCode());
        System.out.println(staticClass1.equals(staticClass2));
        System.out.println(staticClass1.equals(staticClass3));

    }
}


