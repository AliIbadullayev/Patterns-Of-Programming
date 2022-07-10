package patterns.prototype;

import java.awt.print.PrinterJob;

public class ProjectFactory {
    public void setProject(Project project) {
        this.project = project;
    }

    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project clone(){
        return (Project) project.copy();
    }
}
