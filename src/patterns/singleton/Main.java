package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(InfoService.getInfoService().toString());
        System.out.println(InfoService.getInfoService().toString());
        System.out.println(InfoService.getInfoService().toString());
        System.out.println(InfoService.getInfoService().toString());
        System.out.println();

        InfoService.addInfo("Abc");
        InfoService.getInfoService().showInfo();
        InfoService.addInfo("Def");
        InfoService.getInfoService().showInfo();

    }
}
