package day_38_static.j05;

public class StaticBlock {


    public int insVar;

    //classa ait dolayısıyla her obje create edilirken assign etmeye gerrek yok
    public static int staticVar;


    static {
        //EN ÖNCE SADECE BİR KEZ
        System.out.println("STATIC");
        staticVar=10;
    }


    {

        //CONSDAN ÖNCE
        //STATICDEN SONRA HER OBJE CREATE EDİLİRKEN
        insVar=10;
        System.out.println("INSTANCE BLOCK");
    }


    public StaticBlock(){
        System.out.println("CONS");
    }


    public static void main(String[] args) {

      StaticBlock staticBlock=  new StaticBlock();
      StaticBlock staticBlock1=  new StaticBlock();
    }
}
