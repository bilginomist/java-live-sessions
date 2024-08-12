package day_38_static.j02;

public class VariableTypes {


    public static int staticVar=20;

    public  int instanceVar=30;

    public static void main(String[] args) {

        System.out.println("staticVar = " + staticVar);

        //instance alana static blocktan yada methoddan erişim olmaz
       // System.out.println("instanceVar = " + instanceVar);

       // myMethod();

        //instance alana ulaşmak için obje oluştur.
        VariableTypes variableTypes=new VariableTypes();
        System.out.println("variableTypes.instanceVar = " + variableTypes.instanceVar);
    }

       //staik yok
    public  void myMethod(){
       //instance (statik olmayan) bir method hem statik hemde instance alana ulaşabiliyormuş
        System.out.println(staticVar);
        System.out.println(instanceVar);
    }

}
