package Date05_4;

import java.util.Arrays;
import java.util.Scanner;

public class TotalColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int[][] arrays = new int[index1][index2];
        System.out.println("Enter Element of Matrix");
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                arrays[i][j] = scanner.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(arrays));
        System.out.println("Enter Index ");
        int index = scanner.nextInt();
        int sum=0;
        if (index<index1 && index>=0){
            for (int i = 0; i < index1; i++) {
                sum+=arrays[i][index];


            }
        }
        System.out.println(sum);
    }

}
