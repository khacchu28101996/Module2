package Date07_4.Inheritance;

public class Demo {
    public static void main(String[] args) {
        //Ép kiểu cha xống kiểu con:

        Demo demo = new Geometric();
        Demo student = new Student();


        // Ép kiểu con lên kiểu cha:
        if (demo instanceof Geometric) {
            Geometric geometric = (Geometric) demo;
        }
//        // !  Toán tử instanceof:
        //if (student instanceof Geometric){
           Geometric geometric1 = (Geometric) student;
        // }
        System.out.println("HelloWorld");
    }
    public  void  m1(){
        System.out.println("Hello world");
    }
}
