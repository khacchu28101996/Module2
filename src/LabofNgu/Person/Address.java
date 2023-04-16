package LabofNgu.Person;

public class Address {
    private static int idAd =1;
    private int id;
    private String name;

    public Address() {
        this.id= idAd++;
    }

    public Address(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
