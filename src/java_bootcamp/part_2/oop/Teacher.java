package java_bootcamp.part_2.oop;

public class Teacher {

    public String name;
    private int age;

    public void setAge(int age) {

        if (age<0){
            System.err.println("KIRMIZI YAZI");
            throw new RuntimeException("Hatalı yaş");
          //  System.err.println("Hatalı yaş");
        }

        this.age=age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
