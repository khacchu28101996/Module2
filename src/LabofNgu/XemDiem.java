package LabofNgu;

import LabofNgu.Diemthi;

public class XemDiem {
        public static void main(String[] args) {
            Diemthi student1 = new Diemthi("Chu",27,10,10,10);
            Diemthi student2 = new Diemthi("VU",31,10,9,10);
            Diemthi student3 = new Diemthi("Duc",29,10,7,10);
            Diemthi student4 = new Diemthi("Than",27,8,8,9);
            Diemthi[]students = {student1, student2, student3, student4};
            double max = students[0].avg();
            int point = 0;
            for (int i = 0; i< students.length; i++){
                if(students[i].avg() > max){
                    point = i;
                }
            }
            System.out.printf("Học sinh có điểm TB cao nhất là: " + students[point].toString());
        }
    }
