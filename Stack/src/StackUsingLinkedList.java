/**
 * Created by अभिषेक Handa on 18-10-19.
 */

import java.util.Iterator;

public class StackUsingLinkedList<Item> implements Iterable<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private int size;
    public boolean isEmpty(){return first==null;}
    public int size(){return size;}

    public void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        size++;
    }
    public Item pop(){
        Item item=first.item;
        first=first.next;
        size--;
        return item;
    }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        Node temp=first;
        public boolean hasNext(){return !(temp==null);}
        public Item next(){
            Item i=temp.item;
            temp=temp.next;
            return i;
            }
        }
        public void remove(){}

    }

}
