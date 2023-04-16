package MintestWeek2;

import java.util.ArrayList;
import java.util.Scanner;
public class ManagerStudent implements Manager {
    Student student;
    private int size = 0;

    ArrayList<Student> people = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ManagerStudent() {
        super();
        people.add(new Student("Chữ", "27", 9));
        people.add(new Student("Vũ", "33", 7));
        people.add(new Student("Đức", "31", 8));
    }

    @Override
    public void disPlayAll() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Tuổi: ");
        String age = scanner.nextLine();
        System.out.println("Nhập Avg: ");
        double avg = Double.parseDouble(scanner.nextLine());
        Student student1 = new Student(name, age, avg);
        people.add(student1);
    }


    @Override
    public void searchStudent() {
        System.out.println("nhập tên cần tìm");
        String searchName = scanner.nextLine();
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equalsIgnoreCase(searchName)) {
                index = i;
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Student cần tìm: " + people.get(index));
        } else {
            System.out.println("không tìm thấy");
        }


    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập id");
        int deleteId = scanner.nextInt();
        int index = indexOfById(deleteId);
        if (index != -1) {
            people.remove(index);
        } else {
            System.out.println("ko có id cần xóa");
        }
    }

    @Override
    public void updateStudent() {
        System.out.println("Nhập id cần sửa:");
        int updateId = Integer.parseInt(scanner.nextLine());
        int index = indexOfById(updateId);
        if (index != -1) {
            System.out.println("nhập tên sửa:");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                people.get(index).setName(name);
            }
            System.out.println("nhập tuổi sửa");
            String age = scanner.nextLine();
            if (age.equals("")) {
                people.get(index).setAge(age);
            }

        }
    }

    @Override
    public void sortStudentAvg() {

    }


    @Override
    public void sumAvg() {
        double sum = 0;
        for (Student person : people) {
            sum += person.getAvg();
        }
        System.out.println("tổng điểm trung bình: " + sum);
    }

    public int indexOfById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
