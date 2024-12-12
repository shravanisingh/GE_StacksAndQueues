class LinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        head = head.next;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    public void printStack() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}