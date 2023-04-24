package Debug;

import java.util.Scanner;

public class CodeDemo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a:");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter b:");
//        double b = Double.parseDouble(scanner.nextLine());
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("The equation countless experiments");
//            } else {
//                System.out.println("The equation has no solution.");
//            }
//        } else {
//            System.out.println("The equation has solutions : x =" + (-b / a));
//        }
//    }
public static void main(String[] args) {
    Demo demo = new Demo();
    int sum = 1+ demo.numberDemo(1,2);
    System.out.println(sum);
}
}
