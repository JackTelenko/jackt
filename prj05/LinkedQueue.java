package prj05;

public class LinkedQueue<E> implements Queue<E> {
    private DoublyLinkedList<E> list = new DoublyLinkedList<>();

    public LinkedQueue(){}

    //returns size of stack
    public int size(){
        return list.size();
    }
    //checks if stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //add last element
    public void enqueue(E element){
        list.addLast(element);
    }
    //add first element
    public E first(){
        return list.first();
    }

    //removes first element
    public E dequeue(){
        return list.removeFirst();
    }

}
