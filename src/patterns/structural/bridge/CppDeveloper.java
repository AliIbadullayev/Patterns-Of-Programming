package patterns.structural.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ dev writes C++ code...");
    }
}
