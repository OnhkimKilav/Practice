package Test;

import java.util.Objects;

public class ExampleAssert {
    static class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age &&
                    Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 1);
        Cat cat2 = new Cat("Mursik", 4);
        Cat cat3 = null;
        String res = "";
        if (cat1.equals(cat2)) System.out.println(cat1.toString() + " = " + cat2.toString());
        res = (cat1 == null) ? "Cat1 is null" : "Cat1 isn't null";
        System.out.println(res);
        res = (cat2 == null) ? "Cat2 is null" : "Cat2 isn't null";
        System.out.println(res);
        res = (cat3 == null) ? "Cat3 is null" : "Cat3 isn't null";
        System.out.println(res);

    }
}
