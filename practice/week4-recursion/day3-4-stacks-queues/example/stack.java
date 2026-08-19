class Main {
    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println("Top: " + Stack.peek());
        System.out.println("Popped: " + Stack.pop());
        System.out.println("Popped: " + Stack.pop());
        System.out.println("Top: " + Stack.peek());

        Stack.push(40);

        System.out.println("Top: " + Stack.peek());

    }
}

class Stack {
    static int[] stack = new int[10];
    static int top = -1; // meaning the stack is empty

    public static void push(int value) { // adds the value at the very top of the stack
        top++;
        stack[top] = value;

    }

    public static int pop() { // removes the last value from the stack
        int value = stack[top];
        top--;
        return value;
    }

    public static int peek() { // lets you see the top value
        return stack[top];
    }
}
