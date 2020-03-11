package SOLID;

public class LSP {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeigth(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquere());

        Square square = new Square();
        square.setSize(5);
        System.out.println(square.getSquere());

    }

    static Rectangle getRec(){
        return new Rectangle();
    }

    static Square getSqu(){
        return new Square();
    }

}

interface Shape{
    int getSquere();
}

class Rectangle implements Shape {
    int width;
    int heigth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public int getSquere() {
        return width * heigth;
    }
}

class Square implements Shape {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSquere() {
        return size * size;
    }
}
