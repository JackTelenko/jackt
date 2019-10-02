package prj05;

public class LinkedStack<E> implements Stack<E> {
    private DoublyLinkedList<E> list = new DoublyLinkedList<>();

    private DoublyLinkedList.Node<E> trailer;
    private DoublyLinkedList.Node<E> header;

    public LinkedStack(){}

    //returns size of stack
    public int size(){
        return list.size();
    }
    //checks if stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //adds element to top of stack
    public void push(E element){
        list.addFirst(element);
    }
    //returns top element of stack
    public E top(){
        return list.first();
    }
    //pop method
    public E pop(){
        return list.removeFirst();
    }

    //calls toString in doublyLinkedList
    public String toString() {
        return list.toString();
    }

}
