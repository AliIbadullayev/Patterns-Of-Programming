package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Developer;

public class PhpDev implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php dev writes code!");
    }
}
