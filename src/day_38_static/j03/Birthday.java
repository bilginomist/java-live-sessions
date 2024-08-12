package day_38_static.j03;

public class Birthday {


    public static void main(String[] args) {

        Cake mehmet = new Cake();

        mehmet.eatNumberOfSlice(1);

        System.out.println(mehmet.totalNumberOfSlice);


        Cake arif = new Cake();

        arif.eatNumberOfSlice(1);

        System.out.println(arif.totalNumberOfSlice);


        Cake merve = new Cake();

        merve.eatNumberOfSlice(3);


        System.out.println(merve.totalNumberOfSlice);


        Cake adam = new Cake();

        adam.eatNumberOfSlice(5);


        //System.out.println(adam.totalNumberOfSlice);
        System.out.println(Cake.totalNumberOfSlice);
    }
}
