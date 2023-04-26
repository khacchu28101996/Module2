package MiniTest25_4.servive;

import MiniTest25_4.model.Classroom;
import MiniTest25_4.model.Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class CLassroomManage implements Manage<Classroom> {

    private Scanner scanner;
    private ArrayList<Classroom> classrooms;

    public void ClassroomManage(Scanner scanner) {
        this.scanner = scanner;
        classrooms = new ArrayList<>();
        classrooms.add(new Classroom("C0223I1"));
        classrooms.add(new Classroom("C1022I1"));
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    @Override
    public Classroom create() {
        System.out.println("Input name classroom: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        classrooms.add(classroom);
        return classroom;
    }

    @Override
    public Classroom update() {
        Classroom classroom = getById();
        if (classroom != null) {
            System.out.println("Input new name classroom: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                classroom.setName(name);
            }
        }
        return classroom;
    }

    @Override
    public Classroom delete() {
        Classroom classroom = getById();
        if (classroom != null) {
            classrooms.remove(classroom);
        }
        return classroom;
    }

    @Override
    public Classroom getById() {
        displayAll();
        System.out.println("Input id you want to find: ");
        String i = scanner.nextLine();
        if (!i.equals("")) {
            int id = Integer.parseInt(i);
            for (Classroom classroom : classrooms) {
                if (classroom.getId() == id) {
                    return classroom;
                }
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.printf("%-10s%s", "ID", "NAME\n");
        for (Classroom classroom : classrooms) {
            classroom.display();
        }
    }

    public void displayOne(Classroom classroom) {
        if (classroom != null) {
            classroom.display();
        } else {
            System.out.println("Not exist this object!");
        }
    }
}
