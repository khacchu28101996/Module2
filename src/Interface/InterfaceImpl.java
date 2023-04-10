package Interface;

public class InterfaceImpl implements C,A,B {
    @Override
    public void c() {
        System.out.println("C");
    }

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }
}
