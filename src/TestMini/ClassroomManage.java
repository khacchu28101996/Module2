package TestMini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage extends Classroom {
    private final Scanner scanner =  new Scanner(System.in);
    List<Classroom> classrooms = new ArrayList<>();
    public Classroom createClassroom(){
        System.out.println("Enter Name Classroom");
        String name = scanner.nextLine();
        return new Classroom(name);



    }



}
