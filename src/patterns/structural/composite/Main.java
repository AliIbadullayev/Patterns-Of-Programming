package patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        CompoundMechanism device = new CompoundMechanism("PC");

        CompoundMechanism motherBoard = new CompoundMechanism("MotherBoard");
        motherBoard.addMechanism(new LightMechanism("CPU", 100));
        motherBoard.addMechanism(new LightMechanism("GPU",75));

        CompoundMechanism monitor = new CompoundMechanism("Monitor");
        monitor.addMechanism(new LightMechanism("Pixels",200));
        monitor.addMechanism(new LightMechanism("Camera",150));

        monitor.addMechanism(monitor);
        device.addMechanism(monitor);
        device.addMechanism(motherBoard);

        System.out.println(device.getName() + " price: "+device.getPrice());
    }
}
