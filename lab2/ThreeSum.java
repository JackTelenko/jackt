package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreeSum {
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {

        File file = new File(args[0]);

        Scanner scanner = new Scanner(file);

        int max = Integer.parseInt(args[1]);
        int [] a = new int[max];
        int i = 0;

        while (scanner.hasNextInt()) {
            a[i++] = scanner.nextInt();
        }

        StopWatch timer = new StopWatch();
        int count = count(a);
        System.out.println("elapsed time = " + timer.elapsedTime());
        System.out.println(count);
    }
}
