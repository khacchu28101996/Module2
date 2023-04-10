package LabofNgu.CongViec;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class RunMain {
    private static Employee[] employees;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //        for (int i = 0; i < 2; i++) {
    //            if (employees[i] instanceof FullTime) {
    //                FullTime f1 = (FullTime) employees[i];
    //                System.out.println(f1.getYearsOfExp() * 2000000);
    //            } else {
    //                PartTime f1 = (PartTime) employees[i];
    //                System.out.println(f1.getWorkTime() * 25000);
    //            }
    //        }
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo mảng Nhân Viên");
            System.out.println("2. Nhập nhân viên");
            System.out.println("3. Tính lương nhân viên");
            System.out.println("4. Hiển thị Nhân Viên");
            System.out.println("5. Xóa Nhân Viên");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    employees = getArrayEmployee(scanner);
                    break;
                case 4:
                    displayEmployee(employees);
                    break;
                case 2:
                    createEmployee(employees);
                    break;
                case 3:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
            }


        } while (true);

    }

    private static void createEmployee(Employee[] employees) {
    }

    public static Employee[] getArrayEmployee(Scanner scanner) {
        System.out.println("Nhập vào số lượng Nhân Viên: ");
        int length = Integer.parseInt(scanner.nextLine());
        return new Employee[length];
    }


    public static Employee getEmployee(Scanner scanner, int i) {
        System.out.println("Nhập vào ID của Nhân Viên " + (i + 1) + ":");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào Tên của nhân viên: " + (i + 1) + ":");
        String name = scanner.nextLine();
        System.out.println("Nhập vào Tuổi của nhân viên " + (i + 1) + ":");
        int age = Integer.parseInt(scanner.nextLine());
        return new Employee(id, name, age);
    }
        public static void createEmployee (Scanner scanner, Employee[]employees){


        }






    public static void displayEmployee(Employee[] employees) {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
}