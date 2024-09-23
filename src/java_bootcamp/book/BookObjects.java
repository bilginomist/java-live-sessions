package java_bootcamp.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookObjects {


    public static void main(String[] args) throws FileNotFoundException {


        File file = new File(System.getProperty("user.dir") + "/src/java_bootcamp/Books.txt");

        Scanner scanner = new Scanner(file);

        int bookNumber = scanner.nextInt();//2

        for (int i = 0; i < bookNumber; i++) {
            Book book = new Book();
            book.setTitle(scanner.next());
            book.setAuthor(scanner.next());
            book.setYear(scanner.nextInt());

            System.out.println(book);


        }


    }
}
