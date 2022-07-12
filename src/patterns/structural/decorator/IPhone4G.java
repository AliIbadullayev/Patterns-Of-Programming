package patterns.structural.decorator;

public class IPhone4G extends IPhoneDecorator{
    public IPhone4G(IPhone iPhone) {
        super(iPhone);
    }

    public String bluetoothConnection(){
        return "You can share files with bluetooth";
    }

    @Override
    public String giveOptions() {
        return super.giveOptions() + bluetoothConnection();
    }
}
