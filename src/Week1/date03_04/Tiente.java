package Week1.date03_04;

import java.util.Scanner;

public class Tiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Bạn Nhập Số Tiền:");
        usd = sc.nextDouble();
        double result = usd*vnd ;
        System.out.println("Giá trị VNĐ:"+result);

        }
    }
