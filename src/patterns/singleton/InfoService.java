package patterns.singleton;

public class InfoService {
    public static InfoService infoService;
    public static String infoFile = "It's information file\n";

    private InfoService() {
    }

    public static InfoService getInfoService() {
        if (infoService == null){
            infoService = new InfoService();
        }
        return infoService;
    }

    public static void addInfo(String info){
        infoFile += info + "\n";
    }

    public void showInfo(){
        System.out.println(infoFile);
    }
}
