package day_49_exception_part_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class J01_CheckedException {


    public static void main(String[] args) {


        for (int i = 100; i >= 0; i--) {

            System.out.println(i);

            saniye(1);




        }


        fileRead();

    }

    public static void fileRead() {

        try {
            File file =new File("/path");

            FileInputStream fileInputStream=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void saniye(long saniye){
        try {
            Thread.sleep(saniye*1000);
        }catch (InterruptedException e){

        }
    }
}
