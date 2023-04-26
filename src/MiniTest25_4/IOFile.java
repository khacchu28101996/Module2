package MiniTest25_4;

import MiniTest25_4.model.Classroom;

import java.io.*;
import java.util.List;

public class IOFile {
    private static void writeFile(List<Classroom> classroomList) {
        File file = new File("D:\\Modul2\\src\\MiniTest25_4\\data\\student.txt");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Classroom classroom : classroomList) {
                bufferedWriter.write(classroom.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (
                IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
    private void readFile(List<Classroom> classroomList){

    }
}
