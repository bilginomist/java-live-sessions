package homeworks.hw01_sms;

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students;

    public StudentManagement() {
        students=new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }


    public void addAllStudent(ArrayList<Student> listOfStudent){
        this.students.addAll(listOfStudent);
    }


    public void deleteStudentWithId(int studentId){

        for (Student student : this.students) {

            if (student.id==studentId){
                this.students.remove(student);
                System.out.println(studentId +" numaralı kayıt listeden silinmiştir.");
                break;
            }
        }

    }

    public ArrayList<Student> searchStudentWithName(String firstName){
        ArrayList<Student> result=new ArrayList<>();

        for (Student student : this.students) {

            if (student.firstName.equalsIgnoreCase(firstName)){
                result.add(student);
            }
        }

        return  result;
    }



    public Student getStudentWithId(int studentId){

        for (Student student : this.students) {

            if (student.id==studentId){
                return  student;

            }
        }

        System.out.println(studentId + " numaralı öğrenci yoktur");
        return null;
    }


    public ArrayList<Student> getAllStudents(){

        return this.students;
    }

}
