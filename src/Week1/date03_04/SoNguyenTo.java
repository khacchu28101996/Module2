package Week1.date03_04;


public class SoNguyenTo {
    public static void main(String[] args) {
        int num=2;
        int count=0;
        int total=0;
        do {
            int uoc =0;
            for (int i=1;i<=num;i++){
                if (num%i==0){
                    uoc++;
                }
            }
            if (uoc==2){
                count++;
                total+=num;
            }
            num++;
        }while (count<20);
        System.out.println("Ket qua:" +total);

    }
}
