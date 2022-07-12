package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IPhone4G iPhone4G = new IPhone4G(new IPhone3G(new IPhone2G()));

        System.out.println(iPhone4G.giveOptions());
    }
}
