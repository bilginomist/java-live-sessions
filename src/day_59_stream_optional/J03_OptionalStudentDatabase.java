package day_59_stream_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J03_OptionalStudentDatabase {

    //
    static class Student{

        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



    public static void main(String[] args) {

        Student student=new Student("A",1);
        Student student1=new Student("B",2);
        Student student2=new Student("C",3);
        Student student3=new Student("D",4);

        List<Student> students= Arrays.asList(student,student1,student2,student3,new Student("E",5));


        String aranan="A";

     Optional<Student> optionalStudent= students.stream()
                .filter(st->st.getName().equals(aranan))
                .findFirst();


        System.out.println(optionalStudent.isEmpty());


        String result=optionalStudent
                .map(k->"Bulunan öğrencinin adı: " +k.getName() + " yaşı: "+ k.getAge() )
             .orElse("Böyle bir öğrenci yok");


        System.out.println(result);

        Student bulunan=null;

        for (Student st:students){

            if (st.getName().equals(aranan)){
                bulunan=st;
            }
        }

        if (bulunan!=null)
        System.out.println(bulunan.getAge());

    }
}
