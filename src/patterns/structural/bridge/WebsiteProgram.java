package patterns.structural.bridge;

public class WebsiteProgram extends Program{

    protected WebsiteProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Website program being developing...");
        developer.writeCode();
    }

}
