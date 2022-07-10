package patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Database db = new JavaToDbAdapter();

        db.create();
        db.read();
        db.update();
        db.delete();

    }
}
