package patterns.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    PM getPM();
}
