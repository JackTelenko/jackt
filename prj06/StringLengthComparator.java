package prj06;

import java.util.Comparator;

//string length comparator from book that compares length of strings
public class StringLengthComparator implements Comparator<String> {
    public int compare(String a, String b){
        if (a.length() < b.length()) return -1;
        else if(a.length() == b.length()) return 0;
        else return 1;
    }
}
