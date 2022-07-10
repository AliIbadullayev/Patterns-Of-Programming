package patterns.creational.builder;

public interface HouseBuilder {
    void buildHouse();
    void lightHouse();
    void colorHouse();
    void giveType();
    House getHouse();
}
