package Patterns.AbstractFactory.website;

import Patterns.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website...");
    }
}
