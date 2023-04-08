package Date07_4;

public class TestNarrowing {
    public static void main(String[] args) {
        double d = 100.04;
        long l = (long)  d; // yêu cầu chỉ định kiểu dữ liệu (long)
        int i = (int) d; // yêu cầu chỉ định kiểu dữ liệu (int)

        System.out.println("Giá trị Double: " + d);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Int:  " + i);

    }
}

