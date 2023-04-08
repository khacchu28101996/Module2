package LabofNgu.CongViec;

public class Partime extends Employee {
    int workTime;

    public Partime(int workTime) {
        this.workTime = workTime;
    }

    public Partime(int id, int age, String name, int workTime) {
        super(id, age, name);
        this.workTime = workTime;
    }
    public int SalaryPartime(){
        return this.workTime *25000;
    }
}
