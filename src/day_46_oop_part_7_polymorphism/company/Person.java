package day_46_oop_part_7_polymorphism.company;

public abstract class Person {

    String name;
    String gender; //Female - Male
    int age;
    String branch;

    public Person(String name, String gender, int age, String branch) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                '}';
    }


}
