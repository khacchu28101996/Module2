package TestMini;

public interface Manage<E> {
    void createStudent();
    void editStudent();
    Student deleteStudent();
    Student getStudent();
    void displayStudent();

    Student getById();
}
