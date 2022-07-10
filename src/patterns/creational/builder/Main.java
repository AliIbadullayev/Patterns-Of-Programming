package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        House house = new House
                .HouseBuilder("Pent#3123", 2002)
                .withType(HouseType.PENTHOUSE)
                .build();
        House house1 = new House
                .HouseBuilder("Villa#43231",3)
                .withType(HouseType.VILLA)
                .build();

        HouseBuilder houseBuilder = new VillaHouseBuilder();
        HouseBuilder houseBuilder2 = new VillaHouseBuilder();
        HouseEngineer engineer = new HouseEngineer(houseBuilder);
        NotColoringHouseEngineer notColoringHouseEngineer = new NotColoringHouseEngineer(houseBuilder2);

        House house2 = engineer.construct();
        House house3 = notColoringHouseEngineer.construct();


        System.out.println(house);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
//        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
    }
}
