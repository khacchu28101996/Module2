package TestMini;

public interface Manage<E> {
    void createStudent();
    void editStudent();
    E deleteStudent();
    E getStudent();
    void displayStudent();

    Student getById();
}
