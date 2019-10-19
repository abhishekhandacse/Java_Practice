/**
 * Created by अभिषेक Handa on 19-10-19.
 */
import java.util.Iterator;
public class Queue<Item> implements Iterable<Item> {
    private class Node{
        Item val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size=0;
    private Node getNode(Item val){
        Node temp=new Node();
        temp.val=val;
        temp.next=null;
        return temp;
    }
    public boolean isEmpty(){return head==null;}
    public int size(){return size; }

    public void enqueue(Item val){
        size++;
        if(head==null){
            head=getNode(val);
            tail=head;
            return;
        }

        tail.next=getNode(val);
        tail=tail.next;
    }

    public Item deque(){
        size--;
        if(head==null)
            return null;// Dequing a empty queue
        Item val=head.val;
        head=head.next;
        return val;
    }
    // Iterator specific code (Methods of interface Iterable) --> Iterator needs to be implemented or otherwise class should be named as abstract

    public Iterator<Item> iterator(){
        return new queueIterator();
    }
    private class queueIterator implements Iterator<Item>{
        Node temp=head;
        public boolean hasNext(){return !(temp==null) ;}
        public Item next(){Item i=temp.val;temp=temp.next;return i;}
        public void remove(){}
    }



}
