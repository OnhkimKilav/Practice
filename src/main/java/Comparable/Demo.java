package Comparable;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<House> houses = new TreeSet<House>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 16000, "Oxford", false);
        House thirdHouse = new House(70, 1830000, "Paris", true);

        houses.add(firstHouse);
        houses.add(secondHouse);
        houses.add(thirdHouse);

        for(House house : houses)
            System.out.println(house);

    }
}
