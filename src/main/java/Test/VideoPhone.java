package Test;

public class VideoPhone extends AbstractPhone {
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void enterNumber(int outputNumber) {
        System.out.println("Подключаю видеоканал для номера " + outputNumber);
    }

    @Override
    public void call(int inputNumber) {
        System.out.println("У вас входящий видеозвонок " + inputNumber);
    }
}
