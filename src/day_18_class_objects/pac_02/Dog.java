package day_18_class_objects.pac_02;

public class Dog {
    public String name;
    public String breed; //cins
    public int age;
    public String color;

    public void bark(){

        System.out.println(name + " is barking");

    }

    public void sleep(){

        System.out.println(name + " uyuyor");
    }


    public void eat(){

        System.out.println(name + " mamasını yiyor");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
