package day_39_oop_part_2_encapsulation.jo2;

public class Employee {

    //public heryerden ulaş isteidiğin yap
    private String firstName;
    private int age;


    public void setFirstName(String firstName) {

        if (firstName.isBlank()
                || firstName.isEmpty()
                || firstName.contains("1")){
            System.out.println("HATALI İSİM");
            this.firstName="invalid";
            System.exit(1);
        }else {
            this.firstName = firstName;
        }


    }


    public void setAge(int age) {
       if (age<18){
           System.out.println("HATALI YAŞ");
           this.age=0;
           System.exit(1);
       }else {//age>=18
           this.age=age;
       }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
