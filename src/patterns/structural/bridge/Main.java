package patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Program[] programs = {
                new BankProgram(new CppDeveloper()),
                new WebsiteProgram(new JavaDeveloper()),
                new WebsiteProgram(new CppDeveloper()),
                new BankProgram(new JavaDeveloper())
        };
        Program program1 = new BankProgram(new JavaDeveloper());
        for (Program program : programs){
            program.developProgram();

        }
    }
}
