package Date07_4.LabofQuan;
import java.util.Scanner;

public class Product {
    //    public static final String USD = "USD";
    private int id;
    private String name;
    private double price;
    private String type;
    private static String usd = "USD";

    public Product() {

    }

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String getUsd() {
        return usd;
    }

    public static void setUsd(String usd) {
        Product.usd = usd;
    }

    @Override
    public String toString() {
        return "Product:" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + " " + usd +
                ", type='" + type + '\'' +
                '\n';
    }

    static Scanner scanner = new Scanner(System.in);

    public static Product CreatProduct() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price: ");
        double price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Type: ");
        String type = scanner.nextLine();
        return new Product(id, name, price, type);
    }
    public static void EditProduct(Product product) {
        System.out.println("Enter New Name Product: ");
        String name = scanner.nextLine();
        product.setName(name);
        System.out.println("Enter New Price Product: ");
        double price = scanner.nextInt();
        product.setPrice(price);
        scanner.nextLine();
        System.out.println("Enter New Type Product: ");
        String type = scanner.nextLine();
        product.setType(type);
    }
}