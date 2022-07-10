package patterns.abstractfactory.website;

import patterns.abstractfactory.PM;

public class WebPM implements PM {
    @Override
    public void manageProject() {
        System.out.println("Web site Project Manager manages project!");
    }
}
