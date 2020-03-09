package Test;

public class User {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new FirstPhone(1879);
        firstPhone.enterNumber(674345);
        firstPhone.call(1564564);
        AbstractPhone phone = new Phone(2000);
        phone.enterNumber(33212);
        phone.call(33212);
        AbstractPhone videoPhone = new VideoPhone(2010);
        videoPhone.enterNumber(3546343);
        videoPhone.call(3546343);

    }
}
