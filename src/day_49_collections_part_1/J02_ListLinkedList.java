package day_49_collections_part_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class J02_ListLinkedList {


    public static void main(String[] args) {
        List<String> list=new LinkedList<>();

        list.add("A");
        list.add("B");

        System.out.println("list = " + list);

        Deque<String> deque=new LinkedList<>();

        deque.push("A");

        deque.add("B");

        System.out.println(deque);

    }
}
