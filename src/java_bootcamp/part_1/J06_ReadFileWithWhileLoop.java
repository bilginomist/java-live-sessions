package java_bootcamp.part_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J06_ReadFileWithWhileLoop {

    public static void main(String[] args) throws FileNotFoundException {

        //System                   //projenin bilgisayaradaki yeri
       File file=new File(System.getProperty("user.dir")+"/src/java_bootcamp/Names.txt");

        Scanner scanner=new Scanner(file);


        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }


    }
}
