package Test;

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void enterNumber(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void call(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
