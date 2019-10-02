package prj05;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack(){
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }
    /**
     * Returns the number of items in the stack
     * @return number of elements in the stack
     */
    public int size(){
        return (t + 1);
    }

    /**
     * Returns true if the stack is empty, otherwise false
     * @return true if empty, else false
     */
    public boolean isEmpty(){
        return (t == -1);
    }

    /**
     * Adds an element to the top of the stack
     * @param e the element to be added to the stack
     */
    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is full");

    }

    /**
     * Returns the top element of the stack but doesn't pop it off.
     * Comparable to the peek() method in java.util.Stack
     * @return the top element of the stack
     */
    public E top(){
        if (isEmpty()) return null;
        return data[t];
    }

    /**
     * Pops the top element of the stack and returns the element.
     * @return the top element of the stack
     */
    public E pop(){
        if (isEmpty()) return null;
        E answer = data[t];
        t--;
        return answer;
    }
}
