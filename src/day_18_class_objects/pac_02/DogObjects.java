package day_18_class_objects.pac_02;

public class DogObjects {


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name="Çomar";
        dog1.breed="Çoban köpeği";
        dog1.age=3;
        dog1.color="Beyaz";

       // System.out.println(dog1);



        //sadece adını yazdır
        System.out.println(dog1.name);

       //sadece yaşını görmek istioyrum
        System.out.println(dog1.age);



        //bir nolu köpek ne yiyor

        dog1.eat();
        // bir nolu köpek nasıl ses çıkarıyor
        dog1.bark();

        Dog dog2=new Dog();
        System.out.println(dog2);

    }
}
