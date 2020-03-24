package Patterns.AbstractFactory.website;

import Patterns.AbstractFactory.Developer;
import Patterns.AbstractFactory.ProjectManager;
import Patterns.AbstractFactory.ProjectTeamFactory;
import Patterns.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
