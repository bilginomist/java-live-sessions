package day_46_oop_part_7_polymorphism.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {


    public static void main(String[] args) {
        Manager manager=new Manager("Halime","Female",25);
        Assistant assistant1=new Assistant("Merve","Female",23);
        Assistant assistant2=new Assistant("Mehmet","Male",20);

        Developer developer1=new Developer("Ahmet","Male",40);
        Developer developer2=new Developer("Tarık","Male",35);
        Developer developer3=new Developer("Tarık","Male",35);
        Developer developer4=new Developer("Samet","Male",35);
        Developer developer5=new Developer("Fatih","Male",35);


        Tester tester1=new Tester("Ali","Male",23);
        Tester tester2=new Tester("Veli","Male",23);
        Tester tester3=new Tester("Abdusalam","Male",23);
        Tester tester4=new Tester("Serhat","Male",23);
        Tester tester5=new Tester("Selcan","Female",23);

        ArrayList<Person> employeeList=new ArrayList<>();
        employeeList.add(tester1);
        employeeList.add(tester2);
        employeeList.add(tester3);
        employeeList.add(tester5);
        employeeList.add(tester4);

        employeeList.add(manager);
        employeeList.addAll(Arrays.asList(assistant1,assistant2,developer3,developer2,developer1,developer4,developer5));


        /*
        for (Person person : employeeList) {

            if (person.branch.equals("Developer")){
                System.out.println(person);
            }
        }
        */


        for (Person person : employeeList) {

            if (person instanceof Tester){
                System.out.println(person);
            }
        }




    }
}
