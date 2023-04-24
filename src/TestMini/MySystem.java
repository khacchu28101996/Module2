package TestMini;


import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MySystem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        ClassroomManage classroomManage = new ClassroomManage();


        do {
            System.out.println("MENU");
            System.out.println("1.Create Information Student");
            System.out.println("2.Edit Information Student By Id");
            System.out.println("3.Delete Information Student By Id");
            System.out.println("4.Display Information Student By Id");
            System.out.println("0.Exit");
            System.out.println("Please enter the option: ");
            int choice = parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.createStudent();
                    break;
                case 2:
                    studentManager.editStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    studentManager.displayStudent();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Information Incorrect:");
            }
        } while (true);
    }
}

