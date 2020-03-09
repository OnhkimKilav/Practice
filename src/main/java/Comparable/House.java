package Comparable;

public class House implements Comparable<House> {
    public int size;
    public int price;
    public String city;
    public boolean hasFurniture;

    public House(int size, int price, String city, boolean hasFurniture) {
        this.size = size;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.size == anotherHouse.size)
            return 0;
        else if(this.size < anotherHouse.size)
            return -1;
        else return 1;
    }
}
