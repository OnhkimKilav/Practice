package Patterns.AbstractFactory.banking;

import Patterns.AbstractFactory.Developer;
import Patterns.AbstractFactory.ProjectManager;
import Patterns.AbstractFactory.ProjectTeamFactory;
import Patterns.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
