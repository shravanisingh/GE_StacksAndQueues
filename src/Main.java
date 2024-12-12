public class Main {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();

        // Push elements onto the stack
        stack.add(70); // 70 will be added first
        stack.add(30); // 30 will be added after 70
        stack.add(56); // 56 will be added last, so it will be on top

        // Print the stack
        System.out.println("Stack sequence after push operations");
        stack.printStack(); // Output: 56 30 70

    }
}