package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.banking.BankPM;
import patterns.creational.abstractfactory.banking.BankTester;
import patterns.creational.abstractfactory.banking.JavaDev;

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
