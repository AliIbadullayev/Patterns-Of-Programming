package patterns.abstractfactory;

public class Main {
    // we need to identify project command for banking system or creating websites
    // for example here I will create command which creates web site
    public static void main(String[] args) {
//        PhpDev phpDev = new PhpDev();
//        WebTester webTester = new WebTester();
//        WebPM webPM = new WebPM();
//
//        phpDev.writeCode();
//        webTester.testCode();
//        webPM.manageProject();
//
//        // or command which creates bank system
//        JavaDev javaDev = new JavaDev();
//        BankTester bankTester = new BankTester();
//        BankPM bankPM = new WebPM();
//
//        javaDev.writeCode();
//        bankTester.testCode();
//        bankPM.manageProject();

        // I can use Factory Method for dev (Java/PHP dev) and tester (Bank/web site) and PM (Bank/web site)

        ProjectTeamFactory projectTeamFactory = new BankingProjectTeam();
        Developer dev = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        PM pm = projectTeamFactory.getPM();

        dev.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
