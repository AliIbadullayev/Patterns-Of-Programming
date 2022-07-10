package patterns.builder;

public class House {
    private String name;
    private int year;
    private HouseType type;
    private boolean colored;
    private boolean lighted;

    public House(){
    }

    public House(HouseBuilder houseBuilder) {
        setName(houseBuilder.name);
        setYear(houseBuilder.year);
        setType(houseBuilder.type);
        setColored(houseBuilder.colored);
        setLighted(houseBuilder.lighted);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public void setLighted(boolean lighted) {
        this.lighted = lighted;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", colored=" + colored +
                ", lighted=" + lighted +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public HouseType getType() {
        return type;
    }

    public boolean isColored() {
        return colored;
    }

    public boolean isLighted() {
        return lighted;
    }

    public static class HouseBuilder{
        private String name;
        private int year;
        private HouseType type;
        private boolean colored;
        private boolean lighted;

        public HouseBuilder(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public HouseBuilder withType(HouseType type){
            this.type = type;
            return this;
        }

        public HouseBuilder coloredHouse(boolean colored){
            this.colored = colored;
            return this;
        }

        public HouseBuilder lightedHouse(boolean lighted){
            this.lighted = lighted;
            return this;
        }
        
        public House build(){
            return new House(this);
        }
    }
}
