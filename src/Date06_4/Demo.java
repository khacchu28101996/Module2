package Date06_4;

public class Demo {
    int number;
    String name;
    boolean on;
public Demo(){

}

    public Demo(int number, String name, boolean on) {
        this.number = number;
        this.name = name;
        this.on = on;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
