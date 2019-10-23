package program1;

public class RadixSort {
    public static void radixSort(int arr[]) {

        //for loop to go through array
        for (int i = 1; i < arr.length; i++) {
            //see if element in arr[i] is greater than arr[0](index 0)
            if (arr[i] > arr[0]) {
                //if true make arr[0] get arr[i]
                arr[0] = arr[i];
            }
        }

        int[] net = new int[arr.length];

        //initialize to multiply by 10 to move to tenths, hundreds, thousandths etc. place
        int modDiv = 1;

        //runs through until sorted
        while (arr[0] / modDiv > 0) {

            int[] list = new int[100000];

            //goes through and stores array
            for (int i = 0; i < arr.length; i++)
                list[(arr[i] / modDiv) % 10]++;

            //makes new index for algorithm to sort
            for (int i = 1; i < 10; i++)
                list[i] += list[i - 1];

            //creates the array which can then be printed out
            for (int i = arr.length - 1; i >= 0; i--)
                net[--list[(arr[i] / modDiv) % 10]] = arr[i];

            ////arr[i] gets net[i] which makes a sorted copy of the array
            for (int i = 0; i < arr.length; i++)
                arr[i] = net[i];

            //*=10 to make modDiv go to next index
            modDiv *= 10;

        }
    }
}