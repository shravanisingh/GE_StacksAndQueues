public class Main {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue sequence after enqueue operations:");
        queue.printQueue();
    }
}