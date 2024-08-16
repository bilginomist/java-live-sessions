package day_40_oop_part_3_inheritance_1.j02;

public class Animal {

    private String name; //ad
    private String breed;  //cins
    private String gender; //cinsiyet

    private int age;

    private String color;

    public int numberOfLegs;

/*
public Animal(){
super();
}
 */

    public Animal(String name, String breed, String gender, int age, String color,int numberOfLegs) {
       // this.name = name;
        setName(name);
       // this.breed = breed;
        setBreed(breed);
       // this.gender = gender;
        setGender(gender);
      //  this.age = age;
        setAge(age);
      //  this.color = color;

        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {


        if (age<0){
            System.err.println("HATALI");
       System.exit(1);
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
