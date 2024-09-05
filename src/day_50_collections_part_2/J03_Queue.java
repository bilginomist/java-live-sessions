package day_50_collections_part_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class J03_Queue {
    public static void main(String[] args) {

        Queue<String> queue=new PriorityQueue<>();


        System.out.println(queue.add("Ali"));
        System.out.println(queue.offer("Fatih"));

       // System.out.println(queue.add(null));

        System.out.println(queue);

        System.out.println(queue.poll() + " - Kuyruktan çıkan kişi - "); //Çıkan kişiyi yazar


        System.out.println(queue);



        System.out.println(queue.remove() + " Kuyruktan çıkan kişi ");

        System.out.println(queue);


        System.out.println(queue.poll());



        queue.add("b");

        queue.add("a"); // b a    //alfebetik sıra

        System.out.println(queue.element());


        System.out.println("queue.poll() = " + queue.poll());

    }




}


