package Test;

public class FirstPhone extends AbstractPhone {

    public FirstPhone(int year) {
        super(year);
    }

    @Override
    public void enterNumber(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщайте номер, сэр");
    }

    @Override
    public void call(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}

