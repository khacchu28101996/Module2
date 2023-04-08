package LabofNgu.CongViec;

public class Fulltime extends Employee {
    double yearOfExperience;

    public double getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(double yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public Fulltime(double yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public Fulltime(int id, int age, String name, double yearOfExperience) {
        super(id, age, name);

        this.yearOfExperience = yearOfExperience;
    }
    public double SalaryFulltime(double yearOfExperience){
        return this.yearOfExperience * 2000000;
    }

}
