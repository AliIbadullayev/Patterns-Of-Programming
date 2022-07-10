package patterns.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project project = new Project(1, "Super master", "SourceCode source = new SourceCode();");
        System.out.println(project);
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project project1 = projectFactory.clone();
        System.out.println(project1);
    }
}
