package LabofNgu.CongViec;

public class FullTime extends Employee{
    private int yearsOfExp;

    FullTime() {
        super();
    }

    public FullTime(int yearsOfExp) {
        super();
        this.yearsOfExp = yearsOfExp;
    }

    public FullTime(int id, String name, int age, int yearsOfExp) {
        super(id, name, age);
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "yearsOfExp=" + yearsOfExp +
                '}';
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
