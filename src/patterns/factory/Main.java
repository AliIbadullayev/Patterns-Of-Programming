package patterns.factory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DeveloperFactory developerFactory = createDeveloperFactory("cpp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory createDeveloperFactory(String type){
        if (type.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }
        else if (type.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        }
        else {
            throw new RuntimeException("No such type of factory");
        }
    }
}

