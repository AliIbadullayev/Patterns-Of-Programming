package patterns.creational.builder;

public class NotColoringHouseEngineer {
    private HouseBuilder houseBuilder;

    public NotColoringHouseEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        this.houseBuilder.buildHouse();
        this.houseBuilder.lightHouse();
        this.houseBuilder.giveType();
        return this.houseBuilder.getHouse();
    }
}
