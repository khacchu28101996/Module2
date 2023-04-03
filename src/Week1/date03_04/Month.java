package Week1.date03_04;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month:");
        month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng  " +month+" có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " +month+" có 28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng  " +month+" có 30 ngày");
                break;
            default:
                System.out.println("Tháng Không hợp lệ");
        }
    }
}
