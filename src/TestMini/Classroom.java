package TestMini;

public class Classroom extends Student{
    private static int INDEX_CLASS=1;
    private int id;
    private String name;

    public Classroom() {
        this.id = ++INDEX_CLASS;
    }

    public Classroom( String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
