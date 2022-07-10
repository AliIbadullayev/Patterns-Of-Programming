package patterns.structural.adapter;

public interface Database {
    void create();
    void read();
    void update();
    void delete();
}
