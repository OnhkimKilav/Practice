package Test;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void enterNumber(int outputNumber);

    public abstract void call(int inputNumber);
}
