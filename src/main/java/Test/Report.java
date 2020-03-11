package Test;

public class Report {

    public static void main(String[] args) {
        ICreateReportAllPart report1 = new CreateReport();
        report1.printHeader();
        report1.pringBody();
        report1.pringFooter();

        ICreateReportAllPart report2 = new CreateReport();
        report2.pringBody();
        report2.pringBody();
        report2.pringFooter();


    }
}
interface ICreateHeader{
    void printHeader();
}
interface ICreateFooter{
    void pringFooter();
}
interface ICreateBody{
    void pringBody();
}
interface ICreateReportAllPart extends ICreateHeader, ICreateBody, ICreateFooter{
}
class CreateReport implements ICreateReportAllPart{
    @Override
    public void printHeader() {
        System.out.println("print header");
    }

    @Override
    public void pringFooter() {
        System.out.println("print footer");
    }

    @Override
    public void pringBody() {
        System.out.println("print body");
    }

}
