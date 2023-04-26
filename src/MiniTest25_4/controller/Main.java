package MiniTest25_4.controller;

import MiniTest25_4.model.Classroom;
import MiniTest25_4.model.Student;
import MiniTest25_4.servive.StudentManage;
import TestMini.ClassroomManage;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {



    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ClassroomManage classroomManage = new ClassroomManage();
        StudentManage studentManage = new StudentManage(classroomManage, scanner);
        superMenu(studentManage, scanner);

    }
    private static void superMenu(StudentManage studentManage, Scanner scanner) {

        do {

            System.out.println("MENU");
            System.out.println("1. Create new Student");
            System.out.println("2. Update Student by id");
            System.out.println("3. Delete Student by id");
            System.out.println("4. Display Student by id");
            System.out.println("5. Display all Student");
            System.out.println("6. Display all Student by min point");
            System.out.println("7. Display all Student by max point");
            System.out.println("8. Display all Student by rank");
            System.out.println("9. Display all Student by gender");
            System.out.println("10. Display all Student by Classroom");
            System.out.println("11. Action with Classroom");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Student studentCreate = studentManage.create();
                    System.out.println("Student created is: ");
                    studentManage.displayOne(studentCreate);
                    break;

                case 2:
                    Student studentUpdate = studentManage.update();
                    System.out.println("Student updated is: ");
                    studentManage.displayOne(studentUpdate);
                    break;

                case 3:
                    Student studentDelete = studentManage.delete();
                    System.out.println("Student deleted is: ");
                    studentManage.displayOne(studentDelete);
                    break;

                case 4:
                    Student student = studentManage.getById();
                    System.out.println("Student is: ");
                    studentManage.displayOne(student);
                    break;
                case 5:
                    studentManage.displayAll();
                    break;
                case 6:
                    studentManage.displayStudentMinPoint();
                    break;
                case 7:
                    studentManage.displayStudentMaxPoint();
                    break;
                case 8:
                    studentManage.displayStudentByRank();
                    break;
                case 9:
                    studentManage.displayStudentByGender();
                    break;
                case 10:
                    studentManage.displayByClassroom();
                    break;
                case 11:
                    subMenu(studentManage, scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void subMenu(StudentManage studentManage, Scanner scanner) {
        int choice;
        do {

            System.out.println("MENU");
            System.out.println("1. Create new Classroom");
            System.out.println("2. Update Classroom by id");
            System.out.println("3. Delete Classroom by id");
            System.out.println("4. Display Classroom by id");
            System.out.println("5. Display all Classroom");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 0);
    }

}
