package LabOfNam;

import java.util.Scanner;

public class MainContact {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerContact managerContact = new ManagerContact(scanner);
        do {
            System.out.println("------------MENU------------------");
            System.out.println("1. Tạo mới danh bạ");
            System.out.println("2. Thêm mới danh bạ");
            System.out.println("3. Sửa danh bạ");
            System.out.println("4. Xóa danh bạ");
            System.out.println("5. Hiển thị  danh bạ");
            System.out.println("Thoát");
            System.out.println("Nhập lựa chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    managerContact.getContact();
                    break;
                case 2:

                case 5:
                    managerContact.displayContact();
                    break;

                case 0:
                    System.exit(0);

            }

        }while (true);

    }

}
