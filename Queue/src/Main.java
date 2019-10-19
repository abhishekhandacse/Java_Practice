public class Main {

    public static void main(String[] args) {
        Queue<String> q=new Queue();
        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");

        for(String i:q)
            System.out.println(i);

        q.deque();
        q.deque();

        for(String i:q)
            System.out.println(i);

    }
}
