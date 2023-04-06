package Date06_4;

public class MaxStudent {
    private String name;
    private int age;
    private double math;
    private double phys;
    private double chem;
    private double avg = (math+phys+chem)/3;
    public MaxStudent(String name, int age, double avg) {
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhys() {
        return phys;
    }

    public void setPhys(double phys) {
        this.phys = phys;
    }

    public double getChem() {
        return chem;
    }

    public void setChem(double chem) {
        this.chem = chem;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    public MaxStudent(){

    }


}
