package Date06_4;

public class Student {
     String name;
     int age;
     float math;
     float physical;
     float chemistry;

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

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysical() {
        return physical;
    }

    public void setPhysical(float physical) {
        this.physical = physical;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }
    public double getAverage(){
        return (double) (chemistry+physical+math)/3;
    }

    public Student(String name, int age, float math, float physical, float chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }
    public double Average(float math,float physical, float chemistry){
        return (double) (math+physical+chemistry)/3;
    }

}

