package day_50_collections_part_2;

import java.util.Stack;

public class J02_ListStack {


    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(1); //en alta eklendi
        stack.push(2);
        stack.push(3); //en üste eklendi


        System.out.println(stack.peek());
        System.out.println(stack.peek());


        System.out.println("stack.pop() = " + stack.pop()); //3
        System.out.println("stack.pop() = " + stack.pop()); //2
        System.out.println("stack.pop() = " + stack.pop()); //1
        //System.out.println("stack.pop() = " + stack.pop()); //0




    }
}
