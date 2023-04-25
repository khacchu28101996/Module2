package BTVNNg;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static void writeFile(List<Account>  accountList){
        File file = new File("account.txt");
        try{
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Account acc: accountList) {
                bufferedWriter.write(acc.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    private static void readFile(List<Account> accountList) {
        try{
            File file = new File("account.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null){
                accountList.add(new Account());

            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Account> accountList = new ArrayList<>();
        readFile(accountList);
        int choice;
        do{
            System.out.println("==========  Please choose your choice!  ==========");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter password:");
                    String password = scanner.nextLine();
                    for (Account acc: accountList) {
                        if (acc.getUsername().equals(username) && acc.getPassword().equals(password)){

                            System.out.println("Hello " + acc.getFullname() + ".");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter username:");
                    username = scanner.nextLine();
                    boolean flag = false;
                    for (Account acc:accountList) {
                        if(acc.getUsername().equals(username)){
                            System.out.println("Username already exists.");
                            flag = true;
                            break;
                        }
                    }
                    if (!flag){
                        System.out.println("Enter password:");
                        password = scanner.nextLine();
                        System.out.println("Enter full name");
                        String fullname = scanner.nextLine();
                        System.out.println("Enter phone number:");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Enter address");
                        String address = scanner.nextLine();
                        int id = accountList.size() + 1;
                        Account account = new Account(username,password,fullname,phoneNumber,address);
                        accountList.add(account);
                        writeFile(accountList);
                        System.out.println("Successfully created!");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while (true);
    }
}