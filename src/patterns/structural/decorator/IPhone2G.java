package patterns.structural.decorator;

public class IPhone2G implements IPhone{
    @Override
    public String giveOptions() {
        return "Iphone can call to another phone. ";
    }
}
