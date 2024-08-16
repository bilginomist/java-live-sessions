package day_39_oop_part_2_encapsulation.j01;

public class Student {

    //private fields
   // public String firstName;
    //String firstName;
   private   String firstName;
    //  String firstName;
    private int age;


    public Student(String firstName, int age) {
        //this.firstName = firstName;
        setFirstName(firstName);
      //  this.age = age;
        setAge(age);
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Yaş sıfırdan küçük olamaz");
            System.exit(1);
        } else {

            System.out.println("Age başarıyla yüklendi");
            this.age = age;
        }

    }

    public void setFirstName(String firstName) {


        if (firstName == null || firstName.isBlank()) {
            System.err.println("Geçerli bir isim gir");
            System.exit(1);
        } else {
            this.firstName = firstName;
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
