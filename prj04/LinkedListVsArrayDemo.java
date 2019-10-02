package prj04;

import java.util.Random;

public class LinkedListVsArrayDemo {
    public static void main(String[] args) {

        //using Linked List class to add elements to first and last
        LinkedListDS ll = new LinkedListDS();

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addLast(7);
        ll.addLast(6);
        ll.addFirst(9);
        ll.addFirst(10);


        //print toString
        //System.out.println(ll.toString());      //uncomment to print list
        //getting the Nth element in list
        //System.out.println(ll.getNth(0));       //uncomment to print get Nth

        //creating variables to keep track of time
        long startTime;
        long stopTime;
        long elapsedTime;


        //addFirst test
        for (int i = 0; i < 10000; i++) {
            ll.addFirst(i);
        }

            startTime = System.nanoTime();
            stopTime = System.nanoTime();
            elapsedTime = stopTime - startTime;
            System.out.println("addFirst LL 10,000 times: " + elapsedTime / 1000 + " microseconds or " + elapsedTime + " ns");


        //addLast test
        for (int i = 0; i < 10000; i++) {
            //ll.addLast(i);
            ll.addLast(Math.random());
        }

        startTime = System.nanoTime();
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("addLast LL 10,000 times: " + elapsedTime /1000 + " microseconds or " + elapsedTime + " ns");

        //getNth test
        for (int i = 0; i < 10000; i++) {
            ll.getNth(i);
        }
        startTime = System.nanoTime();
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("getNth LL 10,000 times: " + elapsedTime /1000 + " microseconds  or " + elapsedTime + " ns");


        ArrayDs ad = new ArrayDs();

        ad.addFirst(9);
        ad.addFirst(7);
        ad.addLast(8);
        ad.addLast(6);
        ad.addFirst(4);
        ad.addFirst(5);
        ad.addLast(2);
        ad.addLast(10);
        ad.addFirst(3);
        ad.addFirst(1);


        //System.out.println(ad.toString());
        //getting the Nth element in list
        //System.out.println(ad.getNth(1));                 //uncomment to print getNth

        System.out.println();

        //addFirst test
        for (int i = 0; i < 10000; i++) {
            ad.addFirst(i);
        }
        startTime = System.nanoTime();
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("addFirst Array 10,000 times: " + elapsedTime /1000 + " microseconds or " + elapsedTime + " ns");

        //addLast test
        for (int i = 0; i < 10000; i++) {
            ad.addLast(i);
        }
        startTime = System.nanoTime();
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("addLast Array 10,000 times: " + elapsedTime /1000 + " microseconds or " + elapsedTime + " ns");

        //getNth test
        for (int i = 0; i < 10000; i++) {
            ad.getNth(i);
        }
        startTime = System.nanoTime();
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        System.out.println("getNth Array 10,000 times: " + elapsedTime /1000 + " microseconds  or " + elapsedTime + " ns");


        System.out.println();
        System.out.println("RESULTS");
        System.out.println("ArrayDS.addFirst(): Constant Time");
        System.out.println("ArrayDS.addLast(): Constant Time");
        System.out.println("ArrayDS.getNth(): Constant Time");
        System.out.println("LLDs.addFirst(): Constant Time");
        System.out.println("LLDs.addLast(): Constant Time");
        System.out.println("LLDs.getNth(): Constant Time");
    }
}