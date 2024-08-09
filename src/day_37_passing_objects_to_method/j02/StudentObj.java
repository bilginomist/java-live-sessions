package day_37_passing_objects_to_method.j02;

public class StudentObj {

    public static void main(String[] args) {

        Student ahmet=new Student("Ahmet",30);

        System.out.println(ahmet.name);
        changeName(ahmet);

        System.out.println("isim değiştikten sonra "+ahmet.name);


    }                              //Referans tip    referens
                                   //    data tipi   datanın adı
    public static void changeName(Student student){
        student.name="Mehmet";
    }
}
