package TestMini;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements Manage<Student> {
    private final ArrayList<Student> students = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);






    public void createStudent(){
        System.out.println("Enter name Student:");
        String name = scanner.nextLine();
        System.out.println("Enter age Student:" );
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender Student:");
        String gender = scanner.nextLine();
        int choice;
        do {
            System.out.println("Choose Gender Student");
            System.out.println("1. Male");
            System.out.println("2. Female");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;

            }
        }while (choice !=0);
        System.out.println("Enter Average Point:");
        double avgPoint = Double.parseDouble(scanner.nextLine());
        Classroom classroom = new Classroom();
        students.add(new Student(name,age,gender,avgPoint, classroom));


    }

    @Override
    public void editStudent() {
        Student student = getById();
        if (student != null){
            System.out.println("Enter New Name");
            String name = scanner.nextLine();
            if (!name.equals("")){
                student.setName(name);
            }
            System.out.println("Enter New Age");
            String age = scanner.nextLine();
            if (!age.equals("")){
                student.setAge(Integer.parseInt(age));
            }
            if (student instanceof Student){
                Classroom classroom = (Classroom) student;
                System.out.println(" Enter new Classroom");
            }

        }else {
            System.out.println("Not exist ID");
        }


    }

    @Override
    public Student deleteStudent() {
        Student student = getById();


        return null;
    }

    @Override
    public Student getStudent() {
        return null;

    }


    public void displayStudent(){
        for (Student student: students) {
            System.out.println(student);

        }

    }

    @Override
    public Student getById() {
        System.out.println("Input id your choice: ");
        int id = Integer.parseInt(scanner.nextLine());

        return null;
    }

    }

