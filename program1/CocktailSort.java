package program1;

public class CocktailSort {
    void cocktailSort(int arr[]) {
        boolean swap;

        do {
            swap = false;

            //goes through array forwards and compares elements like bubble sort
            for (int i = 0; i <= arr.length - 2; i++) {
                //testing elements to see which is larger
                if (arr[i] > arr[i + 1]) {
                    //assigning variable to arr[i]
                    int next = arr[i];
                    //make arr[i] get arr[i+1]
                    arr[i] = arr[i + 1];
                    //make arr[i+1] new element to compare
                    arr[i + 1] = next;
                    //if elements swap then make swapped true
                    swap = true;
                }
            }
            //if has not been swapped then it exits out of the forwards loop
            if (!swap) {
                break;
            }

            //goes through array backwards and compares like bubble sort but back to front
            for (int i = arr.length - 2; i >= 0; i--) {
                //testing elements back to front to see what is bigger
                if (arr[i] > arr[i + 1]) {
                    //assigning variable to arr[i]
                    int next = arr[i];
                    //arr[i] gets arr[i+1]
                    arr[i] = arr[i + 1];
                    //make arr[i+1] new element to compare
                    arr[i + 1] = next;
                    //make swapped true if elements swap
                    swap = true;

                }
            }
            //finishing do while loop if swapped = true
        }while (swap);
    }
}
