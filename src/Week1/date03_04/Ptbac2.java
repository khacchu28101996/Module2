package Week1.date03_04;
import java.util.Scanner;

public class Ptbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        double delta = b*b-4*a*c;
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("phương trình vô số nghiệm");
                }
                else {
                    System.out.println("Phương trình vô nghiệm");
                }
                }else {
                System.out.println("Phương trình có nghiệm:"+(-c)/b);

            }

        }else if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else if (delta==0){
            System.out.println("Phương trình có nghiệm kép :" + (-b)/(2*a));
        }else {
            System.out.println("Phương trình có nghiệm 1:"+ ((-b)+ Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có nghiệm 2:"+ ((-b)- Math.sqrt(delta))/(2*a));
        }
    }
}
