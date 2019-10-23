package program1;

public class BubbleSort {

    void bubbleSort(int arr[]){

        //checking length of array
        for(int i = 0; i < arr.length - 1; i++){
            //nested for loop to compare objects next to each other in memory
            for(int j = 1; j < arr.length - i; j++){
                //if element j+1 is bigger than element j: switch them and move to next comparison
                if(arr[j-1] > arr[j]){
                    //assigning variable to arr[j-1]
                    int next = arr[j-1];
                    //make j-1 get j
                    arr[j - 1] = arr[j];
                    //make arr[j] new element to compare
                    arr[j] = next;
                }
            }
        }
    }
}
