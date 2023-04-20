package Date_18_4.Lab2.BaiTap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTap {
     static Scanner scanner;

    static Map<String,String> linkedHashMap = new LinkedHashMap<>(16,1.75f,true);
    public static void main(String[] args) {
        do {

            System.out.println("MENU");
            System.out.println("1.Thêm Từ Điển");
            System.out.println("2.Tra Từ Điển");
            System.out.println("3.Sửa Từ Điển");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addDiction();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không hợp lệ");

            }
        }while (true);










    }



    public static void addDiction(){
        System.out.println("Thêm Eng:");
        String eng = scanner.nextLine();
        System.out.println("Thêm Vie");
        String vie = scanner.nextLine();
        linkedHashMap.put(eng,vie);
        System.out.println("Thêm thành công");
    }
}
