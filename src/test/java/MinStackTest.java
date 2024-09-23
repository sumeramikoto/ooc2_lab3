import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {
    @Test
    public void firstCaseTest() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        int min = minStack.min();
        int expectedMin = 1;
        assertEquals(expectedMin, min);
    }

    @Test
    public void secondCaseTest() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();
        int min = minStack.min();
        int expectedMin = 2;
        assertEquals(expectedMin, min);
    }

    @Test
    public void thirdCaseTest() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        int min = minStack.min();
        int expectedMin = 1;
        assertEquals(expectedMin, min);
    }
}
