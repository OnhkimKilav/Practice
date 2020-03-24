package Patterns.Builder.SecondExample;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        getWebsite().setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        getWebsite().setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        getWebsite().setPrice(10000);
    }
}
