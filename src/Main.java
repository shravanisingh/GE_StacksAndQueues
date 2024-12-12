public class Main {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        stack.add(70);
        stack.add(30);
        stack.add(56);
        System.out.println("Stack sequence after push operations");
        stack.printStack();
        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popped");
        stack.pop();
        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popped");
        stack.pop();
        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popped");
        stack.pop();
        System.out.println("Top element of the stack: " + stack.peek());
    }
}