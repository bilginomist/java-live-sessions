package java_bootcamp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {

    public static void readFile(String fileName){
        File file=new File(System.getProperty("user.dir")+"/src/java_bootcamp/"+fileName+".txt");

        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

    public static void readFile(String fileName,boolean withFileName){

        String path=withFileName?"/src/java_bootcamp/"+fileName+".txt":fileName;


        File file=new File(System.getProperty("user.dir")+path);

        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
