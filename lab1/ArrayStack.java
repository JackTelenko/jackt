package lab1;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.File;
import java.util.Scanner;

public class ArrayStack <E> {
    private E[] a;
    private int N;

    public ArrayStack(int capacity){
        a = (E[])(new Object[capacity]);
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public boolean isFull(){
        return N == a.length;
    }

    public void push(E item){
        a[N++] = item;
    }

    public E pop(){
        return a[--N];
    }

    public E peek(){
        return a[N-1];
    }

    public Iterator<E> iterator() {
        return new ArrayStack.ReverseArrayIterator();
    }


    public class ReverseArrayIterator implements Iterator<E>{
        private int i = N - 1;

        public boolean hasNext(){
            return i >= 0;
        }

        public E next(){
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        ArrayStack stack1 = new ArrayStack(1000);
        ArrayStack stack2 = new ArrayStack(1000);


        File file1 = new File ("C:\\Users\\jackt\\IdeaProjects\\CSCI232\\Lecture Practice\\src\\lab1\\numbers.txt");
        File file2 = new File ("C:\\Users\\jackt\\IdeaProjects\\CSCI232\\Lecture Practice\\src\\lab1\\tinyTale.txt");

        Scanner scnr1 = new Scanner(file1);
        Scanner scnr2 = new Scanner(file2);

        //int i = 0;

        while(scnr1.hasNextLine()){
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
