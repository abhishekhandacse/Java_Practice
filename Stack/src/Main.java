import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Stack using arr testing
        StackUsingResizeableArr<String> stk=new StackUsingResizeableArr<String>();
        stk.push("Hello");
        stk.push("World");
        stk.push("Test");
        stk.push("World");
        stk.pop();
        stk.pop();
        for(String i:stk){
            System.out.println(i);
        }
        //Stack using linked list testing
        StackUsingLinkedList<String> llstk=new StackUsingLinkedList<String>();
        llstk.push("Hello");
        llstk.push("World");
        llstk.push("Test");
        llstk.push("World");
        llstk.pop();
        llstk.pop();
        for(String i:llstk){
            System.out.println(i);
        }
    }
}
