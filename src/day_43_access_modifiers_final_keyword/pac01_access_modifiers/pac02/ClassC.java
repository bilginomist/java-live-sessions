package day_43_access_modifiers_final_keyword.pac01_access_modifiers.pac02;

import day_43_access_modifiers_final_keyword.pac01_access_modifiers.pac01.ClassA;

public class ClassC extends ClassA{



    public static void  method1(){

        System.out.println(ClassA.publicVar);
        System.out.println(ClassA.protectedVar);
    }
}
