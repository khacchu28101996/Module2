package LabofNgu.Person;

public class Person {
    private static int idPer =1;
    private int id;
    private String name;
    private int age;
    private Address address;

    public Person() {
        this.id = idPer++;
    }

    public Person(int id, String name, int age, Address address) {
        this.id = idPer++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
