package LabOfNam;

import java.util.Scanner;

public class ManagerContact {
    private final Scanner scanner;
    private Contact[] contacts;

    public ManagerContact(Scanner scanner) {

        this.scanner = scanner;
    }




    public void getContact(){
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập Số điện thoại:");
        String phoneNumber =  scanner.nextLine();

        new Contact(name, phoneNumber);


    }
    public  void displayContact(){
        for (Contact contact: contacts) {
            System.out.println(contact);

        }


    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
}
