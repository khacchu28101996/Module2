package Debug;

import java.util.Scanner;

public class DemoDebug {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < x; i++) {
            System.out.println(i);

        }
    }
}
