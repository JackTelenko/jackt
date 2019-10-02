package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RArrayStack <E> {
    private E[] a;
    private int N;

    public RArrayStack() {
        a = (E[]) (new Object[8]);
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(E item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public E pop() {
        return a[--N];
    }

    private void resize(int capacity) {
        assert capacity >= N;

        E[] cep = (E[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            cep[i] = a[i];
        }
        a = cep;

    }

    public class ReverseArrayIterator implements Iterator<E> {
        private int i = N - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        //RArrayStack<E> stack1 = new RArrayStack<E>();

        RArrayStack stack1 = new RArrayStack();
        RArrayStack stack2 = new RArrayStack();

        File file1 = new File("C:\\Users\\jackt\\IdeaProjects\\CSCI232\\Lecture Practice\\src\\lab1\\numbers.txt");
        File file2 = new File("C:\\Users\\jackt\\IdeaProjects\\CSCI232\\Lecture Practice\\src\\lab1\\tinyTale.txt");

        Scanner scnr1 = new Scanner(file1);
        Scanner scnr2 = new Scanner(file2);

        while(scnr1.hasNextLine()) {
            stack1.push(scnr1.nextLine());
        }
        while(!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }

        while(scnr2.hasNextLine()){
            stack2.push(scnr2.nextLine());
        }
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }

    }
}

