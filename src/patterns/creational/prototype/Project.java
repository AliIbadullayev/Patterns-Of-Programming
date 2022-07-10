package patterns.creational.prototype;

public class Project implements Copyable{
    private int id;
    private String name;
    private String source;

    public Project(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Project copy() {
        return new Project(this.id, this.name, this.source);
    }
}
