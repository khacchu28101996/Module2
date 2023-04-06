package Date05_4;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalMatrix {
    public static void main(String[] args) {
        int sum = 0;
        int sum2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Degree of Matrix");
        int degree = scanner.nextInt();
        int[][] matrix = new int[degree][degree];

        System.out.println("Enter Element of Matrix");
        for (int i = 0; i < degree; i++) {
            for (int j = 0; j < degree; j++) {
                matrix[i][j] = scanner.nextInt();


            }


        }
        System.out.println(Arrays.deepToString(matrix));
        //đường chéo chính
        for (int i = 0; i < degree; i++) {
            for (int j = 0; j < degree; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        //đường chéo phụ
        for (int i = 0; i < degree; i++) {
            for (int j = degree-1; j < degree; j--) {
                if (i+j==degree-1){
                    sum2+=matrix[i][j];
                }

            }

        }
        System.out.println(sum2);
        int total=sum+sum2;
        System.out.println("Tổng 2 đường chéo là :" + total);

    }
}
