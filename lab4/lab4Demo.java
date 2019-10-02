package lab4;

import java.util.Random;

public class lab4Demo {
    public static void main(String[] args){

        //instantiating sorting algorithms
        QuickSort quick = new QuickSort();
        MergeSort merge = new MergeSort();

        //creating random arrays
        Random rand = new Random();
        int[] arr = new int[100000];
        int[] arr2 = new int[100000];

        //putting random numbers into array
        for (int i = 0; i < arr.length; i++){
            int x = rand.nextInt();
            //using same numbers in each different array
            arr[i] = x;
            arr2[i] = x;
            //System.out.println(x);

        }

        //using timer class to time each sorting method
        StopWatch timer = new StopWatch();
        quick.sort(arr);
        System.out.println("Quick Sort " + timer.elapsedTime() + " seconds");

        StopWatch timer2 = new StopWatch();
        merge.sort(arr2);
        System.out.println("Merge Sort " + timer2.elapsedTime() + " seconds");
    }

}