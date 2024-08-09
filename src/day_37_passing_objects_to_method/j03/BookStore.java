package day_37_passing_objects_to_method.j03;

import java.util.ArrayList;
import java.util.Arrays;

public class BookStore {

    public static void main(String[] args) {
        Book book1=new Book("Zülfü Livaneli","Serenad",2011);
        Book book2=new Book("Aziz Nesin","Zubuk",1961);
        Book book3=new Book("Aziz Nesin","Yasar Ne Yasar Ne Yasamaz",1980);
        Book book4=new Book("Kuzzat","Bilginomist",2011);


        ArrayList<Book> books=new ArrayList<>();

        //listeye kitap ekleme

        books.add(book1);
        books.add(book1);
        books.add(book2);

        books.addAll(Arrays.asList(book3,book4));


        System.out.println(books);
            // String
            //int
        for (Book book : books) {

            System.out.println(book);
        }

        System.out.println("==================");

        //2011 yılında basılmış kitapları yazdır

        for (Book each:books){

            if (each.year==2011){
                System.out.println(each);
            }


        }

        //Zülfü livaneli getir

        System.out.println("======================");
        for (Book book : books) {

            if (book.author.contains("Zülfü")){
                System.out.println(book);
            }
        }



    }

}
