class LinkedList {
    Node head;  // Front of the queue
    Node tail;  // End of the queue

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;  // If the queue is empty, both head and tail point to the new node
            return;
        }
        tail.next = newNode;  // Link the new node after the current tail
        tail = newNode;  // Update the tail to the new node
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