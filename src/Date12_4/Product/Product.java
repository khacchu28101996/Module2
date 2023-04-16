package Date12_4.Product;

import java.util.Scanner;

public class Product {
    private static int id = 1;
    private String name;
    private double price;
    private String description;

    static Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public Product() {
        id++;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(int id, String name, int price, String number, int i) {
    }

    public Product(int id, String name, double price, String description, Brand brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", brand=" + brand +
                '}';
    }

    static Scanner scanner = new Scanner(System.in);

    public Object CreatProduct() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price: ");
        double price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Type: ");
        String description = scanner.nextLine();
        return new Product(id, name, price, description, brand);
    }
}
