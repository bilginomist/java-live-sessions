package java_bootcamp.part_2.static_instance;

public class J01_StudentObjects {


    public static void main(String[] args) {

        Student student1=new Student("A","School 1");
        Student student2=new Student("A","School 1");
        Student student3=new Student("A","School 1");
        Student student4=new Student("A","School 1");

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);

        //haber geldi okul adıu School 2

        /*
        student1.schoolName="School 2";
        //student2.schoolName="School 2";
        student3.schoolName="School 2";
        student4.schoolName="School 2";

         */

        Student.schoolName="School 2";

        System.out.println("==========OKUL ADI DEĞİŞTİ==========");
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);

    }
}
