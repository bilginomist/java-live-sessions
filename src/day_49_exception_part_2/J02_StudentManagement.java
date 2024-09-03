package day_49_exception_part_2;

import homeworks.hw01_sms.Student;

import java.util.ArrayList;

public class J02_StudentManagement {

    public static void main(String[] args) {

        Student student1=new
                Student(1,"A","B",12,'M');
        Student student2=new
                Student(1,"A","B",12,'M');

        ArrayList<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);

        boolean found=false;

        int studentId=3;

        for (Student each : list) {

            if (each.id==studentId){
                found=true;
                break;
            }
        }



         //   throw   new MyCompileTimeException();

        if (found==false){

            throw new StudentNotFoundException();
        }

    }
}
