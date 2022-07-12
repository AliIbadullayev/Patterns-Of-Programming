package patterns.structural.bridge;

public class BankProgram extends Program{
    protected BankProgram(Developer developer) {
        super(developer);
    }


    public void developProgram() {
        System.out.println("Bank program being developing...");
        developer.writeCode();
    }
}
