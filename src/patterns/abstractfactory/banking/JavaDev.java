package patterns.abstractfactory.banking;

import patterns.abstractfactory.Developer;

public class JavaDev implements Developer {

    @Override
    public void writeCode() {
        System.out.println("J dev writes code!");
    }
}
