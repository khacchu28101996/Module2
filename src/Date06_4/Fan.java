package Date06_4;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 =new Fan(3,true,"yellow",10);
        Fan fan2 =new Fan(2,false,"blue ",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";

    public int getFast() {
        return fast;
    }

    private double radius = 5;


    public int getMedium() {
        return medium;
    }

    public int getSlow() {
        return slow;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }

    public Fan(int speed, boolean on, String color, double radius){
        this.speed =speed;
        this.color = color;
        this.on = on;
        this.radius= radius;

    }
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off:    ");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}

