package java_bootcamp.part_2.static_instance;

public class Student {

    public String name;
   static public String schoolName;

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
