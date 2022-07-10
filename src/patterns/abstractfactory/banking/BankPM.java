package patterns.abstractfactory.banking;

import patterns.abstractfactory.PM;

public class BankPM implements PM {
    @Override
    public void manageProject() {
        System.out.println("Bank Project Manager manages project!");
    }
}
