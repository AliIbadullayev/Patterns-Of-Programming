package patterns.creational.builder;

public class VillaHouseBuilder implements HouseBuilder{
    private House house;
    public VillaHouseBuilder() {
        house  = new House();
    }

    @Override
    public void buildHouse() {
        house.setYear(10);
        house.setName("Villa");
    }

    @Override
    public void lightHouse() {
        house.setLighted(true);
    }

    @Override
    public void colorHouse() {
        house.setColored(true);
    }

    @Override
    public void giveType() {
        house.setType(HouseType.VILLA);
    }

    @Override
    public House getHouse() {
        return house;
    }


}
