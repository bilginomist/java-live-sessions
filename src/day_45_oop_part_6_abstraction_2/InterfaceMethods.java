package day_45_oop_part_6_abstraction_2;

public  interface InterfaceMethods {
    //variable public static ve final olur
  public static final   int VAR=100;

  // public access modifier default

  public   void abstractMethod();

 public static void staticMethod(){

      System.out.println(VAR);

      System.out.println("Static method");
  }

  //default method classlardaki instance methoda tekabül eder

   default void defaultMethod(){
       System.out.println("Default method");
  }

  private static String privateMethod(){

      System.out.println("Private method");

      System.out.println("private ALGORİTMA ÇALIŞTI");
      return  "dshjfsakjfbskjhbf";
  }


  public static String  getPassword(){

    return privateMethod();
  }

}
