package patterns.structural.adapter;

public class JavaToDbAdapter extends JavaApplication implements Database{


    @Override
    public void create() {
        createJava();
    }

    @Override
    public void read() {
        readJava();
    }

    @Override
    public void update() {
        updateJava();
    }

    @Override
    public void delete() {
        deleteJava();
    }
}
