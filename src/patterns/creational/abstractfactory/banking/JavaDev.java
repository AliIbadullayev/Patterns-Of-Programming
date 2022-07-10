package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.Developer;

public class JavaDev implements Developer {

    @Override
    public void writeCode() {
        System.out.println("J dev writes code!");
    }
}
