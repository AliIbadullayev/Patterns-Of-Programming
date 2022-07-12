package patterns.structural.decorator;

public class IPhoneDecorator implements IPhone{
    IPhone iPhone;

    public IPhoneDecorator(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public String giveOptions() {
        return iPhone.giveOptions();
    }
}
