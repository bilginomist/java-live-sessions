package day_50_collections_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class J06_StackPractice {

    public static void main(String[] args) {
        String str="HELLO";

        Stack<Character> letters=new Stack<>();

        for (char c : str.toCharArray()) {
            letters.push(c);
        }

        System.out.println(letters);
        popAll(letters);





    }

    public static void popAll(Stack<Character> letters){
        while (!letters.isEmpty()){
            System.out.print( letters.pop());

        }
    }
}
