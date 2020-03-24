package Patterns.Builder.SecondExample;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        getWebsite().setName("Visit card");
    }

    @Override
    void buildCms() {
        getWebsite().setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        getWebsite().setPrice(500);
    }
}
