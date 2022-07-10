package patterns.abstractfactory;

import patterns.abstractfactory.website.PhpDev;
import patterns.abstractfactory.website.WebPM;
import patterns.abstractfactory.website.WebTester;

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
