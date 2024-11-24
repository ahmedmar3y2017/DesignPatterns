package problems;

// implement stach using array
public class ArrayStack {

    // isEmpty , push , pop
    // stack is -> lifo {last element in , first element out}

    int stackSize;
    int[] stackValues;
    int top = -1;

    ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        stackValues = new int[stackSize];
    }

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackValues[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int result = stackValues[top--];
        System.out.println("pop : " + result);
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int result = stackValues[top];
        System.out.println("Beek : " + result);
        return result;

    }

    public boolean isEmpty() {

        return top == -1;
    }

    public boolean isFull() {
        return top == stackSize - 1;
    }
}
