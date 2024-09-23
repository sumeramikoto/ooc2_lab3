import java.util.Stack;

public class MinStack {
    class StackValues {
        int value;
        int min;
        public StackValues(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
    Stack<StackValues> basisStack;

    public MinStack() {
        this.basisStack = new Stack<StackValues>();
    }

    public void push(int n) {
        if (basisStack.isEmpty()) {
            basisStack.push(new StackValues(n, n));
        } else {
            int min = Math.min(basisStack.peek().min, n);
            basisStack.push(new StackValues(n, min));
        }
    }

    public int pop() {
        return this.basisStack.pop().value;
    }
    public int min() {
        return this.basisStack.peek().min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);


        int min = minStack.min();
        System.out.println(min);
    }
}
