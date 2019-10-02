package prj04;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayDs {

    //add last method
    public String addLast(int data) {
        int x = data;
        int[] oldArray = {0};
        int newValue = data;
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++)
            newArray[i] = oldArray[i];
        newArray[newArray.length - 1] = newValue;
        oldArray = newArray;

        return Arrays.toString(newArray);
    }


    //method to add first
    public String addFirst(int data) {
        int[] sizes = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(data);
        for (int element : sizes) {
            list.add(element);
        }
        return Integer.toString(data);
    }

    //get Nth method
    public int getNth(int x) {
        int curr = x;
        for (int j = 0; j < x; j++) {
            curr = curr + 1;
        }
        return curr;
    }


}

