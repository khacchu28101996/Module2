package Interface.Demo;

import Interface.A;

public class Rec extends DemoAbs implements A {

    @Override
    void getArea() {
        System.out.println("Day la dien tich:");

    }

    @Override
    public void a() {
        System.out.println("day la A");

    }
}
