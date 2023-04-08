package Date07_4.LabofQuan;

import java.util.Arrays;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm ");
        int n = scanner.nextInt();
        Product[] productArr = new Product[n];


        for (int i = 0; i < n; i++) {
            productArr[i] = Product.CreatProduct();
        }
        System.out.println("List Product: " + Arrays.toString(productArr));


        System.out.println("Product name to find: ");
        String searchName = scanner.next();
        boolean check = false;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getName().equalsIgnoreCase(searchName)) {
                check = true;
                System.out.println("Productt: " + productArr[i]);
            }
        }
        if (!check) {
            System.out.println("Not Product!!");
        }
        double sumPrice = 0;
        for (int i = 0; i < productArr.length; i++) {
            sumPrice += productArr[i].getPrice();
        }
        System.out.println("Total Price: " + sumPrice + " " + Product.getUsd());


        System.out.println(" Repair Product by ID:  ");
        int editId = scanner.nextInt();
        for (int i = 0; i < productArr.length; i++) {
            if (editId == productArr[i].getId()) {
                Product.EditProduct(productArr[editId - 1]);
            }
        }
        System.out.println("Product: " + Arrays.toString(productArr));



        System.out.println("Enter ID product want Del:");
        int deleteId = scanner.nextInt();
        Product[] newProductArr = new Product[productArr.length-1];
        int j = 0;
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].getId() != deleteId) {
                newProductArr[j] = productArr[i];
                j++;
            }
        }
        System.out.println("Product : " + Arrays.toString(newProductArr));
    }
}
