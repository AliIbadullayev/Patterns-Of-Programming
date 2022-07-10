package patterns.abstractfactory.website;

import patterns.abstractfactory.Developer;

public class PhpDev implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php dev writes code!");
    }
}
