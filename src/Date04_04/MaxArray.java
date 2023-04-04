package Date04_04;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,73,56,7};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];

            }

        }
        System.out.println(max);
    }
}
