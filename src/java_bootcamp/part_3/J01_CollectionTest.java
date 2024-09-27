package java_bootcamp.part_3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class J01_CollectionTest {

    public static void main(String[] args) {
        Student student1=new Student("A",20);
        Student student2=new Student("B",19);
        Student student3=new Student("C",32);
        Student student4=new Student("D",43);
        Student student5=new Student("A",24);
        Student student6=new Student("B",43);
        Student student7=new Student("F",22);
        Student student8=new Student("K",17);
        Student student9=new Student("L",16);

      List<Student>students =  List.of(student1,
                student6,
                student3,
                student4,
                student5,
                student7,
                student8,
                student9,
                student2);

        Set<String> names=new HashSet<>();

        for (Student eachStudent : students) {
            if (eachStudent.age>24){
                System.out.println(eachStudent.name);
            }

            names.add(eachStudent.name);
        }

        System.out.println(names);

    }
}
