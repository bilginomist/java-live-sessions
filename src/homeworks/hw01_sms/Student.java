package homeworks.hw01_sms;

public class Student {

   public int id;
    String firstName;
    String lastName;
    int age;
    char gender;


    public Student(int id, String firstName, String lastName, int age, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
