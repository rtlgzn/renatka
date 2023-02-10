public class Student {
    String name;
    String surname;
    String address;
    int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }


    public String toString() {
        return String.format("Студент: %s %s, адрес: %s, ID: %d", name, surname, address, id);
    }
}