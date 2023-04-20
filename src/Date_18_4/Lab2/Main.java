package Date_18_4.Lab2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Chữ",27,"Bắc Ninh");
        Student student2 = new Student("Vũ",31,"Thanh Hóa");
        Student student3 = new Student("Đức",29,"Hà Nội");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);


    }
}
