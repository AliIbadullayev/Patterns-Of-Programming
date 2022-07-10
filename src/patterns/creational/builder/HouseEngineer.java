package patterns.creational.builder;

public class HouseEngineer {
    private HouseBuilder houseBuilder;

    public HouseEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        this.houseBuilder.buildHouse();
        this.houseBuilder.colorHouse();
        this.houseBuilder.lightHouse();
        this.houseBuilder.giveType();
        return this.houseBuilder.getHouse();
    }
}
