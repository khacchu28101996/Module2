package Week1.date03_04;

import java.util.Scanner;

public class TotalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        double total = 0;
        for (int i = 1;i<=n;i++){
            total += (double) i/(i+1);
        }
        System.out.println("Total :"+total);
    }
}
