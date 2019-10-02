package lab3;

import java.util.Random;


public class sortDemo {
    public static void main(String[] args){

        //instanciating sorting algorithms
        SelectionSort select = new SelectionSort();
        ShellSort shell = new ShellSort();
        InsertionSort insert = new InsertionSort();

        //creating random arrays
        Random rand = new Random();
        int[] arr = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];

        for (int i = 0; i < arr.length; i++){
            int x = rand.nextInt();
            System.out.println(rand.nextInt(100));
            //System.out.println(arr2[i]);
            //System.out.println(arr3[i]);

            //using same numbers in each different array
            arr[i] = x;
            arr2[i] = x;
            arr3[i] = x;

        }

        //using timer class to time each sorting method
        StopWatch timer = new StopWatch();
        select.sort(arr);
        System.out.println("Selection Sort " + timer.elapsedTime() + " seconds");

        StopWatch timer2 = new StopWatch();
        shell.sort(arr2);
        System.out.println("Shell Sort " + timer2.elapsedTime() + " seconds");

        StopWatch timer3 = new StopWatch();
        insert.sort(arr3);
        System.out.println("Insertion Sort " + timer3.elapsedTime() + " seconds");

    }
}
