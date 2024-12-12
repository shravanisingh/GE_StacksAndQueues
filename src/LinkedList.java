class LinkedList {
    Node head;  // Front of the queue
    Node tail;  // End of the queue

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
    public void printQueue() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}