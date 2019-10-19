import java.util.Iterator;

public class StackUsingResizeableArr<Item> implements Iterable<Item>{
    private Item[] arr=(Item[])new Object[1];
    private int size=0;
    public boolean isEmpty(){return size==0;}
    public int size(){return size;}

    private void resize(int maxi){
        Item[] temp=(Item[]) new Object[maxi];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    public void push(Item item){
        if(size== arr.length){resize(2*arr.length);}
        arr[size++]=item;
    }
    public Item pop(){

        Item item=arr[--size];
        arr[size]=null; //Inorder to avoid loitering
        if(size>0 && size==(arr.length/4)){resize(arr.length/2);}
        return item;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i=size;
        public boolean hasNext(){return i>0;}
        public Item next(){return arr[--i];}
        public void remove(){}

    }
}
