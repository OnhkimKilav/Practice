package Patterns.Builder.FirstExample;

public class Demo {
    public static void main(String[] args) {
        Person person = new Builder()
                .withName("Valik")
                .withSurname("Mikhno")
                .withAge(21)
                .withHeight(173)
                .withWeight(75)
                .build();

        System.out.println(person);
    }
}
