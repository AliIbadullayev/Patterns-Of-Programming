package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.PM;

public class BankPM implements PM {
    @Override
    public void manageProject() {
        System.out.println("Bank Project Manager manages project!");
    }
}
