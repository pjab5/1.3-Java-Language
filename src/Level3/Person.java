package Level3;

public class Person {
    private String name;
    private String surname;
    private String DNI;

    public Person(String name, String surname, String DNI) {
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDNI() {
        return DNI;
    }
}
