package patterns.abstractfactory;

import patterns.abstractfactory.banking.BankPM;
import patterns.abstractfactory.banking.BankTester;
import patterns.abstractfactory.banking.JavaDev;

public class BankingProjectTeam implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDev();
    }

    @Override
    public Tester getTester() {
        return new BankTester();
    }

    @Override
    public PM getPM() {
        return new BankPM();
    }
}
