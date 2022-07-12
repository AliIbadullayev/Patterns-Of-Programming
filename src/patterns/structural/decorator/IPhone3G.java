package patterns.structural.decorator;

public class IPhone3G extends IPhoneDecorator{
    public IPhone3G(IPhone iPhone) {
        super(iPhone);
    }

    public String playGame(){
        return "You can play games on IPhone. ";
    }

    @Override
    public String giveOptions() {
        return super.giveOptions() + playGame();
    }
}
