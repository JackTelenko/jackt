package program1;

import java.util.Random;
import java.util.Arrays;

public class Program1Demo {
    public static void main(String[] args){

        //instantiating all sorting classes
        BubbleSort bubble = new BubbleSort();
        CocktailSort cocktail = new CocktailSort();
        RadixSort radix = new RadixSort();

        //creating random # generator
        Random rand = new Random();
        int[] arr1 = new int[200000];
        int[] arr2 = new int[200000];
        int[] arr3 = new int[200000];

        System.out.println("Random integers to sort: ");

        //putting random numbers into arrays
        for (int i = 0; i < arr1.length; i++){
            int x = rand.nextInt(500000);
            //using same numbers in each different array
            arr1[i] = x;
            arr2[i] = x;
            arr3[i] = x;

            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //starting stopwatch to time bubble sort
        System.out.println();
        StopWatch timer1 = new StopWatch();
        bubble.bubbleSort(arr1);
        System.out.println("Bubble Sort: " + timer1.elapsedTime() + " seconds");
        System.out.println("Sorted Bubble: " + Arrays.toString(arr1));

        //starting stopwatch to time cocktail sort
        System.out.println();
        StopWatch timer2 = new StopWatch();
        cocktail.cocktailSort(arr2);
        System.out.println("Cocktail Sort: " + timer2.elapsedTime() + " seconds");
        System.out.println("Sorted Cocktail: " + Arrays.toString(arr2));

        //starting stopwatch to time radix sort
        System.out.println();
        StopWatch timer3 = new StopWatch();
        radix.radixSort(arr3);
        System.out.println("Radix Sort: " + timer3.elapsedTime() + " seconds");
        System.out.println("Sorted Radix: " + Arrays.toString(arr3));

    }
}