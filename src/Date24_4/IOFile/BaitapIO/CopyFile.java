package Date24_4.IOFile.BaitapIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        try {
            File myObj =  new File("CopyFile.txt");
            Scanner readFile =  new Scanner(myObj);
            while (readFile.hasNextLine()){
                String data = readFile.nextLine();
                System.out.println(data);
            }
            readFile.close();


        }catch (FileNotFoundException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
