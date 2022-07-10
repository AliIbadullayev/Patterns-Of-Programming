package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Tester;

public class WebTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Web site tester tests code!");
    }
}
