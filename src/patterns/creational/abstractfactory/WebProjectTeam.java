package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.website.PhpDev;
import patterns.creational.abstractfactory.website.WebPM;
import patterns.creational.abstractfactory.website.WebTester;

public class WebProjectTeam implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDev();
    }

    @Override
    public Tester getTester() {
        return new WebTester();
    }

    @Override
    public PM getPM() {
        return new WebPM();
    }
}
