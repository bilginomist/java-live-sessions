package day_18_class_objects.pac_01;

public class J01_ClassAndObjects {

    public static void main(String[] args) {


        String firstName = "Sami";
        String lastName = "Mutlu";
        int age = 20;
        char gender = 'M';
        //referans
        Student sami = new Student();

        sami.firstName = "Sami";
        sami.lastName = "Mutlu";
        sami.age = 20;
        sami.gender = 'm';

        System.out.println(sami);

        sami.study();

        Student arif = new Student();
        arif.firstName = "Arif";
        arif.lastName = "Gün";
        arif.age = 18;
        arif.gender = 'M';

        arif.study();


      //  sami.courseName(); //Bilginomist
      //  arif.courseName();//Bilginomist

        System.out.println(Student.courseName());
    }
}


