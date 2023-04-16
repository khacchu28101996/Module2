package Date12_4.Product;

public class Brand {
    private int id;
    private String name;

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

    public Brand(Brand b1, Brand b2, Brand b3) {
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
