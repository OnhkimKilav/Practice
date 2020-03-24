package Patterns.Builder.SecondExample;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.builderWebsite();

        System.out.println(website);
    }
}
