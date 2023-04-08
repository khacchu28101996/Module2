package Date07_4;

public class TestWidening {
    public static void main(String[] args) {
        int i = 100;
        long l = i;    // không yêu cầu chỉ định ép kiểu
        float f = l;   // không yêu cầu chỉ định ép kiểu
        System.out.println("Giá trị Int: " + i);
        System.out.println("Giá trị Long: " + l);
        System.out.println("Giá trị Float:  " + f);
    }
}
